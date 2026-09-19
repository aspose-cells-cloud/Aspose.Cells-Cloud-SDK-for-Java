/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GetWorkbookRequest.java">
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

public class GetWorkbookRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String name;
    private String format;
    private String password;
    private Boolean isAutoFit;
    private Boolean onlySaveTable;
    private String folder;
    private String outPath;
    private String storageName;
    private String outStorageName;
    private Boolean checkExcelRestriction;
    private String region;
    private Boolean pageWideFitOnPerSheet;
    private Boolean pageTallFitOnPerSheet;
    private Boolean onePagePerSheet;
    private Boolean onlyAutofitTable;
    private String fontsLocation;
    
        public GetWorkbookRequest()
        {        
        }
        public GetWorkbookRequest( String name ,  String format ,  String password ,  Boolean isAutoFit ,  Boolean onlySaveTable ,  String folder ,  String outPath ,  String storageName ,  String outStorageName ,  Boolean checkExcelRestriction ,  String region ,  Boolean pageWideFitOnPerSheet ,  Boolean pageTallFitOnPerSheet ,  Boolean onePagePerSheet ,  Boolean onlyAutofitTable ,  String fontsLocation ) {
            this.name = name; 
            this.format = format; 
            this.password = password; 
            this.isAutoFit = isAutoFit; 
            this.onlySaveTable = onlySaveTable; 
            this.folder = folder; 
            this.outPath = outPath; 
            this.storageName = storageName; 
            this.outStorageName = outStorageName; 
            this.checkExcelRestriction = checkExcelRestriction; 
            this.region = region; 
            this.pageWideFitOnPerSheet = pageWideFitOnPerSheet; 
            this.pageTallFitOnPerSheet = pageTallFitOnPerSheet; 
            this.onePagePerSheet = onePagePerSheet; 
            this.onlyAutofitTable = onlyAutofitTable; 
            this.fontsLocation = fontsLocation; 
        }   

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFormat() {
            return this.format;
        }

        public void setFormat(String format) {
            this.format = format;
        }


        public String getPassword() {
            return this.password;
        }

        public void setPassword(String password) {
            this.password = password;
        }


        public Boolean getIsAutoFit() {
            return this.isAutoFit;
        }

        public void setIsAutoFit(Boolean isAutoFit) {
            this.isAutoFit = isAutoFit;
        }


        public Boolean getOnlySaveTable() {
            return this.onlySaveTable;
        }

        public void setOnlySaveTable(Boolean onlySaveTable) {
            this.onlySaveTable = onlySaveTable;
        }


        public String getFolder() {
            return this.folder;
        }

        public void setFolder(String folder) {
            this.folder = folder;
        }


        public String getOutPath() {
            return this.outPath;
        }

        public void setOutPath(String outPath) {
            this.outPath = outPath;
        }


        public String getStorageName() {
            return this.storageName;
        }

        public void setStorageName(String storageName) {
            this.storageName = storageName;
        }


        public String getOutStorageName() {
            return this.outStorageName;
        }

        public void setOutStorageName(String outStorageName) {
            this.outStorageName = outStorageName;
        }


        public Boolean getCheckExcelRestriction() {
            return this.checkExcelRestriction;
        }

        public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
            this.checkExcelRestriction = checkExcelRestriction;
        }


        public String getRegion() {
            return this.region;
        }

        public void setRegion(String region) {
            this.region = region;
        }


        public Boolean getPageWideFitOnPerSheet() {
            return this.pageWideFitOnPerSheet;
        }

        public void setPageWideFitOnPerSheet(Boolean pageWideFitOnPerSheet) {
            this.pageWideFitOnPerSheet = pageWideFitOnPerSheet;
        }


        public Boolean getPageTallFitOnPerSheet() {
            return this.pageTallFitOnPerSheet;
        }

        public void setPageTallFitOnPerSheet(Boolean pageTallFitOnPerSheet) {
            this.pageTallFitOnPerSheet = pageTallFitOnPerSheet;
        }


        public Boolean getOnePagePerSheet() {
            return this.onePagePerSheet;
        }

        public void setOnePagePerSheet(Boolean onePagePerSheet) {
            this.onePagePerSheet = onePagePerSheet;
        }


        public Boolean getOnlyAutofitTable() {
            return this.onlyAutofitTable;
        }

        public void setOnlyAutofitTable(Boolean onlyAutofitTable) {
            this.onlyAutofitTable = onlyAutofitTable;
        }


        public String getFontsLocation() {
            return this.fontsLocation;
        }

        public void setFontsLocation(String fontsLocation) {
            this.fontsLocation = fontsLocation;
        }

    
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
         
                if (getName() == null) {
                    throw new ApiException("Missing the required parameter 'Name' when calling GetWorkbook");
                }       
        String localVarPath = "v3.0/cells/{name}".replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))   ;
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getFormat() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", getFormat()));
            } 
            if (getPassword() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", getPassword()));
            } 
            if (getIsAutoFit() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "isAutoFit", getIsAutoFit()));
            } 
            if (getOnlySaveTable() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlySaveTable", getOnlySaveTable()));
            } 
            if (getFolder() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "folder", getFolder()));
            } 
            if (getOutPath() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outPath", getOutPath()));
            } 
            if (getStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", getStorageName()));
            } 
            if (getOutStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outStorageName", getOutStorageName()));
            } 
            if (getCheckExcelRestriction() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkExcelRestriction", getCheckExcelRestriction()));
            } 
            if (getRegion() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "region", getRegion()));
            } 
            if (getPageWideFitOnPerSheet() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageWideFitOnPerSheet", getPageWideFitOnPerSheet()));
            } 
            if (getPageTallFitOnPerSheet() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageTallFitOnPerSheet", getPageTallFitOnPerSheet()));
            } 
            if (getOnePagePerSheet() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "onePagePerSheet", getOnePagePerSheet()));
            } 
            if (getOnlyAutofitTable() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "onlyAutofitTable", getOnlyAutofitTable()));
            } 
            if (getFontsLocation() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "FontsLocation", getFontsLocation()));
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
                return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);

    }
}

