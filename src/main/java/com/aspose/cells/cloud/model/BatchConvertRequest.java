/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BatchConvertRequest.java">
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

public class BatchConvertRequest {

    @SerializedName("SourceFolder")
    @JsonProperty("SourceFolder")
    private String sourceFolder;

    public BatchConvertRequest sourceFolder(String sourceFolder) {
        this.sourceFolder = sourceFolder;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSourceFolder() {
        return sourceFolder;
    }

    public void setSourceFolder(String sourceFolder) {
        this.sourceFolder = sourceFolder;
    }

    @SerializedName("SourceStorage")
    @JsonProperty("SourceStorage")
    private String sourceStorage;

    public BatchConvertRequest sourceStorage(String sourceStorage) {
        this.sourceStorage = sourceStorage;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSourceStorage() {
        return sourceStorage;
    }

    public void setSourceStorage(String sourceStorage) {
        this.sourceStorage = sourceStorage;
    }

    @SerializedName("MatchCondition")
    @JsonProperty("MatchCondition")
    private MatchConditionRequest matchCondition;

    public BatchConvertRequest matchCondition(MatchConditionRequest matchCondition) {
        this.matchCondition = matchCondition;
        return this;
    }

    @ApiModelProperty(value = "")
    public MatchConditionRequest getMatchCondition() {
        return matchCondition;
    }

    public void setMatchCondition(MatchConditionRequest matchCondition) {
        this.matchCondition = matchCondition;
    }

    @SerializedName("Format")
    @JsonProperty("Format")
    private String format;

    public BatchConvertRequest format(String format) {
        this.format = format;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @SerializedName("OutFolder")
    @JsonProperty("OutFolder")
    private String outFolder;

    public BatchConvertRequest outFolder(String outFolder) {
        this.outFolder = outFolder;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOutFolder() {
        return outFolder;
    }

    public void setOutFolder(String outFolder) {
        this.outFolder = outFolder;
    }

    @SerializedName("OutStorage")
    @JsonProperty("OutStorage")
    private String outStorage;

    public BatchConvertRequest outStorage(String outStorage) {
        this.outStorage = outStorage;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOutStorage() {
        return outStorage;
    }

    public void setOutStorage(String outStorage) {
        this.outStorage = outStorage;
    }

    @SerializedName("Region")
    @JsonProperty("Region")
    private String region;

    public BatchConvertRequest region(String region) {
        this.region = region;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @SerializedName("PageWideFitOnPerSheet")
    @JsonProperty("PageWideFitOnPerSheet")
    private Boolean pageWideFitOnPerSheet;

    public BatchConvertRequest pageWideFitOnPerSheet(Boolean pageWideFitOnPerSheet) {
        this.pageWideFitOnPerSheet = pageWideFitOnPerSheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getPageWideFitOnPerSheet() {
        return pageWideFitOnPerSheet;
    }

    public void setPageWideFitOnPerSheet(Boolean pageWideFitOnPerSheet) {
        this.pageWideFitOnPerSheet = pageWideFitOnPerSheet;
    }

    @SerializedName("PageTallFitOnPerSheet")
    @JsonProperty("PageTallFitOnPerSheet")
    private Boolean pageTallFitOnPerSheet;

    public BatchConvertRequest pageTallFitOnPerSheet(Boolean pageTallFitOnPerSheet) {
        this.pageTallFitOnPerSheet = pageTallFitOnPerSheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getPageTallFitOnPerSheet() {
        return pageTallFitOnPerSheet;
    }

    public void setPageTallFitOnPerSheet(Boolean pageTallFitOnPerSheet) {
        this.pageTallFitOnPerSheet = pageTallFitOnPerSheet;
    }

    @SerializedName("SaveOptions")
    @JsonProperty("SaveOptions")
    private SaveOptions saveOptions;

    public BatchConvertRequest saveOptions(SaveOptions saveOptions) {
        this.saveOptions = saveOptions;
        return this;
    }

    @ApiModelProperty(value = "")
    public SaveOptions getSaveOptions() {
        return saveOptions;
    }

    public void setSaveOptions(SaveOptions saveOptions) {
        this.saveOptions = saveOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchConvertRequest other = (BatchConvertRequest) o;
        return Objects.equals(this.sourceFolder, other.sourceFolder)
            && Objects.equals(this.sourceStorage, other.sourceStorage)
            && Objects.equals(this.matchCondition, other.matchCondition)
            && Objects.equals(this.format, other.format)
            && Objects.equals(this.outFolder, other.outFolder)
            && Objects.equals(this.outStorage, other.outStorage)
            && Objects.equals(this.region, other.region)
            && Objects.equals(this.pageWideFitOnPerSheet, other.pageWideFitOnPerSheet)
            && Objects.equals(this.pageTallFitOnPerSheet, other.pageTallFitOnPerSheet)
            && Objects.equals(this.saveOptions, other.saveOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceFolder, sourceStorage, matchCondition, format, outFolder, outStorage, region, pageWideFitOnPerSheet, pageTallFitOnPerSheet, saveOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchConvertRequest {\n");
        sb.append("    sourceFolder: ").append(sourceFolder).append("\n");
        sb.append("    sourceStorage: ").append(sourceStorage).append("\n");
        sb.append("    matchCondition: ").append(matchCondition).append("\n");
        sb.append("    format: ").append(format).append("\n");
        sb.append("    outFolder: ").append(outFolder).append("\n");
        sb.append("    outStorage: ").append(outStorage).append("\n");
        sb.append("    region: ").append(region).append("\n");
        sb.append("    pageWideFitOnPerSheet: ").append(pageWideFitOnPerSheet).append("\n");
        sb.append("    pageTallFitOnPerSheet: ").append(pageTallFitOnPerSheet).append("\n");
        sb.append("    saveOptions: ").append(saveOptions).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
