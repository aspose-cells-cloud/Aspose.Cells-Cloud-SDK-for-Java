package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Indicates converting the numbers stored as text into the correct number format, replacing unwanted characters and line breaks with the desired characters, and converting accented characters to their equivalent characters without accents. */
public class ConvertTextRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String convertTextType;

    private String sourceCharacters;
    private String targetCharacters;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public ConvertTextRequest(String spreadsheet, String convertTextType) {
        this(FormFile.ofPath(spreadsheet), convertTextType);
    }

    public ConvertTextRequest(File spreadsheet, String convertTextType) {
        this(FormFile.of(spreadsheet), convertTextType);
    }

    public ConvertTextRequest(FormFile spreadsheet, String convertTextType) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (convertTextType == null || convertTextType.isEmpty()) throw new IllegalArgumentException("convertTextType is required");
        this.spreadsheet = spreadsheet;
        this.convertTextType = convertTextType;
    }

    public ConvertTextRequest(byte[] spreadsheet, String spreadsheetFileName, String convertTextType) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), convertTextType);
    }

    public ConvertTextRequest setSourceCharacters(String sourceCharacters) { this.sourceCharacters = sourceCharacters; return this; }
    public ConvertTextRequest setTargetCharacters(String targetCharacters) { this.targetCharacters = targetCharacters; return this; }
    public ConvertTextRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public ConvertTextRequest setRange(String range) { this.range = range; return this; }
    public ConvertTextRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public ConvertTextRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public ConvertTextRequest setRegion(String region) { this.region = region; return this; }
    public ConvertTextRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/content/convert/text";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("convertTextType", convertTextType);
        if (sourceCharacters != null && !sourceCharacters.isEmpty()) query.put("sourceCharacters", sourceCharacters);
        if (targetCharacters != null && !targetCharacters.isEmpty()) query.put("targetCharacters", targetCharacters);
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
