/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataOutputLocation.java">
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

public class DataOutputLocation {

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public DataOutputLocation dataSource(DataSource dataSource) {
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

    @SerializedName("FileInfo")
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    public DataOutputLocation fileInfo(FileInfo fileInfo) {
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

    @SerializedName("Worksheet")
    @JsonProperty("Worksheet")
    private String worksheet;

    public DataOutputLocation worksheet(String worksheet) {
        this.worksheet = worksheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getWorksheet() {
        return worksheet;
    }

    public void setWorksheet(String worksheet) {
        this.worksheet = worksheet;
    }

    @SerializedName("BeginRowIndex")
    @JsonProperty("BeginRowIndex")
    private Integer beginRowIndex;

    public DataOutputLocation beginRowIndex(Integer beginRowIndex) {
        this.beginRowIndex = beginRowIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getBeginRowIndex() {
        return beginRowIndex;
    }

    public void setBeginRowIndex(Integer beginRowIndex) {
        this.beginRowIndex = beginRowIndex;
    }

    @SerializedName("BeginColumnIndex")
    @JsonProperty("BeginColumnIndex")
    private Integer beginColumnIndex;

    public DataOutputLocation beginColumnIndex(Integer beginColumnIndex) {
        this.beginColumnIndex = beginColumnIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getBeginColumnIndex() {
        return beginColumnIndex;
    }

    public void setBeginColumnIndex(Integer beginColumnIndex) {
        this.beginColumnIndex = beginColumnIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataOutputLocation other = (DataOutputLocation) o;
        return Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.fileInfo, other.fileInfo)
            && Objects.equals(this.worksheet, other.worksheet)
            && Objects.equals(this.beginRowIndex, other.beginRowIndex)
            && Objects.equals(this.beginColumnIndex, other.beginColumnIndex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSource, fileInfo, worksheet, beginRowIndex, beginColumnIndex);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataOutputLocation {\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    fileInfo: ").append(fileInfo).append("\n");
        sb.append("    worksheet: ").append(worksheet).append("\n");
        sb.append("    beginRowIndex: ").append(beginRowIndex).append("\n");
        sb.append("    beginColumnIndex: ").append(beginColumnIndex).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
