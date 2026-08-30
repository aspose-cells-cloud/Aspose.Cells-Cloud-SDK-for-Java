package com.aspose.cells.cloud;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * RichResponse — the unified response type returned by {@link CellsCloudClient#call(RequestOption)}.
 *
 * <p>Carries the HTTP status code, response headers, and the raw response body bytes, together with a
 * convenience JSON decoder.</p>
 */
public class RichResponse {

    private final int statusCode;
    private final Map<String, List<String>> headers;
    private final byte[] body;

    /**
     * @param statusCode the HTTP status code
     * @param headers    the response headers (may be empty)
     * @param body       the raw response body bytes (may be empty, never {@code null})
     */
    public RichResponse(int statusCode, Map<String, List<String>> headers, byte[] body) {
        this.statusCode = statusCode;
        this.headers = headers == null
                ? Collections.<String, List<String>>emptyMap()
                : Collections.unmodifiableMap(headers);
        this.body = body == null ? new byte[0] : body;
    }

    /** @return the HTTP status code. */
    public int getStatusCode() {
        return statusCode;
    }

    /** @return the response headers. */
    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    /** @return the raw response body bytes (never {@code null}). */
    public byte[] getBody() {
        return body;
    }

    /**
     * Decodes the response body as UTF-8 text.
     *
     * @return the body as a String
     */
    @Override
    public String toString() {
        return new String(body, StandardCharsets.UTF_8);
    }

    /** @return the raw response body bytes (a copy). */
    public byte[] toBytes() {
        return body.clone();
    }

    /**
     * Returns the raw response body as a stream, for callers that want to consume large payloads
     * (file downloads/conversions) without materialising the {@link #getBody()} byte array into
     * another copy. The response bytes are already buffered by the client, so this is an in-memory
     * stream, not a socket stream.
     *
     * @return a fresh, independent stream over the response body bytes
     */
    public ByteArrayInputStream getBodyStream() {
        return new ByteArrayInputStream(body);
    }

    /**
     * Parses the JSON response body into an instance of the given type.
     *
     * @param target the target model class
     * @param <T>    the target type
     * @return the parsed object
     * @throws ApiException if the body cannot be parsed
     */
    public <T> T getJson(Class<T> target) {
        try {
            return JsonUtil.MAPPER.readValue(body, target);
        } catch (Exception e) {
            throw new ApiException("Failed to parse response body as " + target.getSimpleName(), e);
        }
    }
}
