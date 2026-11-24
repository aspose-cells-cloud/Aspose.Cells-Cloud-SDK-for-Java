/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CombinationSourceData.java">
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

public class CombinationSourceData {

    @SerializedName("Tag")
    @JsonProperty("Tag")
    private String tag;

    public CombinationSourceData tag(String tag) {
        this.tag = tag;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public CombinationSourceData dataSource(DataSource dataSource) {
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

    public CombinationSourceData fileInfo(FileInfo fileInfo) {
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

    public CombinationSourceData worksheet(String worksheet) {
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

    @SerializedName("TableName")
    @JsonProperty("TableName")
    private String tableName;

    public CombinationSourceData tableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @SerializedName("CellArea")
    @JsonProperty("CellArea")
    private String cellArea;

    public CombinationSourceData cellArea(String cellArea) {
        this.cellArea = cellArea;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCellArea() {
        return cellArea;
    }

    public void setCellArea(String cellArea) {
        this.cellArea = cellArea;
    }

    @SerializedName("HasHeader")
    @JsonProperty("HasHeader")
    private Boolean hasHeader;

    public CombinationSourceData hasHeader(Boolean hasHeader) {
        this.hasHeader = hasHeader;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasHeader() {
        return hasHeader;
    }

    public void setHasHeader(Boolean hasHeader) {
        this.hasHeader = hasHeader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CombinationSourceData other = (CombinationSourceData) o;
        return Objects.equals(this.tag, other.tag)
            && Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.fileInfo, other.fileInfo)
            && Objects.equals(this.worksheet, other.worksheet)
            && Objects.equals(this.tableName, other.tableName)
            && Objects.equals(this.cellArea, other.cellArea)
            && Objects.equals(this.hasHeader, other.hasHeader);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tag, dataSource, fileInfo, worksheet, tableName, cellArea, hasHeader);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CombinationSourceData {\n");
        sb.append("    tag: ").append(tag).append("\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    fileInfo: ").append(fileInfo).append("\n");
        sb.append("    worksheet: ").append(worksheet).append("\n");
        sb.append("    tableName: ").append(tableName).append("\n");
        sb.append("    cellArea: ").append(cellArea).append("\n");
        sb.append("    hasHeader: ").append(hasHeader).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
