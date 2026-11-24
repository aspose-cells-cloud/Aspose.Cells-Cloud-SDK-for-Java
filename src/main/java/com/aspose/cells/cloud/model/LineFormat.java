/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LineFormat.java">
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

public class LineFormat extends FillFormat {

    @SerializedName("BeginArrowheadLength")
    @JsonProperty("BeginArrowheadLength")
    private String beginArrowheadLength;

    public LineFormat beginArrowheadLength(String beginArrowheadLength) {
        this.beginArrowheadLength = beginArrowheadLength;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBeginArrowheadLength() {
        return beginArrowheadLength;
    }

    public void setBeginArrowheadLength(String beginArrowheadLength) {
        this.beginArrowheadLength = beginArrowheadLength;
    }

    @SerializedName("BeginArrowheadStyle")
    @JsonProperty("BeginArrowheadStyle")
    private String beginArrowheadStyle;

    public LineFormat beginArrowheadStyle(String beginArrowheadStyle) {
        this.beginArrowheadStyle = beginArrowheadStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBeginArrowheadStyle() {
        return beginArrowheadStyle;
    }

    public void setBeginArrowheadStyle(String beginArrowheadStyle) {
        this.beginArrowheadStyle = beginArrowheadStyle;
    }

    @SerializedName("BeginArrowheadWidth")
    @JsonProperty("BeginArrowheadWidth")
    private String beginArrowheadWidth;

    public LineFormat beginArrowheadWidth(String beginArrowheadWidth) {
        this.beginArrowheadWidth = beginArrowheadWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBeginArrowheadWidth() {
        return beginArrowheadWidth;
    }

    public void setBeginArrowheadWidth(String beginArrowheadWidth) {
        this.beginArrowheadWidth = beginArrowheadWidth;
    }

    @SerializedName("CapType")
    @JsonProperty("CapType")
    private String capType;

    public LineFormat capType(String capType) {
        this.capType = capType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCapType() {
        return capType;
    }

    public void setCapType(String capType) {
        this.capType = capType;
    }

    @SerializedName("CompoundType")
    @JsonProperty("CompoundType")
    private String compoundType;

    public LineFormat compoundType(String compoundType) {
        this.compoundType = compoundType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCompoundType() {
        return compoundType;
    }

    public void setCompoundType(String compoundType) {
        this.compoundType = compoundType;
    }

    @SerializedName("DashStyle")
    @JsonProperty("DashStyle")
    private String dashStyle;

    public LineFormat dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDashStyle() {
        return dashStyle;
    }

    public void setDashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
    }

    @SerializedName("EndArrowheadLength")
    @JsonProperty("EndArrowheadLength")
    private String endArrowheadLength;

    public LineFormat endArrowheadLength(String endArrowheadLength) {
        this.endArrowheadLength = endArrowheadLength;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEndArrowheadLength() {
        return endArrowheadLength;
    }

    public void setEndArrowheadLength(String endArrowheadLength) {
        this.endArrowheadLength = endArrowheadLength;
    }

    @SerializedName("EndArrowheadStyle")
    @JsonProperty("EndArrowheadStyle")
    private String endArrowheadStyle;

    public LineFormat endArrowheadStyle(String endArrowheadStyle) {
        this.endArrowheadStyle = endArrowheadStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEndArrowheadStyle() {
        return endArrowheadStyle;
    }

    public void setEndArrowheadStyle(String endArrowheadStyle) {
        this.endArrowheadStyle = endArrowheadStyle;
    }

    @SerializedName("EndArrowheadWidth")
    @JsonProperty("EndArrowheadWidth")
    private String endArrowheadWidth;

    public LineFormat endArrowheadWidth(String endArrowheadWidth) {
        this.endArrowheadWidth = endArrowheadWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEndArrowheadWidth() {
        return endArrowheadWidth;
    }

    public void setEndArrowheadWidth(String endArrowheadWidth) {
        this.endArrowheadWidth = endArrowheadWidth;
    }

    @SerializedName("JoinType")
    @JsonProperty("JoinType")
    private String joinType;

    public LineFormat joinType(String joinType) {
        this.joinType = joinType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getJoinType() {
        return joinType;
    }

    public void setJoinType(String joinType) {
        this.joinType = joinType;
    }

    @SerializedName("Weight")
    @JsonProperty("Weight")
    private Double weight;

    public LineFormat weight(Double weight) {
        this.weight = weight;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
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
        LineFormat other = (LineFormat) o;
        return Objects.equals(this.beginArrowheadLength, other.beginArrowheadLength)
            && Objects.equals(this.beginArrowheadStyle, other.beginArrowheadStyle)
            && Objects.equals(this.beginArrowheadWidth, other.beginArrowheadWidth)
            && Objects.equals(this.capType, other.capType)
            && Objects.equals(this.compoundType, other.compoundType)
            && Objects.equals(this.dashStyle, other.dashStyle)
            && Objects.equals(this.endArrowheadLength, other.endArrowheadLength)
            && Objects.equals(this.endArrowheadStyle, other.endArrowheadStyle)
            && Objects.equals(this.endArrowheadWidth, other.endArrowheadWidth)
            && Objects.equals(this.joinType, other.joinType)
            && Objects.equals(this.weight, other.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginArrowheadLength, beginArrowheadStyle, beginArrowheadWidth, capType, compoundType, dashStyle, endArrowheadLength, endArrowheadStyle, endArrowheadWidth, joinType, weight, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineFormat {\n");
        sb.append("    beginArrowheadLength: ").append(beginArrowheadLength).append("\n");
        sb.append("    beginArrowheadStyle: ").append(beginArrowheadStyle).append("\n");
        sb.append("    beginArrowheadWidth: ").append(beginArrowheadWidth).append("\n");
        sb.append("    capType: ").append(capType).append("\n");
        sb.append("    compoundType: ").append(compoundType).append("\n");
        sb.append("    dashStyle: ").append(dashStyle).append("\n");
        sb.append("    endArrowheadLength: ").append(endArrowheadLength).append("\n");
        sb.append("    endArrowheadStyle: ").append(endArrowheadStyle).append("\n");
        sb.append("    endArrowheadWidth: ").append(endArrowheadWidth).append("\n");
        sb.append("    joinType: ").append(joinType).append("\n");
        sb.append("    weight: ").append(weight).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
