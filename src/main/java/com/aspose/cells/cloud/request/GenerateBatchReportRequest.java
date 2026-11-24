/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GenerateBatchReportRequest.java">
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

public class GenerateBatchReportRequest implements RequestOption {

    private FormFile data;
    private FormFile template;
    private Boolean autoColumnsFit;
    private Boolean autoRowsFit;
    private String filename;
    private String format;
    private String mode;
    private String outPath;
    private String outStorageName;
    private String password;
    private String region;
    private String reportObjectName;
    private String sheetName;
    private Boolean zipOutput;

    private HashMap<String, String> extendQueryParameterMap;

    public GenerateBatchReportRequest(FormFile data, FormFile template) {
        this.data = data;
        this.template = template;
    }

    public FormFile getData() {
        return data;
    }

    public FormFile getTemplate() {
        return template;
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

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
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

    public String getReportObjectName() {
        return reportObjectName;
    }

    public void setReportObjectName(String reportObjectName) {
        this.reportObjectName = reportObjectName;
    }

    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    public Boolean getZipOutput() {
        return zipOutput;
    }

    public void setZipOutput(Boolean zipOutput) {
        this.zipOutput = zipOutput;
    }

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public GenerateBatchReportRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/report/generate/batch";
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        if (this.format != null && !this.format.isEmpty()) {
            query.put("format", this.format);
        }
        if (this.mode != null && !this.mode.isEmpty()) {
            query.put("mode", this.mode);
        }
        if (this.zipOutput != null) {
            query.put("zipOutput", String.valueOf(this.zipOutput));
        }
        if (this.reportObjectName != null && !this.reportObjectName.isEmpty()) {
            query.put("reportObjectName", this.reportObjectName);
        }
        if (this.filename != null && !this.filename.isEmpty()) {
            query.put("filename", this.filename);
        }
        if (this.sheetName != null && !this.sheetName.isEmpty()) {
            query.put("sheetName", this.sheetName);
        }
        if (this.outPath != null && !this.outPath.isEmpty()) {
            query.put("outPath", this.outPath);
        }
        if (this.outStorageName != null && !this.outStorageName.isEmpty()) {
            query.put("outStorageName", this.outStorageName);
        }
        if (this.autoRowsFit != null) {
            query.put("AutoRowsFit", String.valueOf(this.autoRowsFit));
        }
        if (this.autoColumnsFit != null) {
            query.put("AutoColumnsFit", String.valueOf(this.autoColumnsFit));
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
        if (this.data != null) {
            form.put("data", this.data);
        }
        if (this.template != null) {
            form.put("template", this.template);
        }
        return form.isEmpty() ? null : form;
    }

    @Override
    public boolean isBinaryResponse() {
        return true;
    }
}
