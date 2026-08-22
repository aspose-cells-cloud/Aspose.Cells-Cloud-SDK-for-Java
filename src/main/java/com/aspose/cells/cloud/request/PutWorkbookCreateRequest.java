package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Create a new workbook using different methods. */
public class PutWorkbookCreateRequest implements RequestOption {
    private final String name;

    private String templateFile;
    private String dataFile;
    private Boolean isWriteOver;
    private String folder;
    private String storageName;
    private Boolean checkExcelRestriction;

    public PutWorkbookCreateRequest(String name) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        this.name = name;
    }

    public PutWorkbookCreateRequest setTemplateFile(String templateFile) { this.templateFile = templateFile; return this; }
    public PutWorkbookCreateRequest setDataFile(String dataFile) { this.dataFile = dataFile; return this; }
    public PutWorkbookCreateRequest setIsWriteOver(Boolean isWriteOver) { this.isWriteOver = isWriteOver; return this; }
    public PutWorkbookCreateRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorkbookCreateRequest setStorageName(String storageName) { this.storageName = storageName; return this; }
    public PutWorkbookCreateRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name);
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (templateFile != null && !templateFile.isEmpty()) query.put("templateFile", templateFile);
        if (dataFile != null && !dataFile.isEmpty()) query.put("dataFile", dataFile);
        if (isWriteOver != null) query.put("isWriteOver", String.valueOf(isWriteOver));
        if (folder != null && !folder.isEmpty()) query.put("folder", folder);
        if (storageName != null && !storageName.isEmpty()) query.put("storageName", storageName);
        if (checkExcelRestriction != null) query.put("checkExcelRestriction", String.valueOf(checkExcelRestriction));
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
