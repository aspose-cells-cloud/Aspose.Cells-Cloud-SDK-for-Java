/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CopyFolderRequest.java">
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

public class CopyFolderRequest implements RequestOption {

    private String destPath;
    private String srcPath;
    private String destStorageName;
    private String srcStorageName;

    private HashMap<String, String> extendQueryParameterMap;

    public CopyFolderRequest(String destPath, String srcPath) {
        this.destPath = destPath;
        this.srcPath = srcPath;
    }

    public String getDestPath() {
        return destPath;
    }

    public String getSrcPath() {
        return srcPath;
    }

    public String getDestStorageName() {
        return destStorageName;
    }

    public void setDestStorageName(String destStorageName) {
        this.destStorageName = destStorageName;
    }

    public String getSrcStorageName() {
        return srcStorageName;
    }

    public void setSrcStorageName(String srcStorageName) {
        this.srcStorageName = srcStorageName;
    }

    public HashMap<String, String> getExtendQueryParameterMap() {
        return extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap(HashMap<String, String> extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }

    public CopyFolderRequest addQueryParameter(String key, String value) {
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
        String path = "/cells/storage/folder/copy/{srcPath}";
        path = path.replace("{srcPath}", UrlUtils.urlEncode(this.srcPath == null ? "" : String.valueOf(this.srcPath)));
        return path;
    }

    @Override
    public Map<String, String> getQueryParameters() {
        Map<String, String> query = new LinkedHashMap<String, String>();
        query.put("destPath", this.destPath == null ? "" : this.destPath);
        if (this.srcStorageName != null && !this.srcStorageName.isEmpty()) {
            query.put("srcStorageName", this.srcStorageName);
        }
        if (this.destStorageName != null && !this.destStorageName.isEmpty()) {
            query.put("destStorageName", this.destStorageName);
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
