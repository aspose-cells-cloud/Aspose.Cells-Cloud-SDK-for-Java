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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ImageSaveOptions extends SaveOptions {

    @SerializedName("ChartImageType")
    @JsonProperty("ChartImageType")
    private String chartImageType;

    public ImageSaveOptions chartImageType(String chartImageType) {
        this.chartImageType = chartImageType;
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
    @JsonProperty("EmbededImageNameInSvg")
    private String embededImageNameInSvg;

    public ImageSaveOptions embededImageNameInSvg(String embededImageNameInSvg) {
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

    @SerializedName("HorizontalResolution")
    @JsonProperty("HorizontalResolution")
    private Integer horizontalResolution;

    public ImageSaveOptions horizontalResolution(Integer horizontalResolution) {
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

    @SerializedName("ImageFormat")
    @JsonProperty("ImageFormat")
    private String imageFormat;

    public ImageSaveOptions imageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
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
    @JsonProperty("IsCellAutoFit")
    private Boolean isCellAutoFit;

    public ImageSaveOptions isCellAutoFit(Boolean isCellAutoFit) {
        this.isCellAutoFit = isCellAutoFit;
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
    @JsonProperty("OnePagePerSheet")
    private Boolean onePagePerSheet;

    public ImageSaveOptions onePagePerSheet(Boolean onePagePerSheet) {
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

    @SerializedName("OnlyArea")
    @JsonProperty("OnlyArea")
    private Boolean onlyArea;

    public ImageSaveOptions onlyArea(Boolean onlyArea) {
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

    @SerializedName("PrintingPage")
    @JsonProperty("PrintingPage")
    private String printingPage;

    public ImageSaveOptions printingPage(String printingPage) {
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

    @SerializedName("PrintWithStatusDialog")
    @JsonProperty("PrintWithStatusDialog")
    private Boolean printWithStatusDialog;

    public ImageSaveOptions printWithStatusDialog(Boolean printWithStatusDialog) {
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

    @SerializedName("Quality")
    @JsonProperty("Quality")
    private Integer quality;

    public ImageSaveOptions quality(Integer quality) {
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

    @SerializedName("TiffCompression")
    @JsonProperty("TiffCompression")
    private String tiffCompression;

    public ImageSaveOptions tiffCompression(String tiffCompression) {
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

    @SerializedName("VerticalResolution")
    @JsonProperty("VerticalResolution")
    private Integer verticalResolution;

    public ImageSaveOptions verticalResolution(Integer verticalResolution) {
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
        ImageSaveOptions other = (ImageSaveOptions) o;
        return Objects.equals(this.chartImageType, other.chartImageType)
            && Objects.equals(this.embededImageNameInSvg, other.embededImageNameInSvg)
            && Objects.equals(this.horizontalResolution, other.horizontalResolution)
            && Objects.equals(this.imageFormat, other.imageFormat)
            && Objects.equals(this.isCellAutoFit, other.isCellAutoFit)
            && Objects.equals(this.onePagePerSheet, other.onePagePerSheet)
            && Objects.equals(this.onlyArea, other.onlyArea)
            && Objects.equals(this.printingPage, other.printingPage)
            && Objects.equals(this.printWithStatusDialog, other.printWithStatusDialog)
            && Objects.equals(this.quality, other.quality)
            && Objects.equals(this.tiffCompression, other.tiffCompression)
            && Objects.equals(this.verticalResolution, other.verticalResolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chartImageType, embededImageNameInSvg, horizontalResolution, imageFormat, isCellAutoFit, onePagePerSheet, onlyArea, printingPage, printWithStatusDialog, quality, tiffCompression, verticalResolution, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageSaveOptions {\n");
        sb.append("    chartImageType: ").append(chartImageType).append("\n");
        sb.append("    embededImageNameInSvg: ").append(embededImageNameInSvg).append("\n");
        sb.append("    horizontalResolution: ").append(horizontalResolution).append("\n");
        sb.append("    imageFormat: ").append(imageFormat).append("\n");
        sb.append("    isCellAutoFit: ").append(isCellAutoFit).append("\n");
        sb.append("    onePagePerSheet: ").append(onePagePerSheet).append("\n");
        sb.append("    onlyArea: ").append(onlyArea).append("\n");
        sb.append("    printingPage: ").append(printingPage).append("\n");
        sb.append("    printWithStatusDialog: ").append(printWithStatusDialog).append("\n");
        sb.append("    quality: ").append(quality).append("\n");
        sb.append("    tiffCompression: ").append(tiffCompression).append("\n");
        sb.append("    verticalResolution: ").append(verticalResolution).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
