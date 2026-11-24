/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SpecifyCellsObject.java">
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

public class SpecifyCellsObject {

    @SerializedName("WorksheetName")
    @JsonProperty("WorksheetName")
    private String worksheetName;

    public SpecifyCellsObject worksheetName(String worksheetName) {
        this.worksheetName = worksheetName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getWorksheetName() {
        return worksheetName;
    }

    public void setWorksheetName(String worksheetName) {
        this.worksheetName = worksheetName;
    }

    @SerializedName("PageIndex")
    @JsonProperty("PageIndex")
    private Integer pageIndex;

    public SpecifyCellsObject pageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    @SerializedName("Region")
    @JsonProperty("Region")
    private String region;

    public SpecifyCellsObject region(String region) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpecifyCellsObject other = (SpecifyCellsObject) o;
        return Objects.equals(this.worksheetName, other.worksheetName)
            && Objects.equals(this.pageIndex, other.pageIndex)
            && Objects.equals(this.region, other.region);
    }

    @Override
    public int hashCode() {
        return Objects.hash(worksheetName, pageIndex, region);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecifyCellsObject {\n");
        sb.append("    worksheetName: ").append(worksheetName).append("\n");
        sb.append("    pageIndex: ").append(pageIndex).append("\n");
        sb.append("    region: ").append(region).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
