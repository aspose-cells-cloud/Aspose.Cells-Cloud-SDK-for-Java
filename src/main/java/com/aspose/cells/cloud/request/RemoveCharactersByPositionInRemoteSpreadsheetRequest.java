package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Deletes characters from every cell in the target range by position (first/last N, before/after a substring, or between two delimiters) while preserving formulas, formatting and data-validation. */
public class RemoveCharactersByPositionInRemoteSpreadsheetRequest implements RequestOption {
    private final String name;
    private final String worksheet;
    private final String range;

    private Integer theFirstNCharacters;
    private Integer theLastNCharacters;
    private String allCharactersBeforeText;
    private String allCharactersAfterText;
    private Boolean caseSensitive;
    private String folder;
    private String storageName;
    private String region;
    private String password;

    public RemoveCharactersByPositionInRemoteSpreadsheetRequest(String name, String worksheet, String range) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (worksheet == null || worksheet.isEmpty()) throw new IllegalArgumentException("worksheet is required");
        if (range == null || range.isEmpty()) throw new IllegalArgumentException("range is required");
        this.name = name;
        this.worksheet = worksheet;
        this.range = range;
    }

    public RemoveCharactersByPositionInRemoteSpreadsheetRequest setTheFirstNCharacters(Integer theFirstNCharacters) { this.theFirstNCharacters = theFirstNCharacters; return this; }
    public RemoveCharactersByPositionInRemoteSpreadsheetRequest setTheLastNCharacters(Integer theLastNCharacters) { this.theLastNCharacters = theLastNCharacters; return this; }
    public RemoveCharactersByPositionInRemoteSpreadsheetRequest setAllCharactersBeforeText(String allCharactersBeforeText) { this.allCharactersBeforeText = allCharactersBeforeText; return this; }
    public RemoveCharactersByPositionInRemoteSpreadsheetRequest setAllCharactersAfterText(String allCharactersAfterText) { this.allCharactersAfterText = allCharactersAfterText; return this; }
    public RemoveCharactersByPositionInRemoteSpreadsheetRequest setCaseSensitive(Boolean caseSensitive) { this.caseSensitive = caseSensitive; return this; }
    public RemoveCharactersByPositionInRemoteSpreadsheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public RemoveCharactersByPositionInRemoteSpreadsheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public RemoveCharactersByPositionInRemoteSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public RemoveCharactersByPositionInRemoteSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(worksheet) + "/range/" + urlEncode(range) + "/content/remove/characters-by-position";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (theFirstNCharacters != null) query.put("theFirstNCharacters", String.valueOf(theFirstNCharacters));
        if (theLastNCharacters != null) query.put("theLastNCharacters", String.valueOf(theLastNCharacters));
        if (allCharactersBeforeText != null && !allCharactersBeforeText.isEmpty()) query.put("allCharactersBeforeText", allCharactersBeforeText);
        if (allCharactersAfterText != null && !allCharactersAfterText.isEmpty()) query.put("allCharactersAfterText", allCharactersAfterText);
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
