/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PostWorkbookSaveAsRequest.java">
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
import com.aspose.cells.cloud.model.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PostWorkbookSaveAsRequest implements RequestOption {

    private String name;
    private String newfilename;
    private Boolean checkExcelRestriction;
    private String folder;
    private String fontsLocation;
    private Boolean isAutoFitColumns;
    private Boolean isAutoFitRows;
    private Boolean onePagePerSheet;
    private String outStorageName;
    private Boolean pageTallFitOnPerSheet;
    private Boolean pageWideFitOnPerSheet;
    private String region;
    private SaveOptions saveOptions;
    private String storageName;

    private HashMap<String, String> extendQueryParameterMap;

    public PostWorkbookSaveAsRequest(String name, String newfilename) {
        this.name = name;
        this.newfilename = newfilename;
    }

    public String getName() {
        return name;
    }

    public String getNewfilename() {
        return newfilename;
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

    public Boolean getIsAutoFitColumns() {
        return isAutoFitColumns;
    }

    public void setIsAutoFitColumns(Boolean isAutoFitColumns) {
        this.isAutoFitColumns = isAutoFitColumns;
    }

    public Boolean getIsAutoFitRows() {
        return isAutoFitRows;
    }

    public void setIsAutoFitRows(Boolean isAutoFitRows) {
        this.isAutoFitRows = isAutoFitRows;
    }

    public Boolean getOnePagePerSheet() {
        return onePagePerSheet;
    }

    public void setOnePagePerSheet(Boolean onePagePerSheet) {
        this.onePagePerSheet = onePagePerSheet;
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

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public SaveOptions getSaveOptions() {
        return saveOptions;
    }

    public void setSaveOptions(SaveOptions saveOptions) {
        this.saveOptions = saveOptions;
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

    public PostWorkbookSaveAsRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/{name}/SaveAs";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("newfilename", this.newfilename == null ? "" : this.newfilename);
        if (this.isAutoFitRows != null) {
            query.put("isAutoFitRows", String.valueOf(this.isAutoFitRows));
        }
        if (this.isAutoFitColumns != null) {
            query.put("isAutoFitColumns", String.valueOf(this.isAutoFitColumns));
        }
        if (this.folder != null && !this.folder.isEmpty()) {
            query.put("folder", this.folder);
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
        return this.saveOptions;
    }

    @Override
    public Map<String, Object> getMultipartForm() {
        return null;
    }
}
