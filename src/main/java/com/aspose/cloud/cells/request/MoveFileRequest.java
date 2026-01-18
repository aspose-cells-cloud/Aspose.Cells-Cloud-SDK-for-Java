/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MoveFileRequest.java">
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

public class MoveFileRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String srcPath;
    private String destPath;
    private String srcStorageName;
    private String destStorageName;
    private String versionId;
    
        public MoveFileRequest()
        {        
        }
        public MoveFileRequest( String srcPath ,  String destPath ,  String srcStorageName ,  String destStorageName ,  String versionId ) {
            this.srcPath = srcPath; 
            this.destPath = destPath; 
            this.srcStorageName = srcStorageName; 
            this.destStorageName = destStorageName; 
            this.versionId = versionId; 
        }   

        public String getSrcPath() {
            return this.srcPath;
        }

        public void setSrcPath(String srcPath) {
            this.srcPath = srcPath;
        }

        public String getDestPath() {
            return this.destPath;
        }

        public void setDestPath(String destPath) {
            this.destPath = destPath;
        }


        public String getSrcStorageName() {
            return this.srcStorageName;
        }

        public void setSrcStorageName(String srcStorageName) {
            this.srcStorageName = srcStorageName;
        }


        public String getDestStorageName() {
            return this.destStorageName;
        }

        public void setDestStorageName(String destStorageName) {
            this.destStorageName = destStorageName;
        }


        public String getVersionId() {
            return this.versionId;
        }

        public void setVersionId(String versionId) {
            this.versionId = versionId;
        }

    
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         
                if (getSrcPath() == null) {
                    throw new ApiException("Missing the required parameter 'SrcPath' when calling MoveFile");
                } 

                if (getDestPath() == null) {
                    throw new ApiException("Missing the required parameter 'DestPath' when calling MoveFile");
                }       
        String localVarPath = "v4.0/cells/storage/file/move/{srcPath}".replaceAll("\\{" + "srcPath" + "\\}", apiClient.escapeString(srcPath.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getDestPath() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "destPath", getDestPath()));
            } 
            if (getSrcStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "srcStorageName", getSrcStorageName()));
            } 
            if (getDestStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "destStorageName", getDestStorageName()));
            } 
            if (getVersionId() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "versionId", getVersionId()));
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

