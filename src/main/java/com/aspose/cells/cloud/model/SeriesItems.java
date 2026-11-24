/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SeriesItems.java">
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

public class SeriesItems extends LinkElement {

    @SerializedName("CategoryData")
    @JsonProperty("CategoryData")
    private String categoryData;

    public SeriesItems categoryData(String categoryData) {
        this.categoryData = categoryData;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCategoryData() {
        return categoryData;
    }

    public void setCategoryData(String categoryData) {
        this.categoryData = categoryData;
    }

    @SerializedName("IsColorVaried")
    @JsonProperty("IsColorVaried")
    private Boolean isColorVaried;

    public SeriesItems isColorVaried(Boolean isColorVaried) {
        this.isColorVaried = isColorVaried;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsColorVaried() {
        return isColorVaried;
    }

    public void setIsColorVaried(Boolean isColorVaried) {
        this.isColorVaried = isColorVaried;
    }

    @SerializedName("SecondCatergoryData")
    @JsonProperty("SecondCatergoryData")
    private String secondCatergoryData;

    public SeriesItems secondCatergoryData(String secondCatergoryData) {
        this.secondCatergoryData = secondCatergoryData;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSecondCatergoryData() {
        return secondCatergoryData;
    }

    public void setSecondCatergoryData(String secondCatergoryData) {
        this.secondCatergoryData = secondCatergoryData;
    }

    @SerializedName("SeriesList")
    @JsonProperty("SeriesList")
    private List<Series> seriesList;

    public SeriesItems seriesList(List<Series> seriesList) {
        this.seriesList = seriesList;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Series> getSeriesList() {
        return seriesList;
    }

    public void setSeriesList(List<Series> seriesList) {
        this.seriesList = seriesList;
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
        SeriesItems other = (SeriesItems) o;
        return Objects.equals(this.categoryData, other.categoryData)
            && Objects.equals(this.isColorVaried, other.isColorVaried)
            && Objects.equals(this.secondCatergoryData, other.secondCatergoryData)
            && Objects.equals(this.seriesList, other.seriesList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryData, isColorVaried, secondCatergoryData, seriesList, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SeriesItems {\n");
        sb.append("    categoryData: ").append(categoryData).append("\n");
        sb.append("    isColorVaried: ").append(isColorVaried).append("\n");
        sb.append("    secondCatergoryData: ").append(secondCatergoryData).append("\n");
        sb.append("    seriesList: ").append(seriesList).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
