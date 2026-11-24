/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Converter.java">
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

package com.aspose.cells.cloud.converter;

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RichResponse;
import com.aspose.cells.cloud.WorkbookRef;
import com.aspose.cells.cloud.datasource.DataSink;
import com.aspose.cells.cloud.datasource.DataSource;
import com.aspose.cells.cloud.datasource.FilePathSink;
import com.aspose.cells.cloud.datasource.FilePathSource;
import com.aspose.cells.cloud.internal.Option;
import com.aspose.cells.cloud.internal.Options;
import com.aspose.cells.cloud.internal.RequestAdapter;
import com.aspose.cells.cloud.internal.Support;
import com.aspose.cells.cloud.request.ConvertSpreadsheetRequest;
import com.aspose.cells.cloud.request.ExportSpreadsheetAsFormatRequest;
import com.aspose.cells.cloud.request.ExportWorksheetAsFormatRequest;

/**
 * Spreadsheet conversion and export facades (v4.0 API).
 *
 * <p>Local conversions upload the spreadsheet and stream the converted file
 * back; cloud exports read a workbook already stored in Aspose.Cells Cloud
 * storage.</p>
 */
public final class Converter {

    private Converter() {
        // Static facade — no instances.
    }

    /**
     * Converts a local spreadsheet to the target format and writes the result
     * to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/convert/spreadsheet}.</p>
     *
     * @param client  the SDK client
     * @param src     the local spreadsheet source
     * @param sink    the destination for the converted bytes
     * @param format  the target format (see {@link Formats})
     * @param options optional conversion options
     */
    public static void convert(CellsCloudClient client, DataSource src, DataSink sink,
                               String format, Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");
        Support.require(format != null && !format.isEmpty(), "format is required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(
                new ConvertSpreadsheetRequest(format, spreadsheet));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /**
     * Convenience overload reading from a local path and writing to a local
     * path.
     */
    public static void convert(CellsCloudClient client, String srcPath, String sinkPath,
                               String format, Option... options) {
        convert(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), format, options);
    }

    /**
     * Convenience overload reading from an in-memory byte array.
     */
    public static void convert(CellsCloudClient client, byte[] src, DataSink sink,
                               String format, Option... options) {
        convert(client, new com.aspose.cells.cloud.datasource.BytesSource(src), sink, format, options);
    }

    /** Converts a spreadsheet to PDF. */
    public static void convertToPdf(CellsCloudClient client, DataSource src, DataSink sink,
                                    Option... options) {
        convert(client, src, sink, Formats.FORMAT_PDF, options);
    }

    /** Converts a spreadsheet to CSV. */
    public static void convertToCsv(CellsCloudClient client, DataSource src, DataSink sink,
                                    Option... options) {
        convert(client, src, sink, Formats.FORMAT_CSV, options);
    }

    /** Converts a spreadsheet to JSON. */
    public static void convertToJson(CellsCloudClient client, DataSource src, DataSink sink,
                                     Option... options) {
        convert(client, src, sink, Formats.FORMAT_JSON, options);
    }

    /** Converts a spreadsheet to HTML. */
    public static void convertToHtml(CellsCloudClient client, DataSource src, DataSink sink,
                                     Option... options) {
        convert(client, src, sink, Formats.FORMAT_HTML, options);
    }

    /** Converts a spreadsheet to XLSX. */
    public static void convertToXlsx(CellsCloudClient client, DataSource src, DataSink sink,
                                     Option... options) {
        convert(client, src, sink, Formats.FORMAT_XLSX, options);
    }

    /** Converts a spreadsheet to PNG. */
    public static void convertToPng(CellsCloudClient client, DataSource src, DataSink sink,
                                    Option... options) {
        convert(client, src, sink, Formats.FORMAT_PNG, options);
    }

    /** Converts a spreadsheet to DOCX. */
    public static void convertToDocx(CellsCloudClient client, DataSource src, DataSink sink,
                                     Option... options) {
        convert(client, src, sink, Formats.FORMAT_DOCX, options);
    }

    /** Converts a spreadsheet to SQL. */
    public static void convertToSql(CellsCloudClient client, DataSource src, DataSink sink,
                                    Option... options) {
        convert(client, src, sink, Formats.FORMAT_SQL, options);
    }

    /**
     * Exports a workbook from cloud storage to the target format and writes the
     * downloaded bytes to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/{name}/export}.</p>
     */
    public static void workbook(CellsCloudClient client, WorkbookRef ref, DataSink sink,
                                String format, Option... options) {
        Support.requireWorkbook(ref);
        Support.require(sink != null, "sink is required");
        Support.require(format != null && !format.isEmpty(), "format is required");

        RequestAdapter request = new RequestAdapter(
                new ExportSpreadsheetAsFormatRequest(format, ref.getName()));
        Options.apply(request, Support.workbookParams(ref));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload accepting a cloud file name. */
    public static void workbook(CellsCloudClient client, String name, DataSink sink,
                                String format, Option... options) {
        workbook(client, WorkbookRef.of(name), sink, format, options);
    }

    /** Alias for {@link #workbook(CellsCloudClient, WorkbookRef, DataSink, String, Option...)}. */
    public static void workbookExport(CellsCloudClient client, WorkbookRef ref, DataSink sink,
                                      String format, Option... options) {
        workbook(client, ref, sink, format, options);
    }

    /** Convenience alias accepting a cloud file name. */
    public static void workbookExport(CellsCloudClient client, String name, DataSink sink,
                                      String format, Option... options) {
        workbook(client, name, sink, format, options);
    }

    /**
     * Exports a single worksheet of a cloud workbook to the target format and
     * writes the downloaded bytes to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/{name}/worksheets/{worksheet}/export}.</p>
     */
    public static void worksheet(CellsCloudClient client, WorkbookRef ref, String worksheet,
                                 DataSink sink, String format, Option... options) {
        Support.requireWorkbook(ref);
        Support.require(worksheet != null && !worksheet.isEmpty(), "worksheet name is required");
        Support.require(sink != null, "sink is required");
        Support.require(format != null && !format.isEmpty(), "format is required");

        RequestAdapter request = new RequestAdapter(
                new ExportWorksheetAsFormatRequest(format, ref.getName(), worksheet));
        Options.apply(request, Support.workbookParams(ref));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload accepting a cloud file name. */
    public static void worksheet(CellsCloudClient client, String name, String worksheet,
                                 DataSink sink, String format, Option... options) {
        worksheet(client, WorkbookRef.of(name), worksheet, sink, format, options);
    }

    /** Alias for {@link #worksheet(CellsCloudClient, WorkbookRef, String, DataSink, String, Option...)}. */
    public static void worksheetExport(CellsCloudClient client, WorkbookRef ref, String worksheet,
                                       DataSink sink, String format, Option... options) {
        worksheet(client, ref, worksheet, sink, format, options);
    }

    /** Convenience alias accepting a cloud file name. */
    public static void worksheetExport(CellsCloudClient client, String name, String worksheet,
                                       DataSink sink, String format, Option... options) {
        worksheet(client, name, worksheet, sink, format, options);
    }
}
