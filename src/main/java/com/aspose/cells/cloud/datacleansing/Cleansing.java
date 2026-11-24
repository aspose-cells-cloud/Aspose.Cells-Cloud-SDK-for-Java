/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Cleansing.java">
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

package com.aspose.cells.cloud.datacleansing;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.RichResponse;
import com.aspose.cells.cloud.datasource.BytesSource;
import com.aspose.cells.cloud.datasource.DataSink;
import com.aspose.cells.cloud.datasource.DataSource;
import com.aspose.cells.cloud.datasource.FilePathSink;
import com.aspose.cells.cloud.datasource.FilePathSource;
import com.aspose.cells.cloud.internal.Option;
import com.aspose.cells.cloud.internal.Options;
import com.aspose.cells.cloud.internal.RequestAdapter;
import com.aspose.cells.cloud.internal.Support;
import com.aspose.cells.cloud.request.RemoveDuplicatesRequest;
import com.aspose.cells.cloud.request.RemoveSpreadsheetBlankColumnsRequest;
import com.aspose.cells.cloud.request.RemoveSpreadsheetBlankRowsRequest;
import com.aspose.cells.cloud.request.RemoveSpreadsheetBlankWorksheetsRequest;

/**
 * Data-cleansing facades: remove blank rows, blank columns, blank worksheets
 * and duplicate rows.
 *
 * <p>Cleansing is exposed as local multipart operations: the spreadsheet is
 * uploaded, the server removes the targeted content and returns the cleaned
 * workbook, which is written to the sink.</p>
 */
public final class Cleansing {

    @FunctionalInterface
    private interface Builder {
        RequestOption create(FormFile spreadsheet);
    }

    private Cleansing() {
        // Static facade — no instances.
    }

    /**
     * Removes blank rows and writes the cleaned workbook to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/remove/blank-rows}.</p>
     */
    public static void removeBlankRows(CellsCloudClient client, DataSource src, DataSink sink,
                                       Option... options) {
        clean(client, src, sink, RemoveSpreadsheetBlankRowsRequest::new, options);
    }

    /**
     * Removes blank columns and writes the cleaned workbook to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/remove/blank-columns}.</p>
     */
    public static void removeBlankColumns(CellsCloudClient client, DataSource src, DataSink sink,
                                          Option... options) {
        clean(client, src, sink, RemoveSpreadsheetBlankColumnsRequest::new, options);
    }

    /**
     * Removes blank worksheets and writes the cleaned workbook to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/remove/blank-worksheets}.</p>
     */
    public static void removeBlankWorksheets(CellsCloudClient client, DataSource src, DataSink sink,
                                             Option... options) {
        clean(client, src, sink, RemoveSpreadsheetBlankWorksheetsRequest::new, options);
    }

    /**
     * Removes duplicate rows within a worksheet, cell range or table and writes
     * the cleaned workbook to {@code sink}. Scope the removal with
     * {@link CleansingOptions#worksheet}, {@link CleansingOptions#range} or
     * {@link CleansingOptions#table}.
     *
     * <p>Uses {@code PUT /v4.0/cells/remove/duplicates}.</p>
     */
    public static void removeDuplicates(CellsCloudClient client, DataSource src, DataSink sink,
                                        Option... options) {
        clean(client, src, sink, RemoveDuplicatesRequest::new, options);
    }

    /** Convenience overloads reading/writing local paths. */
    public static void removeBlankRows(CellsCloudClient client, String srcPath, String sinkPath,
                                       Option... options) {
        removeBlankRows(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), options);
    }

    /** Convenience overloads reading/writing local paths. */
    public static void removeBlankColumns(CellsCloudClient client, String srcPath, String sinkPath,
                                          Option... options) {
        removeBlankColumns(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), options);
    }

    /** Convenience overloads reading/writing local paths. */
    public static void removeBlankWorksheets(CellsCloudClient client, String srcPath,
                                             String sinkPath, Option... options) {
        removeBlankWorksheets(client, new FilePathSource(srcPath), new FilePathSink(sinkPath),
                options);
    }

    /** Convenience overloads reading/writing local paths. */
    public static void removeDuplicates(CellsCloudClient client, String srcPath, String sinkPath,
                                        Option... options) {
        removeDuplicates(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), options);
    }

    /** Convenience overloads reading an in-memory byte array. */
    public static void removeBlankRows(CellsCloudClient client, byte[] src, DataSink sink,
                                       Option... options) {
        removeBlankRows(client, new BytesSource(src), sink, options);
    }

    /** Convenience overloads reading an in-memory byte array. */
    public static void removeBlankColumns(CellsCloudClient client, byte[] src, DataSink sink,
                                          Option... options) {
        removeBlankColumns(client, new BytesSource(src), sink, options);
    }

    /** Convenience overloads reading an in-memory byte array. */
    public static void removeBlankWorksheets(CellsCloudClient client, byte[] src, DataSink sink,
                                             Option... options) {
        removeBlankWorksheets(client, new BytesSource(src), sink, options);
    }

    /** Convenience overloads reading an in-memory byte array. */
    public static void removeDuplicates(CellsCloudClient client, byte[] src, DataSink sink,
                                        Option... options) {
        removeDuplicates(client, new BytesSource(src), sink, options);
    }

    private static void clean(CellsCloudClient client, DataSource src, DataSink sink,
                              Builder builder, Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(builder.create(spreadsheet));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }
}
