package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Specify changing the text case in a spreadsheet to switch between uppercase, lowercase, capitalizing the first letter of each word, or capitalizing the first letter of a sentence, and adjust the text according to specific needs. */
public class UpdateWordCaseRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String wordCaseType;

    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public UpdateWordCaseRequest(String spreadsheet, String wordCaseType) {
        this(FormFile.ofPath(spreadsheet), wordCaseType);
    }

    public UpdateWordCaseRequest(File spreadsheet, String wordCaseType) {
        this(FormFile.of(spreadsheet), wordCaseType);
    }

    public UpdateWordCaseRequest(FormFile spreadsheet, String wordCaseType) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (wordCaseType == null || wordCaseType.isEmpty()) throw new IllegalArgumentException("wordCaseType is required");
        this.spreadsheet = spreadsheet;
        this.wordCaseType = wordCaseType;
    }

    public UpdateWordCaseRequest(byte[] spreadsheet, String spreadsheetFileName, String wordCaseType) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), wordCaseType);
    }

    public UpdateWordCaseRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public UpdateWordCaseRequest setRange(String range) { this.range = range; return this; }
    public UpdateWordCaseRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public UpdateWordCaseRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public UpdateWordCaseRequest setRegion(String region) { this.region = region; return this; }
    public UpdateWordCaseRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/content/wordcase";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("wordCaseType", wordCaseType);
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
