/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportDataTaskParameter.java">
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

public class ImportDataTaskParameter extends TaskParameter {

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public ImportDataTaskParameter dataSource(DataSource dataSource) {
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

    public ImportDataTaskParameter workbook(FileSource workbook) {
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

    @SerializedName("ImportOption")
    @JsonProperty("ImportOption")
    private ImportOption importOption;

    public ImportDataTaskParameter importOption(ImportOption importOption) {
        this.importOption = importOption;
        return this;
    }

    @ApiModelProperty(value = "")
    public ImportOption getImportOption() {
        return importOption;
    }

    public void setImportOption(ImportOption importOption) {
        this.importOption = importOption;
    }

    @SerializedName("TargetDataSource")
    @JsonProperty("TargetDataSource")
    private DataSource targetDataSource;

    public ImportDataTaskParameter targetDataSource(DataSource targetDataSource) {
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

    @SerializedName("DestinationWorkbook")
    @JsonProperty("DestinationWorkbook")
    private FileSource destinationWorkbook;

    public ImportDataTaskParameter destinationWorkbook(FileSource destinationWorkbook) {
        this.destinationWorkbook = destinationWorkbook;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileSource getDestinationWorkbook() {
        return destinationWorkbook;
    }

    public void setDestinationWorkbook(FileSource destinationWorkbook) {
        this.destinationWorkbook = destinationWorkbook;
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
        ImportDataTaskParameter other = (ImportDataTaskParameter) o;
        return Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.workbook, other.workbook)
            && Objects.equals(this.importOption, other.importOption)
            && Objects.equals(this.targetDataSource, other.targetDataSource)
            && Objects.equals(this.destinationWorkbook, other.destinationWorkbook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSource, workbook, importOption, targetDataSource, destinationWorkbook, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportDataTaskParameter {\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    workbook: ").append(workbook).append("\n");
        sb.append("    importOption: ").append(importOption).append("\n");
        sb.append("    targetDataSource: ").append(targetDataSource).append("\n");
        sb.append("    destinationWorkbook: ").append(destinationWorkbook).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
