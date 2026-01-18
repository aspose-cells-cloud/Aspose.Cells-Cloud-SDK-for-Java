/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PlotArea.java">
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


public class PlotArea  extends  ChartFrame {
        @SerializedName("InnerHeight")
        private Integer innerHeight ;

        public  PlotArea  innerHeight(Integer  innerHeight) {
            this.innerHeight =  innerHeight;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getInnerHeight() {
            return innerHeight;
        }

        public void setInnerHeight(Integer innerHeight) {
            this.innerHeight = innerHeight;
        }

        @SerializedName("InnerWidth")
        private Integer innerWidth ;

        public  PlotArea  innerWidth(Integer  innerWidth) {
            this.innerWidth =  innerWidth;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getInnerWidth() {
            return innerWidth;
        }

        public void setInnerWidth(Integer innerWidth) {
            this.innerWidth = innerWidth;
        }

        @SerializedName("InnerX")
        private Integer innerX ;

        public  PlotArea  innerX(Integer  innerX) {
            this.innerX =  innerX;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getInnerX() {
            return innerX;
        }

        public void setInnerX(Integer innerX) {
            this.innerX = innerX;
        }

        @SerializedName("InnerY")
        private Integer innerY ;

        public  PlotArea  innerY(Integer  innerY) {
            this.innerY =  innerY;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getInnerY() {
            return innerY;
        }

        public void setInnerY(Integer innerY) {
            this.innerY = innerY;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PlotArea plotArea = (PlotArea) o;
            return
                Objects.equals(this.innerHeight, plotArea.innerHeight) &&
                Objects.equals(this.innerWidth, plotArea.innerWidth) &&
                Objects.equals(this.innerX, plotArea.innerX) &&
                Objects.equals(this.innerY, plotArea.innerY) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(innerHeight, innerWidth, innerX, innerY, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PlotArea {\n");
            sb.append("    innerHeight: ").append(toIndentedString(getInnerHeight())).append("\n");
            sb.append("    innerWidth: ").append(toIndentedString(getInnerWidth())).append("\n");
            sb.append("    innerX: ").append(toIndentedString(getInnerX())).append("\n");
            sb.append("    innerY: ").append(toIndentedString(getInnerY())).append("\n");
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

