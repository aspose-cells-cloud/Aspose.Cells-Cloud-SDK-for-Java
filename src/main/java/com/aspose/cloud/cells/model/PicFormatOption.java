/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PicFormatOption.java">
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


public class PicFormatOption {
        @SerializedName("Type")
        private String type ;

        public  PicFormatOption  type(String  type) {
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

        @SerializedName("Scale")
        private Double scale ;

        public  PicFormatOption  scale(Double  scale) {
            this.scale =  scale;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getScale() {
            return scale;
        }

        public void setScale(Double scale) {
            this.scale = scale;
        }

        @SerializedName("Left")
        private Double left ;

        public  PicFormatOption  left(Double  left) {
            this.left =  left;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getLeft() {
            return left;
        }

        public void setLeft(Double left) {
            this.left = left;
        }

        @SerializedName("Right")
        private Double right ;

        public  PicFormatOption  right(Double  right) {
            this.right =  right;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getRight() {
            return right;
        }

        public void setRight(Double right) {
            this.right = right;
        }

        @SerializedName("Top")
        private Double top ;

        public  PicFormatOption  top(Double  top) {
            this.top =  top;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getTop() {
            return top;
        }

        public void setTop(Double top) {
            this.top = top;
        }

        @SerializedName("Bottom")
        private Double bottom ;

        public  PicFormatOption  bottom(Double  bottom) {
            this.bottom =  bottom;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getBottom() {
            return bottom;
        }

        public void setBottom(Double bottom) {
            this.bottom = bottom;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PicFormatOption picFormatOption = (PicFormatOption) o;
            return
                Objects.equals(this.type, picFormatOption.type) &&
                Objects.equals(this.scale, picFormatOption.scale) &&
                Objects.equals(this.left, picFormatOption.left) &&
                Objects.equals(this.right, picFormatOption.right) &&
                Objects.equals(this.top, picFormatOption.top) &&
                Objects.equals(this.bottom, picFormatOption.bottom);
      }

      @Override
      public int hashCode() {
        return Objects.hash(type, scale, left, right, top, bottom);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PicFormatOption {\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    scale: ").append(toIndentedString(getScale())).append("\n");
            sb.append("    left: ").append(toIndentedString(getLeft())).append("\n");
            sb.append("    right: ").append(toIndentedString(getRight())).append("\n");
            sb.append("    top: ").append(toIndentedString(getTop())).append("\n");
            sb.append("    bottom: ").append(toIndentedString(getBottom())).append("\n");
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

