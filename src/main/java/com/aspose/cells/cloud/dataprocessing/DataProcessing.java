/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataProcessing.java">
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

import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
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
import com.aspose.cells.cloud.request.ImportCSVDataIntoSpreadsheetRequest;
import com.aspose.cells.cloud.request.ImportDataIntoSpreadsheetRequest;
import com.aspose.cells.cloud.request.ImportJSONDataIntoSpreadsheetRequest;
import com.aspose.cells.cloud.request.ImportXMLDataIntoSpreadsheetRequest;
import com.aspose.cells.cloud.request.MergeRemoteSpreadsheetRequest;
import com.aspose.cells.cloud.request.MergeSpreadsheetsRequest;
import com.aspose.cells.cloud.request.SplitRemoteSpreadsheetRequest;
import com.aspose.cells.cloud.request.SplitSpreadsheetRequest;

/**
 * Data-processing facades: import, merge and split spreadsheets.
 *
 * <p>The v4.0 import endpoints take the data file as the multipart
 * {@code datafile} field and the target template spreadsheet as the
 * {@code Spreadsheet} field, and return the merged workbook as raw bytes.</p>
 */
public final class DataProcessing {

    @FunctionalInterface
    private interface ImportBuilder {
        RequestOption create(FormFile datafile, FormFile spreadsheet,
                             String startcell, String worksheet);
    }

    private DataProcessing() {
        // Static facade — no instances.
    }

    /**
     * Imports XML data into a template spreadsheet at the given
     * worksheet/start-cell position and writes the merged workbook to
     * {@code sink}.
     */
    public static void importXml(CellsCloudClient client, DataSource datafile, DataSource template,
                                 DataSink sink, String worksheet, String startcell,
                                 Option... options) {
        importLocal(client, ImportXMLDataIntoSpreadsheetRequest::new, datafile, template, sink,
                worksheet, startcell, options);
    }

    /**
     * Imports JSON data into a template spreadsheet at the given
     * worksheet/start-cell position and writes the merged workbook to
     * {@code sink}.
     */
    public static void importJson(CellsCloudClient client, DataSource datafile, DataSource template,
                                  DataSink sink, String worksheet, String startcell,
                                  Option... options) {
        importLocal(client, ImportJSONDataIntoSpreadsheetRequest::new, datafile, template, sink,
                worksheet, startcell, options);
    }

    /**
     * Imports CSV data into a template spreadsheet at the given
     * worksheet/start-cell position and writes the merged workbook to
     * {@code sink}.
     */
    public static void importCsv(CellsCloudClient client, DataSource datafile, DataSource template,
                                 DataSink sink, String worksheet, String startcell,
                                 Option... options) {
        importLocal(client, ImportCSVDataIntoSpreadsheetRequest::new, datafile, template, sink,
                worksheet, startcell, options);
    }

    /**
     * Imports data whose format the server infers into a template spreadsheet
     * at the given worksheet/start-cell position and writes the merged
     * workbook to {@code sink}.
     */
    public static void importData(CellsCloudClient client, DataSource datafile, DataSource template,
                                  DataSink sink, String worksheet, String startcell,
                                  Option... options) {
        importLocal(client, ImportDataIntoSpreadsheetRequest::new, datafile, template, sink,
                worksheet, startcell, options);
    }

    /** Convenience overload reading a data file, template and sink from local paths. */
    public static void importXml(CellsCloudClient client, String datafilePath, String templatePath,
                                 String sinkPath, String worksheet, String startcell,
                                 Option... options) {
        importXml(client, new FilePathSource(datafilePath), new FilePathSource(templatePath),
                new FilePathSink(sinkPath), worksheet, startcell, options);
    }

    /** Convenience overload reading a data file, template and sink from local paths. */
    public static void importJson(CellsCloudClient client, String datafilePath, String templatePath,
                                  String sinkPath, String worksheet, String startcell,
                                  Option... options) {
        importJson(client, new FilePathSource(datafilePath), new FilePathSource(templatePath),
                new FilePathSink(sinkPath), worksheet, startcell, options);
    }

    /** Convenience overload reading a data file, template and sink from local paths. */
    public static void importCsv(CellsCloudClient client, String datafilePath, String templatePath,
                                 String sinkPath, String worksheet, String startcell,
                                 Option... options) {
        importCsv(client, new FilePathSource(datafilePath), new FilePathSource(templatePath),
                new FilePathSink(sinkPath), worksheet, startcell, options);
    }

    /** Convenience overload reading a data file, template and sink from local paths. */
    public static void importData(CellsCloudClient client, String datafilePath, String templatePath,
                                  String sinkPath, String worksheet, String startcell,
                                  Option... options) {
        importData(client, new FilePathSource(datafilePath), new FilePathSource(templatePath),
                new FilePathSink(sinkPath), worksheet, startcell, options);
    }

    /**
     * Merges the worksheets of a local spreadsheet into a single output
     * workbook and writes the result bytes to {@code sink}. Set the target
     * format with {@link DataProcessingOptions#outFormat}.
     *
     * <p>Uses {@code PUT /v4.0/cells/merge/spreadsheet}.</p>
     */
    public static void mergeSpreadsheet(CellsCloudClient client, DataSource src, DataSink sink,
                                        Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(new MergeSpreadsheetsRequest(spreadsheet));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload reading/writing local paths. */
    public static void mergeSpreadsheet(CellsCloudClient client, String srcPath, String sinkPath,
                                        Option... options) {
        mergeSpreadsheet(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), options);
    }

    /**
     * Merges a cloud spreadsheet into another cloud workbook and writes the
     * resulting workbook to {@code sink}. Set the target format with
     * {@link DataProcessingOptions#outFormat}.
     *
     * <p>Uses {@code PUT /v4.0/cells/{name}/merge/spreadsheet}.</p>
     */
    public static void mergeRemoteSpreadsheet(CellsCloudClient client, WorkbookRef ref,
                                              String mergedSpreadsheet, DataSink sink,
                                              Option... options) {
        Support.requireWorkbook(ref);
        Support.require(mergedSpreadsheet != null && !mergedSpreadsheet.isEmpty(),
                "merged spreadsheet name is required");
        Support.require(sink != null, "sink is required");

        RequestAdapter request = new RequestAdapter(
                new MergeRemoteSpreadsheetRequest(mergedSpreadsheet, ref.getName()));
        Options.apply(request, Support.workbookParams(ref));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload accepting a cloud file name. */
    public static void mergeRemoteSpreadsheet(CellsCloudClient client, String name,
                                              String mergedSpreadsheet, DataSink sink,
                                              Option... options) {
        mergeRemoteSpreadsheet(client, WorkbookRef.of(name), mergedSpreadsheet, sink, options);
    }

    /**
     * Splits a local spreadsheet by worksheets and writes the resulting
     * file(s) to {@code sink}. Set the target format with
     * {@link DataProcessingOptions#outFormat}; optionally scope the split with
     * {@link DataProcessingOptions#from} and {@link DataProcessingOptions#to}.
     *
     * <p>Uses {@code PUT /v4.0/cells/split/spreadsheet}.</p>
     */
    public static void splitSpreadsheet(CellsCloudClient client, DataSource src, DataSink sink,
                                        Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(new SplitSpreadsheetRequest(spreadsheet));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload reading/writing local paths. */
    public static void splitSpreadsheet(CellsCloudClient client, String srcPath, String sinkPath,
                                        Option... options) {
        splitSpreadsheet(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), options);
    }

    /**
     * Splits a cloud spreadsheet by worksheets into files written under
     * {@code outPath}. Set the target format with
     * {@link DataProcessingOptions#outFormat}.
     *
     * <p>Uses {@code PUT /v4.0/cells/{name}/split/spreadsheet} and returns the
     * raw response so the caller can inspect the resulting file list.</p>
     *
     * @return the rich response
     */
    public static RichResponse splitRemoteSpreadsheet(CellsCloudClient client, WorkbookRef ref,
                                                      String outPath, Option... options) {
        Support.requireWorkbook(ref);
        Support.require(outPath != null && !outPath.isEmpty(), "outPath is required");

        RequestAdapter request = new RequestAdapter(
                new SplitRemoteSpreadsheetRequest(ref.getName()));
        Options.apply(request, Support.workbookParams(ref));
        Options.apply(request, new Option[] {Options.commonParameter("outPath", outPath)});
        Options.apply(request, options);

        return Support.doChecked(client, request);
    }

    /** Convenience overload accepting a cloud file name. */
    public static RichResponse splitRemoteSpreadsheet(CellsCloudClient client, String name,
                                                      String outPath, Option... options) {
        return splitRemoteSpreadsheet(client, WorkbookRef.of(name), outPath, options);
    }

    private static void importLocal(CellsCloudClient client, ImportBuilder builder,
                                    DataSource datafile, DataSource template, DataSink sink,
                                    String worksheet, String startcell, Option... options) {
        Support.require(datafile != null && template != null && sink != null,
                "datafile, template and sink are required");
        Support.require(worksheet != null && !worksheet.isEmpty(), "worksheet is required");
        Support.require(startcell != null && !startcell.isEmpty(), "start cell is required");

        FormFile dataFilePart = FormFile.of(Support.readSource(datafile), "datafile");
        FormFile templatePart = FormFile.of(Support.readSource(template), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(
                builder.create(dataFilePart, templatePart, startcell, worksheet));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }
}
