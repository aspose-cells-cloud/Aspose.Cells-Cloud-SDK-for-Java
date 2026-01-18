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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class Style {
        @SerializedName("Font")
        private Font font ;

        public  Style  font(Font  font) {
            this.font =  font;
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
        private String name ;

        public  Style  name(String  name) {
            this.name =  name;
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
        private String cultureCustom ;

        public  Style  cultureCustom(String  cultureCustom) {
            this.cultureCustom =  cultureCustom;
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
        private String custom ;

        public  Style  custom(String  custom) {
            this.custom =  custom;
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
        private Color backgroundColor ;

        public  Style  backgroundColor(Color  backgroundColor) {
            this.backgroundColor =  backgroundColor;
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
        private Color foregroundColor ;

        public  Style  foregroundColor(Color  foregroundColor) {
            this.foregroundColor =  foregroundColor;
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
        private Boolean isFormulaHidden ;

        public  Style  isFormulaHidden(Boolean  isFormulaHidden) {
            this.isFormulaHidden =  isFormulaHidden;
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
        private Boolean isDateTime ;

        public  Style  isDateTime(Boolean  isDateTime) {
            this.isDateTime =  isDateTime;
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
        private Boolean isTextWrapped ;

        public  Style  isTextWrapped(Boolean  isTextWrapped) {
            this.isTextWrapped =  isTextWrapped;
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
        private Boolean isGradient ;

        public  Style  isGradient(Boolean  isGradient) {
            this.isGradient =  isGradient;
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
        private Boolean isLocked ;

        public  Style  isLocked(Boolean  isLocked) {
            this.isLocked =  isLocked;
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
        private Boolean isPercent ;

        public  Style  isPercent(Boolean  isPercent) {
            this.isPercent =  isPercent;
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
        private Boolean shrinkToFit ;

        public  Style  shrinkToFit(Boolean  shrinkToFit) {
            this.shrinkToFit =  shrinkToFit;
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
        private Integer indentLevel ;

        public  Style  indentLevel(Integer  indentLevel) {
            this.indentLevel =  indentLevel;
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
        private Integer number ;

        public  Style  number(Integer  number) {
            this.number =  number;
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
        private Integer rotationAngle ;

        public  Style  rotationAngle(Integer  rotationAngle) {
            this.rotationAngle =  rotationAngle;
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
        private String pattern ;

        public  Style  pattern(String  pattern) {
            this.pattern =  pattern;
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
        private String textDirection ;

        public  Style  textDirection(String  textDirection) {
            this.textDirection =  textDirection;
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
        private String verticalAlignment ;

        public  Style  verticalAlignment(String  verticalAlignment) {
            this.verticalAlignment =  verticalAlignment;
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
        private String horizontalAlignment ;

        public  Style  horizontalAlignment(String  horizontalAlignment) {
            this.horizontalAlignment =  horizontalAlignment;
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
        private List<Border> borderCollection ;

        public  Style  borderCollection(List<Border>  borderCollection) {
            this.borderCollection =  borderCollection;
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
        private ThemeColor backgroundThemeColor ;

        public  Style  backgroundThemeColor(ThemeColor  backgroundThemeColor) {
            this.backgroundThemeColor =  backgroundThemeColor;
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
        private ThemeColor foregroundThemeColor ;

        public  Style  foregroundThemeColor(ThemeColor  foregroundThemeColor) {
            this.foregroundThemeColor =  foregroundThemeColor;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Style style = (Style) o;
            return
                Objects.equals(this.font, style.font) &&
                Objects.equals(this.name, style.name) &&
                Objects.equals(this.cultureCustom, style.cultureCustom) &&
                Objects.equals(this.custom, style.custom) &&
                Objects.equals(this.backgroundColor, style.backgroundColor) &&
                Objects.equals(this.foregroundColor, style.foregroundColor) &&
                Objects.equals(this.isFormulaHidden, style.isFormulaHidden) &&
                Objects.equals(this.isDateTime, style.isDateTime) &&
                Objects.equals(this.isTextWrapped, style.isTextWrapped) &&
                Objects.equals(this.isGradient, style.isGradient) &&
                Objects.equals(this.isLocked, style.isLocked) &&
                Objects.equals(this.isPercent, style.isPercent) &&
                Objects.equals(this.shrinkToFit, style.shrinkToFit) &&
                Objects.equals(this.indentLevel, style.indentLevel) &&
                Objects.equals(this.number, style.number) &&
                Objects.equals(this.rotationAngle, style.rotationAngle) &&
                Objects.equals(this.pattern, style.pattern) &&
                Objects.equals(this.textDirection, style.textDirection) &&
                Objects.equals(this.verticalAlignment, style.verticalAlignment) &&
                Objects.equals(this.horizontalAlignment, style.horizontalAlignment) &&
                Objects.equals(this.borderCollection, style.borderCollection) &&
                Objects.equals(this.backgroundThemeColor, style.backgroundThemeColor) &&
                Objects.equals(this.foregroundThemeColor, style.foregroundThemeColor);
      }

      @Override
      public int hashCode() {
        return Objects.hash(font, name, cultureCustom, custom, backgroundColor, foregroundColor, isFormulaHidden, isDateTime, isTextWrapped, isGradient, isLocked, isPercent, shrinkToFit, indentLevel, number, rotationAngle, pattern, textDirection, verticalAlignment, horizontalAlignment, borderCollection, backgroundThemeColor, foregroundThemeColor);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Style {\n");
            sb.append("    font: ").append(toIndentedString(getFont())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    cultureCustom: ").append(toIndentedString(getCultureCustom())).append("\n");
            sb.append("    custom: ").append(toIndentedString(getCustom())).append("\n");
            sb.append("    backgroundColor: ").append(toIndentedString(getBackgroundColor())).append("\n");
            sb.append("    foregroundColor: ").append(toIndentedString(getForegroundColor())).append("\n");
            sb.append("    isFormulaHidden: ").append(toIndentedString(getIsFormulaHidden())).append("\n");
            sb.append("    isDateTime: ").append(toIndentedString(getIsDateTime())).append("\n");
            sb.append("    isTextWrapped: ").append(toIndentedString(getIsTextWrapped())).append("\n");
            sb.append("    isGradient: ").append(toIndentedString(getIsGradient())).append("\n");
            sb.append("    isLocked: ").append(toIndentedString(getIsLocked())).append("\n");
            sb.append("    isPercent: ").append(toIndentedString(getIsPercent())).append("\n");
            sb.append("    shrinkToFit: ").append(toIndentedString(getShrinkToFit())).append("\n");
            sb.append("    indentLevel: ").append(toIndentedString(getIndentLevel())).append("\n");
            sb.append("    number: ").append(toIndentedString(getNumber())).append("\n");
            sb.append("    rotationAngle: ").append(toIndentedString(getRotationAngle())).append("\n");
            sb.append("    pattern: ").append(toIndentedString(getPattern())).append("\n");
            sb.append("    textDirection: ").append(toIndentedString(getTextDirection())).append("\n");
            sb.append("    verticalAlignment: ").append(toIndentedString(getVerticalAlignment())).append("\n");
            sb.append("    horizontalAlignment: ").append(toIndentedString(getHorizontalAlignment())).append("\n");
            sb.append("    borderCollection: ").append(toIndentedString(getBorderCollection())).append("\n");
            sb.append("    backgroundThemeColor: ").append(toIndentedString(getBackgroundThemeColor())).append("\n");
            sb.append("    foregroundThemeColor: ").append(toIndentedString(getForegroundThemeColor())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}

