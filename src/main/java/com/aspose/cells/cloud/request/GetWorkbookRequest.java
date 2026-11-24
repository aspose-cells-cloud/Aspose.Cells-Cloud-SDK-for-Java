/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetWorkbookRequest.java">
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

public class GetWorkbookRequest implements RequestOption {

    private String name;
    private Boolean checkExcelRestriction;
    private String folder;
    private String fontsLocation;
    private String format;
    private Boolean isAutoFit;
    private Boolean onePagePerSheet;
    private Boolean onlyAutofitTable;
    private Boolean onlySaveTable;
    private String outPath;
    private String outStorageName;
    private Boolean pageTallFitOnPerSheet;
    private Boolean pageWideFitOnPerSheet;
    private String password;
    private String region;
    private String storageName;

    private HashMap<String, String> extendQueryParameterMap;

    public GetWorkbookRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Boolean getCheckExcelRestriction() {
        return checkExcelRestriction;
    }

    public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
        this.checkExcelRestriction = checkExcelRestriction;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public String getFontsLocation() {
        return fontsLocation;
    }

    public void setFontsLocation(String fontsLocation) {
        this.fontsLocation = fontsLocation;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Boolean getIsAutoFit() {
        return isAutoFit;
    }

    public void setIsAutoFit(Boolean isAutoFit) {
        this.isAutoFit = isAutoFit;
    }

    public Boolean getOnePagePerSheet() {
        return onePagePerSheet;
    }

    public void setOnePagePerSheet(Boolean onePagePerSheet) {
        this.onePagePerSheet = onePagePerSheet;
    }

    public Boolean getOnlyAutofitTable() {
        return onlyAutofitTable;
    }

    public void setOnlyAutofitTable(Boolean onlyAutofitTable) {
        this.onlyAutofitTable = onlyAutofitTable;
    }

    public Boolean getOnlySaveTable() {
        return onlySaveTable;
    }

    public void setOnlySaveTable(Boolean onlySaveTable) {
        this.onlySaveTable = onlySaveTable;
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

    public Boolean getPageTallFitOnPerSheet() {
        return pageTallFitOnPerSheet;
    }

    public void setPageTallFitOnPerSheet(Boolean pageTallFitOnPerSheet) {
        this.pageTallFitOnPerSheet = pageTallFitOnPerSheet;
    }

    public Boolean getPageWideFitOnPerSheet() {
        return pageWideFitOnPerSheet;
    }

    public void setPageWideFitOnPerSheet(Boolean pageWideFitOnPerSheet) {
        this.pageWideFitOnPerSheet = pageWideFitOnPerSheet;
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

    public GetWorkbookRequest addQueryParameter(String key, String value) {
        if (this.extendQueryParameterMap == null) {
            this.extendQueryParameterMap = new HashMap<String, String>();
        }
        this.extendQueryParameterMap.put(key, value);
        return this;
    }

    @Override
    public String getMethod() {
        return "GET";
    }

    @Override
    public String getApiVersion() {
        return "v3.0";
    }

    @Override
    public String getPath() {
        String path = "/cells/{name}";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        if (this.format != null && !this.format.isEmpty()) {
            query.put("format", this.format);
        }
        if (this.password != null && !this.password.isEmpty()) {
            query.put("password", this.password);
        }
        if (this.isAutoFit != null) {
            query.put("isAutoFit", String.valueOf(this.isAutoFit));
        }
        if (this.onlySaveTable != null) {
            query.put("onlySaveTable", String.valueOf(this.onlySaveTable));
        }
        if (this.folder != null && !this.folder.isEmpty()) {
            query.put("folder", this.folder);
        }
        if (this.outPath != null && !this.outPath.isEmpty()) {
            query.put("outPath", this.outPath);
        }
        if (this.storageName != null && !this.storageName.isEmpty()) {
            query.put("storageName", this.storageName);
        }
        if (this.outStorageName != null && !this.outStorageName.isEmpty()) {
            query.put("outStorageName", this.outStorageName);
        }
        if (this.checkExcelRestriction != null) {
            query.put("checkExcelRestriction", String.valueOf(this.checkExcelRestriction));
        }
        if (this.region != null && !this.region.isEmpty()) {
            query.put("region", this.region);
        }
        if (this.pageWideFitOnPerSheet != null) {
            query.put("pageWideFitOnPerSheet", String.valueOf(this.pageWideFitOnPerSheet));
        }
        if (this.pageTallFitOnPerSheet != null) {
            query.put("pageTallFitOnPerSheet", String.valueOf(this.pageTallFitOnPerSheet));
        }
        if (this.onePagePerSheet != null) {
            query.put("onePagePerSheet", String.valueOf(this.onePagePerSheet));
        }
        if (this.onlyAutofitTable != null) {
            query.put("onlyAutofitTable", String.valueOf(this.onlyAutofitTable));
        }
        if (this.fontsLocation != null && !this.fontsLocation.isEmpty()) {
            query.put("FontsLocation", this.fontsLocation);
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

    @Override
    public boolean isBinaryResponse() {
        return true;
    }
}
