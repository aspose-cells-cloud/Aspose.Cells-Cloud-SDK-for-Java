package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Deletes characters from every cell in the target range by position (first/last N, before/after a substring, or between two delimiters) while preserving formulas, formatting and data-validation. */
public class RemoveCharactersByPositionRequest implements RequestOption {
    private final FormFile spreadsheet;

    private Integer theFirstNCharacters;
    private Integer theLastNCharacters;
    private String allCharactersBeforeText;
    private String allCharactersAfterText;
    private Boolean caseSensitive;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public RemoveCharactersByPositionRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public RemoveCharactersByPositionRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public RemoveCharactersByPositionRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public RemoveCharactersByPositionRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public RemoveCharactersByPositionRequest setTheFirstNCharacters(Integer theFirstNCharacters) { this.theFirstNCharacters = theFirstNCharacters; return this; }
    public RemoveCharactersByPositionRequest setTheLastNCharacters(Integer theLastNCharacters) { this.theLastNCharacters = theLastNCharacters; return this; }
    public RemoveCharactersByPositionRequest setAllCharactersBeforeText(String allCharactersBeforeText) { this.allCharactersBeforeText = allCharactersBeforeText; return this; }
    public RemoveCharactersByPositionRequest setAllCharactersAfterText(String allCharactersAfterText) { this.allCharactersAfterText = allCharactersAfterText; return this; }
    public RemoveCharactersByPositionRequest setCaseSensitive(Boolean caseSensitive) { this.caseSensitive = caseSensitive; return this; }
    public RemoveCharactersByPositionRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public RemoveCharactersByPositionRequest setRange(String range) { this.range = range; return this; }
    public RemoveCharactersByPositionRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public RemoveCharactersByPositionRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public RemoveCharactersByPositionRequest setRegion(String region) { this.region = region; return this; }
    public RemoveCharactersByPositionRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/content/remove/characters-by-position";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (theFirstNCharacters != null) query.put("theFirstNCharacters", String.valueOf(theFirstNCharacters));
        if (theLastNCharacters != null) query.put("theLastNCharacters", String.valueOf(theLastNCharacters));
        if (allCharactersBeforeText != null && !allCharactersBeforeText.isEmpty()) query.put("allCharactersBeforeText", allCharactersBeforeText);
        if (allCharactersAfterText != null && !allCharactersAfterText.isEmpty()) query.put("allCharactersAfterText", allCharactersAfterText);
        if (caseSensitive != null) query.put("caseSensitive", String.valueOf(caseSensitive));
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
