package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add an OLE object in the worksheet. */
public class PutWorksheetOleObjectRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private Integer upperLeftRow;
    private Integer upperLeftColumn;
    private Integer height;
    private Integer width;
    private String oleFile;
    private String imageFile;
    private String folder;
    private String storageName;

    public PutWorksheetOleObjectRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PutWorksheetOleObjectRequest setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }
    public PutWorksheetOleObjectRequest setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }
    public PutWorksheetOleObjectRequest setHeight(Integer height) { this.height = height; return this; }
    public PutWorksheetOleObjectRequest setWidth(Integer width) { this.width = width; return this; }
    public PutWorksheetOleObjectRequest setOleFile(String oleFile) { this.oleFile = oleFile; return this; }
    public PutWorksheetOleObjectRequest setImageFile(String imageFile) { this.imageFile = imageFile; return this; }
    public PutWorksheetOleObjectRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetOleObjectRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/v3.0/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/oleobjects";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (upperLeftRow != null) query.put("upperLeftRow", String.valueOf(upperLeftRow));
        if (upperLeftColumn != null) query.put("upperLeftColumn", String.valueOf(upperLeftColumn));
        if (height != null) query.put("height", String.valueOf(height));
        if (width != null) query.put("width", String.valueOf(width));
        if (oleFile != null && !oleFile.isEmpty()) query.put("oleFile", oleFile);
        if (imageFile != null && !imageFile.isEmpty()) query.put("imageFile", imageFile);
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
