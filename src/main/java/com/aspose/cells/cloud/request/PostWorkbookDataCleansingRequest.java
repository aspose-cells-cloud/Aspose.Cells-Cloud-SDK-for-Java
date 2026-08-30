package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.DataCleansing;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Data cleaning of spreadsheet files is a data management process used to identify, correct, and remove errors, incompleteness, duplicates, or inaccuracies in tables and ranges. */
public class PostWorkbookDataCleansingRequest implements RequestOption {
    private final String name;
    private final DataCleansing dataCleansing;

    private String folder;
    private String storageName;
    private String password;
    private String region;
    private Boolean checkExcelRestriction;

    public PostWorkbookDataCleansingRequest(String name, DataCleansing dataCleansing) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (dataCleansing == null) throw new IllegalArgumentException("dataCleansing is required");
        this.name = name;
        this.dataCleansing = dataCleansing;
    }

    public PostWorkbookDataCleansingRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookDataCleansingRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostWorkbookDataCleansingRequest setPassword(String password) { this.password = password; return this; }
    public PostWorkbookDataCleansingRequest setRegion(String region) { this.region = region; return this; }
    public PostWorkbookDataCleansingRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/datacleansing";
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
        return dataCleansing;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
