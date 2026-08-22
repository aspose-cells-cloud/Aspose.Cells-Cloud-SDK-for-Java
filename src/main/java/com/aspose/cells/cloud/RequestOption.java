package com.aspose.cells.cloud;

import java.util.Map;

/**
 * RequestOption — the contract every API request class implements.
 *
 * <p>Each request class (one per operation, under {@code com.aspose.cells.cloud.request}) implements
 * this interface so that {@link CellsCloudClient} can execute it uniformly.</p>
 */
public interface RequestOption {

    /** @return the uppercase HTTP verb: {@code "GET"}, {@code "POST"}, {@code "PUT"}, or {@code "DELETE"}. */
    String getMethod();

    /**
     * @return the API version path segment (e.g. {@code "v3.0"} or {@code "v4.0"}), taken from the
     *         operation's {@code APIVersion} in the specification.
     */
    String getApiVersion();

    /** @return the request path with every {@code {param}} placeholder already substituted and URL-encoded. */
    String getPath();

    /** @return the query-string parameters (required plus present optional), in insertion order. */
    Map<String, String> getQueryParameters();

    /** @return the request headers, including {@code Content-Type} when a body is present. */
    Map<String, String> getHeaderParameters();

    /** @return the JSON request body (a model, {@link java.util.List}, or a scalar), or {@code null} when absent. */
    Object getJsonBody();

    /**
     * @return the multipart form fields keyed by field name, or {@code null} when absent. A value may
     *         be a {@link FormFile} (path, {@link java.io.File}, or bytes), a plain {@link java.io.File},
     *         a {@code byte[]}, or any other scalar (sent as a text field).
     */
    Map<String, Object> getMultipartForm();
}
