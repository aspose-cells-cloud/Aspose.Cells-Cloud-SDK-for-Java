package com.aspose.cells.cloud;

/**
 * ApiException — thrown by the SDK when a request fails or the server returns an error response.
 *
 * <p>Extends {@link RuntimeException} so callers are not forced to declare checked exceptions. The
 * {@link #getCode()} accessor exposes the HTTP status code (or {@code 0} for client-side failures that
 * never reached the server).</p>
 */
public class ApiException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /** HTTP status code, or 0 for client-side failures. */
    private final int code;

    /**
     * Creates an exception with an HTTP status code and a human-readable message.
     *
     * @param code    the HTTP status code (0 when not applicable)
     * @param message the error message
     */
    public ApiException(int code, String message) {
        super(message);
        this.code = code;
    }

    /**
     * Creates an exception without an HTTP status code.
     *
     * @param message the error message
     */
    public ApiException(String message) {
        this(0, message);
    }

    /**
     * Creates an exception wrapping an underlying cause.
     *
     * @param message the error message
     * @param cause   the underlying cause
     */
    public ApiException(String message, Throwable cause) {
        super(message, cause);
        this.code = 0;
    }

    /**
     * @return the HTTP status code, or {@code 0} when the failure did not carry a code.
     */
    public int getCode() {
        return code;
    }
}
