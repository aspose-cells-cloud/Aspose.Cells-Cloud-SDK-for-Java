/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RequestAdapter.java">
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

import com.aspose.cells.cloud.RequestOption;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Wraps a generated request and carries the implicit (extension) query
 * parameters contributed by facade options.
 *
 * <p>Generated request classes expose {@code addQueryParameter(String,
 * String)} but do not share a common supertype for it; every request does
 * however implement {@link RequestOption}. This adapter keeps the facade
 * option API uniform: options call {@link #addQueryParameter(String, String)}
 * on the adapter, and the adapter merges those parameters into the generated
 * request's query string when the SDK client serializes it.</p>
 *
 * <p>The adapter is a plain delegator; it does not use reflection. Every
 * method of {@link RequestOption} is forwarded to the wrapped request.</p>
 */
public final class RequestAdapter implements RequestOption {

    private final RequestOption delegate;
    private final Map<String, String> extraQueryParameters = new LinkedHashMap<>();

    /**
     * @param delegate the generated request to wrap (required)
     */
    public RequestAdapter(RequestOption delegate) {
        if (delegate == null) {
            throw new IllegalArgumentException("request is required");
        }
        this.delegate = delegate;
    }

    /** @return the wrapped generated request. */
    public RequestOption getDelegate() {
        return delegate;
    }

    /**
     * Adds an implicit query parameter to the request URL.
     *
     * @param name  the query parameter name
     * @param value the query parameter value
     * @return this adapter, for chaining
     */
    public RequestAdapter addQueryParameter(String name, String value) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("query parameter name is required");
        }
        this.extraQueryParameters.put(name, value == null ? "" : value);
        return this;
    }

    /** @return the implicit query parameters contributed by options. */
    public Map<String, String> getExtraQueryParameters() {
        return extraQueryParameters;
    }

    @Override
    public String getMethod() {
        return delegate.getMethod();
    }

    @Override
    public String getApiVersion() {
        return delegate.getApiVersion();
    }

    @Override
    public String getPath() {
        return delegate.getPath();
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>(delegate.getQueryParameters());
        query.putAll(extraQueryParameters);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        return delegate.getHeaderParameters();
    }

    @Override
    public Object getJsonBody() {
        return delegate.getJsonBody();
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return delegate.getMultipartForm();
    }

    @Override
    public String getJsonBodyPartName() {
        return delegate.getJsonBodyPartName();
    }

    @Override
    public boolean isBinaryResponse() {
        return delegate.isBinaryResponse();
    }
}
