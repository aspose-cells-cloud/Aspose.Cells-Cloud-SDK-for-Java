/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AutoFitterOptions.java">
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

public class AutoFitterOptions {

    @SerializedName("AutoFitMergedCellsType")
    @JsonProperty("AutoFitMergedCellsType")
    private String autoFitMergedCellsType;

    public AutoFitterOptions autoFitMergedCellsType(String autoFitMergedCellsType) {
        this.autoFitMergedCellsType = autoFitMergedCellsType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAutoFitMergedCellsType() {
        return autoFitMergedCellsType;
    }

    public void setAutoFitMergedCellsType(String autoFitMergedCellsType) {
        this.autoFitMergedCellsType = autoFitMergedCellsType;
    }

    @SerializedName("IgnoreHidden")
    @JsonProperty("IgnoreHidden")
    private Boolean ignoreHidden;

    public AutoFitterOptions ignoreHidden(Boolean ignoreHidden) {
        this.ignoreHidden = ignoreHidden;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIgnoreHidden() {
        return ignoreHidden;
    }

    public void setIgnoreHidden(Boolean ignoreHidden) {
        this.ignoreHidden = ignoreHidden;
    }

    @SerializedName("OnlyAuto")
    @JsonProperty("OnlyAuto")
    private Boolean onlyAuto;

    public AutoFitterOptions onlyAuto(Boolean onlyAuto) {
        this.onlyAuto = onlyAuto;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getOnlyAuto() {
        return onlyAuto;
    }

    public void setOnlyAuto(Boolean onlyAuto) {
        this.onlyAuto = onlyAuto;
    }

    @SerializedName("DefaultEditLanguage")
    @JsonProperty("DefaultEditLanguage")
    private String defaultEditLanguage;

    public AutoFitterOptions defaultEditLanguage(String defaultEditLanguage) {
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

    @SerializedName("MaxRowHeight")
    @JsonProperty("MaxRowHeight")
    private Double maxRowHeight;

    public AutoFitterOptions maxRowHeight(Double maxRowHeight) {
        this.maxRowHeight = maxRowHeight;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getMaxRowHeight() {
        return maxRowHeight;
    }

    public void setMaxRowHeight(Double maxRowHeight) {
        this.maxRowHeight = maxRowHeight;
    }

    @SerializedName("AutoFitWrappedTextType")
    @JsonProperty("AutoFitWrappedTextType")
    private String autoFitWrappedTextType;

    public AutoFitterOptions autoFitWrappedTextType(String autoFitWrappedTextType) {
        this.autoFitWrappedTextType = autoFitWrappedTextType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAutoFitWrappedTextType() {
        return autoFitWrappedTextType;
    }

    public void setAutoFitWrappedTextType(String autoFitWrappedTextType) {
        this.autoFitWrappedTextType = autoFitWrappedTextType;
    }

    @SerializedName("FormatStrategy")
    @JsonProperty("FormatStrategy")
    private String formatStrategy;

    public AutoFitterOptions formatStrategy(String formatStrategy) {
        this.formatStrategy = formatStrategy;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormatStrategy() {
        return formatStrategy;
    }

    public void setFormatStrategy(String formatStrategy) {
        this.formatStrategy = formatStrategy;
    }

    @SerializedName("ForRendering")
    @JsonProperty("ForRendering")
    private Boolean forRendering;

    public AutoFitterOptions forRendering(Boolean forRendering) {
        this.forRendering = forRendering;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getForRendering() {
        return forRendering;
    }

    public void setForRendering(Boolean forRendering) {
        this.forRendering = forRendering;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoFitterOptions other = (AutoFitterOptions) o;
        return Objects.equals(this.autoFitMergedCellsType, other.autoFitMergedCellsType)
            && Objects.equals(this.ignoreHidden, other.ignoreHidden)
            && Objects.equals(this.onlyAuto, other.onlyAuto)
            && Objects.equals(this.defaultEditLanguage, other.defaultEditLanguage)
            && Objects.equals(this.maxRowHeight, other.maxRowHeight)
            && Objects.equals(this.autoFitWrappedTextType, other.autoFitWrappedTextType)
            && Objects.equals(this.formatStrategy, other.formatStrategy)
            && Objects.equals(this.forRendering, other.forRendering);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoFitMergedCellsType, ignoreHidden, onlyAuto, defaultEditLanguage, maxRowHeight, autoFitWrappedTextType, formatStrategy, forRendering);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoFitterOptions {\n");
        sb.append("    autoFitMergedCellsType: ").append(autoFitMergedCellsType).append("\n");
        sb.append("    ignoreHidden: ").append(ignoreHidden).append("\n");
        sb.append("    onlyAuto: ").append(onlyAuto).append("\n");
        sb.append("    defaultEditLanguage: ").append(defaultEditLanguage).append("\n");
        sb.append("    maxRowHeight: ").append(maxRowHeight).append("\n");
        sb.append("    autoFitWrappedTextType: ").append(autoFitWrappedTextType).append("\n");
        sb.append("    formatStrategy: ").append(formatStrategy).append("\n");
        sb.append("    forRendering: ").append(forRendering).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
