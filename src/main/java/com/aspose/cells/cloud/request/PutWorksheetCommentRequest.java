package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Comment;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add cell comment in the worksheet. */
public class PutWorksheetCommentRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String cellName;
    private final Comment comment;

    private String folder;
    private String storageName;

    public PutWorksheetCommentRequest(String name, String sheetName, String cellName, Comment comment) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (cellName == null || cellName.isEmpty()) throw new IllegalArgumentException("cellName is required");
        if (comment == null) throw new IllegalArgumentException("comment is required");
        this.name = name;
        this.sheetName = sheetName;
        this.cellName = cellName;
        this.comment = comment;
    }

    public PutWorksheetCommentRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetCommentRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/comments/" + urlEncode(cellName);
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
        return comment;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
