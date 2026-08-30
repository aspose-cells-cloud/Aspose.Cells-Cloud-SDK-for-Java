package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.model.Shape;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import static com.aspose.cells.cloud.UrlUtils.urlEncode;

/** Add a shape in the worksheet. */
public class PutWorksheetShapeRequest implements RequestOption {
    private final String name;
    private final String sheetName;

    private Shape shapeDTO;
    private String drawingType;
    private Integer upperLeftRow;
    private Integer upperLeftColumn;
    private Integer top;
    private Integer left;
    private Integer width;
    private Integer height;
    private String folder;
    private String storageName;

    public PutWorksheetShapeRequest(String name, String sheetName) {
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name is required");
        if (sheetName == null || sheetName.isEmpty()) throw new IllegalArgumentException("sheetName is required");
        this.name = name;
        this.sheetName = sheetName;
    }

    public PutWorksheetShapeRequest setShapeDTO(Shape shapeDTO) { this.shapeDTO = shapeDTO; return this; }
    public PutWorksheetShapeRequest setDrawingType(String drawingType) { this.drawingType = drawingType; return this; }
    public PutWorksheetShapeRequest setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }
    public PutWorksheetShapeRequest setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }
    public PutWorksheetShapeRequest setTop(Integer top) { this.top = top; return this; }
    public PutWorksheetShapeRequest setLeft(Integer left) { this.left = left; return this; }
    public PutWorksheetShapeRequest setWidth(Integer width) { this.width = width; return this; }
    public PutWorksheetShapeRequest setHeight(Integer height) { this.height = height; return this; }
    public PutWorksheetShapeRequest setFolder(String folder) { this.folder = folder; return this; }
    public PutWorksheetShapeRequest setStorageName(String storageName) { this.storageName = storageName; return this; }

    @Override public String getMethod() { return "PUT"; }

    @Override public String getApiVersion() { return "v3.0"; }

    @Override
    public String getPath() {
        return "/cells/" + urlEncode(name) + "/worksheets/" + urlEncode(sheetName) + "/shapes";
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<>();
        if (drawingType != null && !drawingType.isEmpty()) query.put("DrawingType", drawingType);
        if (upperLeftRow != null) query.put("upperLeftRow", String.valueOf(upperLeftRow));
        if (upperLeftColumn != null) query.put("upperLeftColumn", String.valueOf(upperLeftColumn));
        if (top != null) query.put("top", String.valueOf(top));
        if (left != null) query.put("left", String.valueOf(left));
        if (width != null) query.put("width", String.valueOf(width));
        if (height != null) query.put("height", String.valueOf(height));
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
        return shapeDTO;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
