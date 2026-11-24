/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetCustomFilterRequest.java">
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

public class PutWorksheetCustomFilterRequest implements RequestOption {

    private String criteria1;
    private Integer fieldIndex;
    private String name;
    private String operatorType1;
    private String range;
    private String sheetName;
    private String criteria2;
    private String folder;
    private Boolean isAnd;
    private Boolean matchBlanks;
    private String operatorType2;
    private Boolean refresh;
    private String storageName;

    private HashMap<String, String> extendQueryParameterMap;

    public PutWorksheetCustomFilterRequest(String criteria1, Integer fieldIndex, String name, String operatorType1, String range, String sheetName) {
        this.criteria1 = criteria1;
        this.fieldIndex = fieldIndex;
        this.name = name;
        this.operatorType1 = operatorType1;
        this.range = range;
        this.sheetName = sheetName;
    }

    public String getCriteria1() {
        return criteria1;
    }

    public Integer getFieldIndex() {
        return fieldIndex;
    }

    public String getName() {
        return name;
    }

    public String getOperatorType1() {
        return operatorType1;
    }

    public String getRange() {
        return range;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getCriteria2() {
        return criteria2;
    }

    public void setCriteria2(String criteria2) {
        this.criteria2 = criteria2;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Boolean getIsAnd() {
        return isAnd;
    }

    public void setIsAnd(Boolean isAnd) {
        this.isAnd = isAnd;
    }

    public Boolean getMatchBlanks() {
        return matchBlanks;
    }

    public void setMatchBlanks(Boolean matchBlanks) {
        this.matchBlanks = matchBlanks;
    }

    public String getOperatorType2() {
        return operatorType2;
    }

    public void setOperatorType2(String operatorType2) {
        this.operatorType2 = operatorType2;
    }

    public Boolean getRefresh() {
        return refresh;
    }

    public void setRefresh(Boolean refresh) {
        this.refresh = refresh;
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

    public PutWorksheetCustomFilterRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/{name}/worksheets/{sheetName}/autoFilter/custom";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        path = path.replace("{sheetName}", UrlUtils.urlEncode(this.sheetName == null ? "" : String.valueOf(this.sheetName)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("range", this.range == null ? "" : this.range);
        if (this.fieldIndex != null) {
            query.put("fieldIndex", String.valueOf(this.fieldIndex));
        }
        query.put("operatorType1", this.operatorType1 == null ? "" : this.operatorType1);
        query.put("criteria1", this.criteria1 == null ? "" : this.criteria1);
        if (this.isAnd != null) {
            query.put("isAnd", String.valueOf(this.isAnd));
        }
        if (this.operatorType2 != null && !this.operatorType2.isEmpty()) {
            query.put("operatorType2", this.operatorType2);
        }
        if (this.criteria2 != null && !this.criteria2.isEmpty()) {
            query.put("criteria2", this.criteria2);
        }
        if (this.matchBlanks != null) {
            query.put("matchBlanks", String.valueOf(this.matchBlanks));
        }
        if (this.refresh != null) {
            query.put("refresh", String.valueOf(this.refresh));
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
