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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ImageOrPrintOptions {

    @SerializedName("TextCrossType")
    @JsonProperty("TextCrossType")
    private String textCrossType;

    public ImageOrPrintOptions textCrossType(String textCrossType) {
        this.textCrossType = textCrossType;
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
    @JsonProperty("GridlineType")
    private String gridlineType;

    public ImageOrPrintOptions gridlineType(String gridlineType) {
        this.gridlineType = gridlineType;
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
    @JsonProperty("OutputBlankPageWhenNothingToPrint")
    private Boolean outputBlankPageWhenNothingToPrint;

    public ImageOrPrintOptions outputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) {
        this.outputBlankPageWhenNothingToPrint = outputBlankPageWhenNothingToPrint;
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
    @JsonProperty("CheckWorkbookDefaultFont")
    private Boolean checkWorkbookDefaultFont;

    public ImageOrPrintOptions checkWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) {
        this.checkWorkbookDefaultFont = checkWorkbookDefaultFont;
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
    @JsonProperty("DefaultFont")
    private String defaultFont;

    public ImageOrPrintOptions defaultFont(String defaultFont) {
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

    @SerializedName("IsOptimized")
    @JsonProperty("IsOptimized")
    private Boolean isOptimized;

    public ImageOrPrintOptions isOptimized(Boolean isOptimized) {
        this.isOptimized = isOptimized;
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
    @JsonProperty("PageCount")
    private Integer pageCount;

    public ImageOrPrintOptions pageCount(Integer pageCount) {
        this.pageCount = pageCount;
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
    @JsonProperty("PageIndex")
    private Integer pageIndex;

    public ImageOrPrintOptions pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
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
    @JsonProperty("IsFontSubstitutionCharGranularity")
    private Boolean isFontSubstitutionCharGranularity;

    public ImageOrPrintOptions isFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) {
        this.isFontSubstitutionCharGranularity = isFontSubstitutionCharGranularity;
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
    @JsonProperty("Transparent")
    private Boolean transparent;

    public ImageOrPrintOptions transparent(Boolean transparent) {
        this.transparent = transparent;
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
    @JsonProperty("OnlyArea")
    private Boolean onlyArea;

    public ImageOrPrintOptions onlyArea(Boolean onlyArea) {
        this.onlyArea = onlyArea;
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
    @JsonProperty("SVGFitToViewPort")
    private Boolean sVGFitToViewPort;

    public ImageOrPrintOptions sVGFitToViewPort(Boolean sVGFitToViewPort) {
        this.sVGFitToViewPort = sVGFitToViewPort;
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
    @JsonProperty("EmbededImageNameInSvg")
    private String embededImageNameInSvg;

    public ImageOrPrintOptions embededImageNameInSvg(String embededImageNameInSvg) {
        this.embededImageNameInSvg = embededImageNameInSvg;
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
    @JsonProperty("AllColumnsInOnePagePerSheet")
    private Boolean allColumnsInOnePagePerSheet;

    public ImageOrPrintOptions allColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) {
        this.allColumnsInOnePagePerSheet = allColumnsInOnePagePerSheet;
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
    @JsonProperty("PrintWithStatusDialog")
    private Boolean printWithStatusDialog;

    public ImageOrPrintOptions printWithStatusDialog(Boolean printWithStatusDialog) {
        this.printWithStatusDialog = printWithStatusDialog;
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
    @JsonProperty("HorizontalResolution")
    private Integer horizontalResolution;

    public ImageOrPrintOptions horizontalResolution(Integer horizontalResolution) {
        this.horizontalResolution = horizontalResolution;
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
    @JsonProperty("VerticalResolution")
    private Integer verticalResolution;

    public ImageOrPrintOptions verticalResolution(Integer verticalResolution) {
        this.verticalResolution = verticalResolution;
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
    @JsonProperty("DefaultEditLanguage")
    private String defaultEditLanguage;

    public ImageOrPrintOptions defaultEditLanguage(String defaultEditLanguage) {
        this.defaultEditLanguage = defaultEditLanguage;
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
    @JsonProperty("TiffColorDepth")
    private String tiffColorDepth;

    public ImageOrPrintOptions tiffColorDepth(String tiffColorDepth) {
        this.tiffColorDepth = tiffColorDepth;
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
    @JsonProperty("TiffCompression")
    private String tiffCompression;

    public ImageOrPrintOptions tiffCompression(String tiffCompression) {
        this.tiffCompression = tiffCompression;
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
    @JsonProperty("PrintingPage")
    private String printingPage;

    public ImageOrPrintOptions printingPage(String printingPage) {
        this.printingPage = printingPage;
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
    @JsonProperty("Quality")
    private Integer quality;

    public ImageOrPrintOptions quality(Integer quality) {
        this.quality = quality;
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
    @JsonProperty("ImageType")
    private String imageType;

    public ImageOrPrintOptions imageType(String imageType) {
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

    @SerializedName("OnePagePerSheet")
    @JsonProperty("OnePagePerSheet")
    private Boolean onePagePerSheet;

    public ImageOrPrintOptions onePagePerSheet(Boolean onePagePerSheet) {
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

    @SerializedName("TiffBinarizationMethod")
    @JsonProperty("TiffBinarizationMethod")
    private String tiffBinarizationMethod;

    public ImageOrPrintOptions tiffBinarizationMethod(String tiffBinarizationMethod) {
        this.tiffBinarizationMethod = tiffBinarizationMethod;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImageOrPrintOptions other = (ImageOrPrintOptions) o;
        return Objects.equals(this.textCrossType, other.textCrossType)
            && Objects.equals(this.gridlineType, other.gridlineType)
            && Objects.equals(this.outputBlankPageWhenNothingToPrint, other.outputBlankPageWhenNothingToPrint)
            && Objects.equals(this.checkWorkbookDefaultFont, other.checkWorkbookDefaultFont)
            && Objects.equals(this.defaultFont, other.defaultFont)
            && Objects.equals(this.isOptimized, other.isOptimized)
            && Objects.equals(this.pageCount, other.pageCount)
            && Objects.equals(this.pageIndex, other.pageIndex)
            && Objects.equals(this.isFontSubstitutionCharGranularity, other.isFontSubstitutionCharGranularity)
            && Objects.equals(this.transparent, other.transparent)
            && Objects.equals(this.onlyArea, other.onlyArea)
            && Objects.equals(this.sVGFitToViewPort, other.sVGFitToViewPort)
            && Objects.equals(this.embededImageNameInSvg, other.embededImageNameInSvg)
            && Objects.equals(this.allColumnsInOnePagePerSheet, other.allColumnsInOnePagePerSheet)
            && Objects.equals(this.printWithStatusDialog, other.printWithStatusDialog)
            && Objects.equals(this.horizontalResolution, other.horizontalResolution)
            && Objects.equals(this.verticalResolution, other.verticalResolution)
            && Objects.equals(this.defaultEditLanguage, other.defaultEditLanguage)
            && Objects.equals(this.tiffColorDepth, other.tiffColorDepth)
            && Objects.equals(this.tiffCompression, other.tiffCompression)
            && Objects.equals(this.printingPage, other.printingPage)
            && Objects.equals(this.quality, other.quality)
            && Objects.equals(this.imageType, other.imageType)
            && Objects.equals(this.onePagePerSheet, other.onePagePerSheet)
            && Objects.equals(this.tiffBinarizationMethod, other.tiffBinarizationMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(textCrossType, gridlineType, outputBlankPageWhenNothingToPrint, checkWorkbookDefaultFont, defaultFont, isOptimized, pageCount, pageIndex, isFontSubstitutionCharGranularity, transparent, onlyArea, sVGFitToViewPort, embededImageNameInSvg, allColumnsInOnePagePerSheet, printWithStatusDialog, horizontalResolution, verticalResolution, defaultEditLanguage, tiffColorDepth, tiffCompression, printingPage, quality, imageType, onePagePerSheet, tiffBinarizationMethod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageOrPrintOptions {\n");
        sb.append("    textCrossType: ").append(textCrossType).append("\n");
        sb.append("    gridlineType: ").append(gridlineType).append("\n");
        sb.append("    outputBlankPageWhenNothingToPrint: ").append(outputBlankPageWhenNothingToPrint).append("\n");
        sb.append("    checkWorkbookDefaultFont: ").append(checkWorkbookDefaultFont).append("\n");
        sb.append("    defaultFont: ").append(defaultFont).append("\n");
        sb.append("    isOptimized: ").append(isOptimized).append("\n");
        sb.append("    pageCount: ").append(pageCount).append("\n");
        sb.append("    pageIndex: ").append(pageIndex).append("\n");
        sb.append("    isFontSubstitutionCharGranularity: ").append(isFontSubstitutionCharGranularity).append("\n");
        sb.append("    transparent: ").append(transparent).append("\n");
        sb.append("    onlyArea: ").append(onlyArea).append("\n");
        sb.append("    sVGFitToViewPort: ").append(sVGFitToViewPort).append("\n");
        sb.append("    embededImageNameInSvg: ").append(embededImageNameInSvg).append("\n");
        sb.append("    allColumnsInOnePagePerSheet: ").append(allColumnsInOnePagePerSheet).append("\n");
        sb.append("    printWithStatusDialog: ").append(printWithStatusDialog).append("\n");
        sb.append("    horizontalResolution: ").append(horizontalResolution).append("\n");
        sb.append("    verticalResolution: ").append(verticalResolution).append("\n");
        sb.append("    defaultEditLanguage: ").append(defaultEditLanguage).append("\n");
        sb.append("    tiffColorDepth: ").append(tiffColorDepth).append("\n");
        sb.append("    tiffCompression: ").append(tiffCompression).append("\n");
        sb.append("    printingPage: ").append(printingPage).append("\n");
        sb.append("    quality: ").append(quality).append("\n");
        sb.append("    imageType: ").append(imageType).append("\n");
        sb.append("    onePagePerSheet: ").append(onePagePerSheet).append("\n");
        sb.append("    tiffBinarizationMethod: ").append(tiffBinarizationMethod).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
