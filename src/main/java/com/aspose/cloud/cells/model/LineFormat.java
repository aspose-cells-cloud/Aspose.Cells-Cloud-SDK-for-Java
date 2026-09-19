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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class LineFormat  extends  FillFormat {
        @SerializedName("BeginArrowheadLength")
        private String beginArrowheadLength ;

        public  LineFormat  beginArrowheadLength(String  beginArrowheadLength) {
            this.beginArrowheadLength =  beginArrowheadLength;
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
        private String beginArrowheadStyle ;

        public  LineFormat  beginArrowheadStyle(String  beginArrowheadStyle) {
            this.beginArrowheadStyle =  beginArrowheadStyle;
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
        private String beginArrowheadWidth ;

        public  LineFormat  beginArrowheadWidth(String  beginArrowheadWidth) {
            this.beginArrowheadWidth =  beginArrowheadWidth;
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
        private String capType ;

        public  LineFormat  capType(String  capType) {
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

        @SerializedName("CompoundType")
        private String compoundType ;

        public  LineFormat  compoundType(String  compoundType) {
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

        @SerializedName("DashStyle")
        private String dashStyle ;

        public  LineFormat  dashStyle(String  dashStyle) {
            this.dashStyle =  dashStyle;
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
        private String endArrowheadLength ;

        public  LineFormat  endArrowheadLength(String  endArrowheadLength) {
            this.endArrowheadLength =  endArrowheadLength;
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
        private String endArrowheadStyle ;

        public  LineFormat  endArrowheadStyle(String  endArrowheadStyle) {
            this.endArrowheadStyle =  endArrowheadStyle;
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
        private String endArrowheadWidth ;

        public  LineFormat  endArrowheadWidth(String  endArrowheadWidth) {
            this.endArrowheadWidth =  endArrowheadWidth;
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
        private String joinType ;

        public  LineFormat  joinType(String  joinType) {
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

        @SerializedName("Weight")
        private Double weight ;

        public  LineFormat  weight(Double  weight) {
            this.weight =  weight;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            LineFormat lineFormat = (LineFormat) o;
            return
                Objects.equals(this.beginArrowheadLength, lineFormat.beginArrowheadLength) &&
                Objects.equals(this.beginArrowheadStyle, lineFormat.beginArrowheadStyle) &&
                Objects.equals(this.beginArrowheadWidth, lineFormat.beginArrowheadWidth) &&
                Objects.equals(this.capType, lineFormat.capType) &&
                Objects.equals(this.compoundType, lineFormat.compoundType) &&
                Objects.equals(this.dashStyle, lineFormat.dashStyle) &&
                Objects.equals(this.endArrowheadLength, lineFormat.endArrowheadLength) &&
                Objects.equals(this.endArrowheadStyle, lineFormat.endArrowheadStyle) &&
                Objects.equals(this.endArrowheadWidth, lineFormat.endArrowheadWidth) &&
                Objects.equals(this.joinType, lineFormat.joinType) &&
                Objects.equals(this.weight, lineFormat.weight) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(beginArrowheadLength, beginArrowheadStyle, beginArrowheadWidth, capType, compoundType, dashStyle, endArrowheadLength, endArrowheadStyle, endArrowheadWidth, joinType, weight, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LineFormat {\n");
            sb.append("    beginArrowheadLength: ").append(toIndentedString(getBeginArrowheadLength())).append("\n");
            sb.append("    beginArrowheadStyle: ").append(toIndentedString(getBeginArrowheadStyle())).append("\n");
            sb.append("    beginArrowheadWidth: ").append(toIndentedString(getBeginArrowheadWidth())).append("\n");
            sb.append("    capType: ").append(toIndentedString(getCapType())).append("\n");
            sb.append("    compoundType: ").append(toIndentedString(getCompoundType())).append("\n");
            sb.append("    dashStyle: ").append(toIndentedString(getDashStyle())).append("\n");
            sb.append("    endArrowheadLength: ").append(toIndentedString(getEndArrowheadLength())).append("\n");
            sb.append("    endArrowheadStyle: ").append(toIndentedString(getEndArrowheadStyle())).append("\n");
            sb.append("    endArrowheadWidth: ").append(toIndentedString(getEndArrowheadWidth())).append("\n");
            sb.append("    joinType: ").append(toIndentedString(getJoinType())).append("\n");
            sb.append("    weight: ").append(toIndentedString(getWeight())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    solidFill: ").append(toIndentedString(getSolidFill())).append("\n");
            sb.append("    patternFill: ").append(toIndentedString(getPatternFill())).append("\n");
            sb.append("    textureFill: ").append(toIndentedString(getTextureFill())).append("\n");
            sb.append("    gradientFill: ").append(toIndentedString(getGradientFill())).append("\n");
            sb.append("    imageData: ").append(toIndentedString(getImageData())).append("\n");
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

