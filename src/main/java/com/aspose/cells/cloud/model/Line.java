/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Line.java">
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

public class Line {

    @SerializedName("BeginArrowLength")
    @JsonProperty("BeginArrowLength")
    private String beginArrowLength;

    public Line beginArrowLength(String beginArrowLength) {
        this.beginArrowLength = beginArrowLength;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBeginArrowLength() {
        return beginArrowLength;
    }

    public void setBeginArrowLength(String beginArrowLength) {
        this.beginArrowLength = beginArrowLength;
    }

    @SerializedName("BeginArrowWidth")
    @JsonProperty("BeginArrowWidth")
    private String beginArrowWidth;

    public Line beginArrowWidth(String beginArrowWidth) {
        this.beginArrowWidth = beginArrowWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBeginArrowWidth() {
        return beginArrowWidth;
    }

    public void setBeginArrowWidth(String beginArrowWidth) {
        this.beginArrowWidth = beginArrowWidth;
    }

    @SerializedName("BeginType")
    @JsonProperty("BeginType")
    private String beginType;

    public Line beginType(String beginType) {
        this.beginType = beginType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBeginType() {
        return beginType;
    }

    public void setBeginType(String beginType) {
        this.beginType = beginType;
    }

    @SerializedName("CapType")
    @JsonProperty("CapType")
    private String capType;

    public Line capType(String capType) {
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

    @SerializedName("Color")
    @JsonProperty("Color")
    private Color color;

    public Line color(Color color) {
        this.color = color;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @SerializedName("CompoundType")
    @JsonProperty("CompoundType")
    private String compoundType;

    public Line compoundType(String compoundType) {
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

    @SerializedName("DashType")
    @JsonProperty("DashType")
    private String dashType;

    public Line dashType(String dashType) {
        this.dashType = dashType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDashType() {
        return dashType;
    }

    public void setDashType(String dashType) {
        this.dashType = dashType;
    }

    @SerializedName("EndArrowLength")
    @JsonProperty("EndArrowLength")
    private String endArrowLength;

    public Line endArrowLength(String endArrowLength) {
        this.endArrowLength = endArrowLength;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEndArrowLength() {
        return endArrowLength;
    }

    public void setEndArrowLength(String endArrowLength) {
        this.endArrowLength = endArrowLength;
    }

    @SerializedName("EndArrowWidth")
    @JsonProperty("EndArrowWidth")
    private String endArrowWidth;

    public Line endArrowWidth(String endArrowWidth) {
        this.endArrowWidth = endArrowWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEndArrowWidth() {
        return endArrowWidth;
    }

    public void setEndArrowWidth(String endArrowWidth) {
        this.endArrowWidth = endArrowWidth;
    }

    @SerializedName("EndType")
    @JsonProperty("EndType")
    private String endType;

    public Line endType(String endType) {
        this.endType = endType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEndType() {
        return endType;
    }

    public void setEndType(String endType) {
        this.endType = endType;
    }

    @SerializedName("GradientFill")
    @JsonProperty("GradientFill")
    private GradientFill gradientFill;

    public Line gradientFill(GradientFill gradientFill) {
        this.gradientFill = gradientFill;
        return this;
    }

    @ApiModelProperty(value = "")
    public GradientFill getGradientFill() {
        return gradientFill;
    }

    public void setGradientFill(GradientFill gradientFill) {
        this.gradientFill = gradientFill;
    }

    @SerializedName("IsAuto")
    @JsonProperty("IsAuto")
    private Boolean isAuto;

    public Line isAuto(Boolean isAuto) {
        this.isAuto = isAuto;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAuto() {
        return isAuto;
    }

    public void setIsAuto(Boolean isAuto) {
        this.isAuto = isAuto;
    }

    @SerializedName("IsAutomaticColor")
    @JsonProperty("IsAutomaticColor")
    private Boolean isAutomaticColor;

    public Line isAutomaticColor(Boolean isAutomaticColor) {
        this.isAutomaticColor = isAutomaticColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutomaticColor() {
        return isAutomaticColor;
    }

    public void setIsAutomaticColor(Boolean isAutomaticColor) {
        this.isAutomaticColor = isAutomaticColor;
    }

    @SerializedName("IsVisible")
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    public Line isVisible(Boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    @SerializedName("JoinType")
    @JsonProperty("JoinType")
    private String joinType;

    public Line joinType(String joinType) {
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

    @SerializedName("Style")
    @JsonProperty("Style")
    private String style;

    public Line style(String style) {
        this.style = style;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    @SerializedName("Transparency")
    @JsonProperty("Transparency")
    private Double transparency;

    public Line transparency(Double transparency) {
        this.transparency = transparency;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getTransparency() {
        return transparency;
    }

    public void setTransparency(Double transparency) {
        this.transparency = transparency;
    }

    @SerializedName("Weight")
    @JsonProperty("Weight")
    private String weight;

    public Line weight(String weight) {
        this.weight = weight;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @SerializedName("WeightPt")
    @JsonProperty("WeightPt")
    private Double weightPt;

    public Line weightPt(Double weightPt) {
        this.weightPt = weightPt;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getWeightPt() {
        return weightPt;
    }

    public void setWeightPt(Double weightPt) {
        this.weightPt = weightPt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Line other = (Line) o;
        return Objects.equals(this.beginArrowLength, other.beginArrowLength)
            && Objects.equals(this.beginArrowWidth, other.beginArrowWidth)
            && Objects.equals(this.beginType, other.beginType)
            && Objects.equals(this.capType, other.capType)
            && Objects.equals(this.color, other.color)
            && Objects.equals(this.compoundType, other.compoundType)
            && Objects.equals(this.dashType, other.dashType)
            && Objects.equals(this.endArrowLength, other.endArrowLength)
            && Objects.equals(this.endArrowWidth, other.endArrowWidth)
            && Objects.equals(this.endType, other.endType)
            && Objects.equals(this.gradientFill, other.gradientFill)
            && Objects.equals(this.isAuto, other.isAuto)
            && Objects.equals(this.isAutomaticColor, other.isAutomaticColor)
            && Objects.equals(this.isVisible, other.isVisible)
            && Objects.equals(this.joinType, other.joinType)
            && Objects.equals(this.style, other.style)
            && Objects.equals(this.transparency, other.transparency)
            && Objects.equals(this.weight, other.weight)
            && Objects.equals(this.weightPt, other.weightPt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginArrowLength, beginArrowWidth, beginType, capType, color, compoundType, dashType, endArrowLength, endArrowWidth, endType, gradientFill, isAuto, isAutomaticColor, isVisible, joinType, style, transparency, weight, weightPt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Line {\n");
        sb.append("    beginArrowLength: ").append(beginArrowLength).append("\n");
        sb.append("    beginArrowWidth: ").append(beginArrowWidth).append("\n");
        sb.append("    beginType: ").append(beginType).append("\n");
        sb.append("    capType: ").append(capType).append("\n");
        sb.append("    color: ").append(color).append("\n");
        sb.append("    compoundType: ").append(compoundType).append("\n");
        sb.append("    dashType: ").append(dashType).append("\n");
        sb.append("    endArrowLength: ").append(endArrowLength).append("\n");
        sb.append("    endArrowWidth: ").append(endArrowWidth).append("\n");
        sb.append("    endType: ").append(endType).append("\n");
        sb.append("    gradientFill: ").append(gradientFill).append("\n");
        sb.append("    isAuto: ").append(isAuto).append("\n");
        sb.append("    isAutomaticColor: ").append(isAutomaticColor).append("\n");
        sb.append("    isVisible: ").append(isVisible).append("\n");
        sb.append("    joinType: ").append(joinType).append("\n");
        sb.append("    style: ").append(style).append("\n");
        sb.append("    transparency: ").append(transparency).append("\n");
        sb.append("    weight: ").append(weight).append("\n");
        sb.append("    weightPt: ").append(weightPt).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
