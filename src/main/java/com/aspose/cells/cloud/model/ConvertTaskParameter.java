/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertTaskParameter.java">
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

public class ConvertTaskParameter extends TaskParameter {

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public ConvertTaskParameter dataSource(DataSource dataSource) {
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

    @SerializedName("Workbook")
    @JsonProperty("Workbook")
    private FileSource workbook;

    public ConvertTaskParameter workbook(FileSource workbook) {
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

    @SerializedName("DestinationFile")
    @JsonProperty("DestinationFile")
    private String destinationFile;

    public ConvertTaskParameter destinationFile(String destinationFile) {
        this.destinationFile = destinationFile;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDestinationFile() {
        return destinationFile;
    }

    public void setDestinationFile(String destinationFile) {
        this.destinationFile = destinationFile;
    }

    @SerializedName("Region")
    @JsonProperty("Region")
    private String region;

    public ConvertTaskParameter region(String region) {
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

    @SerializedName("SaveOptions")
    @JsonProperty("SaveOptions")
    private SaveOptions saveOptions;

    public ConvertTaskParameter saveOptions(SaveOptions saveOptions) {
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
        if (!super.equals(o)) {
            return false;
        }
        ConvertTaskParameter other = (ConvertTaskParameter) o;
        return Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.workbook, other.workbook)
            && Objects.equals(this.destinationFile, other.destinationFile)
            && Objects.equals(this.region, other.region)
            && Objects.equals(this.saveOptions, other.saveOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSource, workbook, destinationFile, region, saveOptions, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertTaskParameter {\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    workbook: ").append(workbook).append("\n");
        sb.append("    destinationFile: ").append(destinationFile).append("\n");
        sb.append("    region: ").append(region).append("\n");
        sb.append("    saveOptions: ").append(saveOptions).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
