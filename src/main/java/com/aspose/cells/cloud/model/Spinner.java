/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Spinner.java">
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

public class Spinner extends Shape {

    @SerializedName("CurrentValue")
    @JsonProperty("CurrentValue")
    private Integer currentValue;

    public Spinner currentValue(Integer currentValue) {
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

    public Spinner incrementalChange(Integer incrementalChange) {
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

    @SerializedName("Max")
    @JsonProperty("Max")
    private Integer max;

    public Spinner max(Integer max) {
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

    public Spinner min(Integer min) {
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

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private Boolean shadow;

    public Spinner shadow(Boolean shadow) {
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

    public Spinner link(Link link) {
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
        Spinner other = (Spinner) o;
        return Objects.equals(this.currentValue, other.currentValue)
            && Objects.equals(this.incrementalChange, other.incrementalChange)
            && Objects.equals(this.max, other.max)
            && Objects.equals(this.min, other.min)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentValue, incrementalChange, max, min, shadow, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Spinner {\n");
        sb.append("    currentValue: ").append(currentValue).append("\n");
        sb.append("    incrementalChange: ").append(incrementalChange).append("\n");
        sb.append("    max: ").append(max).append("\n");
        sb.append("    min: ").append(min).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
