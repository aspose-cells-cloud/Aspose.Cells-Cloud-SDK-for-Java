/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Editor.java">
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

import com.aspose.cells.cloud.ApiException;
import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.JsonUtil;
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
import com.aspose.cells.cloud.request.AddWorksheetToSpreadsheetRequest;
import com.aspose.cells.cloud.request.CreateSpreadsheetRequest;
import com.aspose.cells.cloud.request.DeleteWorksheetFromSpreadsheetRequest;
import com.aspose.cells.cloud.request.GetWorksheetsWithLocalSpreadsheetRequest;
import com.aspose.cells.cloud.request.MoveWorksheetInSpreadsheetRequest;
import com.aspose.cells.cloud.request.RenameWorksheetInSpreadsheetRequest;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Worksheet-management facades for local spreadsheets (v4.0 API).
 *
 * <p>Editing is exposed as local multipart operations: the spreadsheet is
 * uploaded, the server applies the edit and returns the updated workbook,
 * which is written to the sink.</p>
 */
public final class Editor {

    private Editor() {
        // Static facade — no instances.
    }

    /**
     * Adds a worksheet and writes the updated workbook to {@code sink}. Position
     * the sheet with {@link EditorOptions#position}.
     *
     * <p>Uses {@code PUT /v4.0/cells/spreadsheet/worksheets}.</p>
     */
    public static void addWorksheet(CellsCloudClient client, DataSource src, DataSink sink,
                                    String sheetName, Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");
        Support.require(sheetName != null && !sheetName.isEmpty(), "sheet name is required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(
                new AddWorksheetToSpreadsheetRequest(spreadsheet));
        Options.apply(request, new Option[] {Options.commonParameter("sheetName", sheetName)});
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload reading/writing local paths. */
    public static void addWorksheet(CellsCloudClient client, String srcPath, String sinkPath,
                                    String sheetName, Option... options) {
        addWorksheet(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), sheetName,
                options);
    }

    /**
     * Deletes a worksheet and writes the updated workbook to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/spreadsheet/worksheets/{sheetName}/delete}.</p>
     */
    public static void deleteWorksheet(CellsCloudClient client, DataSource src, DataSink sink,
                                       String sheetName, Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");
        Support.require(sheetName != null && !sheetName.isEmpty(), "sheet name is required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(
                new DeleteWorksheetFromSpreadsheetRequest(sheetName, spreadsheet));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload reading/writing local paths. */
    public static void deleteWorksheet(CellsCloudClient client, String srcPath, String sinkPath,
                                       String sheetName, Option... options) {
        deleteWorksheet(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), sheetName,
                options);
    }

    /**
     * Renames a worksheet and writes the updated workbook to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/spreadsheet/worksheets/{sourceName}/rename}.</p>
     */
    public static void renameWorksheet(CellsCloudClient client, DataSource src, DataSink sink,
                                       String oldName, String newName, Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");
        Support.require(oldName != null && !oldName.isEmpty()
                && newName != null && !newName.isEmpty(),
                "old and new sheet names are required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(
                new RenameWorksheetInSpreadsheetRequest(oldName, spreadsheet, newName));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload reading/writing local paths. */
    public static void renameWorksheet(CellsCloudClient client, String srcPath, String sinkPath,
                                       String oldName, String newName, Option... options) {
        renameWorksheet(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), oldName,
                newName, options);
    }

    /**
     * Moves a worksheet to the given zero-based position and writes the updated
     * workbook to {@code sink}.
     *
     * <p>Uses {@code PUT /v4.0/cells/spreadsheet/worksheets/{worksheet}/move}.</p>
     */
    public static void moveWorksheet(CellsCloudClient client, DataSource src, DataSink sink,
                                     String worksheet, int position, Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");
        Support.require(worksheet != null && !worksheet.isEmpty(), "worksheet name is required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(
                new MoveWorksheetInSpreadsheetRequest(position, spreadsheet, worksheet));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload reading/writing local paths. */
    public static void moveWorksheet(CellsCloudClient client, String srcPath, String sinkPath,
                                     String worksheet, int position, Option... options) {
        moveWorksheet(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), worksheet,
                position, options);
    }

    /**
     * Returns the worksheets of a local spreadsheet.
     *
     * <p>Uses {@code GET /v4.0/cells/spreadsheet/worksheets}; the response is an
     * array of objects with {@code WorksheetName} and {@code SheetType}.</p>
     *
     * @return the worksheets, in server order
     */
    public static List<Worksheet> listWorksheets(CellsCloudClient client, DataSource src,
                                                 Option... options) {
        Support.require(src != null, "source is required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(
                new GetWorksheetsWithLocalSpreadsheetRequest(spreadsheet));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        return parseWorksheets(response.getBody());
    }

    /** Convenience overload reading a local path. */
    public static List<Worksheet> listWorksheets(CellsCloudClient client, String srcPath,
                                                 Option... options) {
        return listWorksheets(client, new FilePathSource(srcPath), options);
    }

    /** Convenience overload reading an in-memory byte array. */
    public static List<Worksheet> listWorksheets(CellsCloudClient client, byte[] src,
                                                 Option... options) {
        return listWorksheets(client, new BytesSource(src), options);
    }

    /**
     * Creates a new workbook and writes it to {@code sink}. Initialize it from a
     * cloud template with {@link EditorOptions#template}.
     */
    public static void createSpreadsheet(CellsCloudClient client, DataSink sink,
                                         Option... options) {
        Support.require(sink != null, "sink is required");

        RequestAdapter request = new RequestAdapter(new CreateSpreadsheetRequest());
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload writing to a local path. */
    public static void createSpreadsheet(CellsCloudClient client, String sinkPath,
                                         Option... options) {
        createSpreadsheet(client, new FilePathSink(sinkPath), options);
    }

    private static List<Worksheet> parseWorksheets(byte[] body) {
        List<Worksheet> worksheets = new ArrayList<>();
        if (body == null || body.length == 0) {
            return worksheets;
        }
        try {
            JsonNode root = JsonUtil.MAPPER.readTree(body);
            if (root == null || !root.isArray()) {
                return worksheets;
            }
            for (JsonNode item : root) {
                worksheets.add(new Worksheet(
                        item.path("WorksheetName").asText(""),
                        item.path("SheetType").asText("")));
            }
            return worksheets;
        } catch (Exception e) {
            throw new ApiException("Failed to parse worksheets response", e);
        }
    }
}
