package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Deletes user-defined characters, predefined symbol sets, or any substring from every cell in the chosen range while preserving formulas, formatting and data-validation for a remote spreadsheet. */
public class RemoveCharactersInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String range;

    private String removeTextMethod;
    private String characterSets;
    private String removeCustomValue;
    private Boolean caseSensitive;
    private String folder;
    private String storageName;
    private String region;
    private String password;

    public RemoveCharactersInRemoteSpreadsheetRequest(String name, String worksheet, String range) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        this.name = name;
        this.worksheet = worksheet;
        this.range = range;
    }

    public RemoveCharactersInRemoteSpreadsheetRequest setRemoveTextMethod(String removeTextMethod) { this.removeTextMethod = removeTextMethod; return this; }
    public RemoveCharactersInRemoteSpreadsheetRequest setCharacterSets(String characterSets) { this.characterSets = characterSets; return this; }
    public RemoveCharactersInRemoteSpreadsheetRequest setRemoveCustomValue(String removeCustomValue) { this.removeCustomValue = removeCustomValue; return this; }
    public RemoveCharactersInRemoteSpreadsheetRequest setCaseSensitive(Boolean caseSensitive) { this.caseSensitive = caseSensitive; return this; }
    public RemoveCharactersInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public RemoveCharactersInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public RemoveCharactersInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public RemoveCharactersInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/range/" + urlEncode(range) + "/content/remove/characters";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (removeTextMethod != null && !removeTextMethod.isEmpty()) query.put("removeTextMethod", removeTextMethod);
        if (characterSets != null && !characterSets.isEmpty()) query.put("characterSets", characterSets);
        if (removeCustomValue != null && !removeCustomValue.isEmpty()) query.put("removeCustomValue", removeCustomValue);
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
