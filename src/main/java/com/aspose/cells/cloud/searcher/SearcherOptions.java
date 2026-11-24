/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SearcherOptions.java">
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

package com.aspose.cells.cloud.searcher;

import com.aspose.cells.cloud.internal.Option;
import com.aspose.cells.cloud.internal.Options;

import java.util.Map;

/**
 * Options for search and replace operations.
 */
public final class SearcherOptions {

    private SearcherOptions() {
        // Factory methods only — no instances.
    }

    /** @return an option that passes a raw optional parameter to the request. */
    public static Option commonParameter(String name, Object value) {
        return Options.commonParameter(name, value);
    }

    /** @return an option that appends an implicit query parameter. */
    public static Option queryParameter(String name, String value) {
        return Options.queryParameter(name, value);
    }

    /** @return an option that appends several implicit query parameters. */
    public static Option queryParameters(Map<String, String> parameters) {
        return Options.queryParameters(parameters);
    }

    /** @return an option that applies several options in order. */
    public static Option raw(Option... options) {
        return request -> Options.apply(request, options);
    }

    /** @return an option scoping the search or replace to one worksheet. */
    public static Option worksheet(String value) {
        return commonParameter("worksheet", value);
    }

    /** @return an option scoping the search or replace to a cell range (A1 style). */
    public static Option cellArea(String value) {
        return commonParameter("cellArea", value);
    }

    /** @return an option requesting a case-insensitive search. */
    public static Option ignoringCase(boolean value) {
        return commonParameter("ignoringCase", value);
    }

    /** @return an option that sets the workbook open password. */
    public static Option password(String value) {
        return commonParameter("password", value);
    }

    /** @return an option that sets the region. */
    public static Option region(String value) {
        return commonParameter("region", value);
    }

    /** @return an option that sets the cloud folder that contains the workbook. */
    public static Option folder(String value) {
        return commonParameter("folder", value);
    }

    /** @return an option that sets the cloud storage name. */
    public static Option storageName(String value) {
        return commonParameter("storageName", value);
    }
}
