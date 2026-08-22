package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ImportJsonRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Import a JSON data file into the workbook. The JSON data file can either be a cloud file or data from an HTTP URI. */
public class PostWorkbookImportJsonRequest implements RequestOption {
    private final String name;
    private final ImportJsonRequest importJsonRequest;

    private String password;
    private String folder;
    private String storageName;
    private String outPath;
    private String outStorageName;
    private Boolean checkExcelRestriction;
    private String region;

    public PostWorkbookImportJsonRequest(String name, ImportJsonRequest importJsonRequest) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (importJsonRequest == null) throw new IllegalArgumentException("importJsonRequest is required");
        this.name = name;
        this.importJsonRequest = importJsonRequest;
    }

    public PostWorkbookImportJsonRequest setPassword(String password) { this.password = password; return this; }
    public PostWorkbookImportJsonRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookImportJsonRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostWorkbookImportJsonRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public PostWorkbookImportJsonRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public PostWorkbookImportJsonRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostWorkbookImportJsonRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/importjson";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (password != null && !password.isEmpty()) query.put("password", password);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
        if (region != null && !region.isEmpty()) query.put("region", region);
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
        return importJsonRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
