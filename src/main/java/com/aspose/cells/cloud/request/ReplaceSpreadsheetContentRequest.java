/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ReplaceSpreadsheetContentRequest.java">
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

public class ReplaceSpreadsheetContentRequest implements RequestOption {

    private String replaceText;
    private String searchText;
    private FormFile spreadsheet;
    private String cellArea;
    private String password;
    private String region;
    private String worksheet;

    private HashMap<String, String> extendQueryParameterMap;

    public ReplaceSpreadsheetContentRequest(String replaceText, String searchText, FormFile spreadsheet) {
        this.replaceText = replaceText;
        this.searchText = searchText;
        this.spreadsheet = spreadsheet;
    }

    public String getReplaceText() {
        return replaceText;
    }

    public String getSearchText() {
        return searchText;
    }

    public FormFile getSpreadsheet() {
        return spreadsheet;
    }

    public String getCellArea() {
        return cellArea;
    }

    public void setCellArea(String cellArea) {
        this.cellArea = cellArea;
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

    public String getWorksheet() {
        return worksheet;
    }

    public void setWorksheet(String worksheet) {
        this.worksheet = worksheet;
    }

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public ReplaceSpreadsheetContentRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/replace/content";
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("searchText", this.searchText == null ? "" : this.searchText);
        query.put("replaceText", this.replaceText == null ? "" : this.replaceText);
        if (this.worksheet != null && !this.worksheet.isEmpty()) {
            query.put("worksheet", this.worksheet);
        }
        if (this.cellArea != null && !this.cellArea.isEmpty()) {
            query.put("cellArea", this.cellArea);
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
