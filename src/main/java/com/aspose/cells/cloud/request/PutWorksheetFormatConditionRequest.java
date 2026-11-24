/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetFormatConditionRequest.java">
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

public class PutWorksheetFormatConditionRequest implements RequestOption {

    private String cellArea;
    private String formula1;
    private String formula2;
    private Integer index;
    private String name;
    private String operatorType;
    private String sheetName;
    private String type;
    private String folder;
    private String storageName;

    private HashMap<String, String> extendQueryParameterMap;

    public PutWorksheetFormatConditionRequest(String cellArea, String formula1, String formula2, Integer index, String name, String operatorType, String sheetName, String type) {
        this.cellArea = cellArea;
        this.formula1 = formula1;
        this.formula2 = formula2;
        this.index = index;
        this.name = name;
        this.operatorType = operatorType;
        this.sheetName = sheetName;
        this.type = type;
    }

    public String getCellArea() {
        return cellArea;
    }

    public String getFormula1() {
        return formula1;
    }

    public String getFormula2() {
        return formula2;
    }

    public Integer getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public String getOperatorType() {
        return operatorType;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getType() {
        return type;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
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

    public PutWorksheetFormatConditionRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/{name}/worksheets/{sheetName}/conditionalFormattings/{index}";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        path = path.replace("{sheetName}", UrlUtils.urlEncode(this.sheetName == null ? "" : String.valueOf(this.sheetName)));
        path = path.replace("{index}", UrlUtils.urlEncode(this.index == null ? "" : String.valueOf(this.index)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("cellArea", this.cellArea == null ? "" : this.cellArea);
        query.put("type", this.type == null ? "" : this.type);
        query.put("operatorType", this.operatorType == null ? "" : this.operatorType);
        query.put("formula1", this.formula1 == null ? "" : this.formula1);
        query.put("formula2", this.formula2 == null ? "" : this.formula2);
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
