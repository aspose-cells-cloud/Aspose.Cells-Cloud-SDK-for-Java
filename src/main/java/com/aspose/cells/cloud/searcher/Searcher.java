/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Searcher.java">
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

import com.aspose.cells.cloud.ApiException;
import com.aspose.cells.cloud.CellsCloudClient;
import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.JsonUtil;
import com.aspose.cells.cloud.RichResponse;
import com.aspose.cells.cloud.WorkbookRef;
import com.aspose.cells.cloud.datasource.BytesSource;
import com.aspose.cells.cloud.datasource.DataSink;
import com.aspose.cells.cloud.datasource.DataSource;
import com.aspose.cells.cloud.datasource.FilePathSink;
import com.aspose.cells.cloud.datasource.FilePathSource;
import com.aspose.cells.cloud.internal.Option;
import com.aspose.cells.cloud.internal.Options;
import com.aspose.cells.cloud.internal.RequestAdapter;
import com.aspose.cells.cloud.internal.Support;
import com.aspose.cells.cloud.request.ReplaceContentInRemoteRangeRequest;
import com.aspose.cells.cloud.request.ReplaceContentInRemoteSpreadsheetRequest;
import com.aspose.cells.cloud.request.ReplaceContentInRemoteWorksheetRequest;
import com.aspose.cells.cloud.request.ReplaceSpreadsheetContentRequest;
import com.aspose.cells.cloud.request.SearchContentInRemoteRangeRequest;
import com.aspose.cells.cloud.request.SearchContentInRemoteWorksheetRequest;
import com.aspose.cells.cloud.request.SearchSpreadsheetContentRequest;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Find-and-replace facades for local and cloud spreadsheets (v4.0 API).
 *
 * <p>Local search requires a worksheet name (the live endpoint returns 400
 * without one). Local replace returns the modified workbook as file bytes;
 * cloud replace modifies the stored file in place.</p>
 */
public final class Searcher {

    private Searcher() {
        // Static facade — no instances.
    }

    /**
     * Searches a local spreadsheet for {@code text} within {@code worksheet} and
     * returns the matching text items.
     *
     * <p>Uses {@code PUT /v4.0/cells/search/content}.</p>
     */
    public static List<TextItem> search(CellsCloudClient client, DataSource src,
                                        String worksheet, String text, Option... options) {
        Support.require(src != null, "source is required");
        Support.require(worksheet != null && !worksheet.isEmpty(), "worksheet is required");
        Support.require(text != null && !text.isEmpty(), "text is required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(
                new SearchSpreadsheetContentRequest(text, spreadsheet));
        Options.apply(request, new Option[] {Options.commonParameter("worksheet", worksheet)});
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        return decodeTextItems(response.getBody());
    }

    /** Convenience overload reading a local path. */
    public static List<TextItem> search(CellsCloudClient client, String srcPath, String worksheet,
                                        String text, Option... options) {
        return search(client, new FilePathSource(srcPath), worksheet, text, options);
    }

    /** Convenience overload reading an in-memory byte array. */
    public static List<TextItem> search(CellsCloudClient client, byte[] src, String worksheet,
                                        String text, Option... options) {
        return search(client, new BytesSource(src), worksheet, text, options);
    }

    /**
     * Replaces text in a local spreadsheet and writes the resulting workbook to
     * {@code sink}. Scope the replacement with
     * {@link SearcherOptions#worksheet} or {@link SearcherOptions#cellArea}.
     *
     * <p>Uses {@code PUT /v4.0/cells/replace/content}.</p>
     */
    public static void replace(CellsCloudClient client, DataSource src, DataSink sink,
                               String oldValue, String newValue, Option... options) {
        Support.require(src != null && sink != null, "source and sink are required");

        FormFile spreadsheet = FormFile.of(Support.readSource(src), "Spreadsheet");
        RequestAdapter request = new RequestAdapter(
                new ReplaceSpreadsheetContentRequest(newValue, oldValue, spreadsheet));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        Support.writeSink(sink, Support.responseBytes(response));
    }

    /** Convenience overload reading/writing local paths. */
    public static void replace(CellsCloudClient client, String srcPath, String sinkPath,
                               String oldValue, String newValue, Option... options) {
        replace(client, new FilePathSource(srcPath), new FilePathSink(sinkPath), oldValue,
                newValue, options);
    }

    /** Convenience overload reading an in-memory byte array. */
    public static void replace(CellsCloudClient client, byte[] src, DataSink sink,
                               String oldValue, String newValue, Option... options) {
        replace(client, new BytesSource(src), sink, oldValue, newValue, options);
    }

    /**
     * Searches text in a worksheet of a cloud workbook and returns the matching
     * text items.
     *
     * <p>Uses {@code PUT /v4.0/cells/{name}/worksheets/{worksheet}/search/content}.</p>
     */
    public static List<TextItem> searchWorksheet(CellsCloudClient client, WorkbookRef ref,
                                                 String worksheet, String text,
                                                 Option... options) {
        Support.requireWorkbook(ref);
        Support.require(worksheet != null && !worksheet.isEmpty(), "worksheet is required");
        Support.require(text != null && !text.isEmpty(), "text is required");

        RequestAdapter request = new RequestAdapter(
                new SearchContentInRemoteWorksheetRequest(ref.getName(), text, worksheet));
        Options.apply(request, Support.workbookParams(ref));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        return decodeTextItems(response.getBody());
    }

    /** Convenience overload accepting a cloud file name. */
    public static List<TextItem> searchWorksheet(CellsCloudClient client, String name,
                                                 String worksheet, String text,
                                                 Option... options) {
        return searchWorksheet(client, WorkbookRef.of(name), worksheet, text, options);
    }

    /**
     * Searches text in a cell range of a cloud worksheet (A1 style, for example
     * {@code "E35:F40"}) and returns the matching text items.
     *
     * <p>Uses {@code PUT /v4.0/cells/{name}/worksheets/{worksheet}/ranges/{area}/search/content}.</p>
     */
    public static List<TextItem> searchRange(CellsCloudClient client, WorkbookRef ref,
                                             String worksheet, String cellArea, String text,
                                             Option... options) {
        Support.requireWorkbook(ref);
        Support.require(worksheet != null && !worksheet.isEmpty(), "worksheet is required");
        Support.require(cellArea != null && !cellArea.isEmpty(), "cell area is required");
        Support.require(text != null && !text.isEmpty(), "text is required");

        RequestAdapter request = new RequestAdapter(
                new SearchContentInRemoteRangeRequest(cellArea, ref.getName(), text, worksheet));
        Options.apply(request, Support.workbookParams(ref));
        Options.apply(request, options);

        RichResponse response = Support.doChecked(client, request);
        return decodeTextItems(response.getBody());
    }

    /** Convenience overload accepting a cloud file name. */
    public static List<TextItem> searchRange(CellsCloudClient client, String name,
                                             String worksheet, String cellArea, String text,
                                             Option... options) {
        return searchRange(client, WorkbookRef.of(name), worksheet, cellArea, text, options);
    }

    /**
     * Replaces text in a cloud workbook in place.
     *
     * <p>Uses {@code PUT /v4.0/cells/{name}/replace/content}.</p>
     */
    public static void replaceWorkbook(CellsCloudClient client, WorkbookRef ref,
                                       String oldValue, String newValue, Option... options) {
        Support.requireWorkbook(ref);
        Support.require(oldValue != null && !oldValue.isEmpty()
                && newValue != null && !newValue.isEmpty(),
                "old value and new value are required");

        RequestAdapter request = new RequestAdapter(
                new ReplaceContentInRemoteSpreadsheetRequest(ref.getName(), newValue, oldValue));
        Options.apply(request, Support.workbookParams(ref));
        Options.apply(request, options);
        Support.doChecked(client, request);
    }

    /** Convenience overload accepting a cloud file name. */
    public static void replaceWorkbook(CellsCloudClient client, String name, String oldValue,
                                       String newValue, Option... options) {
        replaceWorkbook(client, WorkbookRef.of(name), oldValue, newValue, options);
    }

    /**
     * Replaces text in a worksheet of a cloud workbook in place.
     *
     * <p>Uses {@code PUT /v4.0/cells/{name}/worksheets/{worksheet}/replace/content}.</p>
     */
    public static void replaceWorksheet(CellsCloudClient client, WorkbookRef ref,
                                        String worksheet, String oldValue, String newValue,
                                        Option... options) {
        Support.requireWorkbook(ref);
        Support.require(worksheet != null && !worksheet.isEmpty()
                && oldValue != null && !oldValue.isEmpty()
                && newValue != null && !newValue.isEmpty(),
                "worksheet, old value and new value are required");

        RequestAdapter request = new RequestAdapter(
                new ReplaceContentInRemoteWorksheetRequest(ref.getName(), newValue, oldValue,
                        worksheet));
        Options.apply(request, Support.workbookParams(ref));
        Options.apply(request, options);
        Support.doChecked(client, request);
    }

    /** Convenience overload accepting a cloud file name. */
    public static void replaceWorksheet(CellsCloudClient client, String name, String worksheet,
                                        String oldValue, String newValue, Option... options) {
        replaceWorksheet(client, WorkbookRef.of(name), worksheet, oldValue, newValue, options);
    }

    /**
     * Replaces text in a cell range of a cloud worksheet in place (A1 style,
     * for example {@code "E35:F40"}).
     *
     * <p>Uses {@code PUT /v4.0/cells/{name}/worksheets/{worksheet}/ranges/{area}/replace/content}.</p>
     */
    public static void replaceRange(CellsCloudClient client, WorkbookRef ref, String worksheet,
                                    String cellArea, String oldValue, String newValue,
                                    Option... options) {
        Support.requireWorkbook(ref);
        Support.require(worksheet != null && !worksheet.isEmpty()
                && cellArea != null && !cellArea.isEmpty()
                && oldValue != null && !oldValue.isEmpty()
                && newValue != null && !newValue.isEmpty(),
                "worksheet, cell area, old value and new value are required");

        RequestAdapter request = new RequestAdapter(
                new ReplaceContentInRemoteRangeRequest(cellArea, ref.getName(), newValue, oldValue,
                        worksheet));
        Options.apply(request, Support.workbookParams(ref));
        Options.apply(request, options);
        Support.doChecked(client, request);
    }

    /** Convenience overload accepting a cloud file name. */
    public static void replaceRange(CellsCloudClient client, String name, String worksheet,
                                    String cellArea, String oldValue, String newValue,
                                    Option... options) {
        replaceRange(client, WorkbookRef.of(name), worksheet, cellArea, oldValue, newValue,
                options);
    }

    private static List<TextItem> decodeTextItems(byte[] body) {
        List<TextItem> items = new ArrayList<>();
        if (body == null || body.length == 0) {
            return items;
        }
        try {
            JsonNode root = JsonUtil.MAPPER.readTree(body);
            JsonNode textItems = root == null ? null : root.get("TextItems");
            if (textItems == null || !textItems.isArray()) {
                return items;
            }
            for (JsonNode item : textItems) {
                items.add(new TextItem(
                        item.path("Content").asText(""),
                        item.path("Worksheet").asText(""),
                        item.path("Position").asText("")));
            }
            return items;
        } catch (Exception e) {
            throw new ApiException("Failed to parse search response", e);
        }
    }
}
