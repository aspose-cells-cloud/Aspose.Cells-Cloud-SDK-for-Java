/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TickLabels.java">
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

public class TickLabels extends LinkElement {

    @SerializedName("AutoScaleFont")
    @JsonProperty("AutoScaleFont")
    private Boolean autoScaleFont;

    public TickLabels autoScaleFont(Boolean autoScaleFont) {
        this.autoScaleFont = autoScaleFont;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAutoScaleFont() {
        return autoScaleFont;
    }

    public void setAutoScaleFont(Boolean autoScaleFont) {
        this.autoScaleFont = autoScaleFont;
    }

    @SerializedName("BackgroundMode")
    @JsonProperty("BackgroundMode")
    private String backgroundMode;

    public TickLabels backgroundMode(String backgroundMode) {
        this.backgroundMode = backgroundMode;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBackgroundMode() {
        return backgroundMode;
    }

    public void setBackgroundMode(String backgroundMode) {
        this.backgroundMode = backgroundMode;
    }

    @SerializedName("Font")
    @JsonProperty("Font")
    private Font font;

    public TickLabels font(Font font) {
        this.font = font;
        return this;
    }

    @ApiModelProperty(value = "")
    public Font getFont() {
        return font;
    }

    public void setFont(Font font) {
        this.font = font;
    }

    @SerializedName("Number")
    @JsonProperty("Number")
    private Integer number;

    public TickLabels number(Integer number) {
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

    public TickLabels numberFormat(String numberFormat) {
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

    public TickLabels numberFormatLinked(Boolean numberFormatLinked) {
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

    @SerializedName("Offset")
    @JsonProperty("Offset")
    private Integer offset;

    public TickLabels offset(Integer offset) {
        this.offset = offset;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @SerializedName("RotationAngle")
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    public TickLabels rotationAngle(Integer rotationAngle) {
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

    @SerializedName("TextDirection")
    @JsonProperty("TextDirection")
    private String textDirection;

    public TickLabels textDirection(String textDirection) {
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

    @SerializedName("ReadingOrder")
    @JsonProperty("ReadingOrder")
    private String readingOrder;

    public TickLabels readingOrder(String readingOrder) {
        this.readingOrder = readingOrder;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getReadingOrder() {
        return readingOrder;
    }

    public void setReadingOrder(String readingOrder) {
        this.readingOrder = readingOrder;
    }

    @SerializedName("DirectionType")
    @JsonProperty("DirectionType")
    private String directionType;

    public TickLabels directionType(String directionType) {
        this.directionType = directionType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDirectionType() {
        return directionType;
    }

    public void setDirectionType(String directionType) {
        this.directionType = directionType;
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
        TickLabels other = (TickLabels) o;
        return Objects.equals(this.autoScaleFont, other.autoScaleFont)
            && Objects.equals(this.backgroundMode, other.backgroundMode)
            && Objects.equals(this.font, other.font)
            && Objects.equals(this.number, other.number)
            && Objects.equals(this.numberFormat, other.numberFormat)
            && Objects.equals(this.numberFormatLinked, other.numberFormatLinked)
            && Objects.equals(this.offset, other.offset)
            && Objects.equals(this.rotationAngle, other.rotationAngle)
            && Objects.equals(this.textDirection, other.textDirection)
            && Objects.equals(this.readingOrder, other.readingOrder)
            && Objects.equals(this.directionType, other.directionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoScaleFont, backgroundMode, font, number, numberFormat, numberFormatLinked, offset, rotationAngle, textDirection, readingOrder, directionType, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TickLabels {\n");
        sb.append("    autoScaleFont: ").append(autoScaleFont).append("\n");
        sb.append("    backgroundMode: ").append(backgroundMode).append("\n");
        sb.append("    font: ").append(font).append("\n");
        sb.append("    number: ").append(number).append("\n");
        sb.append("    numberFormat: ").append(numberFormat).append("\n");
        sb.append("    numberFormatLinked: ").append(numberFormatLinked).append("\n");
        sb.append("    offset: ").append(offset).append("\n");
        sb.append("    rotationAngle: ").append(rotationAngle).append("\n");
        sb.append("    textDirection: ").append(textDirection).append("\n");
        sb.append("    readingOrder: ").append(readingOrder).append("\n");
        sb.append("    directionType: ").append(directionType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
