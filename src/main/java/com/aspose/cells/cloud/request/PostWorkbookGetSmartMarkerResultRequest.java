package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Smart marker processing. */
public class PostWorkbookGetSmartMarkerResultRequest implements RequestOption {
    private final String name;

    private String xmlFile;
    private String folder;
    private String outPath;
    private String storageName;
    private String outStorageName;

    public PostWorkbookGetSmartMarkerResultRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public PostWorkbookGetSmartMarkerResultRequest setXmlFile(String xmlFile) { this.xmlFile = xmlFile; return this; }
    public PostWorkbookGetSmartMarkerResultRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorkbookGetSmartMarkerResultRequest setOutPath(String outPath) { this.outPath = outPath; return this; }
    public PostWorkbookGetSmartMarkerResultRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostWorkbookGetSmartMarkerResultRequest setOutStorageName(String outStorageName) { this.outStorageName = outStorageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/smartmarker";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (xmlFile != null && !xmlFile.isEmpty()) query.put("xmlFile", xmlFile);
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (outPath != null && !outPath.isEmpty()) query.put("outPath", outPath);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (outStorageName != null && !outStorageName.isEmpty()) query.put("outStorageName", outStorageName);
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
}
