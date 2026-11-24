/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataLabels.java">
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

public class DataLabels extends ChartFrame {

    @SerializedName("IsAutoText")
    @JsonProperty("IsAutoText")
    private Boolean isAutoText;

    public DataLabels isAutoText(Boolean isAutoText) {
        this.isAutoText = isAutoText;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsAutoText() {
        return isAutoText;
    }

    public void setIsAutoText(Boolean isAutoText) {
        this.isAutoText = isAutoText;
    }

    @SerializedName("IsDeleted")
    @JsonProperty("IsDeleted")
    private Boolean isDeleted;

    public DataLabels isDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @SerializedName("LinkedSource")
    @JsonProperty("LinkedSource")
    private String linkedSource;

    public DataLabels linkedSource(String linkedSource) {
        this.linkedSource = linkedSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getLinkedSource() {
        return linkedSource;
    }

    public void setLinkedSource(String linkedSource) {
        this.linkedSource = linkedSource;
    }

    @SerializedName("Number")
    @JsonProperty("Number")
    private Integer number;

    public DataLabels number(Integer number) {
        this.number = number;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @SerializedName("NumberFormat")
    @JsonProperty("NumberFormat")
    private String numberFormat;

    public DataLabels numberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getNumberFormat() {
        return numberFormat;
    }

    public void setNumberFormat(String numberFormat) {
        this.numberFormat = numberFormat;
    }

    @SerializedName("NumberFormatLinked")
    @JsonProperty("NumberFormatLinked")
    private Boolean numberFormatLinked;

    public DataLabels numberFormatLinked(Boolean numberFormatLinked) {
        this.numberFormatLinked = numberFormatLinked;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getNumberFormatLinked() {
        return numberFormatLinked;
    }

    public void setNumberFormatLinked(Boolean numberFormatLinked) {
        this.numberFormatLinked = numberFormatLinked;
    }

    @SerializedName("Position")
    @JsonProperty("Position")
    private String position;

    public DataLabels position(String position) {
        this.position = position;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @SerializedName("RotationAngle")
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    public DataLabels rotationAngle(Integer rotationAngle) {
        this.rotationAngle = rotationAngle;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRotationAngle() {
        return rotationAngle;
    }

    public void setRotationAngle(Integer rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    @SerializedName("Separator")
    @JsonProperty("Separator")
    private String separator;

    public DataLabels separator(String separator) {
        this.separator = separator;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    @SerializedName("ShowBubbleSize")
    @JsonProperty("ShowBubbleSize")
    private Boolean showBubbleSize;

    public DataLabels showBubbleSize(Boolean showBubbleSize) {
        this.showBubbleSize = showBubbleSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowBubbleSize() {
        return showBubbleSize;
    }

    public void setShowBubbleSize(Boolean showBubbleSize) {
        this.showBubbleSize = showBubbleSize;
    }

    @SerializedName("ShowCategoryName")
    @JsonProperty("ShowCategoryName")
    private Boolean showCategoryName;

    public DataLabels showCategoryName(Boolean showCategoryName) {
        this.showCategoryName = showCategoryName;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowCategoryName() {
        return showCategoryName;
    }

    public void setShowCategoryName(Boolean showCategoryName) {
        this.showCategoryName = showCategoryName;
    }

    @SerializedName("ShowLegendKey")
    @JsonProperty("ShowLegendKey")
    private Boolean showLegendKey;

    public DataLabels showLegendKey(Boolean showLegendKey) {
        this.showLegendKey = showLegendKey;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowLegendKey() {
        return showLegendKey;
    }

    public void setShowLegendKey(Boolean showLegendKey) {
        this.showLegendKey = showLegendKey;
    }

    @SerializedName("ShowPercentage")
    @JsonProperty("ShowPercentage")
    private Boolean showPercentage;

    public DataLabels showPercentage(Boolean showPercentage) {
        this.showPercentage = showPercentage;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowPercentage() {
        return showPercentage;
    }

    public void setShowPercentage(Boolean showPercentage) {
        this.showPercentage = showPercentage;
    }

    @SerializedName("ShowSeriesName")
    @JsonProperty("ShowSeriesName")
    private Boolean showSeriesName;

    public DataLabels showSeriesName(Boolean showSeriesName) {
        this.showSeriesName = showSeriesName;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowSeriesName() {
        return showSeriesName;
    }

    public void setShowSeriesName(Boolean showSeriesName) {
        this.showSeriesName = showSeriesName;
    }

    @SerializedName("ShowValue")
    @JsonProperty("ShowValue")
    private Boolean showValue;

    public DataLabels showValue(Boolean showValue) {
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

    @SerializedName("Text")
    @JsonProperty("Text")
    private String text;

    public DataLabels text(String text) {
        this.text = text;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @SerializedName("TextDirection")
    @JsonProperty("TextDirection")
    private String textDirection;

    public DataLabels textDirection(String textDirection) {
        this.textDirection = textDirection;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextDirection() {
        return textDirection;
    }

    public void setTextDirection(String textDirection) {
        this.textDirection = textDirection;
    }

    @SerializedName("TextHorizontalAlignment")
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    public DataLabels textHorizontalAlignment(String textHorizontalAlignment) {
        this.textHorizontalAlignment = textHorizontalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextHorizontalAlignment() {
        return textHorizontalAlignment;
    }

    public void setTextHorizontalAlignment(String textHorizontalAlignment) {
        this.textHorizontalAlignment = textHorizontalAlignment;
    }

    @SerializedName("TextVerticalAlignment")
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

    public DataLabels textVerticalAlignment(String textVerticalAlignment) {
        this.textVerticalAlignment = textVerticalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextVerticalAlignment() {
        return textVerticalAlignment;
    }

    public void setTextVerticalAlignment(String textVerticalAlignment) {
        this.textVerticalAlignment = textVerticalAlignment;
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
        DataLabels other = (DataLabels) o;
        return Objects.equals(this.isAutoText, other.isAutoText)
            && Objects.equals(this.isDeleted, other.isDeleted)
            && Objects.equals(this.linkedSource, other.linkedSource)
            && Objects.equals(this.number, other.number)
            && Objects.equals(this.numberFormat, other.numberFormat)
            && Objects.equals(this.numberFormatLinked, other.numberFormatLinked)
            && Objects.equals(this.position, other.position)
            && Objects.equals(this.rotationAngle, other.rotationAngle)
            && Objects.equals(this.separator, other.separator)
            && Objects.equals(this.showBubbleSize, other.showBubbleSize)
            && Objects.equals(this.showCategoryName, other.showCategoryName)
            && Objects.equals(this.showLegendKey, other.showLegendKey)
            && Objects.equals(this.showPercentage, other.showPercentage)
            && Objects.equals(this.showSeriesName, other.showSeriesName)
            && Objects.equals(this.showValue, other.showValue)
            && Objects.equals(this.text, other.text)
            && Objects.equals(this.textDirection, other.textDirection)
            && Objects.equals(this.textHorizontalAlignment, other.textHorizontalAlignment)
            && Objects.equals(this.textVerticalAlignment, other.textVerticalAlignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAutoText, isDeleted, linkedSource, number, numberFormat, numberFormatLinked, position, rotationAngle, separator, showBubbleSize, showCategoryName, showLegendKey, showPercentage, showSeriesName, showValue, text, textDirection, textHorizontalAlignment, textVerticalAlignment, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataLabels {\n");
        sb.append("    isAutoText: ").append(isAutoText).append("\n");
        sb.append("    isDeleted: ").append(isDeleted).append("\n");
        sb.append("    linkedSource: ").append(linkedSource).append("\n");
        sb.append("    number: ").append(number).append("\n");
        sb.append("    numberFormat: ").append(numberFormat).append("\n");
        sb.append("    numberFormatLinked: ").append(numberFormatLinked).append("\n");
        sb.append("    position: ").append(position).append("\n");
        sb.append("    rotationAngle: ").append(rotationAngle).append("\n");
        sb.append("    separator: ").append(separator).append("\n");
        sb.append("    showBubbleSize: ").append(showBubbleSize).append("\n");
        sb.append("    showCategoryName: ").append(showCategoryName).append("\n");
        sb.append("    showLegendKey: ").append(showLegendKey).append("\n");
        sb.append("    showPercentage: ").append(showPercentage).append("\n");
        sb.append("    showSeriesName: ").append(showSeriesName).append("\n");
        sb.append("    showValue: ").append(showValue).append("\n");
        sb.append("    text: ").append(text).append("\n");
        sb.append("    textDirection: ").append(textDirection).append("\n");
        sb.append("    textHorizontalAlignment: ").append(textHorizontalAlignment).append("\n");
        sb.append("    textVerticalAlignment: ").append(textVerticalAlignment).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
