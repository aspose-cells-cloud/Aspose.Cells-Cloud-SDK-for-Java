/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImageSaveOptions.java">
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


public class ImageSaveOptions  extends  SaveOptions {
        @SerializedName("ChartImageType")
        private String chartImageType ;

        public  ImageSaveOptions  chartImageType(String  chartImageType) {
            this.chartImageType =  chartImageType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getChartImageType() {
            return chartImageType;
        }

        public void setChartImageType(String chartImageType) {
            this.chartImageType = chartImageType;
        }

        @SerializedName("EmbededImageNameInSvg")
        private String embededImageNameInSvg ;

        public  ImageSaveOptions  embededImageNameInSvg(String  embededImageNameInSvg) {
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

        @SerializedName("HorizontalResolution")
        private Integer horizontalResolution ;

        public  ImageSaveOptions  horizontalResolution(Integer  horizontalResolution) {
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

        @SerializedName("ImageFormat")
        private String imageFormat ;

        public  ImageSaveOptions  imageFormat(String  imageFormat) {
            this.imageFormat =  imageFormat;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getImageFormat() {
            return imageFormat;
        }

        public void setImageFormat(String imageFormat) {
            this.imageFormat = imageFormat;
        }

        @SerializedName("IsCellAutoFit")
        private Boolean isCellAutoFit ;

        public  ImageSaveOptions  isCellAutoFit(Boolean  isCellAutoFit) {
            this.isCellAutoFit =  isCellAutoFit;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsCellAutoFit() {
            return isCellAutoFit;
        }

        public void setIsCellAutoFit(Boolean isCellAutoFit) {
            this.isCellAutoFit = isCellAutoFit;
        }

        @SerializedName("OnePagePerSheet")
        private Boolean onePagePerSheet ;

        public  ImageSaveOptions  onePagePerSheet(Boolean  onePagePerSheet) {
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

        @SerializedName("OnlyArea")
        private Boolean onlyArea ;

        public  ImageSaveOptions  onlyArea(Boolean  onlyArea) {
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

        @SerializedName("PrintingPage")
        private String printingPage ;

        public  ImageSaveOptions  printingPage(String  printingPage) {
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

        @SerializedName("PrintWithStatusDialog")
        private Boolean printWithStatusDialog ;

        public  ImageSaveOptions  printWithStatusDialog(Boolean  printWithStatusDialog) {
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

        @SerializedName("Quality")
        private Integer quality ;

        public  ImageSaveOptions  quality(Integer  quality) {
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

        @SerializedName("TiffCompression")
        private String tiffCompression ;

        public  ImageSaveOptions  tiffCompression(String  tiffCompression) {
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

        @SerializedName("VerticalResolution")
        private Integer verticalResolution ;

        public  ImageSaveOptions  verticalResolution(Integer  verticalResolution) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ImageSaveOptions imageSaveOptions = (ImageSaveOptions) o;
            return
                Objects.equals(this.chartImageType, imageSaveOptions.chartImageType) &&
                Objects.equals(this.embededImageNameInSvg, imageSaveOptions.embededImageNameInSvg) &&
                Objects.equals(this.horizontalResolution, imageSaveOptions.horizontalResolution) &&
                Objects.equals(this.imageFormat, imageSaveOptions.imageFormat) &&
                Objects.equals(this.isCellAutoFit, imageSaveOptions.isCellAutoFit) &&
                Objects.equals(this.onePagePerSheet, imageSaveOptions.onePagePerSheet) &&
                Objects.equals(this.onlyArea, imageSaveOptions.onlyArea) &&
                Objects.equals(this.printingPage, imageSaveOptions.printingPage) &&
                Objects.equals(this.printWithStatusDialog, imageSaveOptions.printWithStatusDialog) &&
                Objects.equals(this.quality, imageSaveOptions.quality) &&
                Objects.equals(this.tiffCompression, imageSaveOptions.tiffCompression) &&
                Objects.equals(this.verticalResolution, imageSaveOptions.verticalResolution) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(chartImageType, embededImageNameInSvg, horizontalResolution, imageFormat, isCellAutoFit, onePagePerSheet, onlyArea, printingPage, printWithStatusDialog, quality, tiffCompression, verticalResolution, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ImageSaveOptions {\n");
            sb.append("    chartImageType: ").append(toIndentedString(getChartImageType())).append("\n");
            sb.append("    embededImageNameInSvg: ").append(toIndentedString(getEmbededImageNameInSvg())).append("\n");
            sb.append("    horizontalResolution: ").append(toIndentedString(getHorizontalResolution())).append("\n");
            sb.append("    imageFormat: ").append(toIndentedString(getImageFormat())).append("\n");
            sb.append("    isCellAutoFit: ").append(toIndentedString(getIsCellAutoFit())).append("\n");
            sb.append("    onePagePerSheet: ").append(toIndentedString(getOnePagePerSheet())).append("\n");
            sb.append("    onlyArea: ").append(toIndentedString(getOnlyArea())).append("\n");
            sb.append("    printingPage: ").append(toIndentedString(getPrintingPage())).append("\n");
            sb.append("    printWithStatusDialog: ").append(toIndentedString(getPrintWithStatusDialog())).append("\n");
            sb.append("    quality: ").append(toIndentedString(getQuality())).append("\n");
            sb.append("    tiffCompression: ").append(toIndentedString(getTiffCompression())).append("\n");
            sb.append("    verticalResolution: ").append(toIndentedString(getVerticalResolution())).append("\n");
            sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
            sb.append("    cachedFileFolder: ").append(toIndentedString(getCachedFileFolder())).append("\n");
            sb.append("    clearData: ").append(toIndentedString(getClearData())).append("\n");
            sb.append("    createDirectory: ").append(toIndentedString(getCreateDirectory())).append("\n");
            sb.append("    enableHTTPCompression: ").append(toIndentedString(getEnableHTTPCompression())).append("\n");
            sb.append("    refreshChartCache: ").append(toIndentedString(getRefreshChartCache())).append("\n");
            sb.append("    sortNames: ").append(toIndentedString(getSortNames())).append("\n");
            sb.append("    validateMergedAreas: ").append(toIndentedString(getValidateMergedAreas())).append("\n");
            sb.append("    mergeAreas: ").append(toIndentedString(getMergeAreas())).append("\n");
            sb.append("    sortExternalNames: ").append(toIndentedString(getSortExternalNames())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
            sb.append("    updateSmartArt: ").append(toIndentedString(getUpdateSmartArt())).append("\n");
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

