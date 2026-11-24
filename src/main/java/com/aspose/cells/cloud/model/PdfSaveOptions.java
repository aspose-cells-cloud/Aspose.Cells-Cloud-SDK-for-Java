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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PdfSaveOptions extends SaveOptions {

    @SerializedName("DisplayDocTitle")
    @JsonProperty("DisplayDocTitle")
    private Boolean displayDocTitle;

    public PdfSaveOptions displayDocTitle(Boolean displayDocTitle) {
        this.displayDocTitle = displayDocTitle;
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
    @JsonProperty("ExportDocumentStructure")
    private Boolean exportDocumentStructure;

    public PdfSaveOptions exportDocumentStructure(Boolean exportDocumentStructure) {
        this.exportDocumentStructure = exportDocumentStructure;
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
    @JsonProperty("EmfRenderSetting")
    private String emfRenderSetting;

    public PdfSaveOptions emfRenderSetting(String emfRenderSetting) {
        this.emfRenderSetting = emfRenderSetting;
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
    @JsonProperty("CustomPropertiesExport")
    private String customPropertiesExport;

    public PdfSaveOptions customPropertiesExport(String customPropertiesExport) {
        this.customPropertiesExport = customPropertiesExport;
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
    @JsonProperty("OptimizationType")
    private String optimizationType;

    public PdfSaveOptions optimizationType(String optimizationType) {
        this.optimizationType = optimizationType;
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
    @JsonProperty("Producer")
    private String producer;

    public PdfSaveOptions producer(String producer) {
        this.producer = producer;
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
    @JsonProperty("PdfCompression")
    private String pdfCompression;

    public PdfSaveOptions pdfCompression(String pdfCompression) {
        this.pdfCompression = pdfCompression;
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
    @JsonProperty("FontEncoding")
    private String fontEncoding;

    public PdfSaveOptions fontEncoding(String fontEncoding) {
        this.fontEncoding = fontEncoding;
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
    @JsonProperty("Watermark")
    private RenderingWatermark watermark;

    public PdfSaveOptions watermark(RenderingWatermark watermark) {
        this.watermark = watermark;
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
    @JsonProperty("CalculateFormula")
    private Boolean calculateFormula;

    public PdfSaveOptions calculateFormula(Boolean calculateFormula) {
        this.calculateFormula = calculateFormula;
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
    @JsonProperty("CheckFontCompatibility")
    private Boolean checkFontCompatibility;

    public PdfSaveOptions checkFontCompatibility(Boolean checkFontCompatibility) {
        this.checkFontCompatibility = checkFontCompatibility;
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
    @JsonProperty("Compliance")
    private String compliance;

    public PdfSaveOptions compliance(String compliance) {
        this.compliance = compliance;
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
    @JsonProperty("DefaultFont")
    private String defaultFont;

    public PdfSaveOptions defaultFont(String defaultFont) {
        this.defaultFont = defaultFont;
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
    @JsonProperty("OnePagePerSheet")
    private Boolean onePagePerSheet;

    public PdfSaveOptions onePagePerSheet(Boolean onePagePerSheet) {
        this.onePagePerSheet = onePagePerSheet;
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
    @JsonProperty("PrintingPageType")
    private String printingPageType;

    public PdfSaveOptions printingPageType(String printingPageType) {
        this.printingPageType = printingPageType;
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
    @JsonProperty("SecurityOptions")
    private PdfSecurityOptions securityOptions;

    public PdfSaveOptions securityOptions(PdfSecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
        return this;
    }

    @ApiModelProperty(value = "")
    public PdfSecurityOptions getSecurityOptions() {
        return securityOptions;
    }

    public void setSecurityOptions(PdfSecurityOptions securityOptions) {
        this.securityOptions = securityOptions;
    }

    @SerializedName("desiredPPI")
    @JsonProperty("desiredPPI")
    private Integer desiredPPI;

    public PdfSaveOptions desiredPPI(Integer desiredPPI) {
        this.desiredPPI = desiredPPI;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getDesiredPPI() {
        return desiredPPI;
    }

    public void setDesiredPPI(Integer desiredPPI) {
        this.desiredPPI = desiredPPI;
    }

    @SerializedName("jpegQuality")
    @JsonProperty("jpegQuality")
    private Integer jpegQuality;

    public PdfSaveOptions jpegQuality(Integer jpegQuality) {
        this.jpegQuality = jpegQuality;
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
    @JsonProperty("ImageType")
    private String imageType;

    public PdfSaveOptions imageType(String imageType) {
        this.imageType = imageType;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        PdfSaveOptions other = (PdfSaveOptions) o;
        return Objects.equals(this.displayDocTitle, other.displayDocTitle)
            && Objects.equals(this.exportDocumentStructure, other.exportDocumentStructure)
            && Objects.equals(this.emfRenderSetting, other.emfRenderSetting)
            && Objects.equals(this.customPropertiesExport, other.customPropertiesExport)
            && Objects.equals(this.optimizationType, other.optimizationType)
            && Objects.equals(this.producer, other.producer)
            && Objects.equals(this.pdfCompression, other.pdfCompression)
            && Objects.equals(this.fontEncoding, other.fontEncoding)
            && Objects.equals(this.watermark, other.watermark)
            && Objects.equals(this.calculateFormula, other.calculateFormula)
            && Objects.equals(this.checkFontCompatibility, other.checkFontCompatibility)
            && Objects.equals(this.compliance, other.compliance)
            && Objects.equals(this.defaultFont, other.defaultFont)
            && Objects.equals(this.onePagePerSheet, other.onePagePerSheet)
            && Objects.equals(this.printingPageType, other.printingPageType)
            && Objects.equals(this.securityOptions, other.securityOptions)
            && Objects.equals(this.desiredPPI, other.desiredPPI)
            && Objects.equals(this.jpegQuality, other.jpegQuality)
            && Objects.equals(this.imageType, other.imageType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayDocTitle, exportDocumentStructure, emfRenderSetting, customPropertiesExport, optimizationType, producer, pdfCompression, fontEncoding, watermark, calculateFormula, checkFontCompatibility, compliance, defaultFont, onePagePerSheet, printingPageType, securityOptions, desiredPPI, jpegQuality, imageType, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PdfSaveOptions {\n");
        sb.append("    displayDocTitle: ").append(displayDocTitle).append("\n");
        sb.append("    exportDocumentStructure: ").append(exportDocumentStructure).append("\n");
        sb.append("    emfRenderSetting: ").append(emfRenderSetting).append("\n");
        sb.append("    customPropertiesExport: ").append(customPropertiesExport).append("\n");
        sb.append("    optimizationType: ").append(optimizationType).append("\n");
        sb.append("    producer: ").append(producer).append("\n");
        sb.append("    pdfCompression: ").append(pdfCompression).append("\n");
        sb.append("    fontEncoding: ").append(fontEncoding).append("\n");
        sb.append("    watermark: ").append(watermark).append("\n");
        sb.append("    calculateFormula: ").append(calculateFormula).append("\n");
        sb.append("    checkFontCompatibility: ").append(checkFontCompatibility).append("\n");
        sb.append("    compliance: ").append(compliance).append("\n");
        sb.append("    defaultFont: ").append(defaultFont).append("\n");
        sb.append("    onePagePerSheet: ").append(onePagePerSheet).append("\n");
        sb.append("    printingPageType: ").append(printingPageType).append("\n");
        sb.append("    securityOptions: ").append(securityOptions).append("\n");
        sb.append("    desiredPPI: ").append(desiredPPI).append("\n");
        sb.append("    jpegQuality: ").append(jpegQuality).append("\n");
        sb.append("    imageType: ").append(imageType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
