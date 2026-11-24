/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetIconFilterRequest.java">
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

public class PutWorksheetIconFilterRequest implements RequestOption {

    private Integer fieldIndex;
    private Integer iconId;
    private String iconSetType;
    private String name;
    private String range;
    private String sheetName;
    private String folder;
    private Boolean matchBlanks;
    private Boolean refresh;
    private String storageName;

    private HashMap<String, String> extendQueryParameterMap;

    public PutWorksheetIconFilterRequest(Integer fieldIndex, Integer iconId, String iconSetType, String name, String range, String sheetName) {
        this.fieldIndex = fieldIndex;
        this.iconId = iconId;
        this.iconSetType = iconSetType;
        this.name = name;
        this.range = range;
        this.sheetName = sheetName;
    }

    public Integer getFieldIndex() {
        return fieldIndex;
    }

    public Integer getIconId() {
        return iconId;
    }

    public String getIconSetType() {
        return iconSetType;
    }

    public String getName() {
        return name;
    }

    public String getRange() {
        return range;
    }

    public String getSheetName() {
        return sheetName;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public Boolean getMatchBlanks() {
        return matchBlanks;
    }

    public void setMatchBlanks(Boolean matchBlanks) {
        this.matchBlanks = matchBlanks;
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

    public PutWorksheetIconFilterRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/{name}/worksheets/{sheetName}/autoFilter/iconFilter";
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
        query.put("iconSetType", this.iconSetType == null ? "" : this.iconSetType);
        if (this.iconId != null) {
            query.put("iconId", String.valueOf(this.iconId));
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
