package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Merge local spreadsheet files into a specified format file. */
public class MergeSpreadsheetsRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String outFormat;
    private Boolean mergeInOneSheet;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public MergeSpreadsheetsRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public MergeSpreadsheetsRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public MergeSpreadsheetsRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public MergeSpreadsheetsRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public MergeSpreadsheetsRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public MergeSpreadsheetsRequest setMergeInOneSheet(Boolean mergeInOneSheet) { this.mergeInOneSheet = mergeInOneSheet; return this; }
    public MergeSpreadsheetsRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public MergeSpreadsheetsRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public MergeSpreadsheetsRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public MergeSpreadsheetsRequest setRegion(String region) { this.region = region; return this; }
    public MergeSpreadsheetsRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/merge/spreadsheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (outFormat != null && !outFormat.isEmpty()) query.put("outFormat", outFormat);
        if (mergeInOneSheet != null) query.put("mergeInOneSheet", String.valueOf(mergeInOneSheet));
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("fontsLocation", fontsLocation);
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
