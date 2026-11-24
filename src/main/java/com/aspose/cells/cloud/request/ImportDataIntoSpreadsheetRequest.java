/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportDataIntoSpreadsheetRequest.java">
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

public class ImportDataIntoSpreadsheetRequest implements RequestOption {

    private FormFile datafile;
    private FormFile spreadsheet;
    private String startcell;
    private String worksheet;
    private Boolean convertNumericData;
    private String fontsLocation;
    private Boolean insert;
    private String outPath;
    private String outStorageName;
    private String password;
    private String region;
    private String splitter;

    private HashMap<String, String> extendQueryParameterMap;

    public ImportDataIntoSpreadsheetRequest(FormFile datafile, FormFile spreadsheet, String startcell, String worksheet) {
        this.datafile = datafile;
        this.spreadsheet = spreadsheet;
        this.startcell = startcell;
        this.worksheet = worksheet;
    }

    public FormFile getDatafile() {
        return datafile;
    }

    public FormFile getSpreadsheet() {
        return spreadsheet;
    }

    public String getStartcell() {
        return startcell;
    }

    public String getWorksheet() {
        return worksheet;
    }

    public Boolean getConvertNumericData() {
        return convertNumericData;
    }

    public void setConvertNumericData(Boolean convertNumericData) {
        this.convertNumericData = convertNumericData;
    }

    public String getFontsLocation() {
        return fontsLocation;
    }

    public void setFontsLocation(String fontsLocation) {
        this.fontsLocation = fontsLocation;
    }

    public Boolean getInsert() {
        return insert;
    }

    public void setInsert(Boolean insert) {
        this.insert = insert;
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

    public String getSplitter() {
        return splitter;
    }

    public void setSplitter(String splitter) {
        this.splitter = splitter;
    }

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public ImportDataIntoSpreadsheetRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/import/data";
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("worksheet", this.worksheet == null ? "" : this.worksheet);
        query.put("startcell", this.startcell == null ? "" : this.startcell);
        if (this.insert != null) {
            query.put("insert", String.valueOf(this.insert));
        }
        if (this.convertNumericData != null) {
            query.put("convertNumericData", String.valueOf(this.convertNumericData));
        }
        if (this.splitter != null && !this.splitter.isEmpty()) {
            query.put("splitter", this.splitter);
        }
        if (this.outPath != null && !this.outPath.isEmpty()) {
            query.put("outPath", this.outPath);
        }
        if (this.outStorageName != null && !this.outStorageName.isEmpty()) {
            query.put("outStorageName", this.outStorageName);
        }
        if (this.fontsLocation != null && !this.fontsLocation.isEmpty()) {
            query.put("fontsLocation", this.fontsLocation);
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
        if (this.datafile != null) {
            form.put("datafile", this.datafile);
        }
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
