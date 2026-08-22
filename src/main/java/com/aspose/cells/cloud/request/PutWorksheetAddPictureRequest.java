package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Picture;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a new picture in the worksheet. */
public class PutWorksheetAddPictureRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private Picture picture;
    private Integer upperLeftRow;
    private Integer upperLeftColumn;
    private Integer lowerRightRow;
    private Integer lowerRightColumn;
    private String picturePath;
    private String folder;
    private String storageName;

    public PutWorksheetAddPictureRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PutWorksheetAddPictureRequest setPicture(Picture picture) { this.picture = picture; return this; }
    public PutWorksheetAddPictureRequest setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }
    public PutWorksheetAddPictureRequest setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }
    public PutWorksheetAddPictureRequest setLowerRightRow(Integer lowerRightRow) { this.lowerRightRow = lowerRightRow; return this; }
    public PutWorksheetAddPictureRequest setLowerRightColumn(Integer lowerRightColumn) { this.lowerRightColumn = lowerRightColumn; return this; }
    public PutWorksheetAddPictureRequest setPicturePath(String picturePath) { this.picturePath = picturePath; return this; }
    public PutWorksheetAddPictureRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetAddPictureRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/pictures";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (upperLeftRow != null) query.put("upperLeftRow", String.valueOf(upperLeftRow));
        if (upperLeftColumn != null) query.put("upperLeftColumn", String.valueOf(upperLeftColumn));
        if (lowerRightRow != null) query.put("lowerRightRow", String.valueOf(lowerRightRow));
        if (lowerRightColumn != null) query.put("lowerRightColumn", String.valueOf(lowerRightColumn));
        if (picturePath != null && !picturePath.isEmpty()) query.put("picturePath", picturePath);
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
