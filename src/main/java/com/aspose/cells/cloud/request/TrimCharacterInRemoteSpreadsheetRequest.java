package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** The TrimSpreadsheetContent API is designed to process and trim content within a spreadsheet. This API allows users to remove extra spaces, line breaks, or other unnecessary characters from the content of selected cells. It is particularly useful for cleaning up data entries and ensuring consistency in spreadsheet formatting */
public class TrimCharacterInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String range;

    private String trimContent;
    private Boolean trimLeading;
    private Boolean trimTrailing;
    private Boolean trimSpaceBetweenWordTo1;
    private Boolean trimNonBreakingSpaces;
    private Boolean removeExtraLineBreaks;
    private Boolean removeAllLineBreaks;
    private String folder;
    private String storageName;
    private String region;
    private String password;

    public TrimCharacterInRemoteSpreadsheetRequest(String name, String worksheet, String range) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        this.name = name;
        this.worksheet = worksheet;
        this.range = range;
    }

    public TrimCharacterInRemoteSpreadsheetRequest setTrimContent(String trimContent) { this.trimContent = trimContent; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setTrimLeading(Boolean trimLeading) { this.trimLeading = trimLeading; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setTrimTrailing(Boolean trimTrailing) { this.trimTrailing = trimTrailing; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setTrimSpaceBetweenWordTo1(Boolean trimSpaceBetweenWordTo1) { this.trimSpaceBetweenWordTo1 = trimSpaceBetweenWordTo1; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setTrimNonBreakingSpaces(Boolean trimNonBreakingSpaces) { this.trimNonBreakingSpaces = trimNonBreakingSpaces; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setRemoveExtraLineBreaks(Boolean removeExtraLineBreaks) { this.removeExtraLineBreaks = removeExtraLineBreaks; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setRemoveAllLineBreaks(Boolean removeAllLineBreaks) { this.removeAllLineBreaks = removeAllLineBreaks; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public TrimCharacterInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/range/" + urlEncode(range) + "/content/trim";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (trimContent != null && !trimContent.isEmpty()) query.put("trimContent", trimContent);
        if (trimLeading != null) query.put("trimLeading", String.valueOf(trimLeading));
        if (trimTrailing != null) query.put("trimTrailing", String.valueOf(trimTrailing));
        if (trimSpaceBetweenWordTo1 != null) query.put("trimSpaceBetweenWordTo1", String.valueOf(trimSpaceBetweenWordTo1));
        if (trimNonBreakingSpaces != null) query.put("trimNonBreakingSpaces", String.valueOf(trimNonBreakingSpaces));
        if (removeExtraLineBreaks != null) query.put("removeExtraLineBreaks", String.valueOf(removeExtraLineBreaks));
        if (removeAllLineBreaks != null) query.put("removeAllLineBreaks", String.valueOf(removeAllLineBreaks));
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
