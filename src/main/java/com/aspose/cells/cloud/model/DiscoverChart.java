/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DiscoverChart.java">
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

public class DiscoverChart {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public DiscoverChart name(String name) {
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

    @SerializedName("SheetName")
    @JsonProperty("SheetName")
    private String sheetName;

    public DiscoverChart sheetName(String sheetName) {
        this.sheetName = sheetName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSheetName() {
        return sheetName;
    }

    public void setSheetName(String sheetName) {
        this.sheetName = sheetName;
    }

    @SerializedName("Title")
    @JsonProperty("Title")
    private String title;

    public DiscoverChart title(String title) {
        this.title = title;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public DiscoverChart type(String type) {
        this.type = type;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @SerializedName("DataRange")
    @JsonProperty("DataRange")
    private String dataRange;

    public DiscoverChart dataRange(String dataRange) {
        this.dataRange = dataRange;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataRange() {
        return dataRange;
    }

    public void setDataRange(String dataRange) {
        this.dataRange = dataRange;
    }

    @SerializedName("Thumbnail")
    @JsonProperty("Thumbnail")
    private String thumbnail;

    public DiscoverChart thumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscoverChart other = (DiscoverChart) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.sheetName, other.sheetName)
            && Objects.equals(this.title, other.title)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.dataRange, other.dataRange)
            && Objects.equals(this.thumbnail, other.thumbnail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sheetName, title, type, dataRange, thumbnail);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscoverChart {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    sheetName: ").append(sheetName).append("\n");
        sb.append("    title: ").append(title).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    dataRange: ").append(dataRange).append("\n");
        sb.append("    thumbnail: ").append(thumbnail).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
