/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataBar.java">
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

public class DataBar {

    @SerializedName("AxisColor")
    @JsonProperty("AxisColor")
    private Color axisColor;

    public DataBar axisColor(Color axisColor) {
        this.axisColor = axisColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getAxisColor() {
        return axisColor;
    }

    public void setAxisColor(Color axisColor) {
        this.axisColor = axisColor;
    }

    @SerializedName("AxisPosition")
    @JsonProperty("AxisPosition")
    private String axisPosition;

    public DataBar axisPosition(String axisPosition) {
        this.axisPosition = axisPosition;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAxisPosition() {
        return axisPosition;
    }

    public void setAxisPosition(String axisPosition) {
        this.axisPosition = axisPosition;
    }

    @SerializedName("BarBorder")
    @JsonProperty("BarBorder")
    private DataBarBorder barBorder;

    public DataBar barBorder(DataBarBorder barBorder) {
        this.barBorder = barBorder;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataBarBorder getBarBorder() {
        return barBorder;
    }

    public void setBarBorder(DataBarBorder barBorder) {
        this.barBorder = barBorder;
    }

    @SerializedName("BarFillType")
    @JsonProperty("BarFillType")
    private String barFillType;

    public DataBar barFillType(String barFillType) {
        this.barFillType = barFillType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBarFillType() {
        return barFillType;
    }

    public void setBarFillType(String barFillType) {
        this.barFillType = barFillType;
    }

    @SerializedName("Color")
    @JsonProperty("Color")
    private Color color;

    public DataBar color(Color color) {
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

    @SerializedName("Direction")
    @JsonProperty("Direction")
    private String direction;

    public DataBar direction(String direction) {
        this.direction = direction;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @SerializedName("MaxCfvo")
    @JsonProperty("MaxCfvo")
    private ConditionalFormattingValue maxCfvo;

    public DataBar maxCfvo(ConditionalFormattingValue maxCfvo) {
        this.maxCfvo = maxCfvo;
        return this;
    }

    @ApiModelProperty(value = "")
    public ConditionalFormattingValue getMaxCfvo() {
        return maxCfvo;
    }

    public void setMaxCfvo(ConditionalFormattingValue maxCfvo) {
        this.maxCfvo = maxCfvo;
    }

    @SerializedName("MaxLength")
    @JsonProperty("MaxLength")
    private Integer maxLength;

    public DataBar maxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
    }

    @SerializedName("MinCfvo")
    @JsonProperty("MinCfvo")
    private ConditionalFormattingValue minCfvo;

    public DataBar minCfvo(ConditionalFormattingValue minCfvo) {
        this.minCfvo = minCfvo;
        return this;
    }

    @ApiModelProperty(value = "")
    public ConditionalFormattingValue getMinCfvo() {
        return minCfvo;
    }

    public void setMinCfvo(ConditionalFormattingValue minCfvo) {
        this.minCfvo = minCfvo;
    }

    @SerializedName("MinLength")
    @JsonProperty("MinLength")
    private Integer minLength;

    public DataBar minLength(Integer minLength) {
        this.minLength = minLength;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMinLength() {
        return minLength;
    }

    public void setMinLength(Integer minLength) {
        this.minLength = minLength;
    }

    @SerializedName("NegativeBarFormat")
    @JsonProperty("NegativeBarFormat")
    private NegativeBarFormat negativeBarFormat;

    public DataBar negativeBarFormat(NegativeBarFormat negativeBarFormat) {
        this.negativeBarFormat = negativeBarFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public NegativeBarFormat getNegativeBarFormat() {
        return negativeBarFormat;
    }

    public void setNegativeBarFormat(NegativeBarFormat negativeBarFormat) {
        this.negativeBarFormat = negativeBarFormat;
    }

    @SerializedName("ShowValue")
    @JsonProperty("ShowValue")
    private Boolean showValue;

    public DataBar showValue(Boolean showValue) {
        this.showValue = showValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowValue() {
        return showValue;
    }

    public void setShowValue(Boolean showValue) {
        this.showValue = showValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataBar other = (DataBar) o;
        return Objects.equals(this.axisColor, other.axisColor)
            && Objects.equals(this.axisPosition, other.axisPosition)
            && Objects.equals(this.barBorder, other.barBorder)
            && Objects.equals(this.barFillType, other.barFillType)
            && Objects.equals(this.color, other.color)
            && Objects.equals(this.direction, other.direction)
            && Objects.equals(this.maxCfvo, other.maxCfvo)
            && Objects.equals(this.maxLength, other.maxLength)
            && Objects.equals(this.minCfvo, other.minCfvo)
            && Objects.equals(this.minLength, other.minLength)
            && Objects.equals(this.negativeBarFormat, other.negativeBarFormat)
            && Objects.equals(this.showValue, other.showValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(axisColor, axisPosition, barBorder, barFillType, color, direction, maxCfvo, maxLength, minCfvo, minLength, negativeBarFormat, showValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataBar {\n");
        sb.append("    axisColor: ").append(axisColor).append("\n");
        sb.append("    axisPosition: ").append(axisPosition).append("\n");
        sb.append("    barBorder: ").append(barBorder).append("\n");
        sb.append("    barFillType: ").append(barFillType).append("\n");
        sb.append("    color: ").append(color).append("\n");
        sb.append("    direction: ").append(direction).append("\n");
        sb.append("    maxCfvo: ").append(maxCfvo).append("\n");
        sb.append("    maxLength: ").append(maxLength).append("\n");
        sb.append("    minCfvo: ").append(minCfvo).append("\n");
        sb.append("    minLength: ").append(minLength).append("\n");
        sb.append("    negativeBarFormat: ").append(negativeBarFormat).append("\n");
        sb.append("    showValue: ").append(showValue).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
