/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ScrollBar.java">
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

public class ScrollBar extends Shape {

    @SerializedName("CurrentValue")
    @JsonProperty("CurrentValue")
    private Integer currentValue;

    public ScrollBar currentValue(Integer currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    @SerializedName("IncrementalChange")
    @JsonProperty("IncrementalChange")
    private Integer incrementalChange;

    public ScrollBar incrementalChange(Integer incrementalChange) {
        this.incrementalChange = incrementalChange;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getIncrementalChange() {
        return incrementalChange;
    }

    public void setIncrementalChange(Integer incrementalChange) {
        this.incrementalChange = incrementalChange;
    }

    @SerializedName("IsHorizontal")
    @JsonProperty("IsHorizontal")
    private Boolean isHorizontal;

    public ScrollBar isHorizontal(Boolean isHorizontal) {
        this.isHorizontal = isHorizontal;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsHorizontal() {
        return isHorizontal;
    }

    public void setIsHorizontal(Boolean isHorizontal) {
        this.isHorizontal = isHorizontal;
    }

    @SerializedName("Max")
    @JsonProperty("Max")
    private Integer max;

    public ScrollBar max(Integer max) {
        this.max = max;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    @SerializedName("Min")
    @JsonProperty("Min")
    private Integer min;

    public ScrollBar min(Integer min) {
        this.min = min;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @SerializedName("PageChange")
    @JsonProperty("PageChange")
    private Integer pageChange;

    public ScrollBar pageChange(Integer pageChange) {
        this.pageChange = pageChange;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPageChange() {
        return pageChange;
    }

    public void setPageChange(Integer pageChange) {
        this.pageChange = pageChange;
    }

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private Boolean shadow;

    public ScrollBar shadow(Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    @SerializedName("link")
    @JsonProperty("link")
    private Link link;

    public ScrollBar link(Link link) {
        this.link = link;
        return this;
    }

    @ApiModelProperty(value = "")
    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
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
        ScrollBar other = (ScrollBar) o;
        return Objects.equals(this.currentValue, other.currentValue)
            && Objects.equals(this.incrementalChange, other.incrementalChange)
            && Objects.equals(this.isHorizontal, other.isHorizontal)
            && Objects.equals(this.max, other.max)
            && Objects.equals(this.min, other.min)
            && Objects.equals(this.pageChange, other.pageChange)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentValue, incrementalChange, isHorizontal, max, min, pageChange, shadow, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ScrollBar {\n");
        sb.append("    currentValue: ").append(currentValue).append("\n");
        sb.append("    incrementalChange: ").append(incrementalChange).append("\n");
        sb.append("    isHorizontal: ").append(isHorizontal).append("\n");
        sb.append("    max: ").append(max).append("\n");
        sb.append("    min: ").append(min).append("\n");
        sb.append("    pageChange: ").append(pageChange).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
