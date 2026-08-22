package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Deletes user-defined characters, predefined symbol sets, or any substring from every cell in the chosen range while preserving formulas, formatting and data-validation. */
public class RemoveCharactersRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String removeTextMethod;
    private String characterSets;
    private String removeCustomValue;
    private Boolean caseSensitive;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public RemoveCharactersRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public RemoveCharactersRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public RemoveCharactersRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public RemoveCharactersRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public RemoveCharactersRequest setRemoveTextMethod(String removeTextMethod) { this.removeTextMethod = removeTextMethod; return this; }
    public RemoveCharactersRequest setCharacterSets(String characterSets) { this.characterSets = characterSets; return this; }
    public RemoveCharactersRequest setRemoveCustomValue(String removeCustomValue) { this.removeCustomValue = removeCustomValue; return this; }
    public RemoveCharactersRequest setCaseSensitive(Boolean caseSensitive) { this.caseSensitive = caseSensitive; return this; }
    public RemoveCharactersRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public RemoveCharactersRequest setRange(String range) { this.range = range; return this; }
    public RemoveCharactersRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public RemoveCharactersRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public RemoveCharactersRequest setRegion(String region) { this.region = region; return this; }
    public RemoveCharactersRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/content/remove/characters";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (removeTextMethod != null && !removeTextMethod.isEmpty()) query.put("removeTextMethod", removeTextMethod);
        if (characterSets != null && !characterSets.isEmpty()) query.put("characterSets", characterSets);
        if (removeCustomValue != null && !removeCustomValue.isEmpty()) query.put("removeCustomValue", removeCustomValue);
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
