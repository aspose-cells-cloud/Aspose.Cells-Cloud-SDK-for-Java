package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/** The TrimSpreadsheetContent API is designed to process and trim content within a remote spreadsheet. This API allows users to remove extra spaces, line breaks, or other unnecessary characters from the content of selected cells. It is particularly useful for cleaning up data entries and ensuring consistency in spreadsheet formatting */
public class TrimCharacterRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String trimContent;
    private Boolean trimLeading;
    private Boolean trimTrailing;
    private Boolean trimSpaceBetweenWordTo1;
    private Boolean trimNonBreakingSpaces;
    private Boolean removeExtraLineBreaks;
    private Boolean removeAllLineBreaks;
    private String worksheet;
    private String range;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public TrimCharacterRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public TrimCharacterRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public TrimCharacterRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public TrimCharacterRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public TrimCharacterRequest setTrimContent(String trimContent) { this.trimContent = trimContent; return this; }
    public TrimCharacterRequest setTrimLeading(Boolean trimLeading) { this.trimLeading = trimLeading; return this; }
    public TrimCharacterRequest setTrimTrailing(Boolean trimTrailing) { this.trimTrailing = trimTrailing; return this; }
    public TrimCharacterRequest setTrimSpaceBetweenWordTo1(Boolean trimSpaceBetweenWordTo1) { this.trimSpaceBetweenWordTo1 = trimSpaceBetweenWordTo1; return this; }
    public TrimCharacterRequest setTrimNonBreakingSpaces(Boolean trimNonBreakingSpaces) { this.trimNonBreakingSpaces = trimNonBreakingSpaces; return this; }
    public TrimCharacterRequest setRemoveExtraLineBreaks(Boolean removeExtraLineBreaks) { this.removeExtraLineBreaks = removeExtraLineBreaks; return this; }
    public TrimCharacterRequest setRemoveAllLineBreaks(Boolean removeAllLineBreaks) { this.removeAllLineBreaks = removeAllLineBreaks; return this; }
    public TrimCharacterRequest setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }
    public TrimCharacterRequest setRange(String range) { this.range = range; return this; }
    public TrimCharacterRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public TrimCharacterRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public TrimCharacterRequest setRegion(String region) { this.region = region; return this; }
    public TrimCharacterRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/cells/content/trim";
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
