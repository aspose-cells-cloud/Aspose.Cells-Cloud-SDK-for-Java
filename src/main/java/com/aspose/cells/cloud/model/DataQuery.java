/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataQuery.java">
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

public class DataQuery {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public DataQuery name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("DataSourceDataType")
    @JsonProperty("DataSourceDataType")
    private String dataSourceDataType;

    public DataQuery dataSourceDataType(String dataSourceDataType) {
        this.dataSourceDataType = dataSourceDataType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataSourceDataType() {
        return dataSourceDataType;
    }

    public void setDataSourceDataType(String dataSourceDataType) {
        this.dataSourceDataType = dataSourceDataType;
    }

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public DataQuery dataSource(DataSource dataSource) {
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

    public DataQuery fileInfo(FileInfo fileInfo) {
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

    @SerializedName("DataItem")
    @JsonProperty("DataItem")
    private DataItem dataItem;

    public DataQuery dataItem(DataItem dataItem) {
        this.dataItem = dataItem;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataItem getDataItem() {
        return dataItem;
    }

    public void setDataItem(DataItem dataItem) {
        this.dataItem = dataItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataQuery other = (DataQuery) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.dataSourceDataType, other.dataSourceDataType)
            && Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.fileInfo, other.fileInfo)
            && Objects.equals(this.dataItem, other.dataItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataSourceDataType, dataSource, fileInfo, dataItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataQuery {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    dataSourceDataType: ").append(dataSourceDataType).append("\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    fileInfo: ").append(fileInfo).append("\n");
        sb.append("    dataItem: ").append(dataItem).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
