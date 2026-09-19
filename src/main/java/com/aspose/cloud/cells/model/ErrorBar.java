/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ErrorBar.java">
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


public class ErrorBar  extends  Line {
        @SerializedName("Link")
        private Link link ;

        public  ErrorBar  link(Link  link) {
            this.link =  link;
            return this;
        }

        @ApiModelProperty(value = "")
        public Link getLink() {
            return link;
        }

        public void setLink(Link link) {
            this.link = link;
        }

        @SerializedName("Amount")
        private Double amount ;

        public  ErrorBar  amount(Double  amount) {
            this.amount =  amount;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getAmount() {
            return amount;
        }

        public void setAmount(Double amount) {
            this.amount = amount;
        }

        @SerializedName("DisplayType")
        private String displayType ;

        public  ErrorBar  displayType(String  displayType) {
            this.displayType =  displayType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDisplayType() {
            return displayType;
        }

        public void setDisplayType(String displayType) {
            this.displayType = displayType;
        }

        @SerializedName("MinusValue")
        private String minusValue ;

        public  ErrorBar  minusValue(String  minusValue) {
            this.minusValue =  minusValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getMinusValue() {
            return minusValue;
        }

        public void setMinusValue(String minusValue) {
            this.minusValue = minusValue;
        }

        @SerializedName("PlusValue")
        private String plusValue ;

        public  ErrorBar  plusValue(String  plusValue) {
            this.plusValue =  plusValue;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPlusValue() {
            return plusValue;
        }

        public void setPlusValue(String plusValue) {
            this.plusValue = plusValue;
        }

        @SerializedName("ShowMarkerTTop")
        private Boolean showMarkerTTop ;

        public  ErrorBar  showMarkerTTop(Boolean  showMarkerTTop) {
            this.showMarkerTTop =  showMarkerTTop;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShowMarkerTTop() {
            return showMarkerTTop;
        }

        public void setShowMarkerTTop(Boolean showMarkerTTop) {
            this.showMarkerTTop = showMarkerTTop;
        }

        @SerializedName("Type")
        private String type ;

        public  ErrorBar  type(String  type) {
            this.type =  type;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ErrorBar errorBar = (ErrorBar) o;
            return
                Objects.equals(this.link, errorBar.link) &&
                Objects.equals(this.amount, errorBar.amount) &&
                Objects.equals(this.displayType, errorBar.displayType) &&
                Objects.equals(this.minusValue, errorBar.minusValue) &&
                Objects.equals(this.plusValue, errorBar.plusValue) &&
                Objects.equals(this.showMarkerTTop, errorBar.showMarkerTTop) &&
                Objects.equals(this.type, errorBar.type) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(link, amount, displayType, minusValue, plusValue, showMarkerTTop, type, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ErrorBar {\n");
            sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
            sb.append("    amount: ").append(toIndentedString(getAmount())).append("\n");
            sb.append("    displayType: ").append(toIndentedString(getDisplayType())).append("\n");
            sb.append("    minusValue: ").append(toIndentedString(getMinusValue())).append("\n");
            sb.append("    plusValue: ").append(toIndentedString(getPlusValue())).append("\n");
            sb.append("    showMarkerTTop: ").append(toIndentedString(getShowMarkerTTop())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
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

