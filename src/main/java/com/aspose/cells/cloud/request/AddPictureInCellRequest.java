package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** add new picture in the cells. */
public class AddPictureInCellRequest implements RequestOption {
    private final String name;
    private final String sheetName;
    private final String cellName;
    private final String picturePath;

    private String folder;
    private String storageName;

    public AddPictureInCellRequest(String name, String sheetName, String cellName, String picturePath) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        if (cellName == null || cellName.isEmpty()) throw new IllegalArgumentException("cellName is required");
        if (picturePath == null || picturePath.isEmpty()) throw new IllegalArgumentException("picturePath is required");
        this.name = name;
        this.sheetName = sheetName;
        this.cellName = cellName;
        this.picturePath = picturePath;
    }

    public AddPictureInCellRequest setFolder(String folder) { this.folder = folder; return this; }
    public AddPictureInCellRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "POST"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pictures/addPictureInCell";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        query.put("cellName", cellName);
        query.put("picturePath", picturePath);
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
