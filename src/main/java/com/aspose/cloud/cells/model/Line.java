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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class Line {
        @SerializedName("BeginArrowLength")
        private String beginArrowLength ;

        public  Line  beginArrowLength(String  beginArrowLength) {
            this.beginArrowLength =  beginArrowLength;
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
        private String beginArrowWidth ;

        public  Line  beginArrowWidth(String  beginArrowWidth) {
            this.beginArrowWidth =  beginArrowWidth;
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
        private String beginType ;

        public  Line  beginType(String  beginType) {
            this.beginType =  beginType;
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
        private String capType ;

        public  Line  capType(String  capType) {
            this.capType =  capType;
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
        private Color color ;

        public  Line  color(Color  color) {
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

        @SerializedName("CompoundType")
        private String compoundType ;

        public  Line  compoundType(String  compoundType) {
            this.compoundType =  compoundType;
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
        private String dashType ;

        public  Line  dashType(String  dashType) {
            this.dashType =  dashType;
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
        private String endArrowLength ;

        public  Line  endArrowLength(String  endArrowLength) {
            this.endArrowLength =  endArrowLength;
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
        private String endArrowWidth ;

        public  Line  endArrowWidth(String  endArrowWidth) {
            this.endArrowWidth =  endArrowWidth;
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
        private String endType ;

        public  Line  endType(String  endType) {
            this.endType =  endType;
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
        private GradientFill gradientFill ;

        public  Line  gradientFill(GradientFill  gradientFill) {
            this.gradientFill =  gradientFill;
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
        private Boolean isAuto ;

        public  Line  isAuto(Boolean  isAuto) {
            this.isAuto =  isAuto;
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
        private Boolean isAutomaticColor ;

        public  Line  isAutomaticColor(Boolean  isAutomaticColor) {
            this.isAutomaticColor =  isAutomaticColor;
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
        private Boolean isVisible ;

        public  Line  isVisible(Boolean  isVisible) {
            this.isVisible =  isVisible;
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
        private String joinType ;

        public  Line  joinType(String  joinType) {
            this.joinType =  joinType;
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
        private String style ;

        public  Line  style(String  style) {
            this.style =  style;
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
        private Double transparency ;

        public  Line  transparency(Double  transparency) {
            this.transparency =  transparency;
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
        private String weight ;

        public  Line  weight(String  weight) {
            this.weight =  weight;
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
        private Double weightPt ;

        public  Line  weightPt(Double  weightPt) {
            this.weightPt =  weightPt;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Line line = (Line) o;
            return
                Objects.equals(this.beginArrowLength, line.beginArrowLength) &&
                Objects.equals(this.beginArrowWidth, line.beginArrowWidth) &&
                Objects.equals(this.beginType, line.beginType) &&
                Objects.equals(this.capType, line.capType) &&
                Objects.equals(this.color, line.color) &&
                Objects.equals(this.compoundType, line.compoundType) &&
                Objects.equals(this.dashType, line.dashType) &&
                Objects.equals(this.endArrowLength, line.endArrowLength) &&
                Objects.equals(this.endArrowWidth, line.endArrowWidth) &&
                Objects.equals(this.endType, line.endType) &&
                Objects.equals(this.gradientFill, line.gradientFill) &&
                Objects.equals(this.isAuto, line.isAuto) &&
                Objects.equals(this.isAutomaticColor, line.isAutomaticColor) &&
                Objects.equals(this.isVisible, line.isVisible) &&
                Objects.equals(this.joinType, line.joinType) &&
                Objects.equals(this.style, line.style) &&
                Objects.equals(this.transparency, line.transparency) &&
                Objects.equals(this.weight, line.weight) &&
                Objects.equals(this.weightPt, line.weightPt);
      }

      @Override
      public int hashCode() {
        return Objects.hash(beginArrowLength, beginArrowWidth, beginType, capType, color, compoundType, dashType, endArrowLength, endArrowWidth, endType, gradientFill, isAuto, isAutomaticColor, isVisible, joinType, style, transparency, weight, weightPt);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Line {\n");
            sb.append("    beginArrowLength: ").append(toIndentedString(getBeginArrowLength())).append("\n");
            sb.append("    beginArrowWidth: ").append(toIndentedString(getBeginArrowWidth())).append("\n");
            sb.append("    beginType: ").append(toIndentedString(getBeginType())).append("\n");
            sb.append("    capType: ").append(toIndentedString(getCapType())).append("\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
            sb.append("    compoundType: ").append(toIndentedString(getCompoundType())).append("\n");
            sb.append("    dashType: ").append(toIndentedString(getDashType())).append("\n");
            sb.append("    endArrowLength: ").append(toIndentedString(getEndArrowLength())).append("\n");
            sb.append("    endArrowWidth: ").append(toIndentedString(getEndArrowWidth())).append("\n");
            sb.append("    endType: ").append(toIndentedString(getEndType())).append("\n");
            sb.append("    gradientFill: ").append(toIndentedString(getGradientFill())).append("\n");
            sb.append("    isAuto: ").append(toIndentedString(getIsAuto())).append("\n");
            sb.append("    isAutomaticColor: ").append(toIndentedString(getIsAutomaticColor())).append("\n");
            sb.append("    isVisible: ").append(toIndentedString(getIsVisible())).append("\n");
            sb.append("    joinType: ").append(toIndentedString(getJoinType())).append("\n");
            sb.append("    style: ").append(toIndentedString(getStyle())).append("\n");
            sb.append("    transparency: ").append(toIndentedString(getTransparency())).append("\n");
            sb.append("    weight: ").append(toIndentedString(getWeight())).append("\n");
            sb.append("    weightPt: ").append(toIndentedString(getWeightPt())).append("\n");
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

