package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** The Swap Ranges for Excel API provides a powerful tool to move any two columns, rows, ranges, or individual cells within an Excel file. This API allows users to re-arrange their tables quickly and efficiently, ensuring that the original data formatting is preserved and all existing formulas continue to function correctly. By leveraging this API, users can streamline their data manipulation tasks and maintain the integrity of their spreadsheets. */
public class SwapRangeRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String worksheet1;
    private final String range1;
    private final String worksheet2;
    private final String range2;

    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public SwapRangeRequest(String spreadsheet, String worksheet1, String range1, String worksheet2, String range2) {
        this(FormFile.ofPath(spreadsheet), worksheet1, range1, worksheet2, range2);
    }

    public SwapRangeRequest(File spreadsheet, String worksheet1, String range1, String worksheet2, String range2) {
        this(FormFile.of(spreadsheet), worksheet1, range1, worksheet2, range2);
    }

    public SwapRangeRequest(FormFile spreadsheet, String worksheet1, String range1, String worksheet2, String range2) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (worksheet1 == null || worksheet1.isEmpty()) throw new IllegalArgumentException("worksheet1 is required");
        if (range1 == null || range1.isEmpty()) throw new IllegalArgumentException("range1 is required");
        if (worksheet2 == null || worksheet2.isEmpty()) throw new IllegalArgumentException("worksheet2 is required");
        if (range2 == null || range2.isEmpty()) throw new IllegalArgumentException("range2 is required");
        this.spreadsheet = spreadsheet;
        this.worksheet1 = worksheet1;
        this.range1 = range1;
        this.worksheet2 = worksheet2;
        this.range2 = range2;
    }

    public SwapRangeRequest(byte[] spreadsheet, String spreadsheetFileName, String worksheet1, String range1, String worksheet2, String range2) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), worksheet1, range1, worksheet2, range2);
    }

    public SwapRangeRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public SwapRangeRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public SwapRangeRequest setRegion(String region) { this.region = region; return this; }
    public SwapRangeRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/swap/range";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("worksheet1", worksheet1);
        query.put("range1", range1);
        query.put("worksheet2", worksheet2);
        query.put("range2", range2);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (password != null && !password.isEmpty()) query.put("password", password);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "multipart/form-data");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        Map<String, Object> form = new HashMap<>();
        form.put("Spreadsheet", spreadsheet);
        return form;
    }

    @Override public boolean isBinaryResponse() { return true; }
}
