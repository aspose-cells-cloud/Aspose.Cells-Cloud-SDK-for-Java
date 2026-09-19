/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Trendline.java">
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


public class Trendline  extends  Line {
        @SerializedName("Link")
        private Link link ;

        public  Trendline  link(Link  link) {
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

        @SerializedName("Backward")
        private Double backward ;

        public  Trendline  backward(Double  backward) {
            this.backward =  backward;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getBackward() {
            return backward;
        }

        public void setBackward(Double backward) {
            this.backward = backward;
        }

        @SerializedName("DataLabels")
        private DataLabels dataLabels ;

        public  Trendline  dataLabels(DataLabels  dataLabels) {
            this.dataLabels =  dataLabels;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataLabels getDataLabels() {
            return dataLabels;
        }

        public void setDataLabels(DataLabels dataLabels) {
            this.dataLabels = dataLabels;
        }

        @SerializedName("DisplayEquation")
        private Boolean displayEquation ;

        public  Trendline  displayEquation(Boolean  displayEquation) {
            this.displayEquation =  displayEquation;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getDisplayEquation() {
            return displayEquation;
        }

        public void setDisplayEquation(Boolean displayEquation) {
            this.displayEquation = displayEquation;
        }

        @SerializedName("DisplayRSquared")
        private Boolean displayRSquared ;

        public  Trendline  displayRSquared(Boolean  displayRSquared) {
            this.displayRSquared =  displayRSquared;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getDisplayRSquared() {
            return displayRSquared;
        }

        public void setDisplayRSquared(Boolean displayRSquared) {
            this.displayRSquared = displayRSquared;
        }

        @SerializedName("Forward")
        private Double forward ;

        public  Trendline  forward(Double  forward) {
            this.forward =  forward;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getForward() {
            return forward;
        }

        public void setForward(Double forward) {
            this.forward = forward;
        }

        @SerializedName("Intercept")
        private Double intercept ;

        public  Trendline  intercept(Double  intercept) {
            this.intercept =  intercept;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getIntercept() {
            return intercept;
        }

        public void setIntercept(Double intercept) {
            this.intercept = intercept;
        }

        @SerializedName("IsNameAuto")
        private Boolean isNameAuto ;

        public  Trendline  isNameAuto(Boolean  isNameAuto) {
            this.isNameAuto =  isNameAuto;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsNameAuto() {
            return isNameAuto;
        }

        public void setIsNameAuto(Boolean isNameAuto) {
            this.isNameAuto = isNameAuto;
        }

        @SerializedName("LegendEntry")
        private LegendEntry legendEntry ;

        public  Trendline  legendEntry(LegendEntry  legendEntry) {
            this.legendEntry =  legendEntry;
            return this;
        }

        @ApiModelProperty(value = "")
        public LegendEntry getLegendEntry() {
            return legendEntry;
        }

        public void setLegendEntry(LegendEntry legendEntry) {
            this.legendEntry = legendEntry;
        }

        @SerializedName("Name")
        private String name ;

        public  Trendline  name(String  name) {
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

        @SerializedName("Order")
        private Integer order ;

        public  Trendline  order(Integer  order) {
            this.order =  order;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        @SerializedName("Period")
        private Integer period ;

        public  Trendline  period(Integer  period) {
            this.period =  period;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPeriod() {
            return period;
        }

        public void setPeriod(Integer period) {
            this.period = period;
        }

        @SerializedName("Type")
        private String type ;

        public  Trendline  type(String  type) {
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

            Trendline trendline = (Trendline) o;
            return
                Objects.equals(this.link, trendline.link) &&
                Objects.equals(this.backward, trendline.backward) &&
                Objects.equals(this.dataLabels, trendline.dataLabels) &&
                Objects.equals(this.displayEquation, trendline.displayEquation) &&
                Objects.equals(this.displayRSquared, trendline.displayRSquared) &&
                Objects.equals(this.forward, trendline.forward) &&
                Objects.equals(this.intercept, trendline.intercept) &&
                Objects.equals(this.isNameAuto, trendline.isNameAuto) &&
                Objects.equals(this.legendEntry, trendline.legendEntry) &&
                Objects.equals(this.name, trendline.name) &&
                Objects.equals(this.order, trendline.order) &&
                Objects.equals(this.period, trendline.period) &&
                Objects.equals(this.type, trendline.type) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(link, backward, dataLabels, displayEquation, displayRSquared, forward, intercept, isNameAuto, legendEntry, name, order, period, type, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Trendline {\n");
            sb.append("    link: ").append(toIndentedString(getLink())).append("\n");
            sb.append("    backward: ").append(toIndentedString(getBackward())).append("\n");
            sb.append("    dataLabels: ").append(toIndentedString(getDataLabels())).append("\n");
            sb.append("    displayEquation: ").append(toIndentedString(getDisplayEquation())).append("\n");
            sb.append("    displayRSquared: ").append(toIndentedString(getDisplayRSquared())).append("\n");
            sb.append("    forward: ").append(toIndentedString(getForward())).append("\n");
            sb.append("    intercept: ").append(toIndentedString(getIntercept())).append("\n");
            sb.append("    isNameAuto: ").append(toIndentedString(getIsNameAuto())).append("\n");
            sb.append("    legendEntry: ").append(toIndentedString(getLegendEntry())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    order: ").append(toIndentedString(getOrder())).append("\n");
            sb.append("    period: ").append(toIndentedString(getPeriod())).append("\n");
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

