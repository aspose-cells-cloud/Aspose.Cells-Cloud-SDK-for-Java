package com.aspose.cells.cloud;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.FormBody;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * CellsCloudClient — the entry point of the Aspose.Cells Cloud SDK for Java.
 *
 * <p>Owns a {@link Configuration} and an {@link OkHttpClient}. It authenticates via OAuth2
 * client-credentials and executes {@link RequestOption} instances returned by the generated request
 * classes.</p>
 *
 * <pre>{@code
 * CellsCloudClient client = new CellsCloudClient(clientId, clientSecret, "https://api.aspose.cloud");
 * RichResponse response = client.call(new GetWorkbookRequest("Book1.xlsx"));
 * }</pre>
 */
public class CellsCloudClient {

    private static final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
    private static final MediaType OCTET_STREAM = MediaType.parse("application/octet-stream");

    private static final ObjectMapper MAPPER = JsonUtil.MAPPER;

    private final Configuration configuration;
    private volatile OkHttpClient httpClient;

    private volatile String accessToken;
    private volatile long tokenExpiryMillis;

    /**
     * Creates a client bound to the given credentials and base URL.
     *
     * @param clientId     the OAuth2 client id
     * @param clientSecret the OAuth2 client secret
     * @param baseUrl      the API base URL (e.g. {@code https://api.aspose.cloud})
     */
    public CellsCloudClient(String clientId, String clientSecret, String baseUrl) {
        this(clientId, clientSecret, baseUrl, null);
    }

    /**
     * Creates a client bound to the given credentials, base URL, and an externally-built HTTP client.
     *
     * <p>Passing your own {@link OkHttpClient} is the analog of the Go SDK's {@code WithHTTPClient}:
     * it lets callers supply a custom {@code Transport} for mTLS, tracing, proxies, or test mocks.
     * The OAuth2 token request and every API request run through this same client, so its timeouts,
     * connection pool, and dispatcher apply to token refresh as well.</p>
     *
     * @param clientId     the OAuth2 client id
     * @param clientSecret the OAuth2 client secret
     * @param baseUrl      the API base URL (e.g. {@code https://api.aspose.cloud})
     * @param httpClient   the HTTP client to use, or {@code null} to build a default one from the
     *                     {@link Configuration#getTimeout() timeout}
     */
    public CellsCloudClient(String clientId, String clientSecret, String baseUrl, OkHttpClient httpClient) {
        this.configuration = new Configuration();
        this.configuration.setClientId(clientId);
        this.configuration.setClientSecret(clientSecret);
        if (baseUrl != null && !baseUrl.isEmpty()) {
            this.configuration.setBaseUrl(baseUrl);
        }
        this.httpClient = httpClient != null
                ? httpClient
                : new OkHttpClient.Builder()
                        .connectTimeout(configuration.getTimeout().toMillis(), TimeUnit.MILLISECONDS)
                        .readTimeout(configuration.getTimeout().toMillis(), TimeUnit.MILLISECONDS)
                        .writeTimeout(configuration.getTimeout().toMillis(), TimeUnit.MILLISECONDS)
                        .build();
    }

    /** @return the underlying configuration. */
    public Configuration getConfiguration() {
        return configuration;
    }

    /**
     * Fluent setter for the request timeout.
     *
     * <p>Rebuilds the underlying {@link OkHttpClient} with the new timeout. The builder is derived from
     * the existing client via {@code newBuilder()} so the connection pool and dispatcher are preserved —
     * no socket or thread-pool leaks.</p>
     */
    public CellsCloudClient setTimeout(Duration timeout) {
        if (timeout == null) {
            throw new IllegalArgumentException("timeout must not be null");
        }
        configuration.setTimeout(timeout);
        long millis = timeout.toMillis();
        this.httpClient = this.httpClient.newBuilder()
                .connectTimeout(millis, TimeUnit.MILLISECONDS)
                .readTimeout(millis, TimeUnit.MILLISECONDS)
                .writeTimeout(millis, TimeUnit.MILLISECONDS)
                .build();
        return this;
    }

    /** Fluent setter for the number of automatic retries on transient failures. */
    public CellsCloudClient setRetries(int retries) {
        configuration.setRetries(retries);
        return this;
    }

    /**
     * Executes a single request and returns the response.
     *
     * @param request the request to execute
     * @return the response
     * @throws ApiException on authentication, transport, or server-side failure
     */
    public RichResponse call(RequestOption request) throws ApiException {
        return execute(request, configuration.getRetries());
    }

    /**
     * Executes one or more requests in order and returns their responses.
     *
     * @param requests the requests to execute
     * @return the responses, in request order
     * @throws ApiException on the first failure
     */
    public RichResponse[] call(RequestOption... requests) throws ApiException {
        if (requests.length == 0) {
            throw new IllegalArgumentException("at least one request is required");
        }
        RichResponse[] responses = new RichResponse[requests.length];
        for (int i = 0; i < requests.length; i++) {
            responses[i] = execute(requests[i], configuration.getRetries());
        }
        return responses;
    }

    private RichResponse execute(RequestOption requestOption, int retriesLeft) throws ApiException {
        ensureAuthenticated();

        String url = buildUrl(requestOption);
        Request.Builder builder = new Request.Builder().url(url);
        applyHeaders(builder, requestOption);

        switch (requestOption.getMethod().toUpperCase()) {
            case "GET":
                builder.get();
                break;
            case "DELETE":
                // Some DELETE operations carry a body (e.g. PostBatchLock batch requests); buildBody
                // returns an empty body when there is nothing to send.
                builder.delete(buildBody(requestOption));
                break;
            case "POST":
                builder.post(buildBody(requestOption));
                break;
            case "PUT":
                builder.put(buildBody(requestOption));
                break;
            default:
                throw new ApiException("Unsupported HTTP method: " + requestOption.getMethod());
        }

        try (Response response = httpClient.newCall(builder.build()).execute()) {
            byte[] body = response.body() == null ? new byte[0] : response.body().bytes();
            Map<String, List<String>> headers = toHeaderMap(response);
            int code = response.code();

            if ((code >= 500 || code == 429) && retriesLeft > 0) {
                // Transient server error or rate limit — retry within the configured retry budget,
                // honoring the server's Retry-After hint when one is present.
                return retry(requestOption, retriesLeft - 1, response.header("Retry-After"));
            }
            if (code >= 400) {
                throw new ApiException(code, "HTTP " + code + ": " + new String(body, java.nio.charset.StandardCharsets.UTF_8));
            }
            return new RichResponse(code, headers, body);
        } catch (ApiException e) {
            throw e;
        } catch (IOException e) {
            // Retry transient transport failures (network/timeouts), not deterministic errors.
            if (retriesLeft > 0) {
                return retry(requestOption, retriesLeft - 1, null);
            }
            throw new ApiException("Request failed: " + e.getMessage(), e);
        }
    }

    /**
     * Backs off exponentially (100 ms, 200 ms, 400 ms, ... capped at 4 s) before retrying. When the
     * server supplied a {@code Retry-After} header the delay never backs off less than that value
     * (capped at 60 s so a broken value cannot block the thread indefinitely). The sleep is
     * interrupt-aware: cancelling the calling thread (e.g. {@code Future.cancel(true)}) aborts the
     * retry instead of blocking forever.
     */
    private RichResponse retry(RequestOption requestOption, int retriesLeft, String retryAfterHeader)
            throws ApiException {
        int attempt = configuration.getRetries() - retriesLeft - 1;
        long delayMs = Math.min(100L << attempt, 4000L);
        if (retryAfterHeader != null) {
            try {
                long serverDelay = Math.min(Long.parseLong(retryAfterHeader.trim()) * 1000L, 60_000L);
                delayMs = Math.max(delayMs, serverDelay);
            } catch (NumberFormatException ignored) {
                // Not a seconds value — fall back to the exponential schedule.
            }
        }
        try {
            Thread.sleep(delayMs);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new ApiException("Operation cancelled during retry backoff", e);
        }
        return execute(requestOption, retriesLeft);
    }

    private RequestBody buildBody(RequestOption requestOption) {
        Map<String, Object> form = requestOption.getMultipartForm();
        if (form != null && !form.isEmpty()) {
            MultipartBody.Builder mb = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (Map.Entry<String, Object> entry : form.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof FormFile) {
                    FormFile f = (FormFile) value;
                    MediaType mt = f.getContentType() != null
                            ? MediaType.parse(f.getContentType()) : OCTET_STREAM;
                    RequestBody body = f.isFile()
                            ? RequestBody.create(f.getFile(), mt)
                            : RequestBody.create(f.getData(), mt);
                    mb.addFormDataPart(entry.getKey(), f.getFileName(), body);
                } else if (value instanceof File) {
                    File f = (File) value;
                    mb.addFormDataPart(entry.getKey(), f.getName(),
                            RequestBody.create(f, OCTET_STREAM));
                } else if (value instanceof byte[]) {
                    mb.addFormDataPart(entry.getKey(), "file",
                            RequestBody.create((byte[]) value, OCTET_STREAM));
                } else {
                    mb.addFormDataPart(entry.getKey(), String.valueOf(value));
                }
            }
            Object jsonBody = requestOption.getJsonBody();
            if (jsonBody != null) {
                // The JSON body is a real JSON document — mark the part as application/json rather
                // than the default text/plain OkHttp applies to addFormDataPart(name, value).
                mb.addFormDataPart(requestOption.getJsonBodyPartName(), null,
                        RequestBody.create(toJson(jsonBody), JSON));
            }
            return mb.build();
        }

        Object jsonBody = requestOption.getJsonBody();
        if (jsonBody != null) {
            return RequestBody.create(toJson(jsonBody), JSON);
        }
        return RequestBody.create(new byte[0], null);
    }

    private String buildUrl(RequestOption requestOption) {
        String base = configuration.getBaseUrl();
        if (base == null || base.isEmpty()) {
            throw new ApiException("Configuration baseUrl is not set");
        }
        if (base.endsWith("/")) {
            base = base.substring(0, base.length() - 1);
        }
        // The API version is a property of the operation (getApiVersion); the path returned by
        // getPath() is version-less, so the version segment is assembled here exactly once per
        // request. There is a single source of truth for the version string.
        String version = requestOption.getApiVersion();
        if (version == null || version.isEmpty()) {
            throw new ApiException("Request " + requestOption.getClass().getSimpleName()
                    + " did not provide an API version");
        }
        String path = requestOption.getPath();
        String apiUrl = base + "/" + version + (path.startsWith("/") ? path : "/" + path);
        HttpUrl parsed = HttpUrl.parse(apiUrl);
        if (parsed == null) {
            throw new ApiException("Invalid request URL: " + apiUrl);
        }
        HttpUrl.Builder builder = parsed.newBuilder();
        Map<String, String> query = requestOption.getQueryParameters();
        if (query != null) {
            for (Map.Entry<String, String> entry : query.entrySet()) {
                if (entry.getKey() != null && entry.getValue() != null) {
                    builder.addQueryParameter(entry.getKey(), entry.getValue());
                }
            }
        }
        return builder.build().toString();
    }

    private void applyHeaders(Request.Builder builder, RequestOption requestOption) {
        builder.header("Authorization", "Bearer " + accessToken);
        if (!requestOption.isBinaryResponse()) {
            // Binary endpoints (file downloads/conversions) stream the raw file; forcing
            // application/json can make the server wrap or reject the response. A user-supplied
            // Accept header still wins because it is applied below, after this default.
            builder.header("Accept", "application/json");
        }
        for (Map.Entry<String, String> header : configuration.getHeaderParameters().entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        Map<String, String> headers = requestOption.getHeaderParameters();
        if (headers != null) {
            for (Map.Entry<String, String> header : headers.entrySet()) {
                builder.header(header.getKey(), header.getValue());
            }
        }
    }

    private Map<String, List<String>> toHeaderMap(Response response) {
        Map<String, List<String>> result = new LinkedHashMap<>();
        for (String name : response.headers().names()) {
            result.put(name, response.headers(name));
        }
        return result;
    }

    private void ensureAuthenticated() throws ApiException {
        if (accessToken != null && System.currentTimeMillis() < tokenExpiryMillis) {
            return;
        }
        synchronized (this) {
            if (accessToken != null && System.currentTimeMillis() < tokenExpiryMillis) {
                return;
            }
            requestOauthToken();
        }
    }

    private void requestOauthToken() throws ApiException {
        String clientId = configuration.getClientId();
        String clientSecret = configuration.getClientSecret();
        if (clientId == null || clientId.isEmpty() || clientSecret == null || clientSecret.isEmpty()) {
            throw new ApiException("Missing client credentials: configure clientId and clientSecret");
        }

        FormBody form = new FormBody.Builder()
                .add("grant_type", "client_credentials")
                .add("client_id", clientId)
                .add("client_secret", clientSecret)
                .build();

        Request request = new Request.Builder()
                .url(configuration.getAuthUrl())
                .header("Accept", "application/json")
                .header("Content-Type", "application/x-www-form-urlencoded")
                .post(form)
                .build();

        try (Response response = httpClient.newCall(request).execute()) {
            byte[] body = response.body() == null ? new byte[0] : response.body().bytes();
            if (!response.isSuccessful()) {
                throw new ApiException(response.code(),
                        "Failed to obtain OAuth2 token: " + new String(body, java.nio.charset.StandardCharsets.UTF_8));
            }
            Map<String, Object> token = MAPPER.readValue(body, new TypeReference<Map<String, Object>>() {
            });
            accessToken = (String) token.get("access_token");
            if (accessToken == null || accessToken.isEmpty()) {
                throw new ApiException("OAuth2 token response did not include a non-empty access_token");
            }
            Object expiresIn = token.get("expires_in");
            long expiresSeconds = expiresIn instanceof Number ? ((Number) expiresIn).longValue() : 3600L;
            // Refresh a bit early to avoid racing an in-flight request against an expiring token. For
            // short-lived tokens (some test/edge servers return small expires_in) the margin could go
            // negative, which would force a re-authentication on every request — clamp it away.
            long ttlSeconds = expiresSeconds - 60L;
            if (ttlSeconds < 1L) {
                ttlSeconds = Math.max(expiresSeconds, 1L);
            }
            tokenExpiryMillis = System.currentTimeMillis() + ttlSeconds * 1000L;
        } catch (ApiException e) {
            throw e;
        } catch (IOException e) {
            throw new ApiException("Failed to obtain OAuth2 token: " + e.getMessage(), e);
        }
    }

    private String toJson(Object value) {
        try {
            return MAPPER.writeValueAsString(value);
        } catch (Exception e) {
            throw new ApiException("Failed to serialize request body", e);
        }
    }
}
