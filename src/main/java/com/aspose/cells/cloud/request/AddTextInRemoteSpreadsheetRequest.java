package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Specify appending text to multiple cells at once, allowing you to add prefixes, suffixes, labels, or any specific characters. You can choose the exact position of the text—in the beginning, at the end, or before or after certain characters in the cell. */
public class AddTextInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String range;
    private final String text;
    private final String position;

    private String selectText;
    private Boolean skipEmptyCells;
    private String folder;
    private String storageName;
    private String region;
    private String password;

    public AddTextInRemoteSpreadsheetRequest(String name, String worksheet, String range, String text, String position) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (text == null || text.isEmpty()) throw new IllegalArgumentException("text is required");
        if (position == null || position.isEmpty()) throw new IllegalArgumentException("position is required");
        this.name = name;
        this.worksheet = worksheet;
        this.range = range;
        this.text = text;
        this.position = position;
    }

    public AddTextInRemoteSpreadsheetRequest setSelectText(String selectText) { this.selectText = selectText; return this; }
    public AddTextInRemoteSpreadsheetRequest setSkipEmptyCells(Boolean skipEmptyCells) { this.skipEmptyCells = skipEmptyCells; return this; }
    public AddTextInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public AddTextInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public AddTextInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public AddTextInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/range/" + urlEncode(range) + "/content/add/text";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("text", text);
        query.put("position", position);
        if (selectText != null && !selectText.isEmpty()) query.put("selectText", selectText);
        if (skipEmptyCells != null) query.put("skipEmptyCells", String.valueOf(skipEmptyCells));
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
