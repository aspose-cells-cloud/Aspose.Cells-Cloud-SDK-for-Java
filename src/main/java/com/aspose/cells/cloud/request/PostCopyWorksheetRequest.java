package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.CopyOptions;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Copy contents and formats from another worksheet. */
public class PostCopyWorksheetRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String sourceSheet;
    private final CopyOptions options;

    private String sourceWorkbook;
    private String sourceFolder;
    private String folder;
    private String storageName;

    public PostCopyWorksheetRequest(String name, String sheetName, String sourceSheet, CopyOptions options) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (sourceSheet == null || sourceSheet.isEmpty()) throw new IllegalArgumentException("sourceSheet is required");
        if (options == null) throw new IllegalArgumentException("options is required");
        this.name = name;
        this.sheetName = sheetName;
        this.sourceSheet = sourceSheet;
        this.options = options;
    }

    public PostCopyWorksheetRequest setSourceWorkbook(String sourceWorkbook) { this.sourceWorkbook = sourceWorkbook; return this; }
    public PostCopyWorksheetRequest setSourceFolder(String sourceFolder) { this.sourceFolder = sourceFolder; return this; }
    public PostCopyWorksheetRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostCopyWorksheetRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/copy";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("sourceSheet", sourceSheet);
        if (sourceWorkbook != null && !sourceWorkbook.isEmpty()) query.put("sourceWorkbook", sourceWorkbook);
        if (sourceFolder != null && !sourceFolder.isEmpty()) query.put("sourceFolder", sourceFolder);
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
        return options;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
