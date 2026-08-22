package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Delete a picture object by index in the worksheet. */
public class DeleteWorksheetPictureRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pictureIndex;

    private String folder;
    private String storageName;

    public DeleteWorksheetPictureRequest(String name, String sheetName, Integer pictureIndex) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pictureIndex == null) throw new IllegalArgumentException("pictureIndex is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pictureIndex = pictureIndex;
    }

    public DeleteWorksheetPictureRequest setFolder(String folder) { this.folder = folder; return this; }
    public DeleteWorksheetPictureRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "DELETE"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pictures/" + urlEncode(String.valueOf(pictureIndex));
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
