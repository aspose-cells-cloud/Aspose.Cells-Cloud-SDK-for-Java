/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetListObjectRequest.java">
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

public class PutWorksheetListObjectRequest implements RequestOption {

    private String name;
    private String sheetName;
    private String displayName;
    private Integer endColumn;
    private Integer endRow;
    private String folder;
    private Boolean hasHeaders;
    private Boolean showTotals;
    private Integer startColumn;
    private Integer startRow;
    private String storageName;

    private HashMap<String, String> extendQueryParameterMap;

    public PutWorksheetListObjectRequest(String name, String sheetName) {
        this.name = name;
        this.sheetName = sheetName;
    }

    public String getName() {
        return name;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Integer getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    public Integer getEndRow() {
        return endRow;
    }

    public void setEndRow(Integer endRow) {
        this.endRow = endRow;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Boolean getHasHeaders() {
        return hasHeaders;
    }

    public void setHasHeaders(Boolean hasHeaders) {
        this.hasHeaders = hasHeaders;
    }

    public Boolean getShowTotals() {
        return showTotals;
    }

    public void setShowTotals(Boolean showTotals) {
        this.showTotals = showTotals;
    }

    public Integer getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(Integer startColumn) {
        this.startColumn = startColumn;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public PutWorksheetListObjectRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/{name}/worksheets/{sheetName}/listobjects";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        path = path.replace("{sheetName}", UrlUtils.urlEncode(this.sheetName == null ? "" : String.valueOf(this.sheetName)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        if (this.startRow != null) {
            query.put("startRow", String.valueOf(this.startRow));
        }
        if (this.startColumn != null) {
            query.put("startColumn", String.valueOf(this.startColumn));
        }
        if (this.endRow != null) {
            query.put("endRow", String.valueOf(this.endRow));
        }
        if (this.endColumn != null) {
            query.put("endColumn", String.valueOf(this.endColumn));
        }
        if (this.folder != null && !this.folder.isEmpty()) {
            query.put("folder", this.folder);
        }
        if (this.hasHeaders != null) {
            query.put("hasHeaders", String.valueOf(this.hasHeaders));
        }
        if (this.displayName != null && !this.displayName.isEmpty()) {
            query.put("displayName", this.displayName);
        }
        if (this.showTotals != null) {
            query.put("showTotals", String.valueOf(this.showTotals));
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
