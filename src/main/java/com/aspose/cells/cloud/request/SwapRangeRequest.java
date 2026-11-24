/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SwapRangeRequest.java">
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

public class SwapRangeRequest implements RequestOption {

    private String range1;
    private String range2;
    private FormFile spreadsheet;
    private String worksheet1;
    private String worksheet2;
    private String outPath;
    private String outStorageName;
    private String password;
    private String region;

    private HashMap<String, String> extendQueryParameterMap;

    public SwapRangeRequest(String range1, String range2, FormFile spreadsheet, String worksheet1, String worksheet2) {
        this.range1 = range1;
        this.range2 = range2;
        this.spreadsheet = spreadsheet;
        this.worksheet1 = worksheet1;
        this.worksheet2 = worksheet2;
    }

    public String getRange1() {
        return range1;
    }

    public String getRange2() {
        return range2;
    }

    public FormFile getSpreadsheet() {
        return spreadsheet;
    }

    public String getWorksheet1() {
        return worksheet1;
    }

    public String getWorksheet2() {
        return worksheet2;
    }

    public String getOutPath() {
        return outPath;
    }

    public void setOutPath(String outPath) {
        this.outPath = outPath;
    }

    public String getOutStorageName() {
        return outStorageName;
    }

    public void setOutStorageName(String outStorageName) {
        this.outStorageName = outStorageName;
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

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public SwapRangeRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/swap/range";
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("worksheet1", this.worksheet1 == null ? "" : this.worksheet1);
        query.put("range1", this.range1 == null ? "" : this.range1);
        query.put("worksheet2", this.worksheet2 == null ? "" : this.worksheet2);
        query.put("range2", this.range2 == null ? "" : this.range2);
        if (this.outPath != null && !this.outPath.isEmpty()) {
            query.put("outPath", this.outPath);
        }
        if (this.outStorageName != null && !this.outStorageName.isEmpty()) {
            query.put("outStorageName", this.outStorageName);
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
