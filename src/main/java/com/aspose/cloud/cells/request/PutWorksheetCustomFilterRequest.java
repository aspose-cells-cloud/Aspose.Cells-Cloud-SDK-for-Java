/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetCustomFilterRequest.java">
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

public class PutWorksheetCustomFilterRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String name;
    private String sheetName;
    private String range;
    private Integer fieldIndex;
    private String operatorType1;
    private String criteria1;
    private Boolean isAnd;
    private String operatorType2;
    private String criteria2;
    private Boolean matchBlanks;
    private Boolean refresh;
    private String folder;
    private String storageName;
    
        public PutWorksheetCustomFilterRequest()
        {        
        }
        public PutWorksheetCustomFilterRequest( String name ,  String sheetName ,  String range ,  Integer fieldIndex ,  String operatorType1 ,  String criteria1 ,  Boolean isAnd ,  String operatorType2 ,  String criteria2 ,  Boolean matchBlanks ,  Boolean refresh ,  String folder ,  String storageName ) {
            this.name = name; 
            this.sheetName = sheetName; 
            this.range = range; 
            this.fieldIndex = fieldIndex; 
            this.operatorType1 = operatorType1; 
            this.criteria1 = criteria1; 
            this.isAnd = isAnd; 
            this.operatorType2 = operatorType2; 
            this.criteria2 = criteria2; 
            this.matchBlanks = matchBlanks; 
            this.refresh = refresh; 
            this.folder = folder; 
            this.storageName = storageName; 
        }   

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }


        public String getSheetName() {
            return this.sheetName;
        }

        public void setSheetName(String sheetName) {
            this.sheetName = sheetName;
        }

        public String getRange() {
            return this.range;
        }

        public void setRange(String range) {
            this.range = range;
        }


        public Integer getFieldIndex() {
            return this.fieldIndex;
        }

        public void setFieldIndex(Integer fieldIndex) {
            this.fieldIndex = fieldIndex;
        }


        public String getOperatorType1() {
            return this.operatorType1;
        }

        public void setOperatorType1(String operatorType1) {
            this.operatorType1 = operatorType1;
        }


        public String getCriteria1() {
            return this.criteria1;
        }

        public void setCriteria1(String criteria1) {
            this.criteria1 = criteria1;
        }


        public Boolean getIsAnd() {
            return this.isAnd;
        }

        public void setIsAnd(Boolean isAnd) {
            this.isAnd = isAnd;
        }


        public String getOperatorType2() {
            return this.operatorType2;
        }

        public void setOperatorType2(String operatorType2) {
            this.operatorType2 = operatorType2;
        }


        public String getCriteria2() {
            return this.criteria2;
        }

        public void setCriteria2(String criteria2) {
            this.criteria2 = criteria2;
        }


        public Boolean getMatchBlanks() {
            return this.matchBlanks;
        }

        public void setMatchBlanks(Boolean matchBlanks) {
            this.matchBlanks = matchBlanks;
        }


        public Boolean getRefresh() {
            return this.refresh;
        }

        public void setRefresh(Boolean refresh) {
            this.refresh = refresh;
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

    
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         
                if (getName() == null) {
                    throw new ApiException("Missing the required parameter 'Name' when calling PutWorksheetCustomFilter");
                } 

                if (getSheetName() == null) {
                    throw new ApiException("Missing the required parameter 'SheetName' when calling PutWorksheetCustomFilter");
                } 

                if (getRange() == null) {
                    throw new ApiException("Missing the required parameter 'Range' when calling PutWorksheetCustomFilter");
                } 

                if (getFieldIndex() == null) {
                    throw new ApiException("Missing the required parameter 'FieldIndex' when calling PutWorksheetCustomFilter");
                } 

                if (getOperatorType1() == null) {
                    throw new ApiException("Missing the required parameter 'OperatorType1' when calling PutWorksheetCustomFilter");
                } 

                if (getCriteria1() == null) {
                    throw new ApiException("Missing the required parameter 'Criteria1' when calling PutWorksheetCustomFilter");
                }       
        String localVarPath = "v3.0/cells/{name}/worksheets/{sheetName}/autoFilter/custom".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString())) 
    .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getRange() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "range", getRange()));
            } 
            if (getFieldIndex() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "fieldIndex", getFieldIndex()));
            } 
            if (getOperatorType1() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "operatorType1", getOperatorType1()));
            } 
            if (getCriteria1() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "criteria1", getCriteria1()));
            } 
            if (getIsAnd() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAnd", getIsAnd()));
            } 
            if (getOperatorType2() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "operatorType2", getOperatorType2()));
            } 
            if (getCriteria2() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "criteria2", getCriteria2()));
            } 
            if (getMatchBlanks() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "matchBlanks", getMatchBlanks()));
            } 
            if (getRefresh() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "refresh", getRefresh()));
            } 
            if (getFolder() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", getFolder()));
            } 
            if (getStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", getStorageName()));
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

