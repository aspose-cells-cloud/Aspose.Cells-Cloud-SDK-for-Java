package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Split a local spreadsheet into the specified format, multi-file. */
public class SplitSpreadsheetRequest implements RequestOption {
    private final FormFile spreadsheet;

    private Integer from;
    private Integer to;
    private String outFormat;
    private String outPath;
    private String outStorageName;
    private String fontsLocation;
    private String region;
    private String password;

    public SplitSpreadsheetRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public SplitSpreadsheetRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public SplitSpreadsheetRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public SplitSpreadsheetRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public SplitSpreadsheetRequest setFrom(Integer from) { this.from = from; return this; }
    public SplitSpreadsheetRequest setTo(Integer to) { this.to = to; return this; }
    public SplitSpreadsheetRequest setOutFormat(String outFormat) { this.outFormat = outFormat; return this; }
    public SplitSpreadsheetRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public SplitSpreadsheetRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public SplitSpreadsheetRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }
    public SplitSpreadsheetRequest setRegion(String region) { this.region = region; return this; }
    public SplitSpreadsheetRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/split/spreadsheet";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (from != null) query.put("from", String.valueOf(from));
        if (to != null) query.put("to", String.valueOf(to));
        if (outFormat != null && !outFormat.isEmpty()) query.put("outFormat", outFormat);
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
