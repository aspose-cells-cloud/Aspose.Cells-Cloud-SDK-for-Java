/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SplitWorkbookTaskParameter.java">
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

public class SplitWorkbookTaskParameter extends TaskParameter {

    @SerializedName("Workbook")
    @JsonProperty("Workbook")
    private FileSource workbook;

    public SplitWorkbookTaskParameter workbook(FileSource workbook) {
        this.workbook = workbook;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileSource getWorkbook() {
        return workbook;
    }

    public void setWorkbook(FileSource workbook) {
        this.workbook = workbook;
    }

    @SerializedName("DestinationFilePosition")
    @JsonProperty("DestinationFilePosition")
    private FileSource destinationFilePosition;

    public SplitWorkbookTaskParameter destinationFilePosition(FileSource destinationFilePosition) {
        this.destinationFilePosition = destinationFilePosition;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileSource getDestinationFilePosition() {
        return destinationFilePosition;
    }

    public void setDestinationFilePosition(FileSource destinationFilePosition) {
        this.destinationFilePosition = destinationFilePosition;
    }

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public SplitWorkbookTaskParameter dataSource(DataSource dataSource) {
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

    @SerializedName("TargetDataSource")
    @JsonProperty("TargetDataSource")
    private DataSource targetDataSource;

    public SplitWorkbookTaskParameter targetDataSource(DataSource targetDataSource) {
        this.targetDataSource = targetDataSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataSource getTargetDataSource() {
        return targetDataSource;
    }

    public void setTargetDataSource(DataSource targetDataSource) {
        this.targetDataSource = targetDataSource;
    }

    @SerializedName("DestinationFileFormat")
    @JsonProperty("DestinationFileFormat")
    private String destinationFileFormat;

    public SplitWorkbookTaskParameter destinationFileFormat(String destinationFileFormat) {
        this.destinationFileFormat = destinationFileFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDestinationFileFormat() {
        return destinationFileFormat;
    }

    public void setDestinationFileFormat(String destinationFileFormat) {
        this.destinationFileFormat = destinationFileFormat;
    }

    @SerializedName("SplitNameRule")
    @JsonProperty("SplitNameRule")
    private String splitNameRule;

    public SplitWorkbookTaskParameter splitNameRule(String splitNameRule) {
        this.splitNameRule = splitNameRule;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSplitNameRule() {
        return splitNameRule;
    }

    public void setSplitNameRule(String splitNameRule) {
        this.splitNameRule = splitNameRule;
    }

    @SerializedName("VerticalResolution")
    @JsonProperty("VerticalResolution")
    private Integer verticalResolution;

    public SplitWorkbookTaskParameter verticalResolution(Integer verticalResolution) {
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

    @SerializedName("HorizontalResolution")
    @JsonProperty("HorizontalResolution")
    private Integer horizontalResolution;

    public SplitWorkbookTaskParameter horizontalResolution(Integer horizontalResolution) {
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
        SplitWorkbookTaskParameter other = (SplitWorkbookTaskParameter) o;
        return Objects.equals(this.workbook, other.workbook)
            && Objects.equals(this.destinationFilePosition, other.destinationFilePosition)
            && Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.targetDataSource, other.targetDataSource)
            && Objects.equals(this.destinationFileFormat, other.destinationFileFormat)
            && Objects.equals(this.splitNameRule, other.splitNameRule)
            && Objects.equals(this.verticalResolution, other.verticalResolution)
            && Objects.equals(this.horizontalResolution, other.horizontalResolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workbook, destinationFilePosition, dataSource, targetDataSource, destinationFileFormat, splitNameRule, verticalResolution, horizontalResolution, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SplitWorkbookTaskParameter {\n");
        sb.append("    workbook: ").append(workbook).append("\n");
        sb.append("    destinationFilePosition: ").append(destinationFilePosition).append("\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    targetDataSource: ").append(targetDataSource).append("\n");
        sb.append("    destinationFileFormat: ").append(destinationFileFormat).append("\n");
        sb.append("    splitNameRule: ").append(splitNameRule).append("\n");
        sb.append("    verticalResolution: ").append(verticalResolution).append("\n");
        sb.append("    horizontalResolution: ").append(horizontalResolution).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
