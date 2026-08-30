package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Picture;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Update a picture by index in the worksheet. */
public class PostWorksheetPictureRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final Integer pictureIndex;
    private final Picture picture;

    private String folder;
    private String storageName;

    public PostWorksheetPictureRequest(String name, String sheetName, Integer pictureIndex, Picture picture) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (pictureIndex == null) throw new IllegalArgumentException("pictureIndex is required");
        if (picture == null) throw new IllegalArgumentException("picture is required");
        this.name = name;
        this.sheetName = sheetName;
        this.pictureIndex = pictureIndex;
        this.picture = picture;
    }

    public PostWorksheetPictureRequest setFolder(String folder) { this.folder = folder; return this; }
    public PostWorksheetPictureRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pictures/" + urlEncode(String.valueOf(pictureIndex));
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
        return picture;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
