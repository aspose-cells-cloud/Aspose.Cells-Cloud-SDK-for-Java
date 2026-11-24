/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CategorizeSpreadsheetRequest.java">
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

import com.aspose.cells.cloud.FormFile;
import com.aspose.cells.cloud.RequestOption;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CategorizeSpreadsheetRequest implements RequestOption {

    private FormFile spreadsheet;
    private String targetColumn;
    private String newColumnName;
    private String password;
    private String region;
    private String sheetName;

    private HashMap<String, String> extendQueryParameterMap;

    public CategorizeSpreadsheetRequest(FormFile spreadsheet, String targetColumn) {
        this.spreadsheet = spreadsheet;
        this.targetColumn = targetColumn;
    }

    public FormFile getSpreadsheet() {
        return spreadsheet;
    }

    public String getTargetColumn() {
        return targetColumn;
    }

    public String getNewColumnName() {
        return newColumnName;
    }

    public void setNewColumnName(String newColumnName) {
        this.newColumnName = newColumnName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public CategorizeSpreadsheetRequest addQueryParameter(String key, String value) {
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
        return "v4.0";
    }

    @Override
    public String getPath() {
        String path = "/cells/ai/categorize/spreadsheet";
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("targetColumn", this.targetColumn == null ? "" : this.targetColumn);
        if (this.sheetName != null && !this.sheetName.isEmpty()) {
            query.put("sheetName", this.sheetName);
        }
        if (this.newColumnName != null && !this.newColumnName.isEmpty()) {
            query.put("newColumnName", this.newColumnName);
        }
        if (this.region != null && !this.region.isEmpty()) {
            query.put("region", this.region);
        }
        if (this.password != null && !this.password.isEmpty()) {
            query.put("password", this.password);
        }
        if (this.extendQueryParameterMap != null) {
            query.putAll(this.extendQueryParameterMap);
        }
        return query;
    }

    @Override
    public Map<String, String> getHeaderParameters() {
        Map<String, String> headers = new LinkedHashMap<String, String>();
        headers.put("Content-Type", "multipart/form-data");
        return headers;
    }

    @Override
    public Object getJsonBody() {
        return null;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        Map<String, Object> form = new LinkedHashMap<String, Object>();
        if (this.spreadsheet != null) {
            form.put("Spreadsheet", this.spreadsheet);
        }
        return form.isEmpty() ? null : form;
    }

    @Override
    public boolean isBinaryResponse() {
        return true;
    }
}
