/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PaginatedSaveOptions.java">
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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class PaginatedSaveOptions  extends  SaveOptions {
        @SerializedName("DefaultFont")
        private String defaultFont ;

        public  PaginatedSaveOptions  defaultFont(String  defaultFont) {
            this.defaultFont =  defaultFont;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDefaultFont() {
            return defaultFont;
        }

        public void setDefaultFont(String defaultFont) {
            this.defaultFont = defaultFont;
        }

        @SerializedName("CheckWorkbookDefaultFont")
        private Boolean checkWorkbookDefaultFont ;

        public  PaginatedSaveOptions  checkWorkbookDefaultFont(Boolean  checkWorkbookDefaultFont) {
            this.checkWorkbookDefaultFont =  checkWorkbookDefaultFont;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getCheckWorkbookDefaultFont() {
            return checkWorkbookDefaultFont;
        }

        public void setCheckWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) {
            this.checkWorkbookDefaultFont = checkWorkbookDefaultFont;
        }

        @SerializedName("CheckFontCompatibility")
        private Boolean checkFontCompatibility ;

        public  PaginatedSaveOptions  checkFontCompatibility(Boolean  checkFontCompatibility) {
            this.checkFontCompatibility =  checkFontCompatibility;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getCheckFontCompatibility() {
            return checkFontCompatibility;
        }

        public void setCheckFontCompatibility(Boolean checkFontCompatibility) {
            this.checkFontCompatibility = checkFontCompatibility;
        }

        @SerializedName("IsFontSubstitutionCharGranularity")
        private Boolean isFontSubstitutionCharGranularity ;

        public  PaginatedSaveOptions  isFontSubstitutionCharGranularity(Boolean  isFontSubstitutionCharGranularity) {
            this.isFontSubstitutionCharGranularity =  isFontSubstitutionCharGranularity;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsFontSubstitutionCharGranularity() {
            return isFontSubstitutionCharGranularity;
        }

        public void setIsFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) {
            this.isFontSubstitutionCharGranularity = isFontSubstitutionCharGranularity;
        }

        @SerializedName("OnePagePerSheet")
        private Boolean onePagePerSheet ;

        public  PaginatedSaveOptions  onePagePerSheet(Boolean  onePagePerSheet) {
            this.onePagePerSheet =  onePagePerSheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getOnePagePerSheet() {
            return onePagePerSheet;
        }

        public void setOnePagePerSheet(Boolean onePagePerSheet) {
            this.onePagePerSheet = onePagePerSheet;
        }

        @SerializedName("AllColumnsInOnePagePerSheet")
        private Boolean allColumnsInOnePagePerSheet ;

        public  PaginatedSaveOptions  allColumnsInOnePagePerSheet(Boolean  allColumnsInOnePagePerSheet) {
            this.allColumnsInOnePagePerSheet =  allColumnsInOnePagePerSheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAllColumnsInOnePagePerSheet() {
            return allColumnsInOnePagePerSheet;
        }

        public void setAllColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) {
            this.allColumnsInOnePagePerSheet = allColumnsInOnePagePerSheet;
        }

        @SerializedName("IgnoreError")
        private Boolean ignoreError ;

        public  PaginatedSaveOptions  ignoreError(Boolean  ignoreError) {
            this.ignoreError =  ignoreError;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIgnoreError() {
            return ignoreError;
        }

        public void setIgnoreError(Boolean ignoreError) {
            this.ignoreError = ignoreError;
        }

        @SerializedName("OutputBlankPageWhenNothingToPrint")
        private Boolean outputBlankPageWhenNothingToPrint ;

        public  PaginatedSaveOptions  outputBlankPageWhenNothingToPrint(Boolean  outputBlankPageWhenNothingToPrint) {
            this.outputBlankPageWhenNothingToPrint =  outputBlankPageWhenNothingToPrint;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getOutputBlankPageWhenNothingToPrint() {
            return outputBlankPageWhenNothingToPrint;
        }

        public void setOutputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) {
            this.outputBlankPageWhenNothingToPrint = outputBlankPageWhenNothingToPrint;
        }

        @SerializedName("PageIndex")
        private Integer pageIndex ;

        public  PaginatedSaveOptions  pageIndex(Integer  pageIndex) {
            this.pageIndex =  pageIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPageIndex() {
            return pageIndex;
        }

        public void setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
        }

        @SerializedName("PageCount")
        private Integer pageCount ;

        public  PaginatedSaveOptions  pageCount(Integer  pageCount) {
            this.pageCount =  pageCount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPageCount() {
            return pageCount;
        }

        public void setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
        }

        @SerializedName("PrintingPageType")
        private String printingPageType ;

        public  PaginatedSaveOptions  printingPageType(String  printingPageType) {
            this.printingPageType =  printingPageType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPrintingPageType() {
            return printingPageType;
        }

        public void setPrintingPageType(String printingPageType) {
            this.printingPageType = printingPageType;
        }

        @SerializedName("GridlineType")
        private String gridlineType ;

        public  PaginatedSaveOptions  gridlineType(String  gridlineType) {
            this.gridlineType =  gridlineType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getGridlineType() {
            return gridlineType;
        }

        public void setGridlineType(String gridlineType) {
            this.gridlineType = gridlineType;
        }

        @SerializedName("TextCrossType")
        private String textCrossType ;

        public  PaginatedSaveOptions  textCrossType(String  textCrossType) {
            this.textCrossType =  textCrossType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTextCrossType() {
            return textCrossType;
        }

        public void setTextCrossType(String textCrossType) {
            this.textCrossType = textCrossType;
        }

        @SerializedName("DefaultEditLanguage")
        private String defaultEditLanguage ;

        public  PaginatedSaveOptions  defaultEditLanguage(String  defaultEditLanguage) {
            this.defaultEditLanguage =  defaultEditLanguage;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDefaultEditLanguage() {
            return defaultEditLanguage;
        }

        public void setDefaultEditLanguage(String defaultEditLanguage) {
            this.defaultEditLanguage = defaultEditLanguage;
        }

        @SerializedName("EmfRenderSetting")
        private String emfRenderSetting ;

        public  PaginatedSaveOptions  emfRenderSetting(String  emfRenderSetting) {
            this.emfRenderSetting =  emfRenderSetting;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getEmfRenderSetting() {
            return emfRenderSetting;
        }

        public void setEmfRenderSetting(String emfRenderSetting) {
            this.emfRenderSetting = emfRenderSetting;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PaginatedSaveOptions paginatedSaveOptions = (PaginatedSaveOptions) o;
            return
                Objects.equals(this.defaultFont, paginatedSaveOptions.defaultFont) &&
                Objects.equals(this.checkWorkbookDefaultFont, paginatedSaveOptions.checkWorkbookDefaultFont) &&
                Objects.equals(this.checkFontCompatibility, paginatedSaveOptions.checkFontCompatibility) &&
                Objects.equals(this.isFontSubstitutionCharGranularity, paginatedSaveOptions.isFontSubstitutionCharGranularity) &&
                Objects.equals(this.onePagePerSheet, paginatedSaveOptions.onePagePerSheet) &&
                Objects.equals(this.allColumnsInOnePagePerSheet, paginatedSaveOptions.allColumnsInOnePagePerSheet) &&
                Objects.equals(this.ignoreError, paginatedSaveOptions.ignoreError) &&
                Objects.equals(this.outputBlankPageWhenNothingToPrint, paginatedSaveOptions.outputBlankPageWhenNothingToPrint) &&
                Objects.equals(this.pageIndex, paginatedSaveOptions.pageIndex) &&
                Objects.equals(this.pageCount, paginatedSaveOptions.pageCount) &&
                Objects.equals(this.printingPageType, paginatedSaveOptions.printingPageType) &&
                Objects.equals(this.gridlineType, paginatedSaveOptions.gridlineType) &&
                Objects.equals(this.textCrossType, paginatedSaveOptions.textCrossType) &&
                Objects.equals(this.defaultEditLanguage, paginatedSaveOptions.defaultEditLanguage) &&
                Objects.equals(this.emfRenderSetting, paginatedSaveOptions.emfRenderSetting) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(defaultFont, checkWorkbookDefaultFont, checkFontCompatibility, isFontSubstitutionCharGranularity, onePagePerSheet, allColumnsInOnePagePerSheet, ignoreError, outputBlankPageWhenNothingToPrint, pageIndex, pageCount, printingPageType, gridlineType, textCrossType, defaultEditLanguage, emfRenderSetting, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PaginatedSaveOptions {\n");
            sb.append("    defaultFont: ").append(toIndentedString(getDefaultFont())).append("\n");
            sb.append("    checkWorkbookDefaultFont: ").append(toIndentedString(getCheckWorkbookDefaultFont())).append("\n");
            sb.append("    checkFontCompatibility: ").append(toIndentedString(getCheckFontCompatibility())).append("\n");
            sb.append("    isFontSubstitutionCharGranularity: ").append(toIndentedString(getIsFontSubstitutionCharGranularity())).append("\n");
            sb.append("    onePagePerSheet: ").append(toIndentedString(getOnePagePerSheet())).append("\n");
            sb.append("    allColumnsInOnePagePerSheet: ").append(toIndentedString(getAllColumnsInOnePagePerSheet())).append("\n");
            sb.append("    ignoreError: ").append(toIndentedString(getIgnoreError())).append("\n");
            sb.append("    outputBlankPageWhenNothingToPrint: ").append(toIndentedString(getOutputBlankPageWhenNothingToPrint())).append("\n");
            sb.append("    pageIndex: ").append(toIndentedString(getPageIndex())).append("\n");
            sb.append("    pageCount: ").append(toIndentedString(getPageCount())).append("\n");
            sb.append("    printingPageType: ").append(toIndentedString(getPrintingPageType())).append("\n");
            sb.append("    gridlineType: ").append(toIndentedString(getGridlineType())).append("\n");
            sb.append("    textCrossType: ").append(toIndentedString(getTextCrossType())).append("\n");
            sb.append("    defaultEditLanguage: ").append(toIndentedString(getDefaultEditLanguage())).append("\n");
            sb.append("    emfRenderSetting: ").append(toIndentedString(getEmfRenderSetting())).append("\n");
            sb.append("    mergeAreas: ").append(toIndentedString(getMergeAreas())).append("\n");
            sb.append("    sortExternalNames: ").append(toIndentedString(getSortExternalNames())).append("\n");
            sb.append("    updateSmartArt: ").append(toIndentedString(getUpdateSmartArt())).append("\n");
            sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
            sb.append("    cachedFileFolder: ").append(toIndentedString(getCachedFileFolder())).append("\n");
            sb.append("    clearData: ").append(toIndentedString(getClearData())).append("\n");
            sb.append("    createDirectory: ").append(toIndentedString(getCreateDirectory())).append("\n");
            sb.append("    enableHTTPCompression: ").append(toIndentedString(getEnableHTTPCompression())).append("\n");
            sb.append("    refreshChartCache: ").append(toIndentedString(getRefreshChartCache())).append("\n");
            sb.append("    sortNames: ").append(toIndentedString(getSortNames())).append("\n");
            sb.append("    validateMergedAreas: ").append(toIndentedString(getValidateMergedAreas())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
            sb.append("    encryptDocumentProperties: ").append(toIndentedString(getEncryptDocumentProperties())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}

