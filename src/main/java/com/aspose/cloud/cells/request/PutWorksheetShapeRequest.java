/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetShapeRequest.java">
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

public class PutWorksheetShapeRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String name;
    private String sheetName;
    private String drawingType;
    private Integer upperLeftRow;
    private Integer upperLeftColumn;
    private Integer top;
    private Integer left;
    private Integer width;
    private Integer height;
    private String folder;
    private String storageName;
    private Shape shapeDTO;    
        public PutWorksheetShapeRequest()
        {        
        }
        public PutWorksheetShapeRequest( String name ,  String sheetName ,  Shape shapeDTO ,  String drawingType ,  Integer upperLeftRow ,  Integer upperLeftColumn ,  Integer top ,  Integer left ,  Integer width ,  Integer height ,  String folder ,  String storageName ) {
            this.name = name; 
            this.sheetName = sheetName; 
            this.shapeDTO = shapeDTO; 
            this.drawingType = drawingType; 
            this.upperLeftRow = upperLeftRow; 
            this.upperLeftColumn = upperLeftColumn; 
            this.top = top; 
            this.left = left; 
            this.width = width; 
            this.height = height; 
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

        public String getDrawingType() {
            return this.drawingType;
        }

        public void setDrawingType(String drawingType) {
            this.drawingType = drawingType;
        }


        public Integer getUpperLeftRow() {
            return this.upperLeftRow;
        }

        public void setUpperLeftRow(Integer upperLeftRow) {
            this.upperLeftRow = upperLeftRow;
        }


        public Integer getUpperLeftColumn() {
            return this.upperLeftColumn;
        }

        public void setUpperLeftColumn(Integer upperLeftColumn) {
            this.upperLeftColumn = upperLeftColumn;
        }


        public Integer getTop() {
            return this.top;
        }

        public void setTop(Integer top) {
            this.top = top;
        }


        public Integer getLeft() {
            return this.left;
        }

        public void setLeft(Integer left) {
            this.left = left;
        }


        public Integer getWidth() {
            return this.width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }


        public Integer getHeight() {
            return this.height;
        }

        public void setHeight(Integer height) {
            this.height = height;
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

        public Shape getShapeDTO() {
            return this.shapeDTO;
        }

        public void setShapeDTO(Shape shapeDTO) {
            this.shapeDTO = shapeDTO;
        }
    
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         
                if (getName() == null) {
                    throw new ApiException("Missing the required parameter 'Name' when calling PutWorksheetShape");
                } 

                if (getSheetName() == null) {
                    throw new ApiException("Missing the required parameter 'SheetName' when calling PutWorksheetShape");
                }       
        String localVarPath = "v3.0/cells/{name}/worksheets/{sheetName}/shapes".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString())) 
    .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getDrawingType() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "DrawingType", getDrawingType()));
            } 
            if (getUpperLeftRow() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftRow", getUpperLeftRow()));
            } 
            if (getUpperLeftColumn() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftColumn", getUpperLeftColumn()));
            } 
            if (getTop() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "top", getTop()));
            } 
            if (getLeft() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "left", getLeft()));
            } 
            if (getWidth() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "width", getWidth()));
            } 
            if (getHeight() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "height", getHeight()));
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
        localVarPostBody = getShapeDTO();
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

