package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Hyperlink;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update hyperlink by index in the worksheet. */
public class PostWorksheetHyperlinkRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer hyperlinkIndex;
    private final Hyperlink hyperlink;

    private String folder;
    private String storageName;

    public PostWorksheetHyperlinkRequest(String name, String sheetName, Integer hyperlinkIndex, Hyperlink hyperlink) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (hyperlinkIndex == null) throw new IllegalArgumentException("hyperlinkIndex is required");
        if (hyperlink == null) throw new IllegalArgumentException("hyperlink is required");
        this.name = name;
        this.sheetName = sheetName;
        this.hyperlinkIndex = hyperlinkIndex;
        this.hyperlink = hyperlink;
    }

    public PostWorksheetHyperlinkRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetHyperlinkRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/hyperlinks/" + urlEncode(String.valueOf(hyperlinkIndex));
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
        return hyperlink;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
