/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportOption.java">
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

public class ImportOption {

    @SerializedName("DestinationWorksheet")
    @JsonProperty("DestinationWorksheet")
    private String destinationWorksheet;

    public ImportOption destinationWorksheet(String destinationWorksheet) {
        this.destinationWorksheet = destinationWorksheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDestinationWorksheet() {
        return destinationWorksheet;
    }

    public void setDestinationWorksheet(String destinationWorksheet) {
        this.destinationWorksheet = destinationWorksheet;
    }

    @SerializedName("IsInsert")
    @JsonProperty("IsInsert")
    private Boolean isInsert;

    public ImportOption isInsert(Boolean isInsert) {
        this.isInsert = isInsert;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsInsert() {
        return isInsert;
    }

    public void setIsInsert(Boolean isInsert) {
        this.isInsert = isInsert;
    }

    @SerializedName("ImportDataType")
    @JsonProperty("ImportDataType")
    private String importDataType;

    public ImportOption importDataType(String importDataType) {
        this.importDataType = importDataType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getImportDataType() {
        return importDataType;
    }

    public void setImportDataType(String importDataType) {
        this.importDataType = importDataType;
    }

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public ImportOption dataSource(DataSource dataSource) {
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

    @SerializedName("Source")
    @JsonProperty("Source")
    private FileSource source;

    public ImportOption source(FileSource source) {
        this.source = source;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileSource getSource() {
        return source;
    }

    public void setSource(FileSource source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportOption other = (ImportOption) o;
        return Objects.equals(this.destinationWorksheet, other.destinationWorksheet)
            && Objects.equals(this.isInsert, other.isInsert)
            && Objects.equals(this.importDataType, other.importDataType)
            && Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.source, other.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destinationWorksheet, isInsert, importDataType, dataSource, source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportOption {\n");
        sb.append("    destinationWorksheet: ").append(destinationWorksheet).append("\n");
        sb.append("    isInsert: ").append(isInsert).append("\n");
        sb.append("    importDataType: ").append(importDataType).append("\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    source: ").append(source).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
