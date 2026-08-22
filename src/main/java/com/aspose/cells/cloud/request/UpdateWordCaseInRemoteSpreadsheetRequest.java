package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Specify changing the text case in a remote spreadsheet to switch between uppercase, lowercase, capitalizing the first letter of each word, or capitalizing the first letter of a sentence, and adjust the text according to specific needs. */
public class UpdateWordCaseInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String range;
    private final String wordCaseType;

    private String folder;
    private String storageName;
    private String region;
    private String password;

    public UpdateWordCaseInRemoteSpreadsheetRequest(String name, String worksheet, String range, String wordCaseType) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (wordCaseType == null || wordCaseType.isEmpty()) throw new IllegalArgumentException("wordCaseType is required");
        this.name = name;
        this.worksheet = worksheet;
        this.range = range;
        this.wordCaseType = wordCaseType;
    }

    public UpdateWordCaseInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public UpdateWordCaseInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public UpdateWordCaseInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public UpdateWordCaseInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/range/" + urlEncode(range) + "/content/wordcase";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("wordCaseType", wordCaseType);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (password != null && !password.isEmpty()) query.put("password", password);
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        return new HashMap<>();
    }

    @Override
    public Object getJsonBody() {
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
