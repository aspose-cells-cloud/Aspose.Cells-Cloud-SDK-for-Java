/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PutConvertWorkbookRequest.java">
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

public class PutConvertWorkbookRequest  implements IRequestModel {
    private HashMap<String,String> extendQueryParameterMap;
    public HashMap<String,String> getExtendQueryParameterMap() {
        return this.extendQueryParameterMap;
    }

    public void setExtendQueryParameterMap( HashMap<String,String>  extendQueryParameterMap) {
        this.extendQueryParameterMap = extendQueryParameterMap;
    }
    private String format;
    private String password;
    private String outPath;
    private String storageName;
    private Boolean checkExcelRestriction;
    private String streamFormat;
    private String region;
    private Boolean pageWideFitOnPerSheet;
    private Boolean pageTallFitOnPerSheet;
    private String sheetName;
    private Integer pageIndex;
    private Boolean onePagePerSheet;
    private Boolean autoRowsFit;
    private Boolean autoColumnsFit;
    private String fontsLocation;
    
     
                private HashMap<String,File> file;
                private String localPath;
        public PutConvertWorkbookRequest()
        {        
        }
        public PutConvertWorkbookRequest( String  localPath   ,  String format ,  String password ,  String outPath ,  String storageName ,  Boolean checkExcelRestriction ,  String streamFormat ,  String region ,  Boolean pageWideFitOnPerSheet ,  Boolean pageTallFitOnPerSheet ,  String sheetName ,  Integer pageIndex ,  Boolean onePagePerSheet ,  Boolean autoRowsFit ,  Boolean autoColumnsFit ,  String fontsLocation ) {
              this.localPath  = localPath;   
            this.format = format; 
            this.password = password; 
            this.outPath = outPath; 
            this.storageName = storageName; 
            this.checkExcelRestriction = checkExcelRestriction; 
            this.streamFormat = streamFormat; 
            this.region = region; 
            this.pageWideFitOnPerSheet = pageWideFitOnPerSheet; 
            this.pageTallFitOnPerSheet = pageTallFitOnPerSheet; 
            this.sheetName = sheetName; 
            this.pageIndex = pageIndex; 
            this.onePagePerSheet = onePagePerSheet; 
            this.autoRowsFit = autoRowsFit; 
            this.autoColumnsFit = autoColumnsFit; 
            this.fontsLocation = fontsLocation; 
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


        public Boolean getCheckExcelRestriction() {
            return this.checkExcelRestriction;
        }

        public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
            this.checkExcelRestriction = checkExcelRestriction;
        }


        public String getStreamFormat() {
            return this.streamFormat;
        }

        public void setStreamFormat(String streamFormat) {
            this.streamFormat = streamFormat;
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


        public String getSheetName() {
            return this.sheetName;
        }

        public void setSheetName(String sheetName) {
            this.sheetName = sheetName;
        }


        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public void setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
        }


        public Boolean getOnePagePerSheet() {
            return this.onePagePerSheet;
        }

        public void setOnePagePerSheet(Boolean onePagePerSheet) {
            this.onePagePerSheet = onePagePerSheet;
        }


        public Boolean getAutoRowsFit() {
            return this.autoRowsFit;
        }

        public void setAutoRowsFit(Boolean autoRowsFit) {
            this.autoRowsFit = autoRowsFit;
        }


        public Boolean getAutoColumnsFit() {
            return this.autoColumnsFit;
        }

        public void setAutoColumnsFit(Boolean autoColumnsFit) {
            this.autoColumnsFit = autoColumnsFit;
        }


        public String getFontsLocation() {
            return this.fontsLocation;
        }

        public void setFontsLocation(String fontsLocation) {
            this.fontsLocation = fontsLocation;
        }

    
             
            public HashMap<String,File> getFile() {
                return this.file;
            }

            public void setFile(HashMap<String,File> file) {
                this.file = file;
            }
     
        public String getLocalPath() {
                return this.localPath;
        }
        public void setLocalPath(String localPath) {
            this.localPath = localPath;
        }        
        
    @Override
    public Call buildHttpRequest(ApiClient apiClient, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener, Boolean addAuthHeaders) throws ApiException {
          
                if ( getFile() == null && getLocalPath() ==null ) {
                    throw new ApiException("Missing the required parameter 'File' when calling PutConvertWorkbook");
                } 

                if (getFormat() == null) {
                    throw new ApiException("Missing the required parameter 'Format' when calling PutConvertWorkbook");
                }       
        String localVarPath = "v3.0/cells/convert";
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        List<Pair> localVarQueryParams = new ArrayList<Pair>();
            if (getFormat() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "format", getFormat()));
            } 
            if (getPassword() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "password", getPassword()));
            } 
            if (getOutPath() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "outPath", getOutPath()));
            } 
            if (getStorageName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "storageName", getStorageName()));
            } 
            if (getCheckExcelRestriction() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "checkExcelRestriction", getCheckExcelRestriction()));
            } 
            if (getStreamFormat() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "streamFormat", getStreamFormat()));
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
            if (getSheetName() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "sheetName", getSheetName()));
            } 
            if (getPageIndex() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "pageIndex", getPageIndex()));
            } 
            if (getOnePagePerSheet() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "onePagePerSheet", getOnePagePerSheet()));
            } 
            if (getAutoRowsFit() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "AutoRowsFit", getAutoRowsFit()));
            } 
            if (getAutoColumnsFit() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "AutoColumnsFit", getAutoColumnsFit()));
            } 
            if (getFontsLocation() != null){
                localVarQueryParams.addAll(apiClient.parameterToPairs("", "FontsLocation", getFontsLocation()));
            }  
        if(this.extendQueryParameterMap !=null){
            for (String key :this.extendQueryParameterMap.keySet()) {
                    localVarQueryParams.addAll(apiClient.parameterToPairs("", key, this.extendQueryParameterMap.get(key)));           
            }
        }
                   
            if (getLocalPath() != null && !getLocalPath().isEmpty()) {
                File fileToUpload = new File(getLocalPath());
                if (fileToUpload.exists()) {
                    localVarFormParams.put(fileToUpload.getName(), fileToUpload);
                }
            }
            if (getFile() != null){
                for (String key : getFile().keySet()) {
                    localVarFormParams.put(key,getFile().get(key));                
                }
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

