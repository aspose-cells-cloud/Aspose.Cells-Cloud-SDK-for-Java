package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Specify appending text to multiple cells at once, allowing you to add prefixes, suffixes, labels, or any specific characters. You can choose the exact position of the text—in the beginning, at the end, or before or after certain characters in the cell. */
public class AddTextRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String text;
    private final String position;

    private String selectText;
    private Boolean skipEmptyCells;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public AddTextRequest(String spreadsheet, String text, String position) {
        this(FormFile.ofPath(spreadsheet), text, position);
    }

    public AddTextRequest(File spreadsheet, String text, String position) {
        this(FormFile.of(spreadsheet), text, position);
    }

    public AddTextRequest(FormFile spreadsheet, String text, String position) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (text == null || text.isEmpty()) throw new IllegalArgumentException("text is required");
        if (position == null || position.isEmpty()) throw new IllegalArgumentException("position is required");
        this.spreadsheet = spreadsheet;
        this.text = text;
        this.position = position;
    }

    public AddTextRequest(byte[] spreadsheet, String spreadsheetFileName, String text, String position) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), text, position);
    }

    public AddTextRequest setSelectText(String selectText) { this.selectText = selectText; return this; }
    public AddTextRequest setSkipEmptyCells(Boolean skipEmptyCells) { this.skipEmptyCells = skipEmptyCells; return this; }
    public AddTextRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public AddTextRequest setRange(String range) { this.range = range; return this; }
    public AddTextRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public AddTextRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public AddTextRequest setRegion(String region) { this.region = region; return this; }
    public AddTextRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/content/add/text";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("text", text);
        query.put("position", position);
        if (selectText != null && !selectText.isEmpty()) query.put("selectText", selectText);
        if (skipEmptyCells != null) query.put("skipEmptyCells", String.valueOf(skipEmptyCells));
        if (worksheet != null && !worksheet.isEmpty()) query.put("worksheet", worksheet);
        if (range != null && !range.isEmpty()) query.put("range", range);
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
