/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutWorksheetChartRequest.java">
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

public class PutWorksheetChartRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String name;
    private String sheetName;
    private String chartType;
    private Integer upperLeftRow;
    private Integer upperLeftColumn;
    private Integer lowerRightRow;
    private Integer lowerRightColumn;
    private String area;
    private Boolean isVertical;
    private String categoryData;
    private Boolean isAutoGetSerialName;
    private String title;
    private String folder;
    private Boolean dataLabels;
    private String dataLabelsPosition;
    private String pivotTableSheet;
    private String pivotTableName;
    private String storageName;
    
        public PutWorksheetChartRequest()
        {        
        }
        public PutWorksheetChartRequest( String name ,  String sheetName ,  String chartType ,  Integer upperLeftRow ,  Integer upperLeftColumn ,  Integer lowerRightRow ,  Integer lowerRightColumn ,  String area ,  Boolean isVertical ,  String categoryData ,  Boolean isAutoGetSerialName ,  String title ,  String folder ,  Boolean dataLabels ,  String dataLabelsPosition ,  String pivotTableSheet ,  String pivotTableName ,  String storageName ) {
            this.name = name; 
            this.sheetName = sheetName; 
            this.chartType = chartType; 
            this.upperLeftRow = upperLeftRow; 
            this.upperLeftColumn = upperLeftColumn; 
            this.lowerRightRow = lowerRightRow; 
            this.lowerRightColumn = lowerRightColumn; 
            this.area = area; 
            this.isVertical = isVertical; 
            this.categoryData = categoryData; 
            this.isAutoGetSerialName = isAutoGetSerialName; 
            this.title = title; 
            this.folder = folder; 
            this.dataLabels = dataLabels; 
            this.dataLabelsPosition = dataLabelsPosition; 
            this.pivotTableSheet = pivotTableSheet; 
            this.pivotTableName = pivotTableName; 
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

        public String getChartType() {
            return this.chartType;
        }

        public void setChartType(String chartType) {
            this.chartType = chartType;
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


        public Integer getLowerRightRow() {
            return this.lowerRightRow;
        }

        public void setLowerRightRow(Integer lowerRightRow) {
            this.lowerRightRow = lowerRightRow;
        }


        public Integer getLowerRightColumn() {
            return this.lowerRightColumn;
        }

        public void setLowerRightColumn(Integer lowerRightColumn) {
            this.lowerRightColumn = lowerRightColumn;
        }


        public String getArea() {
            return this.area;
        }

        public void setArea(String area) {
            this.area = area;
        }


        public Boolean getIsVertical() {
            return this.isVertical;
        }

        public void setIsVertical(Boolean isVertical) {
            this.isVertical = isVertical;
        }


        public String getCategoryData() {
            return this.categoryData;
        }

        public void setCategoryData(String categoryData) {
            this.categoryData = categoryData;
        }


        public Boolean getIsAutoGetSerialName() {
            return this.isAutoGetSerialName;
        }

        public void setIsAutoGetSerialName(Boolean isAutoGetSerialName) {
            this.isAutoGetSerialName = isAutoGetSerialName;
        }


        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }


        public String getFolder() {
            return this.folder;
        }

        public void setFolder(String folder) {
            this.folder = folder;
        }


        public Boolean getDataLabels() {
            return this.dataLabels;
        }

        public void setDataLabels(Boolean dataLabels) {
            this.dataLabels = dataLabels;
        }


        public String getDataLabelsPosition() {
            return this.dataLabelsPosition;
        }

        public void setDataLabelsPosition(String dataLabelsPosition) {
            this.dataLabelsPosition = dataLabelsPosition;
        }


        public String getPivotTableSheet() {
            return this.pivotTableSheet;
        }

        public void setPivotTableSheet(String pivotTableSheet) {
            this.pivotTableSheet = pivotTableSheet;
        }


        public String getPivotTableName() {
            return this.pivotTableName;
        }

        public void setPivotTableName(String pivotTableName) {
            this.pivotTableName = pivotTableName;
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
                    throw new ApiException("Missing the required parameter 'Name' when calling PutWorksheetChart");
                } 

                if (getSheetName() == null) {
                    throw new ApiException("Missing the required parameter 'SheetName' when calling PutWorksheetChart");
                } 

                if (getChartType() == null) {
                    throw new ApiException("Missing the required parameter 'ChartType' when calling PutWorksheetChart");
                }       
        String localVarPath = "v3.0/cells/{name}/worksheets/{sheetName}/charts".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString())) 
    .replaceAll("\\{" + "sheetName" + "\\}", apiClient.escapeString(sheetName.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getChartType() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "chartType", getChartType()));
            } 
            if (getUpperLeftRow() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftRow", getUpperLeftRow()));
            } 
            if (getUpperLeftColumn() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "upperLeftColumn", getUpperLeftColumn()));
            } 
            if (getLowerRightRow() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "lowerRightRow", getLowerRightRow()));
            } 
            if (getLowerRightColumn() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "lowerRightColumn", getLowerRightColumn()));
            } 
            if (getArea() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "area", getArea()));
            } 
            if (getIsVertical() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "isVertical", getIsVertical()));
            } 
            if (getCategoryData() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "categoryData", getCategoryData()));
            } 
            if (getIsAutoGetSerialName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAutoGetSerialName", getIsAutoGetSerialName()));
            } 
            if (getTitle() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "title", getTitle()));
            } 
            if (getFolder() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", getFolder()));
            } 
            if (getDataLabels() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataLabels", getDataLabels()));
            } 
            if (getDataLabelsPosition() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "dataLabelsPosition", getDataLabelsPosition()));
            } 
            if (getPivotTableSheet() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotTableSheet", getPivotTableSheet()));
            } 
            if (getPivotTableName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "pivotTableName", getPivotTableName()));
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

