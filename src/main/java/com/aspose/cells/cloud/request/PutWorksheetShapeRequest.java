/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetShapeRequest.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cells.cloud.request;

import com.aspose.cells.cloud.RequestOption;
import com.aspose.cells.cloud.UrlUtils;
import com.aspose.cells.cloud.model.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PutWorksheetShapeRequest implements RequestOption {

    private String name;
    private String sheetName;
    private String drawingType;
    private String folder;
    private Integer height;
    private Integer left;
    private Shape shapeDTO;
    private String storageName;
    private Integer top;
    private Integer upperLeftColumn;
    private Integer upperLeftRow;
    private Integer width;

    private HashMap<String, String> extendQueryParameterMap;

    public PutWorksheetShapeRequest(String name, String sheetName) {
        this.name = name;
        this.sheetName = sheetName;
    }

    public String getName() {
        return name;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getDrawingType() {
        return drawingType;
    }

    public void setDrawingType(String drawingType) {
        this.drawingType = drawingType;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getLeft() {
        return left;
    }

    public void setLeft(Integer left) {
        this.left = left;
    }

    public Shape getShapeDTO() {
        return shapeDTO;
    }

    public void setShapeDTO(Shape shapeDTO) {
        this.shapeDTO = shapeDTO;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public Integer getTop() {
        return top;
    }

    public void setTop(Integer top) {
        this.top = top;
    }

    public Integer getUpperLeftColumn() {
        return upperLeftColumn;
    }

    public void setUpperLeftColumn(Integer upperLeftColumn) {
        this.upperLeftColumn = upperLeftColumn;
    }

    public Integer getUpperLeftRow() {
        return upperLeftRow;
    }

    public void setUpperLeftRow(Integer upperLeftRow) {
        this.upperLeftRow = upperLeftRow;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public PutWorksheetShapeRequest addQueryParameter(String key, String value) {
        if (this.extendQueryParameterMap == null) {
            this.extendQueryParameterMap = new HashMap<String, String>();
        }
        this.extendQueryParameterMap.put(key, value);
        return this;
    }

    @Override
    public String getMethod() {
        return "PUT";
    }

    @Override
    public String getApiVersion() {
        return "v3.0";
    }

    @Override
    public String getPath() {
        String path = "/cells/{name}/worksheets/{sheetName}/shapes";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        path = path.replace("{sheetName}", UrlUtils.urlEncode(this.sheetName == null ? "" : String.valueOf(this.sheetName)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        if (this.drawingType != null && !this.drawingType.isEmpty()) {
            query.put("DrawingType", this.drawingType);
        }
        if (this.upperLeftRow != null) {
            query.put("upperLeftRow", String.valueOf(this.upperLeftRow));
        }
        if (this.upperLeftColumn != null) {
            query.put("upperLeftColumn", String.valueOf(this.upperLeftColumn));
        }
        if (this.top != null) {
            query.put("top", String.valueOf(this.top));
        }
        if (this.left != null) {
            query.put("left", String.valueOf(this.left));
        }
        if (this.width != null) {
            query.put("width", String.valueOf(this.width));
        }
        if (this.height != null) {
            query.put("height", String.valueOf(this.height));
        }
        if (this.folder != null && !this.folder.isEmpty()) {
            query.put("folder", this.folder);
        }
        if (this.storageName != null && !this.storageName.isEmpty()) {
            query.put("storageName", this.storageName);
        }
        if (this.extendQueryParameterMap != null) {
            query.putAll(this.extendQueryParameterMap);
        }
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "application/json");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return this.shapeDTO;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
