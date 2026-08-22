package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.io.File;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete all blank rows that do not contain any data or other objects. */
public class RemoveSpreadsheetBlankColumnsRequest implements RequestOption {
    private final FormFile spreadsheet;

    private String outPath;
    private String outStorageName;
    private String region;
    private String password;

    public RemoveSpreadsheetBlankColumnsRequest(String spreadsheet) {
        this(FormFile.ofPath(spreadsheet));
    }

    public RemoveSpreadsheetBlankColumnsRequest(File spreadsheet) {
        this(FormFile.of(spreadsheet));
    }

    public RemoveSpreadsheetBlankColumnsRequest(FormFile spreadsheet) {
        if (spreadsheet == null) throw new IllegalArgumentException("spreadsheet is required");
        this.spreadsheet = spreadsheet;
    }

    public RemoveSpreadsheetBlankColumnsRequest(byte[] spreadsheet, String spreadsheetFileName) {
        this(FormFile.of(spreadsheet, spreadsheetFileName));
    }

    public RemoveSpreadsheetBlankColumnsRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public RemoveSpreadsheetBlankColumnsRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public RemoveSpreadsheetBlankColumnsRequest setRegion(String region) { this.region = region; return this; }
    public RemoveSpreadsheetBlankColumnsRequest setPassword(String password) { this.password = password; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v4.0"; }

    @Override
    public String getPath() {
        return "/v4.0/cells/remove/blank-columns";
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
