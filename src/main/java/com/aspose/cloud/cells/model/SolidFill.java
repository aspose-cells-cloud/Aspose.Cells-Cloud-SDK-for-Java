/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SolidFill.java">
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


public class SolidFill {
        @SerializedName("Color")
        private Color color ;

        public  SolidFill  color(Color  color) {
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

        @SerializedName("CellsColor")
        private CellsColor cellsColor ;

        public  SolidFill  cellsColor(CellsColor  cellsColor) {
            this.cellsColor =  cellsColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellsColor getCellsColor() {
            return cellsColor;
        }

        public void setCellsColor(CellsColor cellsColor) {
            this.cellsColor = cellsColor;
        }

        @SerializedName("Transparency")
        private Double transparency ;

        public  SolidFill  transparency(Double  transparency) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            SolidFill solidFill = (SolidFill) o;
            return
                Objects.equals(this.color, solidFill.color) &&
                Objects.equals(this.cellsColor, solidFill.cellsColor) &&
                Objects.equals(this.transparency, solidFill.transparency);
      }

      @Override
      public int hashCode() {
        return Objects.hash(color, cellsColor, transparency);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SolidFill {\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
            sb.append("    cellsColor: ").append(toIndentedString(getCellsColor())).append("\n");
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

