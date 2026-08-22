package com.aspose.cells.cloud;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
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

    private static final ObjectMapper MAPPER = new ObjectMapper()
            .registerModule(new JavaTimeModule())
            .setSerializationInclusion(JsonInclude.Include.NON_NULL)
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    private final Configuration configuration;
    private final OkHttpClient httpClient;

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
        this.configuration = new Configuration();
        this.configuration.setClientId(clientId);
        this.configuration.setClientSecret(clientSecret);
        if (baseUrl != null && !baseUrl.isEmpty()) {
            this.configuration.setBaseUrl(baseUrl);
        }
        this.httpClient = new OkHttpClient.Builder()
                .connectTimeout(configuration.getTimeout().toMillis(), TimeUnit.MILLISECONDS)
                .readTimeout(configuration.getTimeout().toMillis(), TimeUnit.MILLISECONDS)
                .writeTimeout(configuration.getTimeout().toMillis(), TimeUnit.MILLISECONDS)
                .build();
    }

    /** @return the underlying configuration. */
    public Configuration getConfiguration() {
        return configuration;
    }

    /** Fluent setter for the request timeout. */
    public CellsCloudClient setTimeout(Duration timeout) {
        configuration.setTimeout(timeout);
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
                builder.delete();
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

            if (code >= 400) {
                throw new ApiException(code, "HTTP " + code + ": " + new String(body, java.nio.charset.StandardCharsets.UTF_8));
            }
            return new RichResponse(code, headers, body);
        } catch (ApiException e) {
            throw e;
        } catch (IOException e) {
            // Retry transient transport failures.
            if (retriesLeft > 0) {
                return execute(requestOption, retriesLeft - 1);
            }
            throw new ApiException("Request failed: " + e.getMessage(), e);
        }
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
                mb.addFormDataPart("data", toJson(jsonBody));
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
        // The request path already carries the per-operation API version segment (e.g. /v3.0/cells/...).
        String base = configuration.getBaseUrl();
        if (base.endsWith("/")) {
            base = base.substring(0, base.length() - 1);
        }
        String apiUrl = base + requestOption.getPath();
        HttpUrl.Builder builder = HttpUrl.parse(apiUrl).newBuilder();
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
        builder.header("Accept", "application/json");
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
            Object expiresIn = token.get("expires_in");
            long expiresSeconds = expiresIn instanceof Number ? ((Number) expiresIn).longValue() : 3600L;
            // Refresh a bit early to avoid racing an in-flight request against an expiring token.
            tokenExpiryMillis = System.currentTimeMillis() + (expiresSeconds - 60L) * 1000L;
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
