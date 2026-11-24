/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataTransformationRequest.java">
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

public class DataTransformationRequest {

    @SerializedName("FileInfo")
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    public DataTransformationRequest fileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public DataTransformationRequest dataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @SerializedName("LoadData")
    @JsonProperty("LoadData")
    private LoadData loadData;

    public DataTransformationRequest loadData(LoadData loadData) {
        this.loadData = loadData;
        return this;
    }

    @ApiModelProperty(value = "")
    public LoadData getLoadData() {
        return loadData;
    }

    public void setLoadData(LoadData loadData) {
        this.loadData = loadData;
    }

    @SerializedName("AppliedSteps")
    @JsonProperty("AppliedSteps")
    private List<AppliedStep> appliedSteps;

    public DataTransformationRequest appliedSteps(List<AppliedStep> appliedSteps) {
        this.appliedSteps = appliedSteps;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<AppliedStep> getAppliedSteps() {
        return appliedSteps;
    }

    public void setAppliedSteps(List<AppliedStep> appliedSteps) {
        this.appliedSteps = appliedSteps;
    }

    @SerializedName("Region")
    @JsonProperty("Region")
    private String region;

    public DataTransformationRequest region(String region) {
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

    @SerializedName("OutFormat")
    @JsonProperty("OutFormat")
    private String outFormat;

    public DataTransformationRequest outFormat(String outFormat) {
        this.outFormat = outFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOutFormat() {
        return outFormat;
    }

    public void setOutFormat(String outFormat) {
        this.outFormat = outFormat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataTransformationRequest other = (DataTransformationRequest) o;
        return Objects.equals(this.fileInfo, other.fileInfo)
            && Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.loadData, other.loadData)
            && Objects.equals(this.appliedSteps, other.appliedSteps)
            && Objects.equals(this.region, other.region)
            && Objects.equals(this.outFormat, other.outFormat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileInfo, dataSource, loadData, appliedSteps, region, outFormat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataTransformationRequest {\n");
        sb.append("    fileInfo: ").append(fileInfo).append("\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    loadData: ").append(loadData).append("\n");
        sb.append("    appliedSteps: ").append(appliedSteps).append("\n");
        sb.append("    region: ").append(region).append("\n");
        sb.append("    outFormat: ").append(outFormat).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
