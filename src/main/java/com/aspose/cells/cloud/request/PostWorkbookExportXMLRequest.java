package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Export XML data from an Excel file. When there are XML Maps in an Excel file, export XML data. When there is no XML map in the Excel file, convert the Excel file to an XML file. */
public class PostWorkbookExportXMLRequest implements RequestOption {
    private final String name;

    private String password;
    private String folder;
    private String storageName;
    private String outPath;
    private String outStorageName;
    private Boolean checkExcelRestriction;
    private String region;

    public PostWorkbookExportXMLRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public PostWorkbookExportXMLRequest setPassword(String password) { this.password = password; return this; }
    public PostWorkbookExportXMLRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookExportXMLRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostWorkbookExportXMLRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public PostWorkbookExportXMLRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }
    public PostWorkbookExportXMLRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }
    public PostWorkbookExportXMLRequest setRegion(String region) { this.region = region; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/exportxml";
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
        return new HashMap<>();
    }

    @Override
    public Object getJsonBody() {
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }

    @Override public boolean isBinaryResponse() { return true; }
}
