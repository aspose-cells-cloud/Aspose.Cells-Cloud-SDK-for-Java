package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete all blank rows that do not contain any data or other objects. */
public class RemoveSpreadsheetBlankWorksheetsRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public RemoveSpreadsheetBlankWorksheetsRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public RemoveSpreadsheetBlankWorksheetsRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public RemoveSpreadsheetBlankWorksheetsRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public RemoveSpreadsheetBlankWorksheetsRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public RemoveSpreadsheetBlankWorksheetsRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public RemoveSpreadsheetBlankWorksheetsRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public RemoveSpreadsheetBlankWorksheetsRequest setRegion(String region) { this.region = region; return this; }
    public RemoveSpreadsheetBlankWorksheetsRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/remove/blank-worksheets";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
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
