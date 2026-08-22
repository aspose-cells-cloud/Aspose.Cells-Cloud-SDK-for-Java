package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.DataFill;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Data filling for spreadsheet files is primarily used to fill empty data in tables and ranges. */
public class PostWorkbookDataFillRequest implements RequestOption {
    private final String name;
    private final DataFill dataFill;

    private String folder;
    private String storageName;
    private String password;
    private String region;
    private Boolean checkExcelRestriction;

    public PostWorkbookDataFillRequest(String name, DataFill dataFill) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (dataFill == null) throw new IllegalArgumentException("dataFill is required");
        this.name = name;
        this.dataFill = dataFill;
    }

    public PostWorkbookDataFillRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookDataFillRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostWorkbookDataFillRequest setPassword(String password) { this.password = password; return this; }
    public PostWorkbookDataFillRequest setRegion(String region) { this.region = region; return this; }
    public PostWorkbookDataFillRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/datafill";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return dataFill;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
