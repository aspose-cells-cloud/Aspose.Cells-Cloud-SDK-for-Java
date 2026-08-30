package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update page header in the worksheet. */
public class PostHeaderRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer section;
    private final String script;
    private final Boolean isFirstPage;

    private String folder;
    private String storageName;

    public PostHeaderRequest(String name, String sheetName, Integer section, String script, Boolean isFirstPage) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (section == null) throw new IllegalArgumentException("section is required");
        if (script == null || script.isEmpty()) throw new IllegalArgumentException("script is required");
        if (isFirstPage == null) throw new IllegalArgumentException("isFirstPage is required");
        this.name = name;
        this.sheetName = sheetName;
        this.section = section;
        this.script = script;
        this.isFirstPage = isFirstPage;
    }

    public PostHeaderRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostHeaderRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pagesetup/header";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("section", String.valueOf(section));
        query.put("script", script);
        query.put("isFirstPage", String.valueOf(isFirstPage));
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
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
