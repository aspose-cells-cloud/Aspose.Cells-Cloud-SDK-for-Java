/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SwapRangeRequest.java">
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

public class SwapRangeRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String worksheet1;
    private String range1;
    private String worksheet2;
    private String range2;
    private String outPath;
    private String outStorageName;
    private String region;
    private String password;
    
     
     
     private String spreadsheet;            
        public SwapRangeRequest()
        {        
        }
        public SwapRangeRequest( String  spreadsheet    ,  String worksheet1 ,  String range1 ,  String worksheet2 ,  String range2 ,  String outPath ,  String outStorageName ,  String region ,  String password ) {
              this.spreadsheet  = spreadsheet;  
            this.worksheet1 = worksheet1; 
            this.range1 = range1; 
            this.worksheet2 = worksheet2; 
            this.range2 = range2; 
            this.outPath = outPath; 
            this.outStorageName = outStorageName; 
            this.region = region; 
            this.password = password; 
        }   

        public String getWorksheet1() {
            return this.worksheet1;
        }

        public void setWorksheet1(String worksheet1) {
            this.worksheet1 = worksheet1;
        }


        public String getRange1() {
            return this.range1;
        }

        public void setRange1(String range1) {
            this.range1 = range1;
        }


        public String getWorksheet2() {
            return this.worksheet2;
        }

        public void setWorksheet2(String worksheet2) {
            this.worksheet2 = worksheet2;
        }


        public String getRange2() {
            return this.range2;
        }

        public void setRange2(String range2) {
            this.range2 = range2;
        }


        public String getOutPath() {
            return this.outPath;
        }

        public void setOutPath(String outPath) {
            this.outPath = outPath;
        }


        public String getOutStorageName() {
            return this.outStorageName;
        }

        public void setOutStorageName(String outStorageName) {
            this.outStorageName = outStorageName;
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

    
     
            public String getSpreadsheet() {
                    return this.spreadsheet;
            }
            public void setSpreadsheet(String spreadsheet) {
                this.spreadsheet = spreadsheet;
            }
         
        
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
          
         
                if ( getSpreadsheet() == null ) {
                    throw new ApiException("Missing the required parameter 'Spreadsheet' when calling SwapRange");
                } 

                if (getWorksheet1() == null) {
                    throw new ApiException("Missing the required parameter 'Worksheet1' when calling SwapRange");
                } 

                if (getRange1() == null) {
                    throw new ApiException("Missing the required parameter 'Range1' when calling SwapRange");
                } 

                if (getWorksheet2() == null) {
                    throw new ApiException("Missing the required parameter 'Worksheet2' when calling SwapRange");
                } 

                if (getRange2() == null) {
                    throw new ApiException("Missing the required parameter 'Range2' when calling SwapRange");
                }       
        String localVarPath = "v4.0/cells/swap/range";
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getWorksheet1() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "worksheet1", getWorksheet1()));
            } 
            if (getRange1() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "range1", getRange1()));
            } 
            if (getWorksheet2() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "worksheet2", getWorksheet2()));
            } 
            if (getRange2() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "range2", getRange2()));
            } 
            if (getOutPath() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outPath", getOutPath()));
            } 
            if (getOutStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outStorageName", getOutStorageName()));
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
                   
            File SpreadsheetToUpload = new File(getSpreadsheet());
            if (SpreadsheetToUpload.exists()) {
                    localVarFormParams.put(SpreadsheetToUpload.getName(), SpreadsheetToUpload);
            }     
                  
        Object localVarPostBody = null;
                final String[] localVarAccepts = {
                    "application/json"
                };
                final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
                if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

                final String[] localVarContentTypes = { "multipart/form-data"  };        
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

