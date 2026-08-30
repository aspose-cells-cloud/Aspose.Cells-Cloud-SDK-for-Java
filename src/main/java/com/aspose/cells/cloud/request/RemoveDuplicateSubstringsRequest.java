package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** Finds and removes repeated substrings inside every cell of the chosen range, using user-defined or preset delimiters, while preserving formulas, formatting and data-validation. */
public class RemoveDuplicateSubstringsRequest implements RequestOption {
    private final FormFile spreadsheet;
    private final String delimiters;

    private Boolean treatConsecutiveDelimitersAsOne;
    private Boolean caseSensitive;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public RemoveDuplicateSubstringsRequest(String spreadsheet, String delimiters) {
        this(FormFile.ofPath(spreadsheet), delimiters);
    }

    public RemoveDuplicateSubstringsRequest(File spreadsheet, String delimiters) {
        this(FormFile.of(spreadsheet), delimiters);
    }

    public RemoveDuplicateSubstringsRequest(FormFile spreadsheet, String delimiters) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        if (delimiters == null || delimiters.isEmpty()) throw new IllegalArgumentException("delimiters is required");
        this.spreadsheet = spreadsheet;
        this.delimiters = delimiters;
    }

    public RemoveDuplicateSubstringsRequest(byte[] spreadsheet, String spreadsheetFileName, String delimiters) {
        this(FormFile.of(spreadsheet, spreadsheetFileName), delimiters);
    }

    public RemoveDuplicateSubstringsRequest setTreatConsecutiveDelimitersAsOne(Boolean treatConsecutiveDelimitersAsOne) { this.treatConsecutiveDelimitersAsOne = treatConsecutiveDelimitersAsOne; return this; }
    public RemoveDuplicateSubstringsRequest setCaseSensitive(Boolean caseSensitive) { this.caseSensitive = caseSensitive; return this; }
    public RemoveDuplicateSubstringsRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public RemoveDuplicateSubstringsRequest setRange(String range) { this.range = range; return this; }
    public RemoveDuplicateSubstringsRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public RemoveDuplicateSubstringsRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public RemoveDuplicateSubstringsRequest setRegion(String region) { this.region = region; return this; }
    public RemoveDuplicateSubstringsRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/content/remove/duplicate-substrings";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("delimiters", delimiters);
        if (treatConsecutiveDelimitersAsOne != null) query.put("treatConsecutiveDelimitersAsOne", String.valueOf(treatConsecutiveDelimitersAsOne));
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

    @Override public boolean isBinaryResponse() { return true; }
}
