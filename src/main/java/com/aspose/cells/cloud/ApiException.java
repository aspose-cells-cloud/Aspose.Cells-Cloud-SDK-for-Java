/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ApiException.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

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
