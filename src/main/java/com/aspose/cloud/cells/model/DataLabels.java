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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class DataLabels  extends  ChartFrame {
        @SerializedName("IsAutoText")
        private Boolean isAutoText ;

        public  DataLabels  isAutoText(Boolean  isAutoText) {
            this.isAutoText =  isAutoText;
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
        private Boolean isDeleted ;

        public  DataLabels  isDeleted(Boolean  isDeleted) {
            this.isDeleted =  isDeleted;
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
        private String linkedSource ;

        public  DataLabels  linkedSource(String  linkedSource) {
            this.linkedSource =  linkedSource;
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
        private Integer number ;

        public  DataLabels  number(Integer  number) {
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

        @SerializedName("NumberFormat")
        private String numberFormat ;

        public  DataLabels  numberFormat(String  numberFormat) {
            this.numberFormat =  numberFormat;
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
        private Boolean numberFormatLinked ;

        public  DataLabels  numberFormatLinked(Boolean  numberFormatLinked) {
            this.numberFormatLinked =  numberFormatLinked;
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
        private String position ;

        public  DataLabels  position(String  position) {
            this.position =  position;
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
        private Integer rotationAngle ;

        public  DataLabels  rotationAngle(Integer  rotationAngle) {
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

        @SerializedName("Separator")
        private String separator ;

        public  DataLabels  separator(String  separator) {
            this.separator =  separator;
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
        private Boolean showBubbleSize ;

        public  DataLabels  showBubbleSize(Boolean  showBubbleSize) {
            this.showBubbleSize =  showBubbleSize;
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
        private Boolean showCategoryName ;

        public  DataLabels  showCategoryName(Boolean  showCategoryName) {
            this.showCategoryName =  showCategoryName;
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
        private Boolean showLegendKey ;

        public  DataLabels  showLegendKey(Boolean  showLegendKey) {
            this.showLegendKey =  showLegendKey;
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
        private Boolean showPercentage ;

        public  DataLabels  showPercentage(Boolean  showPercentage) {
            this.showPercentage =  showPercentage;
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
        private Boolean showSeriesName ;

        public  DataLabels  showSeriesName(Boolean  showSeriesName) {
            this.showSeriesName =  showSeriesName;
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
        private Boolean showValue ;

        public  DataLabels  showValue(Boolean  showValue) {
            this.showValue =  showValue;
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
        private String text ;

        public  DataLabels  text(String  text) {
            this.text =  text;
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
        private String textDirection ;

        public  DataLabels  textDirection(String  textDirection) {
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

        @SerializedName("TextHorizontalAlignment")
        private String textHorizontalAlignment ;

        public  DataLabels  textHorizontalAlignment(String  textHorizontalAlignment) {
            this.textHorizontalAlignment =  textHorizontalAlignment;
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
        private String textVerticalAlignment ;

        public  DataLabels  textVerticalAlignment(String  textVerticalAlignment) {
            this.textVerticalAlignment =  textVerticalAlignment;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DataLabels dataLabels = (DataLabels) o;
            return
                Objects.equals(this.isAutoText, dataLabels.isAutoText) &&
                Objects.equals(this.isDeleted, dataLabels.isDeleted) &&
                Objects.equals(this.linkedSource, dataLabels.linkedSource) &&
                Objects.equals(this.number, dataLabels.number) &&
                Objects.equals(this.numberFormat, dataLabels.numberFormat) &&
                Objects.equals(this.numberFormatLinked, dataLabels.numberFormatLinked) &&
                Objects.equals(this.position, dataLabels.position) &&
                Objects.equals(this.rotationAngle, dataLabels.rotationAngle) &&
                Objects.equals(this.separator, dataLabels.separator) &&
                Objects.equals(this.showBubbleSize, dataLabels.showBubbleSize) &&
                Objects.equals(this.showCategoryName, dataLabels.showCategoryName) &&
                Objects.equals(this.showLegendKey, dataLabels.showLegendKey) &&
                Objects.equals(this.showPercentage, dataLabels.showPercentage) &&
                Objects.equals(this.showSeriesName, dataLabels.showSeriesName) &&
                Objects.equals(this.showValue, dataLabels.showValue) &&
                Objects.equals(this.text, dataLabels.text) &&
                Objects.equals(this.textDirection, dataLabels.textDirection) &&
                Objects.equals(this.textHorizontalAlignment, dataLabels.textHorizontalAlignment) &&
                Objects.equals(this.textVerticalAlignment, dataLabels.textVerticalAlignment) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(isAutoText, isDeleted, linkedSource, number, numberFormat, numberFormatLinked, position, rotationAngle, separator, showBubbleSize, showCategoryName, showLegendKey, showPercentage, showSeriesName, showValue, text, textDirection, textHorizontalAlignment, textVerticalAlignment, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataLabels {\n");
            sb.append("    isAutoText: ").append(toIndentedString(getIsAutoText())).append("\n");
            sb.append("    isDeleted: ").append(toIndentedString(getIsDeleted())).append("\n");
            sb.append("    linkedSource: ").append(toIndentedString(getLinkedSource())).append("\n");
            sb.append("    number: ").append(toIndentedString(getNumber())).append("\n");
            sb.append("    numberFormat: ").append(toIndentedString(getNumberFormat())).append("\n");
            sb.append("    numberFormatLinked: ").append(toIndentedString(getNumberFormatLinked())).append("\n");
            sb.append("    position: ").append(toIndentedString(getPosition())).append("\n");
            sb.append("    rotationAngle: ").append(toIndentedString(getRotationAngle())).append("\n");
            sb.append("    separator: ").append(toIndentedString(getSeparator())).append("\n");
            sb.append("    showBubbleSize: ").append(toIndentedString(getShowBubbleSize())).append("\n");
            sb.append("    showCategoryName: ").append(toIndentedString(getShowCategoryName())).append("\n");
            sb.append("    showLegendKey: ").append(toIndentedString(getShowLegendKey())).append("\n");
            sb.append("    showPercentage: ").append(toIndentedString(getShowPercentage())).append("\n");
            sb.append("    showSeriesName: ").append(toIndentedString(getShowSeriesName())).append("\n");
            sb.append("    showValue: ").append(toIndentedString(getShowValue())).append("\n");
            sb.append("    text: ").append(toIndentedString(getText())).append("\n");
            sb.append("    textDirection: ").append(toIndentedString(getTextDirection())).append("\n");
            sb.append("    textHorizontalAlignment: ").append(toIndentedString(getTextHorizontalAlignment())).append("\n");
            sb.append("    textVerticalAlignment: ").append(toIndentedString(getTextVerticalAlignment())).append("\n");
            sb.append("    area: ").append(toIndentedString(getArea())).append("\n");
            sb.append("    autoScaleFont: ").append(toIndentedString(getAutoScaleFont())).append("\n");
            sb.append("    backgroundMode: ").append(toIndentedString(getBackgroundMode())).append("\n");
            sb.append("    border: ").append(toIndentedString(getBorder())).append("\n");
            sb.append("    font: ").append(toIndentedString(getFont())).append("\n");
            sb.append("    isAutomaticSize: ").append(toIndentedString(getIsAutomaticSize())).append("\n");
            sb.append("    isInnerMode: ").append(toIndentedString(getIsInnerMode())).append("\n");
            sb.append("    shadow: ").append(toIndentedString(getShadow())).append("\n");
            sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
            sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
            sb.append("    x: ").append(toIndentedString(getX())).append("\n");
            sb.append("    y: ").append(toIndentedString(getY())).append("\n");
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

