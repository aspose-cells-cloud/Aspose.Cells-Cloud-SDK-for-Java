/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="EditorOptions.java">
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

package com.aspose.cells.cloud.editor;

import com.aspose.cells.cloud.internal.Option;
import com.aspose.cells.cloud.internal.Options;

import java.util.Map;

/**
 * Options for worksheet editing operations.
 */
public final class EditorOptions {

    private EditorOptions() {
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

    /** @return an option that sets the insert position of a new worksheet. */
    public static Option position(int value) {
        return commonParameter("position", value);
    }

    /** @return an option that sets the sheet type for a new worksheet. */
    public static Option sheetType(String value) {
        return commonParameter("sheetType", value);
    }

    /** @return an option that initializes a new workbook from a cloud template file path. */
    public static Option template(String value) {
        return commonParameter("template", value);
    }

    /** @return an option that sets the output format of a created workbook. */
    public static Option format(String value) {
        return commonParameter("format", value);
    }

    /** @return an option that writes the edited workbook to this cloud path. */
    public static Option outPath(String value) {
        return commonParameter("outPath", value);
    }

    /** @return an option that sets the cloud storage name for the output workbook. */
    public static Option outStorageName(String value) {
        return commonParameter("outStorageName", value);
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
