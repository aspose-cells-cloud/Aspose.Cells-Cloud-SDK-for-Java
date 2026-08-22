package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ImportXMLRequest;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Import an XML data file into an Excel file. The XML data file can either be a cloud file or data from an HTTP URI. */
public class PostWorkbookImportXMLRequest implements RequestOption {
    private final String name;
    private final ImportXMLRequest importXMLRequest;

    private String password;
    private String folder;
    private String storageName;
    private String outPath;
    private String outStorageName;
    private Boolean checkExcelRestriction;
    private String region;

    public PostWorkbookImportXMLRequest(String name, ImportXMLRequest importXMLRequest) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (importXMLRequest == null) throw new IllegalArgumentException("importXMLRequest is required");
        this.name = name;
        this.importXMLRequest = importXMLRequest;
    }

    public PostWorkbookImportXMLRequest setPassword(String password) { this.password = password; return this; }
    public PostWorkbookImportXMLRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookImportXMLRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostWorkbookImportXMLRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public PostWorkbookImportXMLRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public PostWorkbookImportXMLRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostWorkbookImportXMLRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/importxml";
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
        return importXMLRequest;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
