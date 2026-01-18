/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Walls.java">
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


public class Walls  extends  Floor {
        @SerializedName("CenterX")
        private Integer centerX ;

        public  Walls  centerX(Integer  centerX) {
            this.centerX =  centerX;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getCenterX() {
            return centerX;
        }

        public void setCenterX(Integer centerX) {
            this.centerX = centerX;
        }

        @SerializedName("CenterY")
        private Integer centerY ;

        public  Walls  centerY(Integer  centerY) {
            this.centerY =  centerY;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getCenterY() {
            return centerY;
        }

        public void setCenterY(Integer centerY) {
            this.centerY = centerY;
        }

        @SerializedName("Depth")
        private Integer depth ;

        public  Walls  depth(Integer  depth) {
            this.depth =  depth;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getDepth() {
            return depth;
        }

        public void setDepth(Integer depth) {
            this.depth = depth;
        }

        @SerializedName("Height")
        private Integer height ;

        public  Walls  height(Integer  height) {
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

        @SerializedName("Width")
        private Integer width ;

        public  Walls  width(Integer  width) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Walls walls = (Walls) o;
            return
                Objects.equals(this.centerX, walls.centerX) &&
                Objects.equals(this.centerY, walls.centerY) &&
                Objects.equals(this.depth, walls.depth) &&
                Objects.equals(this.height, walls.height) &&
                Objects.equals(this.width, walls.width) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(centerX, centerY, depth, height, width, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Walls {\n");
            sb.append("    centerX: ").append(toIndentedString(getCenterX())).append("\n");
            sb.append("    centerY: ").append(toIndentedString(getCenterY())).append("\n");
            sb.append("    depth: ").append(toIndentedString(getDepth())).append("\n");
            sb.append("    height: ").append(toIndentedString(getHeight())).append("\n");
            sb.append("    width: ").append(toIndentedString(getWidth())).append("\n");
            sb.append("    border: ").append(toIndentedString(getBorder())).append("\n");
            sb.append("    backgroundColor: ").append(toIndentedString(getBackgroundColor())).append("\n");
            sb.append("    fillFormat: ").append(toIndentedString(getFillFormat())).append("\n");
            sb.append("    foregroundColor: ").append(toIndentedString(getForegroundColor())).append("\n");
            sb.append("    format: ").append(toIndentedString(getFormat())).append("\n");
            sb.append("    invertIfNegative: ").append(toIndentedString(getInvertIfNegative())).append("\n");
            sb.append("    transparency: ").append(toIndentedString(getTransparency())).append("\n");
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

