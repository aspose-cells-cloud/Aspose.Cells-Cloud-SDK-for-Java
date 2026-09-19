/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DeleteWorksheetFreezePanesRequest.java">
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

public class DeleteWorksheetFreezePanesRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String name;
    private String sheetName;
    private Integer row;
    private Integer column;
    private Integer freezedRows;
    private Integer freezedColumns;
    private String folder;
    private String storageName;
    
        public DeleteWorksheetFreezePanesRequest()
        {        
        }
        public DeleteWorksheetFreezePanesRequest( String name ,  String sheetName ,  Integer row ,  Integer column ,  Integer freezedRows ,  Integer freezedColumns ,  String folder ,  String storageName ) {
            this.name = name; 
            this.sheetName = sheetName; 
            this.row = row; 
            this.column = column; 
            this.freezedRows = freezedRows; 
            this.freezedColumns = freezedColumns; 
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

        public Integer getRow() {
            return this.row;
        }

        public void setRow(Integer row) {
            this.row = row;
        }


        public Integer getColumn() {
            return this.column;
        }

        public void setColumn(Integer column) {
            this.column = column;
        }


        public Integer getFreezedRows() {
            return this.freezedRows;
        }

        public void setFreezedRows(Integer freezedRows) {
            this.freezedRows = freezedRows;
        }


        public Integer getFreezedColumns() {
            return this.freezedColumns;
        }

        public void setFreezedColumns(Integer freezedColumns) {
            this.freezedColumns = freezedColumns;
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
                    throw new ApiException("Missing the required parameter 'Name' when calling DeleteWorksheetFreezePanes");
                } 

                if (getSheetName() == null) {
                    throw new ApiException("Missing the required parameter 'SheetName' when calling DeleteWorksheetFreezePanes");
                } 

                if (getRow() == null) {
                    throw new ApiException("Missing the required parameter 'Row' when calling DeleteWorksheetFreezePanes");
                } 

                if (getColumn() == null) {
                    throw new ApiException("Missing the required parameter 'Column' when calling DeleteWorksheetFreezePanes");
                } 

                if (getFreezedRows() == null) {
                    throw new ApiException("Missing the required parameter 'FreezedRows' when calling DeleteWorksheetFreezePanes");
                } 

                if (getFreezedColumns() == null) {
                    throw new ApiException("Missing the required parameter 'FreezedColumns' when calling DeleteWorksheetFreezePanes");
                }       
        String localVarPath = "v3.0/cells/{name}/worksheets/{sheetName}/freezepanes".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString())) 
    .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getRow() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "row", getRow()));
            } 
            if (getColumn() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "column", getColumn()));
            } 
            if (getFreezedRows() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "freezedRows", getFreezedRows()));
            } 
            if (getFreezedColumns() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "freezedColumns", getFreezedColumns()));
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
                return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);

    }
}

