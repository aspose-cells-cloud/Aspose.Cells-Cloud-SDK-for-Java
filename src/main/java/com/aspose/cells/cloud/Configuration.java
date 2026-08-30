package com.aspose.cells.cloud;

import java.time.Duration;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Configuration — runtime configuration for the Aspose.Cells Cloud SDK.
 *
 * <p>All configurable values are centralized here and reachable from {@link CellsCloudClient}.
 * Credentials have no default and are supplied by the caller; a missing credential is reported at
 * request time via {@link ApiException}.</p>
 */
public class Configuration {

    private String clientId;
    private String clientSecret;
    private String baseUrl = "https://api.aspose.cloud";
    private String authUrl = "https://api.aspose.cloud/connect/token";
    private Duration timeout = Duration.ofSeconds(30);
    private int retries = 0;
    private final Map<String, String> headerParameters = new LinkedHashMap<>();

    /** @return the OAuth2 client id. */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /** @return the OAuth2 client secret. */
    public String getClientSecret() {
        return clientSecret;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /** @return the API base URL (defaults to {@code https://api.aspose.cloud}). */
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    /** @return the OAuth2 token endpoint URL. */
    public String getAuthUrl() {
        return authUrl;
    }

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    /** @return the request timeout (defaults to 30 seconds). */
    public Duration getTimeout() {
        return timeout;
    }

    public void setTimeout(Duration timeout) {
        if (timeout == null) {
            throw new IllegalArgumentException("timeout must not be null");
        }
        this.timeout = timeout;
    }

    /** @return the number of automatic retries on transient failures (defaults to 0). */
    public int getRetries() {
        return retries;
    }

    public void setRetries(int retries) {
        this.retries = retries;
    }

    /** @return the default headers applied to every request (insertion-ordered). */
    public Map<String, String> getHeaderParameters() {
        return headerParameters;
    }

    /**
     * Adds or replaces a default header applied to every request.
     *
     * @param key   the header name
     * @param value the header value
     */
    public void addDefaultHeader(String key, String value) {
        headerParameters.put(key, value);
    }
}
