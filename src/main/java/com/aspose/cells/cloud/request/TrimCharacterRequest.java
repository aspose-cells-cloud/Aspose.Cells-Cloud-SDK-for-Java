/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TrimCharacterRequest.java">
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

public class TrimCharacterRequest implements RequestOption {

    private FormFile spreadsheet;
    private String outPath;
    private String outStorageName;
    private String password;
    private String range;
    private String region;
    private Boolean removeAllLineBreaks;
    private Boolean removeExtraLineBreaks;
    private String trimContent;
    private Boolean trimLeading;
    private Boolean trimNonBreakingSpaces;
    private Boolean trimSpaceBetweenWordTo1;
    private Boolean trimTrailing;
    private String worksheet;

    private HashMap<String, String> extendQueryParameterMap;

    public TrimCharacterRequest(FormFile spreadsheet) {
        this.spreadsheet = spreadsheet;
    }

    public FormFile getSpreadsheet() {
        return spreadsheet;
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

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getRemoveAllLineBreaks() {
        return removeAllLineBreaks;
    }

    public void setRemoveAllLineBreaks(Boolean removeAllLineBreaks) {
        this.removeAllLineBreaks = removeAllLineBreaks;
    }

    public Boolean getRemoveExtraLineBreaks() {
        return removeExtraLineBreaks;
    }

    public void setRemoveExtraLineBreaks(Boolean removeExtraLineBreaks) {
        this.removeExtraLineBreaks = removeExtraLineBreaks;
    }

    public String getTrimContent() {
        return trimContent;
    }

    public void setTrimContent(String trimContent) {
        this.trimContent = trimContent;
    }

    public Boolean getTrimLeading() {
        return trimLeading;
    }

    public void setTrimLeading(Boolean trimLeading) {
        this.trimLeading = trimLeading;
    }

    public Boolean getTrimNonBreakingSpaces() {
        return trimNonBreakingSpaces;
    }

    public void setTrimNonBreakingSpaces(Boolean trimNonBreakingSpaces) {
        this.trimNonBreakingSpaces = trimNonBreakingSpaces;
    }

    public Boolean getTrimSpaceBetweenWordTo1() {
        return trimSpaceBetweenWordTo1;
    }

    public void setTrimSpaceBetweenWordTo1(Boolean trimSpaceBetweenWordTo1) {
        this.trimSpaceBetweenWordTo1 = trimSpaceBetweenWordTo1;
    }

    public Boolean getTrimTrailing() {
        return trimTrailing;
    }

    public void setTrimTrailing(Boolean trimTrailing) {
        this.trimTrailing = trimTrailing;
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

    public TrimCharacterRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/content/trim";
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        if (this.trimContent != null && !this.trimContent.isEmpty()) {
            query.put("trimContent", this.trimContent);
        }
        if (this.trimLeading != null) {
            query.put("trimLeading", String.valueOf(this.trimLeading));
        }
        if (this.trimTrailing != null) {
            query.put("trimTrailing", String.valueOf(this.trimTrailing));
        }
        if (this.trimSpaceBetweenWordTo1 != null) {
            query.put("trimSpaceBetweenWordTo1", String.valueOf(this.trimSpaceBetweenWordTo1));
        }
        if (this.trimNonBreakingSpaces != null) {
            query.put("trimNonBreakingSpaces", String.valueOf(this.trimNonBreakingSpaces));
        }
        if (this.removeExtraLineBreaks != null) {
            query.put("removeExtraLineBreaks", String.valueOf(this.removeExtraLineBreaks));
        }
        if (this.removeAllLineBreaks != null) {
            query.put("removeAllLineBreaks", String.valueOf(this.removeAllLineBreaks));
        }
        if (this.worksheet != null && !this.worksheet.isEmpty()) {
            query.put("worksheet", this.worksheet);
        }
        if (this.range != null && !this.range.isEmpty()) {
            query.put("range", this.range);
        }
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
