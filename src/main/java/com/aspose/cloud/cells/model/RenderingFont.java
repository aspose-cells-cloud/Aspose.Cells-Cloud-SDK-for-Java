/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RenderingFont.java">
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


public class RenderingFont {
        @SerializedName("Name")
        private String name ;

        public  RenderingFont  name(String  name) {
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

        @SerializedName("Size")
        private Double size ;

        public  RenderingFont  size(Double  size) {
            this.size =  size;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getSize() {
            return size;
        }

        public void setSize(Double size) {
            this.size = size;
        }

        @SerializedName("Bold")
        private Boolean bold ;

        public  RenderingFont  bold(Boolean  bold) {
            this.bold =  bold;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getBold() {
            return bold;
        }

        public void setBold(Boolean bold) {
            this.bold = bold;
        }

        @SerializedName("Italic")
        private Boolean italic ;

        public  RenderingFont  italic(Boolean  italic) {
            this.italic =  italic;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getItalic() {
            return italic;
        }

        public void setItalic(Boolean italic) {
            this.italic = italic;
        }

        @SerializedName("Color")
        private Color color ;

        public  RenderingFont  color(Color  color) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            RenderingFont renderingFont = (RenderingFont) o;
            return
                Objects.equals(this.name, renderingFont.name) &&
                Objects.equals(this.size, renderingFont.size) &&
                Objects.equals(this.bold, renderingFont.bold) &&
                Objects.equals(this.italic, renderingFont.italic) &&
                Objects.equals(this.color, renderingFont.color);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, size, bold, italic, color);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RenderingFont {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    size: ").append(toIndentedString(getSize())).append("\n");
            sb.append("    bold: ").append(toIndentedString(getBold())).append("\n");
            sb.append("    italic: ").append(toIndentedString(getItalic())).append("\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
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

