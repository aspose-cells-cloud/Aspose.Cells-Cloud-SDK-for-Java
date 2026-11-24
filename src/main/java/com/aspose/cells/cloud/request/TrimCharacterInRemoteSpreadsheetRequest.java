/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TrimCharacterInRemoteSpreadsheetRequest.java">
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

public class TrimCharacterInRemoteSpreadsheetRequest implements RequestOption {

    private String name;
    private String range;
    private String worksheet;
    private String folder;
    private String password;
    private String region;
    private Boolean removeAllLineBreaks;
    private Boolean removeExtraLineBreaks;
    private String storageName;
    private String trimContent;
    private Boolean trimLeading;
    private Boolean trimNonBreakingSpaces;
    private Boolean trimSpaceBetweenWordTo1;
    private Boolean trimTrailing;

    private HashMap<String, String> extendQueryParameterMap;

    public TrimCharacterInRemoteSpreadsheetRequest(String name, String range, String worksheet) {
        this.name = name;
        this.range = range;
        this.worksheet = worksheet;
    }

    public String getName() {
        return name;
    }

    public String getRange() {
        return range;
    }

    public String getWorksheet() {
        return worksheet;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
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

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
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

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public TrimCharacterInRemoteSpreadsheetRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/{name}/worksheets/{worksheet}/range/{range}/content/trim";
        path = path.replace("{name}", UrlUtils.urlEncode(this.name == null ? "" : String.valueOf(this.name)));
        path = path.replace("{worksheet}", UrlUtils.urlEncode(this.worksheet == null ? "" : String.valueOf(this.worksheet)));
        path = path.replace("{range}", UrlUtils.urlEncode(this.range == null ? "" : String.valueOf(this.range)));
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
        if (this.folder != null && !this.folder.isEmpty()) {
            query.put("folder", this.folder);
        }
        if (this.storageName != null && !this.storageName.isEmpty()) {
            query.put("storageName", this.storageName);
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
