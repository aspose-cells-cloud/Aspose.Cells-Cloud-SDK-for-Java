/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImageOrPrintOptions.java">
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


public class ImageOrPrintOptions {
        @SerializedName("TextCrossType")
        private String textCrossType ;

        public  ImageOrPrintOptions  textCrossType(String  textCrossType) {
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

        @SerializedName("GridlineType")
        private String gridlineType ;

        public  ImageOrPrintOptions  gridlineType(String  gridlineType) {
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

        @SerializedName("OutputBlankPageWhenNothingToPrint")
        private Boolean outputBlankPageWhenNothingToPrint ;

        public  ImageOrPrintOptions  outputBlankPageWhenNothingToPrint(Boolean  outputBlankPageWhenNothingToPrint) {
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

        @SerializedName("CheckWorkbookDefaultFont")
        private Boolean checkWorkbookDefaultFont ;

        public  ImageOrPrintOptions  checkWorkbookDefaultFont(Boolean  checkWorkbookDefaultFont) {
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

        @SerializedName("DefaultFont")
        private String defaultFont ;

        public  ImageOrPrintOptions  defaultFont(String  defaultFont) {
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

        @SerializedName("IsOptimized")
        private Boolean isOptimized ;

        public  ImageOrPrintOptions  isOptimized(Boolean  isOptimized) {
            this.isOptimized =  isOptimized;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsOptimized() {
            return isOptimized;
        }

        public void setIsOptimized(Boolean isOptimized) {
            this.isOptimized = isOptimized;
        }

        @SerializedName("PageCount")
        private Integer pageCount ;

        public  ImageOrPrintOptions  pageCount(Integer  pageCount) {
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

        @SerializedName("PageIndex")
        private Integer pageIndex ;

        public  ImageOrPrintOptions  pageIndex(Integer  pageIndex) {
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

        @SerializedName("IsFontSubstitutionCharGranularity")
        private Boolean isFontSubstitutionCharGranularity ;

        public  ImageOrPrintOptions  isFontSubstitutionCharGranularity(Boolean  isFontSubstitutionCharGranularity) {
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

        @SerializedName("Transparent")
        private Boolean transparent ;

        public  ImageOrPrintOptions  transparent(Boolean  transparent) {
            this.transparent =  transparent;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getTransparent() {
            return transparent;
        }

        public void setTransparent(Boolean transparent) {
            this.transparent = transparent;
        }

        @SerializedName("OnlyArea")
        private Boolean onlyArea ;

        public  ImageOrPrintOptions  onlyArea(Boolean  onlyArea) {
            this.onlyArea =  onlyArea;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getOnlyArea() {
            return onlyArea;
        }

        public void setOnlyArea(Boolean onlyArea) {
            this.onlyArea = onlyArea;
        }

        @SerializedName("SVGFitToViewPort")
        private Boolean sVGFitToViewPort ;

        public  ImageOrPrintOptions  sVGFitToViewPort(Boolean  sVGFitToViewPort) {
            this.sVGFitToViewPort =  sVGFitToViewPort;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getSVGFitToViewPort() {
            return sVGFitToViewPort;
        }

        public void setSVGFitToViewPort(Boolean sVGFitToViewPort) {
            this.sVGFitToViewPort = sVGFitToViewPort;
        }

        @SerializedName("EmbededImageNameInSvg")
        private String embededImageNameInSvg ;

        public  ImageOrPrintOptions  embededImageNameInSvg(String  embededImageNameInSvg) {
            this.embededImageNameInSvg =  embededImageNameInSvg;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getEmbededImageNameInSvg() {
            return embededImageNameInSvg;
        }

        public void setEmbededImageNameInSvg(String embededImageNameInSvg) {
            this.embededImageNameInSvg = embededImageNameInSvg;
        }

        @SerializedName("AllColumnsInOnePagePerSheet")
        private Boolean allColumnsInOnePagePerSheet ;

        public  ImageOrPrintOptions  allColumnsInOnePagePerSheet(Boolean  allColumnsInOnePagePerSheet) {
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

        @SerializedName("PrintWithStatusDialog")
        private Boolean printWithStatusDialog ;

        public  ImageOrPrintOptions  printWithStatusDialog(Boolean  printWithStatusDialog) {
            this.printWithStatusDialog =  printWithStatusDialog;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPrintWithStatusDialog() {
            return printWithStatusDialog;
        }

        public void setPrintWithStatusDialog(Boolean printWithStatusDialog) {
            this.printWithStatusDialog = printWithStatusDialog;
        }

        @SerializedName("HorizontalResolution")
        private Integer horizontalResolution ;

        public  ImageOrPrintOptions  horizontalResolution(Integer  horizontalResolution) {
            this.horizontalResolution =  horizontalResolution;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getHorizontalResolution() {
            return horizontalResolution;
        }

        public void setHorizontalResolution(Integer horizontalResolution) {
            this.horizontalResolution = horizontalResolution;
        }

        @SerializedName("VerticalResolution")
        private Integer verticalResolution ;

        public  ImageOrPrintOptions  verticalResolution(Integer  verticalResolution) {
            this.verticalResolution =  verticalResolution;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getVerticalResolution() {
            return verticalResolution;
        }

        public void setVerticalResolution(Integer verticalResolution) {
            this.verticalResolution = verticalResolution;
        }

        @SerializedName("DefaultEditLanguage")
        private String defaultEditLanguage ;

        public  ImageOrPrintOptions  defaultEditLanguage(String  defaultEditLanguage) {
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

        @SerializedName("TiffColorDepth")
        private String tiffColorDepth ;

        public  ImageOrPrintOptions  tiffColorDepth(String  tiffColorDepth) {
            this.tiffColorDepth =  tiffColorDepth;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTiffColorDepth() {
            return tiffColorDepth;
        }

        public void setTiffColorDepth(String tiffColorDepth) {
            this.tiffColorDepth = tiffColorDepth;
        }

        @SerializedName("TiffCompression")
        private String tiffCompression ;

        public  ImageOrPrintOptions  tiffCompression(String  tiffCompression) {
            this.tiffCompression =  tiffCompression;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTiffCompression() {
            return tiffCompression;
        }

        public void setTiffCompression(String tiffCompression) {
            this.tiffCompression = tiffCompression;
        }

        @SerializedName("PrintingPage")
        private String printingPage ;

        public  ImageOrPrintOptions  printingPage(String  printingPage) {
            this.printingPage =  printingPage;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPrintingPage() {
            return printingPage;
        }

        public void setPrintingPage(String printingPage) {
            this.printingPage = printingPage;
        }

        @SerializedName("Quality")
        private Integer quality ;

        public  ImageOrPrintOptions  quality(Integer  quality) {
            this.quality =  quality;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getQuality() {
            return quality;
        }

        public void setQuality(Integer quality) {
            this.quality = quality;
        }

        @SerializedName("ImageType")
        private String imageType ;

        public  ImageOrPrintOptions  imageType(String  imageType) {
            this.imageType =  imageType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getImageType() {
            return imageType;
        }

        public void setImageType(String imageType) {
            this.imageType = imageType;
        }

        @SerializedName("OnePagePerSheet")
        private Boolean onePagePerSheet ;

        public  ImageOrPrintOptions  onePagePerSheet(Boolean  onePagePerSheet) {
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

        @SerializedName("TiffBinarizationMethod")
        private String tiffBinarizationMethod ;

        public  ImageOrPrintOptions  tiffBinarizationMethod(String  tiffBinarizationMethod) {
            this.tiffBinarizationMethod =  tiffBinarizationMethod;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTiffBinarizationMethod() {
            return tiffBinarizationMethod;
        }

        public void setTiffBinarizationMethod(String tiffBinarizationMethod) {
            this.tiffBinarizationMethod = tiffBinarizationMethod;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ImageOrPrintOptions imageOrPrintOptions = (ImageOrPrintOptions) o;
            return
                Objects.equals(this.textCrossType, imageOrPrintOptions.textCrossType) &&
                Objects.equals(this.gridlineType, imageOrPrintOptions.gridlineType) &&
                Objects.equals(this.outputBlankPageWhenNothingToPrint, imageOrPrintOptions.outputBlankPageWhenNothingToPrint) &&
                Objects.equals(this.checkWorkbookDefaultFont, imageOrPrintOptions.checkWorkbookDefaultFont) &&
                Objects.equals(this.defaultFont, imageOrPrintOptions.defaultFont) &&
                Objects.equals(this.isOptimized, imageOrPrintOptions.isOptimized) &&
                Objects.equals(this.pageCount, imageOrPrintOptions.pageCount) &&
                Objects.equals(this.pageIndex, imageOrPrintOptions.pageIndex) &&
                Objects.equals(this.isFontSubstitutionCharGranularity, imageOrPrintOptions.isFontSubstitutionCharGranularity) &&
                Objects.equals(this.transparent, imageOrPrintOptions.transparent) &&
                Objects.equals(this.onlyArea, imageOrPrintOptions.onlyArea) &&
                Objects.equals(this.sVGFitToViewPort, imageOrPrintOptions.sVGFitToViewPort) &&
                Objects.equals(this.embededImageNameInSvg, imageOrPrintOptions.embededImageNameInSvg) &&
                Objects.equals(this.allColumnsInOnePagePerSheet, imageOrPrintOptions.allColumnsInOnePagePerSheet) &&
                Objects.equals(this.printWithStatusDialog, imageOrPrintOptions.printWithStatusDialog) &&
                Objects.equals(this.horizontalResolution, imageOrPrintOptions.horizontalResolution) &&
                Objects.equals(this.verticalResolution, imageOrPrintOptions.verticalResolution) &&
                Objects.equals(this.defaultEditLanguage, imageOrPrintOptions.defaultEditLanguage) &&
                Objects.equals(this.tiffColorDepth, imageOrPrintOptions.tiffColorDepth) &&
                Objects.equals(this.tiffCompression, imageOrPrintOptions.tiffCompression) &&
                Objects.equals(this.printingPage, imageOrPrintOptions.printingPage) &&
                Objects.equals(this.quality, imageOrPrintOptions.quality) &&
                Objects.equals(this.imageType, imageOrPrintOptions.imageType) &&
                Objects.equals(this.onePagePerSheet, imageOrPrintOptions.onePagePerSheet) &&
                Objects.equals(this.tiffBinarizationMethod, imageOrPrintOptions.tiffBinarizationMethod);
      }

      @Override
      public int hashCode() {
        return Objects.hash(textCrossType, gridlineType, outputBlankPageWhenNothingToPrint, checkWorkbookDefaultFont, defaultFont, isOptimized, pageCount, pageIndex, isFontSubstitutionCharGranularity, transparent, onlyArea, sVGFitToViewPort, embededImageNameInSvg, allColumnsInOnePagePerSheet, printWithStatusDialog, horizontalResolution, verticalResolution, defaultEditLanguage, tiffColorDepth, tiffCompression, printingPage, quality, imageType, onePagePerSheet, tiffBinarizationMethod);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ImageOrPrintOptions {\n");
            sb.append("    textCrossType: ").append(toIndentedString(getTextCrossType())).append("\n");
            sb.append("    gridlineType: ").append(toIndentedString(getGridlineType())).append("\n");
            sb.append("    outputBlankPageWhenNothingToPrint: ").append(toIndentedString(getOutputBlankPageWhenNothingToPrint())).append("\n");
            sb.append("    checkWorkbookDefaultFont: ").append(toIndentedString(getCheckWorkbookDefaultFont())).append("\n");
            sb.append("    defaultFont: ").append(toIndentedString(getDefaultFont())).append("\n");
            sb.append("    isOptimized: ").append(toIndentedString(getIsOptimized())).append("\n");
            sb.append("    pageCount: ").append(toIndentedString(getPageCount())).append("\n");
            sb.append("    pageIndex: ").append(toIndentedString(getPageIndex())).append("\n");
            sb.append("    isFontSubstitutionCharGranularity: ").append(toIndentedString(getIsFontSubstitutionCharGranularity())).append("\n");
            sb.append("    transparent: ").append(toIndentedString(getTransparent())).append("\n");
            sb.append("    onlyArea: ").append(toIndentedString(getOnlyArea())).append("\n");
            sb.append("    sVGFitToViewPort: ").append(toIndentedString(getSVGFitToViewPort())).append("\n");
            sb.append("    embededImageNameInSvg: ").append(toIndentedString(getEmbededImageNameInSvg())).append("\n");
            sb.append("    allColumnsInOnePagePerSheet: ").append(toIndentedString(getAllColumnsInOnePagePerSheet())).append("\n");
            sb.append("    printWithStatusDialog: ").append(toIndentedString(getPrintWithStatusDialog())).append("\n");
            sb.append("    horizontalResolution: ").append(toIndentedString(getHorizontalResolution())).append("\n");
            sb.append("    verticalResolution: ").append(toIndentedString(getVerticalResolution())).append("\n");
            sb.append("    defaultEditLanguage: ").append(toIndentedString(getDefaultEditLanguage())).append("\n");
            sb.append("    tiffColorDepth: ").append(toIndentedString(getTiffColorDepth())).append("\n");
            sb.append("    tiffCompression: ").append(toIndentedString(getTiffCompression())).append("\n");
            sb.append("    printingPage: ").append(toIndentedString(getPrintingPage())).append("\n");
            sb.append("    quality: ").append(toIndentedString(getQuality())).append("\n");
            sb.append("    imageType: ").append(toIndentedString(getImageType())).append("\n");
            sb.append("    onePagePerSheet: ").append(toIndentedString(getOnePagePerSheet())).append("\n");
            sb.append("    tiffBinarizationMethod: ").append(toIndentedString(getTiffBinarizationMethod())).append("\n");
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

