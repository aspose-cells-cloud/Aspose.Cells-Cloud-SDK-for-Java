/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PdfSaveOptions.java">
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


public class PdfSaveOptions  extends  SaveOptions {
        @SerializedName("DisplayDocTitle")
        private Boolean displayDocTitle ;

        public  PdfSaveOptions  displayDocTitle(Boolean  displayDocTitle) {
            this.displayDocTitle =  displayDocTitle;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getDisplayDocTitle() {
            return displayDocTitle;
        }

        public void setDisplayDocTitle(Boolean displayDocTitle) {
            this.displayDocTitle = displayDocTitle;
        }

        @SerializedName("ExportDocumentStructure")
        private Boolean exportDocumentStructure ;

        public  PdfSaveOptions  exportDocumentStructure(Boolean  exportDocumentStructure) {
            this.exportDocumentStructure =  exportDocumentStructure;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExportDocumentStructure() {
            return exportDocumentStructure;
        }

        public void setExportDocumentStructure(Boolean exportDocumentStructure) {
            this.exportDocumentStructure = exportDocumentStructure;
        }

        @SerializedName("EmfRenderSetting")
        private String emfRenderSetting ;

        public  PdfSaveOptions  emfRenderSetting(String  emfRenderSetting) {
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

        @SerializedName("CustomPropertiesExport")
        private String customPropertiesExport ;

        public  PdfSaveOptions  customPropertiesExport(String  customPropertiesExport) {
            this.customPropertiesExport =  customPropertiesExport;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCustomPropertiesExport() {
            return customPropertiesExport;
        }

        public void setCustomPropertiesExport(String customPropertiesExport) {
            this.customPropertiesExport = customPropertiesExport;
        }

        @SerializedName("OptimizationType")
        private String optimizationType ;

        public  PdfSaveOptions  optimizationType(String  optimizationType) {
            this.optimizationType =  optimizationType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOptimizationType() {
            return optimizationType;
        }

        public void setOptimizationType(String optimizationType) {
            this.optimizationType = optimizationType;
        }

        @SerializedName("Producer")
        private String producer ;

        public  PdfSaveOptions  producer(String  producer) {
            this.producer =  producer;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getProducer() {
            return producer;
        }

        public void setProducer(String producer) {
            this.producer = producer;
        }

        @SerializedName("PdfCompression")
        private String pdfCompression ;

        public  PdfSaveOptions  pdfCompression(String  pdfCompression) {
            this.pdfCompression =  pdfCompression;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPdfCompression() {
            return pdfCompression;
        }

        public void setPdfCompression(String pdfCompression) {
            this.pdfCompression = pdfCompression;
        }

        @SerializedName("FontEncoding")
        private String fontEncoding ;

        public  PdfSaveOptions  fontEncoding(String  fontEncoding) {
            this.fontEncoding =  fontEncoding;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFontEncoding() {
            return fontEncoding;
        }

        public void setFontEncoding(String fontEncoding) {
            this.fontEncoding = fontEncoding;
        }

        @SerializedName("Watermark")
        private RenderingWatermark watermark ;

        public  PdfSaveOptions  watermark(RenderingWatermark  watermark) {
            this.watermark =  watermark;
            return this;
        }

        @ApiModelProperty(value = "")
        public RenderingWatermark getWatermark() {
            return watermark;
        }

        public void setWatermark(RenderingWatermark watermark) {
            this.watermark = watermark;
        }

        @SerializedName("CalculateFormula")
        private Boolean calculateFormula ;

        public  PdfSaveOptions  calculateFormula(Boolean  calculateFormula) {
            this.calculateFormula =  calculateFormula;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getCalculateFormula() {
            return calculateFormula;
        }

        public void setCalculateFormula(Boolean calculateFormula) {
            this.calculateFormula = calculateFormula;
        }

        @SerializedName("CheckFontCompatibility")
        private Boolean checkFontCompatibility ;

        public  PdfSaveOptions  checkFontCompatibility(Boolean  checkFontCompatibility) {
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

        @SerializedName("Compliance")
        private String compliance ;

        public  PdfSaveOptions  compliance(String  compliance) {
            this.compliance =  compliance;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCompliance() {
            return compliance;
        }

        public void setCompliance(String compliance) {
            this.compliance = compliance;
        }

        @SerializedName("DefaultFont")
        private String defaultFont ;

        public  PdfSaveOptions  defaultFont(String  defaultFont) {
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

        @SerializedName("OnePagePerSheet")
        private Boolean onePagePerSheet ;

        public  PdfSaveOptions  onePagePerSheet(Boolean  onePagePerSheet) {
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

        @SerializedName("PrintingPageType")
        private String printingPageType ;

        public  PdfSaveOptions  printingPageType(String  printingPageType) {
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

        @SerializedName("SecurityOptions")
        private PdfSecurityOptions securityOptions ;

        public  PdfSaveOptions  securityOptions(PdfSecurityOptions  securityOptions) {
            this.securityOptions =  securityOptions;
            return this;
        }

        @ApiModelProperty(value = "")
        public PdfSecurityOptions getSecurityOptions() {
            return securityOptions;
        }

        public void setSecurityOptions(PdfSecurityOptions securityOptions) {
            this.securityOptions = securityOptions;
        }

        @SerializedName("DesiredPPI")
        private Integer desiredPPI ;

        public  PdfSaveOptions  desiredPPI(Integer  desiredPPI) {
            this.desiredPPI =  desiredPPI;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getDesiredPPI() {
            return desiredPPI;
        }

        public void setDesiredPPI(Integer desiredPPI) {
            this.desiredPPI = desiredPPI;
        }

        @SerializedName("JpegQuality")
        private Integer jpegQuality ;

        public  PdfSaveOptions  jpegQuality(Integer  jpegQuality) {
            this.jpegQuality =  jpegQuality;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getJpegQuality() {
            return jpegQuality;
        }

        public void setJpegQuality(Integer jpegQuality) {
            this.jpegQuality = jpegQuality;
        }

        @SerializedName("ImageType")
        private String imageType ;

        public  PdfSaveOptions  imageType(String  imageType) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PdfSaveOptions pdfSaveOptions = (PdfSaveOptions) o;
            return
                Objects.equals(this.displayDocTitle, pdfSaveOptions.displayDocTitle) &&
                Objects.equals(this.exportDocumentStructure, pdfSaveOptions.exportDocumentStructure) &&
                Objects.equals(this.emfRenderSetting, pdfSaveOptions.emfRenderSetting) &&
                Objects.equals(this.customPropertiesExport, pdfSaveOptions.customPropertiesExport) &&
                Objects.equals(this.optimizationType, pdfSaveOptions.optimizationType) &&
                Objects.equals(this.producer, pdfSaveOptions.producer) &&
                Objects.equals(this.pdfCompression, pdfSaveOptions.pdfCompression) &&
                Objects.equals(this.fontEncoding, pdfSaveOptions.fontEncoding) &&
                Objects.equals(this.watermark, pdfSaveOptions.watermark) &&
                Objects.equals(this.calculateFormula, pdfSaveOptions.calculateFormula) &&
                Objects.equals(this.checkFontCompatibility, pdfSaveOptions.checkFontCompatibility) &&
                Objects.equals(this.compliance, pdfSaveOptions.compliance) &&
                Objects.equals(this.defaultFont, pdfSaveOptions.defaultFont) &&
                Objects.equals(this.onePagePerSheet, pdfSaveOptions.onePagePerSheet) &&
                Objects.equals(this.printingPageType, pdfSaveOptions.printingPageType) &&
                Objects.equals(this.securityOptions, pdfSaveOptions.securityOptions) &&
                Objects.equals(this.desiredPPI, pdfSaveOptions.desiredPPI) &&
                Objects.equals(this.jpegQuality, pdfSaveOptions.jpegQuality) &&
                Objects.equals(this.imageType, pdfSaveOptions.imageType) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(displayDocTitle, exportDocumentStructure, emfRenderSetting, customPropertiesExport, optimizationType, producer, pdfCompression, fontEncoding, watermark, calculateFormula, checkFontCompatibility, compliance, defaultFont, onePagePerSheet, printingPageType, securityOptions, desiredPPI, jpegQuality, imageType, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PdfSaveOptions {\n");
            sb.append("    displayDocTitle: ").append(toIndentedString(getDisplayDocTitle())).append("\n");
            sb.append("    exportDocumentStructure: ").append(toIndentedString(getExportDocumentStructure())).append("\n");
            sb.append("    emfRenderSetting: ").append(toIndentedString(getEmfRenderSetting())).append("\n");
            sb.append("    customPropertiesExport: ").append(toIndentedString(getCustomPropertiesExport())).append("\n");
            sb.append("    optimizationType: ").append(toIndentedString(getOptimizationType())).append("\n");
            sb.append("    producer: ").append(toIndentedString(getProducer())).append("\n");
            sb.append("    pdfCompression: ").append(toIndentedString(getPdfCompression())).append("\n");
            sb.append("    fontEncoding: ").append(toIndentedString(getFontEncoding())).append("\n");
            sb.append("    watermark: ").append(toIndentedString(getWatermark())).append("\n");
            sb.append("    calculateFormula: ").append(toIndentedString(getCalculateFormula())).append("\n");
            sb.append("    checkFontCompatibility: ").append(toIndentedString(getCheckFontCompatibility())).append("\n");
            sb.append("    compliance: ").append(toIndentedString(getCompliance())).append("\n");
            sb.append("    defaultFont: ").append(toIndentedString(getDefaultFont())).append("\n");
            sb.append("    onePagePerSheet: ").append(toIndentedString(getOnePagePerSheet())).append("\n");
            sb.append("    printingPageType: ").append(toIndentedString(getPrintingPageType())).append("\n");
            sb.append("    securityOptions: ").append(toIndentedString(getSecurityOptions())).append("\n");
            sb.append("    desiredPPI: ").append(toIndentedString(getDesiredPPI())).append("\n");
            sb.append("    jpegQuality: ").append(toIndentedString(getJpegQuality())).append("\n");
            sb.append("    imageType: ").append(toIndentedString(getImageType())).append("\n");
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

