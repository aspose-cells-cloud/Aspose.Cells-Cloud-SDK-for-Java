package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.PageSetup;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update page setup in the worksheet. */
public class PostPageSetupRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final PageSetup pageSetup;

    private String folder;
    private String storageName;

    public PostPageSetupRequest(String name, String sheetName, PageSetup pageSetup) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pageSetup == null) throw new IllegalArgumentException("pageSetup is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pageSetup = pageSetup;
    }

    public PostPageSetupRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostPageSetupRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pagesetup";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
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
        return pageSetup;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
