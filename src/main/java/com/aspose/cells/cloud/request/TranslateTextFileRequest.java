package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Translates text file content to the specified target language. */
public class TranslateTextFileRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String targetLanguage;

    private String region;
    private String password;

    public TranslateTextFileRequest(String spreadsheet, String targetLanguage) {
        this(FormFile.ofPath(spreadsheet), targetLanguage);
    }

    public TranslateTextFileRequest(File spreadsheet, String targetLanguage) {
        this(FormFile.of(spreadsheet), targetLanguage);
    }

    public TranslateTextFileRequest(FormFile spreadsheet, String targetLanguage) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (targetLanguage == null || targetLanguage.isEmpty()) throw new IllegalArgumentException("targetLanguage is required");
        this.spreadsheet = spreadsheet;
        this.targetLanguage = targetLanguage;
    }

    public TranslateTextFileRequest(byte[] spreadsheet, String spreadsheetFileName, String targetLanguage) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), targetLanguage);
    }

    public TranslateTextFileRequest setRegion(String region) { this.region = region; return this; }
    public TranslateTextFileRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/ai/translate/text-file";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("targetLanguage", targetLanguage);
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
