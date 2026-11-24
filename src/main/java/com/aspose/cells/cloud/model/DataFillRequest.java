/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataFillRequest.java">
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

public class DataFillRequest {

    @SerializedName("File")
    @JsonProperty("File")
    private FileInfo file;

    public DataFillRequest file(FileInfo file) {
        this.file = file;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileInfo getFile() {
        return file;
    }

    public void setFile(FileInfo file) {
        this.file = file;
    }

    @SerializedName("OutFileFormat")
    @JsonProperty("OutFileFormat")
    private String outFileFormat;

    public DataFillRequest outFileFormat(String outFileFormat) {
        this.outFileFormat = outFileFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOutFileFormat() {
        return outFileFormat;
    }

    public void setOutFileFormat(String outFileFormat) {
        this.outFileFormat = outFileFormat;
    }

    @SerializedName("CheckExcelRestriction")
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    public DataFillRequest checkExcelRestriction(Boolean checkExcelRestriction) {
        this.checkExcelRestriction = checkExcelRestriction;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckExcelRestriction() {
        return checkExcelRestriction;
    }

    public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
        this.checkExcelRestriction = checkExcelRestriction;
    }

    @SerializedName("Region")
    @JsonProperty("Region")
    private String region;

    public DataFillRequest region(String region) {
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

    @SerializedName("DataFill")
    @JsonProperty("DataFill")
    private DataFill dataFill;

    public DataFillRequest dataFill(DataFill dataFill) {
        this.dataFill = dataFill;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataFill getDataFill() {
        return dataFill;
    }

    public void setDataFill(DataFill dataFill) {
        this.dataFill = dataFill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataFillRequest other = (DataFillRequest) o;
        return Objects.equals(this.file, other.file)
            && Objects.equals(this.outFileFormat, other.outFileFormat)
            && Objects.equals(this.checkExcelRestriction, other.checkExcelRestriction)
            && Objects.equals(this.region, other.region)
            && Objects.equals(this.dataFill, other.dataFill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(file, outFileFormat, checkExcelRestriction, region, dataFill);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFillRequest {\n");
        sb.append("    file: ").append(file).append("\n");
        sb.append("    outFileFormat: ").append(outFileFormat).append("\n");
        sb.append("    checkExcelRestriction: ").append(checkExcelRestriction).append("\n");
        sb.append("    region: ").append(region).append("\n");
        sb.append("    dataFill: ").append(dataFill).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
