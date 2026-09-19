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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class DataBar {
        @SerializedName("AxisColor")
        private Color axisColor ;

        public  DataBar  axisColor(Color  axisColor) {
            this.axisColor =  axisColor;
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
        private String axisPosition ;

        public  DataBar  axisPosition(String  axisPosition) {
            this.axisPosition =  axisPosition;
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
        private DataBarBorder barBorder ;

        public  DataBar  barBorder(DataBarBorder  barBorder) {
            this.barBorder =  barBorder;
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
        private String barFillType ;

        public  DataBar  barFillType(String  barFillType) {
            this.barFillType =  barFillType;
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
        private Color color ;

        public  DataBar  color(Color  color) {
            this.color =  color;
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
        private String direction ;

        public  DataBar  direction(String  direction) {
            this.direction =  direction;
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
        private ConditionalFormattingValue maxCfvo ;

        public  DataBar  maxCfvo(ConditionalFormattingValue  maxCfvo) {
            this.maxCfvo =  maxCfvo;
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
        private Integer maxLength ;

        public  DataBar  maxLength(Integer  maxLength) {
            this.maxLength =  maxLength;
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
        private ConditionalFormattingValue minCfvo ;

        public  DataBar  minCfvo(ConditionalFormattingValue  minCfvo) {
            this.minCfvo =  minCfvo;
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
        private Integer minLength ;

        public  DataBar  minLength(Integer  minLength) {
            this.minLength =  minLength;
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
        private NegativeBarFormat negativeBarFormat ;

        public  DataBar  negativeBarFormat(NegativeBarFormat  negativeBarFormat) {
            this.negativeBarFormat =  negativeBarFormat;
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
        private Boolean showValue ;

        public  DataBar  showValue(Boolean  showValue) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DataBar dataBar = (DataBar) o;
            return
                Objects.equals(this.axisColor, dataBar.axisColor) &&
                Objects.equals(this.axisPosition, dataBar.axisPosition) &&
                Objects.equals(this.barBorder, dataBar.barBorder) &&
                Objects.equals(this.barFillType, dataBar.barFillType) &&
                Objects.equals(this.color, dataBar.color) &&
                Objects.equals(this.direction, dataBar.direction) &&
                Objects.equals(this.maxCfvo, dataBar.maxCfvo) &&
                Objects.equals(this.maxLength, dataBar.maxLength) &&
                Objects.equals(this.minCfvo, dataBar.minCfvo) &&
                Objects.equals(this.minLength, dataBar.minLength) &&
                Objects.equals(this.negativeBarFormat, dataBar.negativeBarFormat) &&
                Objects.equals(this.showValue, dataBar.showValue);
      }

      @Override
      public int hashCode() {
        return Objects.hash(axisColor, axisPosition, barBorder, barFillType, color, direction, maxCfvo, maxLength, minCfvo, minLength, negativeBarFormat, showValue);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataBar {\n");
            sb.append("    axisColor: ").append(toIndentedString(getAxisColor())).append("\n");
            sb.append("    axisPosition: ").append(toIndentedString(getAxisPosition())).append("\n");
            sb.append("    barBorder: ").append(toIndentedString(getBarBorder())).append("\n");
            sb.append("    barFillType: ").append(toIndentedString(getBarFillType())).append("\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
            sb.append("    direction: ").append(toIndentedString(getDirection())).append("\n");
            sb.append("    maxCfvo: ").append(toIndentedString(getMaxCfvo())).append("\n");
            sb.append("    maxLength: ").append(toIndentedString(getMaxLength())).append("\n");
            sb.append("    minCfvo: ").append(toIndentedString(getMinCfvo())).append("\n");
            sb.append("    minLength: ").append(toIndentedString(getMinLength())).append("\n");
            sb.append("    negativeBarFormat: ").append(toIndentedString(getNegativeBarFormat())).append("\n");
            sb.append("    showValue: ").append(toIndentedString(getShowValue())).append("\n");
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

