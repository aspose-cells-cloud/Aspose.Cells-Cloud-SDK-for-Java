/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Options.java">
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

package com.aspose.cells.cloud.internal;

import com.aspose.cells.cloud.JsonUtil;
import com.aspose.cells.cloud.RequestOption;

import java.util.Map;

/**
 * Generic option factories shared by every convenience facade package.
 *
 * <p>All options ultimately append an implicit query parameter through
 * {@link RequestAdapter#addQueryParameter(String, String)}; this mirrors the
 * Go/Python facades, where generic parameters are forwarded to the generated
 * request's extension-query support.</p>
 */
public final class Options {

    private Options() {
        // Utility holder — no instances.
    }

    /**
     * Passes an optional parameter to the underlying generated request.
     *
     * <p>The name must match the operation parameter's wire name in the
     * specification (for example {@code "AutoRowsFit"} or
     * {@code "fontsLocation"}).</p>
     *
     * @param name  the wire name of the parameter
     * @param value the value (converted to its wire string form)
     * @return the option
     */
    public static Option commonParameter(String name, Object value) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("parameter name is required");
        }
        String text = stringify(value);
        return request -> adapter(request).addQueryParameter(name, text);
    }

    /**
     * Appends an implicit query parameter to the request URL.
     *
     * @param name  the query parameter name
     * @param value the query parameter value
     * @return the option
     */
    public static Option queryParameter(String name, String value) {
        return commonParameter(name, value);
    }

    /**
     * Appends several implicit query parameters to the request URL.
     *
     * @param parameters the parameters keyed by wire name
     * @return the option
     */
    public static Option queryParameters(Map<String, String> parameters) {
        return request -> {
            if (parameters == null) {
                return;
            }
            RequestAdapter target = adapter(request);
            for (Map.Entry<String, String> entry : parameters.entrySet()) {
                if (entry.getKey() != null && !entry.getKey().isEmpty()) {
                    target.addQueryParameter(entry.getKey(), stringify(entry.getValue()));
                }
            }
        };
    }

    /**
     * Attaches a {@code SaveOptions} model (or mapping, or JSON string) through
     * the implicit {@code "SaveOptions"} query parameter.
     *
     * @param value the save options to serialize
     * @return the option
     */
    public static Option saveOptions(Object value) {
        if (value == null) {
            throw new IllegalArgumentException("save options are required");
        }
        String text;
        if (value instanceof String) {
            text = (String) value;
        } else {
            try {
                text = JsonUtil.MAPPER.writeValueAsString(value);
            } catch (Exception e) {
                throw new IllegalArgumentException("cannot serialize save options", e);
            }
        }
        return queryParameter("SaveOptions", text);
    }

    /**
     * Applies every option to a request, skipping {@code null} entries.
     *
     * @param request the request to configure
     * @param options the options to apply
     */
    public static void apply(RequestOption request, Option... options) {
        if (options == null) {
            return;
        }
        for (Option option : options) {
            if (option != null) {
                option.apply(request);
            }
        }
    }

    /**
     * Converts an option value to the string form sent on the wire.
     *
     * @param value the value (may be {@code null})
     * @return the string form
     */
    public static String stringify(Object value) {
        if (value == null) {
            return "";
        }
        if (value instanceof String) {
            return (String) value;
        }
        if (value instanceof Boolean) {
            return ((Boolean) value) ? "true" : "false";
        }
        return String.valueOf(value);
    }

    private static RequestAdapter adapter(RequestOption request) {
        if (request instanceof RequestAdapter) {
            return (RequestAdapter) request;
        }
        throw new IllegalArgumentException(
                "facade options can only be applied to an internal RequestAdapter");
    }
}
