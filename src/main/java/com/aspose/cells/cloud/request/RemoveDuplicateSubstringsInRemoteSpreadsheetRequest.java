package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Finds and removes repeated substrings inside every cell of the chosen range, using user-defined or preset delimiters, while preserving formulas, formatting and data-validation. */
public class RemoveDuplicateSubstringsInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String range;
    private final String delimiters;

    private Boolean treatConsecutiveDelimitersAsOne;
    private Boolean caseSensitive;
    private String folder;
    private String storageName;
    private String region;
    private String password;

    public RemoveDuplicateSubstringsInRemoteSpreadsheetRequest(String name, String worksheet, String range, String delimiters) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        if (delimiters == null || delimiters.isEmpty()) throw new IllegalArgumentException("delimiters is required");
        this.name = name;
        this.worksheet = worksheet;
        this.range = range;
        this.delimiters = delimiters;
    }

    public RemoveDuplicateSubstringsInRemoteSpreadsheetRequest setTreatConsecutiveDelimitersAsOne(Boolean treatConsecutiveDelimitersAsOne) { this.treatConsecutiveDelimitersAsOne = treatConsecutiveDelimitersAsOne; return this; }
    public RemoveDuplicateSubstringsInRemoteSpreadsheetRequest setCaseSensitive(Boolean caseSensitive) { this.caseSensitive = caseSensitive; return this; }
    public RemoveDuplicateSubstringsInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public RemoveDuplicateSubstringsInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public RemoveDuplicateSubstringsInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public RemoveDuplicateSubstringsInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/range/" + urlEncode(range) + "/content/remove/duplicate-substrings";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("delimiters", delimiters);
        if (treatConsecutiveDelimitersAsOne != null) query.put("treatConsecutiveDelimitersAsOne", String.valueOf(treatConsecutiveDelimitersAsOne));
        if (caseSensitive != null) query.put("caseSensitive", String.valueOf(caseSensitive));
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
