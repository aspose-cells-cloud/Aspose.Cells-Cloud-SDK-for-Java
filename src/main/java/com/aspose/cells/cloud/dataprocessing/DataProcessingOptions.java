/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataProcessingOptions.java">
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

package com.aspose.cells.cloud.dataprocessing;

import com.aspose.cells.cloud.internal.Option;
import com.aspose.cells.cloud.internal.Options;

import java.util.Map;

/**
 * Options for import, merge and split operations.
 */
public final class DataProcessingOptions {

    private DataProcessingOptions() {
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

    /** @return an option that inserts data instead of overwriting the target cells. */
    public static Option insert(boolean value) {
        return commonParameter("insert", value);
    }

    /** @return an option that converts imported numeric strings to numeric cell values. */
    public static Option convertNumericData(boolean value) {
        return commonParameter("convertNumericData", value);
    }

    /** @return an option that sets the column delimiter for CSV imports. */
    public static Option splitter(String value) {
        return commonParameter("splitter", value);
    }

    /** @return an option that sets the target format of merged or split output. */
    public static Option outFormat(String value) {
        return commonParameter("outFormat", value);
    }

    /** @return an option that merges all worksheets into a single sheet. */
    public static Option mergeInOneSheet(boolean value) {
        return commonParameter("mergeInOneSheet", value);
    }

    /** @return an option that starts a split at the given zero-based worksheet index. */
    public static Option from(int value) {
        return commonParameter("from", value);
    }

    /** @return an option that ends a split at the given zero-based worksheet index. */
    public static Option to(int value) {
        return commonParameter("to", value);
    }

    /** @return an option that sets the fonts location used for merge/split output. */
    public static Option fontsLocation(String value) {
        return commonParameter("fontsLocation", value);
    }

    /** @return an option that writes the output to this cloud path. */
    public static Option outPath(String value) {
        return commonParameter("outPath", value);
    }

    /** @return an option that sets the cloud storage name for the output file. */
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
