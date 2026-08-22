package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.ImportOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Import data into the Excel file. */
public class PostImportDataRequest implements RequestOption {
    private final String name;

    private ImportOption importOption;
    private String folder;
    private String storageName;
    private String region;
    private String fontsLocation;

    public PostImportDataRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public PostImportDataRequest setImportOption(ImportOption importOption) { this.importOption = importOption; return this; }
    public PostImportDataRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostImportDataRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PostImportDataRequest setRegion(String region) { this.region = region; return this; }
    public PostImportDataRequest setFontsLocation(String fontsLocation) { this.fontsLocation = fontsLocation; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/importdata";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (region != null && !region.isEmpty()) query.put("region", region);
        if (fontsLocation != null && !fontsLocation.isEmpty()) query.put("FontsLocation", fontsLocation);
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
        return importOption;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
