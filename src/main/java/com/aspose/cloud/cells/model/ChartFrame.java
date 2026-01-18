/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ChartFrame.java">
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


public class ChartFrame {
        @SerializedName("Area")
        private Area area ;

        public  ChartFrame  area(Area  area) {
            this.area =  area;
            return this;
        }

        @ApiModelProperty(value = "")
        public Area getArea() {
            return area;
        }

        public void setArea(Area area) {
            this.area = area;
        }

        @SerializedName("AutoScaleFont")
        private Boolean autoScaleFont ;

        public  ChartFrame  autoScaleFont(Boolean  autoScaleFont) {
            this.autoScaleFont =  autoScaleFont;
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
        private String backgroundMode ;

        public  ChartFrame  backgroundMode(String  backgroundMode) {
            this.backgroundMode =  backgroundMode;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getBackgroundMode() {
            return backgroundMode;
        }

        public void setBackgroundMode(String backgroundMode) {
            this.backgroundMode = backgroundMode;
        }

        @SerializedName("Border")
        private Line border ;

        public  ChartFrame  border(Line  border) {
            this.border =  border;
            return this;
        }

        @ApiModelProperty(value = "")
        public Line getBorder() {
            return border;
        }

        public void setBorder(Line border) {
            this.border = border;
        }

        @SerializedName("Font")
        private Font font ;

        public  ChartFrame  font(Font  font) {
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

        @SerializedName("IsAutomaticSize")
        private Boolean isAutomaticSize ;

        public  ChartFrame  isAutomaticSize(Boolean  isAutomaticSize) {
            this.isAutomaticSize =  isAutomaticSize;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsAutomaticSize() {
            return isAutomaticSize;
        }

        public void setIsAutomaticSize(Boolean isAutomaticSize) {
            this.isAutomaticSize = isAutomaticSize;
        }

        @SerializedName("IsInnerMode")
        private Boolean isInnerMode ;

        public  ChartFrame  isInnerMode(Boolean  isInnerMode) {
            this.isInnerMode =  isInnerMode;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsInnerMode() {
            return isInnerMode;
        }

        public void setIsInnerMode(Boolean isInnerMode) {
            this.isInnerMode = isInnerMode;
        }

        @SerializedName("Shadow")
        private Boolean shadow ;

        public  ChartFrame  shadow(Boolean  shadow) {
            this.shadow =  shadow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getShadow() {
            return shadow;
        }

        public void setShadow(Boolean shadow) {
            this.shadow = shadow;
        }

        @SerializedName("Width")
        private Integer width ;

        public  ChartFrame  width(Integer  width) {
            this.width =  width;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        @SerializedName("Height")
        private Integer height ;

        public  ChartFrame  height(Integer  height) {
            this.height =  height;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        @SerializedName("X")
        private Integer x ;

        public  ChartFrame  x(Integer  x) {
            this.x =  x;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getX() {
            return x;
        }

        public void setX(Integer x) {
            this.x = x;
        }

        @SerializedName("Y")
        private Integer y ;

        public  ChartFrame  y(Integer  y) {
            this.y =  y;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getY() {
            return y;
        }

        public void setY(Integer y) {
            this.y = y;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ChartFrame chartFrame = (ChartFrame) o;
            return
                Objects.equals(this.area, chartFrame.area) &&
                Objects.equals(this.autoScaleFont, chartFrame.autoScaleFont) &&
                Objects.equals(this.backgroundMode, chartFrame.backgroundMode) &&
                Objects.equals(this.border, chartFrame.border) &&
                Objects.equals(this.font, chartFrame.font) &&
                Objects.equals(this.isAutomaticSize, chartFrame.isAutomaticSize) &&
                Objects.equals(this.isInnerMode, chartFrame.isInnerMode) &&
                Objects.equals(this.shadow, chartFrame.shadow) &&
                Objects.equals(this.width, chartFrame.width) &&
                Objects.equals(this.height, chartFrame.height) &&
                Objects.equals(this.x, chartFrame.x) &&
                Objects.equals(this.y, chartFrame.y);
      }

      @Override
      public int hashCode() {
        return Objects.hash(area, autoScaleFont, backgroundMode, border, font, isAutomaticSize, isInnerMode, shadow, width, height, x, y);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ChartFrame {\n");
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

