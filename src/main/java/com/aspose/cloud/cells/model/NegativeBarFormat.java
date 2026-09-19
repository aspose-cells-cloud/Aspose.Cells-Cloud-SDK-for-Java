/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="NegativeBarFormat.java">
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


public class NegativeBarFormat {
        @SerializedName("BorderColor")
        private Color borderColor ;

        public  NegativeBarFormat  borderColor(Color  borderColor) {
            this.borderColor =  borderColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Color getBorderColor() {
            return borderColor;
        }

        public void setBorderColor(Color borderColor) {
            this.borderColor = borderColor;
        }

        @SerializedName("BorderColorType")
        private String borderColorType ;

        public  NegativeBarFormat  borderColorType(String  borderColorType) {
            this.borderColorType =  borderColorType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getBorderColorType() {
            return borderColorType;
        }

        public void setBorderColorType(String borderColorType) {
            this.borderColorType = borderColorType;
        }

        @SerializedName("Color")
        private Color color ;

        public  NegativeBarFormat  color(Color  color) {
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

        @SerializedName("ColorType")
        private String colorType ;

        public  NegativeBarFormat  colorType(String  colorType) {
            this.colorType =  colorType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getColorType() {
            return colorType;
        }

        public void setColorType(String colorType) {
            this.colorType = colorType;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            NegativeBarFormat negativeBarFormat = (NegativeBarFormat) o;
            return
                Objects.equals(this.borderColor, negativeBarFormat.borderColor) &&
                Objects.equals(this.borderColorType, negativeBarFormat.borderColorType) &&
                Objects.equals(this.color, negativeBarFormat.color) &&
                Objects.equals(this.colorType, negativeBarFormat.colorType);
      }

      @Override
      public int hashCode() {
        return Objects.hash(borderColor, borderColorType, color, colorType);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class NegativeBarFormat {\n");
            sb.append("    borderColor: ").append(toIndentedString(getBorderColor())).append("\n");
            sb.append("    borderColorType: ").append(toIndentedString(getBorderColorType())).append("\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
            sb.append("    colorType: ").append(toIndentedString(getColorType())).append("\n");
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

