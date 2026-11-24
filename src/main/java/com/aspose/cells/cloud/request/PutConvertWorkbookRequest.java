/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutConvertWorkbookRequest.java">
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

public class PutConvertWorkbookRequest implements RequestOption {

    private FormFile file;
    private String format;
    private Boolean autoColumnsFit;
    private Boolean autoRowsFit;
    private Boolean checkExcelRestriction;
    private String fontsLocation;
    private Boolean onePagePerSheet;
    private String outPath;
    private Integer pageIndex;
    private Boolean pageTallFitOnPerSheet;
    private Boolean pageWideFitOnPerSheet;
    private String password;
    private String region;
    private String sheetName;
    private String storageName;
    private String streamFormat;

    private HashMap<String, String> extendQueryParameterMap;

    public PutConvertWorkbookRequest(FormFile file, String format) {
        this.file = file;
        this.format = format;
    }

    public FormFile getFile() {
        return file;
    }

    public String getFormat() {
        return format;
    }

    public Boolean getAutoColumnsFit() {
        return autoColumnsFit;
    }

    public void setAutoColumnsFit(Boolean autoColumnsFit) {
        this.autoColumnsFit = autoColumnsFit;
    }

    public Boolean getAutoRowsFit() {
        return autoRowsFit;
    }

    public void setAutoRowsFit(Boolean autoRowsFit) {
        this.autoRowsFit = autoRowsFit;
    }

    public Boolean getCheckExcelRestriction() {
        return checkExcelRestriction;
    }

    public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
        this.checkExcelRestriction = checkExcelRestriction;
    }

    public String getFontsLocation() {
        return fontsLocation;
    }

    public void setFontsLocation(String fontsLocation) {
        this.fontsLocation = fontsLocation;
    }

    public Boolean getOnePagePerSheet() {
        return onePagePerSheet;
    }

    public void setOnePagePerSheet(Boolean onePagePerSheet) {
        this.onePagePerSheet = onePagePerSheet;
    }

    public String getOutPath() {
        return outPath;
    }

    public void setOutPath(String outPath) {
        this.outPath = outPath;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
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

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getStreamFormat() {
        return streamFormat;
    }

    public void setStreamFormat(String streamFormat) {
        this.streamFormat = streamFormat;
    }

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public PutConvertWorkbookRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/convert";
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("format", this.format == null ? "" : this.format);
        if (this.password != null && !this.password.isEmpty()) {
            query.put("password", this.password);
        }
        if (this.outPath != null && !this.outPath.isEmpty()) {
            query.put("outPath", this.outPath);
        }
        if (this.storageName != null && !this.storageName.isEmpty()) {
            query.put("storageName", this.storageName);
        }
        if (this.checkExcelRestriction != null) {
            query.put("checkExcelRestriction", String.valueOf(this.checkExcelRestriction));
        }
        if (this.streamFormat != null && !this.streamFormat.isEmpty()) {
            query.put("streamFormat", this.streamFormat);
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
        if (this.sheetName != null && !this.sheetName.isEmpty()) {
            query.put("sheetName", this.sheetName);
        }
        if (this.pageIndex != null) {
            query.put("pageIndex", String.valueOf(this.pageIndex));
        }
        if (this.onePagePerSheet != null) {
            query.put("onePagePerSheet", String.valueOf(this.onePagePerSheet));
        }
        if (this.autoRowsFit != null) {
            query.put("AutoRowsFit", String.valueOf(this.autoRowsFit));
        }
        if (this.autoColumnsFit != null) {
            query.put("AutoColumnsFit", String.valueOf(this.autoColumnsFit));
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
        if (this.file != null) {
            form.put("File", this.file);
        }
        return form.isEmpty() ? null : form;
    }

    @Override
    public boolean isBinaryResponse() {
        return true;
    }
}
