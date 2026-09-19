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
package com.aspose.cloud.cells.request;
import com.aspose.cloud.cells.client.*;
import com.aspose.cloud.cells.model.*;
import com.squareup.okhttp.*;
import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class TrimCharacterInRemoteSpreadsheetRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String name;
    private String worksheet;
    private String range;
    private String trimContent;
    private Boolean trimLeading;
    private Boolean trimTrailing;
    private Boolean trimSpaceBetweenWordTo1;
    private Boolean trimNonBreakingSpaces;
    private Boolean removeExtraLineBreaks;
    private Boolean removeAllLineBreaks;
    private String folder;
    private String storageName;
    private String region;
    private String password;
    
        public TrimCharacterInRemoteSpreadsheetRequest()
        {        
        }
        public TrimCharacterInRemoteSpreadsheetRequest( String name ,  String worksheet ,  String range ,  String trimContent ,  Boolean trimLeading ,  Boolean trimTrailing ,  Boolean trimSpaceBetweenWordTo1 ,  Boolean trimNonBreakingSpaces ,  Boolean removeExtraLineBreaks ,  Boolean removeAllLineBreaks ,  String folder ,  String storageName ,  String region ,  String password ) {
            this.name = name; 
            this.worksheet = worksheet; 
            this.range = range; 
            this.trimContent = trimContent; 
            this.trimLeading = trimLeading; 
            this.trimTrailing = trimTrailing; 
            this.trimSpaceBetweenWordTo1 = trimSpaceBetweenWordTo1; 
            this.trimNonBreakingSpaces = trimNonBreakingSpaces; 
            this.removeExtraLineBreaks = removeExtraLineBreaks; 
            this.removeAllLineBreaks = removeAllLineBreaks; 
            this.folder = folder; 
            this.storageName = storageName; 
            this.region = region; 
            this.password = password; 
        }   

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String getWorksheet() {
            return this.worksheet;
        }

        public void setWorksheet(String worksheet) {
            this.worksheet = worksheet;
        }


        public String getRange() {
            return this.range;
        }

        public void setRange(String range) {
            this.range = range;
        }

        public String getTrimContent() {
            return this.trimContent;
        }

        public void setTrimContent(String trimContent) {
            this.trimContent = trimContent;
        }


        public Boolean getTrimLeading() {
            return this.trimLeading;
        }

        public void setTrimLeading(Boolean trimLeading) {
            this.trimLeading = trimLeading;
        }


        public Boolean getTrimTrailing() {
            return this.trimTrailing;
        }

        public void setTrimTrailing(Boolean trimTrailing) {
            this.trimTrailing = trimTrailing;
        }


        public Boolean getTrimSpaceBetweenWordTo1() {
            return this.trimSpaceBetweenWordTo1;
        }

        public void setTrimSpaceBetweenWordTo1(Boolean trimSpaceBetweenWordTo1) {
            this.trimSpaceBetweenWordTo1 = trimSpaceBetweenWordTo1;
        }


        public Boolean getTrimNonBreakingSpaces() {
            return this.trimNonBreakingSpaces;
        }

        public void setTrimNonBreakingSpaces(Boolean trimNonBreakingSpaces) {
            this.trimNonBreakingSpaces = trimNonBreakingSpaces;
        }


        public Boolean getRemoveExtraLineBreaks() {
            return this.removeExtraLineBreaks;
        }

        public void setRemoveExtraLineBreaks(Boolean removeExtraLineBreaks) {
            this.removeExtraLineBreaks = removeExtraLineBreaks;
        }


        public Boolean getRemoveAllLineBreaks() {
            return this.removeAllLineBreaks;
        }

        public void setRemoveAllLineBreaks(Boolean removeAllLineBreaks) {
            this.removeAllLineBreaks = removeAllLineBreaks;
        }


        public String getFolder() {
            return this.folder;
        }

        public void setFolder(String folder) {
            this.folder = folder;
        }


        public String getStorageName() {
            return this.storageName;
        }

        public void setStorageName(String storageName) {
            this.storageName = storageName;
        }


        public String getRegion() {
            return this.region;
        }

        public void setRegion(String region) {
            this.region = region;
        }


        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

    
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         
                if (getName() == null) {
                    throw new ApiException("Missing the required parameter 'Name' when calling TrimCharacterInRemoteSpreadsheet");
                } 

                if (getWorksheet() == null) {
                    throw new ApiException("Missing the required parameter 'Worksheet' when calling TrimCharacterInRemoteSpreadsheet");
                } 

                if (getRange() == null) {
                    throw new ApiException("Missing the required parameter 'Range' when calling TrimCharacterInRemoteSpreadsheet");
                }       
        String localVarPath = "v4.0/cells/{name}/worksheets/{worksheet}/range/{range}/content/trim".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString())) 
    .replaceAll("\\{" + "worksheet" + "\\}", apiClient.escapeString(worksheet.toString())) 
    .replaceAll("\\{" + "range" + "\\}", apiClient.escapeString(range.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getTrimContent() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimContent", getTrimContent()));
            } 
            if (getTrimLeading() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimLeading", getTrimLeading()));
            } 
            if (getTrimTrailing() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimTrailing", getTrimTrailing()));
            } 
            if (getTrimSpaceBetweenWordTo1() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimSpaceBetweenWordTo1", getTrimSpaceBetweenWordTo1()));
            } 
            if (getTrimNonBreakingSpaces() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "trimNonBreakingSpaces", getTrimNonBreakingSpaces()));
            } 
            if (getRemoveExtraLineBreaks() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "removeExtraLineBreaks", getRemoveExtraLineBreaks()));
            } 
            if (getRemoveAllLineBreaks() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "removeAllLineBreaks", getRemoveAllLineBreaks()));
            } 
            if (getFolder() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", getFolder()));
            } 
            if (getStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", getStorageName()));
            } 
            if (getRegion() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", getRegion()));
            } 
            if (getPassword() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", getPassword()));
            }  
        if(this.extendQueryParameterMap !=null){
            for (String key :this.extendQueryParameterMap.keySet()) {
                    localVarQueryParams.addAll(apiClient.parameterToPairs("", key, this.extendQueryParameterMap.get(key)));           
            }
        }
        Object localVarPostBody = null;
                final String[] localVarAccepts = {
                    "application/json"
                };
                final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
                if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

                final String[] localVarContentTypes = { "application/json" };        
                final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
                localVarHeaderParams.put("Content-Type", localVarContentType);

                if(progressListener != null) {
                    apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                        @Override
                        public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                            com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                            return originalResponse.newBuilder()
                            .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                            .build();
                        }
                    });
                }

                String[] localVarAuthNames = new String[] {  };
                return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);

    }
}

