package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Indicates extracting substrings, text characters, and numbers from a spreadsheet cell into another cell without having to use complex FIND, MIN, LEFT, or RIGHT formulas. */
public class ExtractTextRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String extractTextType;
    private final String outPositionRange;

    private String beforeText;
    private String afterText;
    private Integer beforePosition;
    private Integer afterPosition;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public ExtractTextRequest(String spreadsheet, String extractTextType, String outPositionRange) {
        this(FormFile.ofPath(spreadsheet), extractTextType, outPositionRange);
    }

    public ExtractTextRequest(File spreadsheet, String extractTextType, String outPositionRange) {
        this(FormFile.of(spreadsheet), extractTextType, outPositionRange);
    }

    public ExtractTextRequest(FormFile spreadsheet, String extractTextType, String outPositionRange) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (extractTextType == null || extractTextType.isEmpty()) throw new IllegalArgumentException("extractTextType is required");
        if (outPositionRange == null || outPositionRange.isEmpty()) throw new IllegalArgumentException("outPositionRange is required");
        this.spreadsheet = spreadsheet;
        this.extractTextType = extractTextType;
        this.outPositionRange = outPositionRange;
    }

    public ExtractTextRequest(byte[] spreadsheet, String spreadsheetFileName, String extractTextType, String outPositionRange) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), extractTextType, outPositionRange);
    }

    public ExtractTextRequest setBeforeText(String beforeText) { this.beforeText = beforeText; return this; }
    public ExtractTextRequest setAfterText(String afterText) { this.afterText = afterText; return this; }
    public ExtractTextRequest setBeforePosition(Integer beforePosition) { this.beforePosition = beforePosition; return this; }
    public ExtractTextRequest setAfterPosition(Integer afterPosition) { this.afterPosition = afterPosition; return this; }
    public ExtractTextRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public ExtractTextRequest setRange(String range) { this.range = range; return this; }
    public ExtractTextRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ExtractTextRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ExtractTextRequest setRegion(String region) { this.region = region; return this; }
    public ExtractTextRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/content/extract/text";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("extractTextType", extractTextType);
        query.put("outPositionRange", outPositionRange);
        if (beforeText != null && !beforeText.isEmpty()) query.put("beforeText", beforeText);
        if (afterText != null && !afterText.isEmpty()) query.put("afterText", afterText);
        if (beforePosition != null) query.put("beforePosition", String.valueOf(beforePosition));
        if (afterPosition != null) query.put("afterPosition", String.valueOf(afterPosition));
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
}
