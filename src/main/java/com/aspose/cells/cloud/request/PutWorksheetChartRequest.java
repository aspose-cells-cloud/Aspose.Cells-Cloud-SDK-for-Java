/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetChartRequest.java">
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
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PutWorksheetChartRequest implements RequestOption {

    private String chartType;
    private String name;
    private String sheetName;
    private String area;
    private String categoryData;
    private Boolean dataLabels;
    private String dataLabelsPosition;
    private String folder;
    private Boolean isAutoGetSerialName;
    private Boolean isVertical;
    private Integer lowerRightColumn;
    private Integer lowerRightRow;
    private String pivotTableName;
    private String pivotTableSheet;
    private String storageName;
    private String title;
    private Integer upperLeftColumn;
    private Integer upperLeftRow;

    private HashMap<String, String> extendQueryParameterMap;

    public PutWorksheetChartRequest(String chartType, String name, String sheetName) {
        this.chartType = chartType;
        this.name = name;
        this.sheetName = sheetName;
    }

    public String getChartType() {
        return chartType;
    }

    public String getName() {
        return name;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCategoryData() {
        return categoryData;
    }

    public void setCategoryData(String categoryData) {
        this.categoryData = categoryData;
    }

    public Boolean getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(Boolean dataLabels) {
        this.dataLabels = dataLabels;
    }

    public String getDataLabelsPosition() {
        return dataLabelsPosition;
    }

    public void setDataLabelsPosition(String dataLabelsPosition) {
        this.dataLabelsPosition = dataLabelsPosition;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Boolean getIsAutoGetSerialName() {
        return isAutoGetSerialName;
    }

    public void setIsAutoGetSerialName(Boolean isAutoGetSerialName) {
        this.isAutoGetSerialName = isAutoGetSerialName;
    }

    public Boolean getIsVertical() {
        return isVertical;
    }

    public void setIsVertical(Boolean isVertical) {
        this.isVertical = isVertical;
    }

    public Integer getLowerRightColumn() {
        return lowerRightColumn;
    }

    public void setLowerRightColumn(Integer lowerRightColumn) {
        this.lowerRightColumn = lowerRightColumn;
    }

    public Integer getLowerRightRow() {
        return lowerRightRow;
    }

    public void setLowerRightRow(Integer lowerRightRow) {
        this.lowerRightRow = lowerRightRow;
    }

    public String getPivotTableName() {
        return pivotTableName;
    }

    public void setPivotTableName(String pivotTableName) {
        this.pivotTableName = pivotTableName;
    }

    public String getPivotTableSheet() {
        return pivotTableSheet;
    }

    public void setPivotTableSheet(String pivotTableSheet) {
        this.pivotTableSheet = pivotTableSheet;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public PutWorksheetChartRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/{name}/worksheets/{sheetName}/charts";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        path = path.replace("{sheetName}", UrlUtils.urlEncode(this.sheetName == null ? "" : String.valueOf(this.sheetName)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("chartType", this.chartType == null ? "" : this.chartType);
        if (this.upperLeftRow != null) {
            query.put("upperLeftRow", String.valueOf(this.upperLeftRow));
        }
        if (this.upperLeftColumn != null) {
            query.put("upperLeftColumn", String.valueOf(this.upperLeftColumn));
        }
        if (this.lowerRightRow != null) {
            query.put("lowerRightRow", String.valueOf(this.lowerRightRow));
        }
        if (this.lowerRightColumn != null) {
            query.put("lowerRightColumn", String.valueOf(this.lowerRightColumn));
        }
        if (this.area != null && !this.area.isEmpty()) {
            query.put("area", this.area);
        }
        if (this.isVertical != null) {
            query.put("isVertical", String.valueOf(this.isVertical));
        }
        if (this.categoryData != null && !this.categoryData.isEmpty()) {
            query.put("categoryData", this.categoryData);
        }
        if (this.isAutoGetSerialName != null) {
            query.put("isAutoGetSerialName", String.valueOf(this.isAutoGetSerialName));
        }
        if (this.title != null && !this.title.isEmpty()) {
            query.put("title", this.title);
        }
        if (this.folder != null && !this.folder.isEmpty()) {
            query.put("folder", this.folder);
        }
        if (this.dataLabels != null) {
            query.put("dataLabels", String.valueOf(this.dataLabels));
        }
        if (this.dataLabelsPosition != null && !this.dataLabelsPosition.isEmpty()) {
            query.put("dataLabelsPosition", this.dataLabelsPosition);
        }
        if (this.pivotTableSheet != null && !this.pivotTableSheet.isEmpty()) {
            query.put("pivotTableSheet", this.pivotTableSheet);
        }
        if (this.pivotTableName != null && !this.pivotTableName.isEmpty()) {
            query.put("pivotTableName", this.pivotTableName);
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
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
