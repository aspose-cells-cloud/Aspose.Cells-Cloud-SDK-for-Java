/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutHorizontalPageBreakRequest.java">
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

public class PutHorizontalPageBreakRequest implements RequestOption {

    private String name;
    private String sheetName;
    private String cellname;
    private Integer column;
    private Integer endColumn;
    private String folder;
    private Integer row;
    private Integer startColumn;
    private String storageName;

    private HashMap<String, String> extendQueryParameterMap;

    public PutHorizontalPageBreakRequest(String name, String sheetName) {
        this.name = name;
        this.sheetName = sheetName;
    }

    public String getName() {
        return name;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getCellname() {
        return cellname;
    }

    public void setCellname(String cellname) {
        this.cellname = cellname;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Integer getEndColumn() {
        return endColumn;
    }

    public void setEndColumn(Integer endColumn) {
        this.endColumn = endColumn;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getStartColumn() {
        return startColumn;
    }

    public void setStartColumn(Integer startColumn) {
        this.startColumn = startColumn;
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

    public PutHorizontalPageBreakRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/{name}/worksheets/{sheetName}/horizontalpagebreaks";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        path = path.replace("{sheetName}", UrlUtils.urlEncode(this.sheetName == null ? "" : String.valueOf(this.sheetName)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        if (this.cellname != null && !this.cellname.isEmpty()) {
            query.put("cellname", this.cellname);
        }
        if (this.row != null) {
            query.put("row", String.valueOf(this.row));
        }
        if (this.column != null) {
            query.put("column", String.valueOf(this.column));
        }
        if (this.startColumn != null) {
            query.put("startColumn", String.valueOf(this.startColumn));
        }
        if (this.endColumn != null) {
            query.put("endColumn", String.valueOf(this.endColumn));
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
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
