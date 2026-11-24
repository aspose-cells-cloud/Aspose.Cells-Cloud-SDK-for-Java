/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReportingOptions.java">
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

package com.aspose.cells.cloud.reporting;

import com.aspose.cells.cloud.internal.Option;
import com.aspose.cells.cloud.internal.Options;

import java.util.Map;

/**
 * Options for reporting and AI analysis operations.
 */
public final class ReportingOptions {

    private ReportingOptions() {
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

    /** @return an option that restricts an analysis/calculation to a worksheet. */
    public static Option worksheet(String value) {
        return commonParameter("worksheet", value);
    }

    /** @return an option that restricts an analysis/calculation to a cell range. */
    public static Option range(String value) {
        return commonParameter("range", value);
    }

    /** @return an option that sets the aggregation/calculation operation. */
    public static Option operation(String value) {
        return commonParameter("operation", value);
    }

    /** @return an option that sets the color position (for example {@code fill} or {@code font}). */
    public static Option colorPosition(String value) {
        return commonParameter("colorPosition", value);
    }

    /** @return an option that scopes an AI analysis/calculation to a worksheet by name. */
    public static Option sheetName(String value) {
        return commonParameter("sheetName", value);
    }

    /** @return an option that names the category column produced by categorize. */
    public static Option newColumnName(String value) {
        return commonParameter("newColumnName", value);
    }

    /** @return an option that sets the workbook open password. */
    public static Option password(String value) {
        return commonParameter("password", value);
    }

    /** @return an option that sets the region. */
    public static Option region(String value) {
        return commonParameter("region", value);
    }
}
