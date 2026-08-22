package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Indicates converting the numbers stored as text into the correct number format, replacing unwanted characters and line breaks with the desired characters, and converting accented characters to their equivalent characters without accents. */
public class ConvertTextInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String range;
    private final String convertTextType;

    private String sourceCharacters;
    private String targetCharacters;
    private String folder;
    private String storageName;
    private String region;
    private String password;

    public ConvertTextInRemoteSpreadsheetRequest(String name, String worksheet, String range, String convertTextType) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (convertTextType == null || convertTextType.isEmpty()) throw new IllegalArgumentException("convertTextType is required");
        this.name = name;
        this.worksheet = worksheet;
        this.range = range;
        this.convertTextType = convertTextType;
    }

    public ConvertTextInRemoteSpreadsheetRequest setSourceCharacters(String sourceCharacters) { this.sourceCharacters = sourceCharacters; return this; }
    public ConvertTextInRemoteSpreadsheetRequest setTargetCharacters(String targetCharacters) { this.targetCharacters = targetCharacters; return this; }
    public ConvertTextInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public ConvertTextInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public ConvertTextInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public ConvertTextInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/range/" + urlEncode(range) + "/content/convert/text";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("convertTextType", convertTextType);
        if (sourceCharacters != null && !sourceCharacters.isEmpty()) query.put("sourceCharacters", sourceCharacters);
        if (targetCharacters != null && !targetCharacters.isEmpty()) query.put("targetCharacters", targetCharacters);
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
