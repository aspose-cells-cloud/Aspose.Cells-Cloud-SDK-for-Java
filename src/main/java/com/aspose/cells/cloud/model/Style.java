/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Style.java">
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

public class Style {

    @SerializedName("Font")
    @JsonProperty("Font")
    private Font font;

    public Style font(Font font) {
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

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public Style name(String name) {
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

    @SerializedName("CultureCustom")
    @JsonProperty("CultureCustom")
    private String cultureCustom;

    public Style cultureCustom(String cultureCustom) {
        this.cultureCustom = cultureCustom;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCultureCustom() {
        return cultureCustom;
    }

    public void setCultureCustom(String cultureCustom) {
        this.cultureCustom = cultureCustom;
    }

    @SerializedName("Custom")
    @JsonProperty("Custom")
    private String custom;

    public Style custom(String custom) {
        this.custom = custom;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    @SerializedName("BackgroundColor")
    @JsonProperty("BackgroundColor")
    private Color backgroundColor;

    public Style backgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @SerializedName("ForegroundColor")
    @JsonProperty("ForegroundColor")
    private Color foregroundColor;

    public Style foregroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    @SerializedName("IsFormulaHidden")
    @JsonProperty("IsFormulaHidden")
    private Boolean isFormulaHidden;

    public Style isFormulaHidden(Boolean isFormulaHidden) {
        this.isFormulaHidden = isFormulaHidden;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsFormulaHidden() {
        return isFormulaHidden;
    }

    public void setIsFormulaHidden(Boolean isFormulaHidden) {
        this.isFormulaHidden = isFormulaHidden;
    }

    @SerializedName("IsDateTime")
    @JsonProperty("IsDateTime")
    private Boolean isDateTime;

    public Style isDateTime(Boolean isDateTime) {
        this.isDateTime = isDateTime;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsDateTime() {
        return isDateTime;
    }

    public void setIsDateTime(Boolean isDateTime) {
        this.isDateTime = isDateTime;
    }

    @SerializedName("IsTextWrapped")
    @JsonProperty("IsTextWrapped")
    private Boolean isTextWrapped;

    public Style isTextWrapped(Boolean isTextWrapped) {
        this.isTextWrapped = isTextWrapped;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsTextWrapped() {
        return isTextWrapped;
    }

    public void setIsTextWrapped(Boolean isTextWrapped) {
        this.isTextWrapped = isTextWrapped;
    }

    @SerializedName("IsGradient")
    @JsonProperty("IsGradient")
    private Boolean isGradient;

    public Style isGradient(Boolean isGradient) {
        this.isGradient = isGradient;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsGradient() {
        return isGradient;
    }

    public void setIsGradient(Boolean isGradient) {
        this.isGradient = isGradient;
    }

    @SerializedName("IsLocked")
    @JsonProperty("IsLocked")
    private Boolean isLocked;

    public Style isLocked(Boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    @SerializedName("IsPercent")
    @JsonProperty("IsPercent")
    private Boolean isPercent;

    public Style isPercent(Boolean isPercent) {
        this.isPercent = isPercent;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsPercent() {
        return isPercent;
    }

    public void setIsPercent(Boolean isPercent) {
        this.isPercent = isPercent;
    }

    @SerializedName("ShrinkToFit")
    @JsonProperty("ShrinkToFit")
    private Boolean shrinkToFit;

    public Style shrinkToFit(Boolean shrinkToFit) {
        this.shrinkToFit = shrinkToFit;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShrinkToFit() {
        return shrinkToFit;
    }

    public void setShrinkToFit(Boolean shrinkToFit) {
        this.shrinkToFit = shrinkToFit;
    }

    @SerializedName("IndentLevel")
    @JsonProperty("IndentLevel")
    private Integer indentLevel;

    public Style indentLevel(Integer indentLevel) {
        this.indentLevel = indentLevel;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getIndentLevel() {
        return indentLevel;
    }

    public void setIndentLevel(Integer indentLevel) {
        this.indentLevel = indentLevel;
    }

    @SerializedName("Number")
    @JsonProperty("Number")
    private Integer number;

    public Style number(Integer number) {
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

    @SerializedName("RotationAngle")
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    public Style rotationAngle(Integer rotationAngle) {
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

    @SerializedName("Pattern")
    @JsonProperty("Pattern")
    private String pattern;

    public Style pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @SerializedName("TextDirection")
    @JsonProperty("TextDirection")
    private String textDirection;

    public Style textDirection(String textDirection) {
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

    @SerializedName("VerticalAlignment")
    @JsonProperty("VerticalAlignment")
    private String verticalAlignment;

    public Style verticalAlignment(String verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getVerticalAlignment() {
        return verticalAlignment;
    }

    public void setVerticalAlignment(String verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }

    @SerializedName("HorizontalAlignment")
    @JsonProperty("HorizontalAlignment")
    private String horizontalAlignment;

    public Style horizontalAlignment(String horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getHorizontalAlignment() {
        return horizontalAlignment;
    }

    public void setHorizontalAlignment(String horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }

    @SerializedName("BorderCollection")
    @JsonProperty("BorderCollection")
    private List<Border> borderCollection;

    public Style borderCollection(List<Border> borderCollection) {
        this.borderCollection = borderCollection;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Border> getBorderCollection() {
        return borderCollection;
    }

    public void setBorderCollection(List<Border> borderCollection) {
        this.borderCollection = borderCollection;
    }

    @SerializedName("BackgroundThemeColor")
    @JsonProperty("BackgroundThemeColor")
    private ThemeColor backgroundThemeColor;

    public Style backgroundThemeColor(ThemeColor backgroundThemeColor) {
        this.backgroundThemeColor = backgroundThemeColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public ThemeColor getBackgroundThemeColor() {
        return backgroundThemeColor;
    }

    public void setBackgroundThemeColor(ThemeColor backgroundThemeColor) {
        this.backgroundThemeColor = backgroundThemeColor;
    }

    @SerializedName("ForegroundThemeColor")
    @JsonProperty("ForegroundThemeColor")
    private ThemeColor foregroundThemeColor;

    public Style foregroundThemeColor(ThemeColor foregroundThemeColor) {
        this.foregroundThemeColor = foregroundThemeColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public ThemeColor getForegroundThemeColor() {
        return foregroundThemeColor;
    }

    public void setForegroundThemeColor(ThemeColor foregroundThemeColor) {
        this.foregroundThemeColor = foregroundThemeColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Style other = (Style) o;
        return Objects.equals(this.font, other.font)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.cultureCustom, other.cultureCustom)
            && Objects.equals(this.custom, other.custom)
            && Objects.equals(this.backgroundColor, other.backgroundColor)
            && Objects.equals(this.foregroundColor, other.foregroundColor)
            && Objects.equals(this.isFormulaHidden, other.isFormulaHidden)
            && Objects.equals(this.isDateTime, other.isDateTime)
            && Objects.equals(this.isTextWrapped, other.isTextWrapped)
            && Objects.equals(this.isGradient, other.isGradient)
            && Objects.equals(this.isLocked, other.isLocked)
            && Objects.equals(this.isPercent, other.isPercent)
            && Objects.equals(this.shrinkToFit, other.shrinkToFit)
            && Objects.equals(this.indentLevel, other.indentLevel)
            && Objects.equals(this.number, other.number)
            && Objects.equals(this.rotationAngle, other.rotationAngle)
            && Objects.equals(this.pattern, other.pattern)
            && Objects.equals(this.textDirection, other.textDirection)
            && Objects.equals(this.verticalAlignment, other.verticalAlignment)
            && Objects.equals(this.horizontalAlignment, other.horizontalAlignment)
            && Objects.equals(this.borderCollection, other.borderCollection)
            && Objects.equals(this.backgroundThemeColor, other.backgroundThemeColor)
            && Objects.equals(this.foregroundThemeColor, other.foregroundThemeColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(font, name, cultureCustom, custom, backgroundColor, foregroundColor, isFormulaHidden, isDateTime, isTextWrapped, isGradient, isLocked, isPercent, shrinkToFit, indentLevel, number, rotationAngle, pattern, textDirection, verticalAlignment, horizontalAlignment, borderCollection, backgroundThemeColor, foregroundThemeColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Style {\n");
        sb.append("    font: ").append(font).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    cultureCustom: ").append(cultureCustom).append("\n");
        sb.append("    custom: ").append(custom).append("\n");
        sb.append("    backgroundColor: ").append(backgroundColor).append("\n");
        sb.append("    foregroundColor: ").append(foregroundColor).append("\n");
        sb.append("    isFormulaHidden: ").append(isFormulaHidden).append("\n");
        sb.append("    isDateTime: ").append(isDateTime).append("\n");
        sb.append("    isTextWrapped: ").append(isTextWrapped).append("\n");
        sb.append("    isGradient: ").append(isGradient).append("\n");
        sb.append("    isLocked: ").append(isLocked).append("\n");
        sb.append("    isPercent: ").append(isPercent).append("\n");
        sb.append("    shrinkToFit: ").append(shrinkToFit).append("\n");
        sb.append("    indentLevel: ").append(indentLevel).append("\n");
        sb.append("    number: ").append(number).append("\n");
        sb.append("    rotationAngle: ").append(rotationAngle).append("\n");
        sb.append("    pattern: ").append(pattern).append("\n");
        sb.append("    textDirection: ").append(textDirection).append("\n");
        sb.append("    verticalAlignment: ").append(verticalAlignment).append("\n");
        sb.append("    horizontalAlignment: ").append(horizontalAlignment).append("\n");
        sb.append("    borderCollection: ").append(borderCollection).append("\n");
        sb.append("    backgroundThemeColor: ").append(backgroundThemeColor).append("\n");
        sb.append("    foregroundThemeColor: ").append(foregroundThemeColor).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
