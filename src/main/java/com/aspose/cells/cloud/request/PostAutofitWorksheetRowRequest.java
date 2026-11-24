/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostAutofitWorksheetRowRequest.java">
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

public class PostAutofitWorksheetRowRequest implements RequestOption {

    private String name;
    private Integer rowIndex;
    private String sheetName;
    private Integer firstColumn;
    private String folder;
    private Integer lastColumn;
    private Integer rowCount;
    private String storageName;

    private HashMap<String, String> extendQueryParameterMap;

    public PostAutofitWorksheetRowRequest(String name, Integer rowIndex, String sheetName) {
        this.name = name;
        this.rowIndex = rowIndex;
        this.sheetName = sheetName;
    }

    public String getName() {
        return name;
    }

    public Integer getRowIndex() {
        return rowIndex;
    }

    public String getSheetName() {
        return sheetName;
    }

    public Integer getFirstColumn() {
        return firstColumn;
    }

    public void setFirstColumn(Integer firstColumn) {
        this.firstColumn = firstColumn;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Integer getLastColumn() {
        return lastColumn;
    }

    public void setLastColumn(Integer lastColumn) {
        this.lastColumn = lastColumn;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
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

    public PostAutofitWorksheetRowRequest addQueryParameter(String key, String value) {
        if (this.extendQueryParameterMap == null) {
            this.extendQueryParameterMap = new HashMap<String, String>();
        }
        this.extendQueryParameterMap.put(key, value);
        return this;
    }

    @Override
    public String getMethod() {
        return "POST";
    }

    @Override
    public String getApiVersion() {
        return "v3.0";
    }

    @Override
    public String getPath() {
        String path = "/cells/{name}/worksheets/{sheetName}/autofitrow";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        path = path.replace("{sheetName}", UrlUtils.urlEncode(this.sheetName == null ? "" : String.valueOf(this.sheetName)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        if (this.rowIndex != null) {
            query.put("rowIndex", String.valueOf(this.rowIndex));
        }
        if (this.firstColumn != null) {
            query.put("firstColumn", String.valueOf(this.firstColumn));
        }
        if (this.lastColumn != null) {
            query.put("lastColumn", String.valueOf(this.lastColumn));
        }
        if (this.folder != null && !this.folder.isEmpty()) {
            query.put("folder", this.folder);
        }
        if (this.storageName != null && !this.storageName.isEmpty()) {
            query.put("storageName", this.storageName);
        }
        if (this.rowCount != null) {
            query.put("rowCount", String.valueOf(this.rowCount));
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
