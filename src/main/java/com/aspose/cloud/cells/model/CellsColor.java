/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellsColor.java">
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


public class CellsColor {
        @SerializedName("Color")
        private Color color ;

        public  CellsColor  color(Color  color) {
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

        @SerializedName("ColorIndex")
        private Integer colorIndex ;

        public  CellsColor  colorIndex(Integer  colorIndex) {
            this.colorIndex =  colorIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getColorIndex() {
            return colorIndex;
        }

        public void setColorIndex(Integer colorIndex) {
            this.colorIndex = colorIndex;
        }

        @SerializedName("IsShapeColor")
        private Boolean isShapeColor ;

        public  CellsColor  isShapeColor(Boolean  isShapeColor) {
            this.isShapeColor =  isShapeColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getIsShapeColor() {
            return isShapeColor;
        }

        public void setIsShapeColor(Boolean isShapeColor) {
            this.isShapeColor = isShapeColor;
        }

        @SerializedName("Tint")
        private Double tint ;

        public  CellsColor  tint(Double  tint) {
            this.tint =  tint;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getTint() {
            return tint;
        }

        public void setTint(Double tint) {
            this.tint = tint;
        }

        @SerializedName("Argb")
        private Integer argb ;

        public  CellsColor  argb(Integer  argb) {
            this.argb =  argb;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getArgb() {
            return argb;
        }

        public void setArgb(Integer argb) {
            this.argb = argb;
        }

        @SerializedName("ThemeColor")
        private ThemeColor themeColor ;

        public  CellsColor  themeColor(ThemeColor  themeColor) {
            this.themeColor =  themeColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public ThemeColor getThemeColor() {
            return themeColor;
        }

        public void setThemeColor(ThemeColor themeColor) {
            this.themeColor = themeColor;
        }

        @SerializedName("Type")
        private String type ;

        public  CellsColor  type(String  type) {
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

        @SerializedName("Transparency")
        private Double transparency ;

        public  CellsColor  transparency(Double  transparency) {
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

            CellsColor cellsColor = (CellsColor) o;
            return
                Objects.equals(this.color, cellsColor.color) &&
                Objects.equals(this.colorIndex, cellsColor.colorIndex) &&
                Objects.equals(this.isShapeColor, cellsColor.isShapeColor) &&
                Objects.equals(this.tint, cellsColor.tint) &&
                Objects.equals(this.argb, cellsColor.argb) &&
                Objects.equals(this.themeColor, cellsColor.themeColor) &&
                Objects.equals(this.type, cellsColor.type) &&
                Objects.equals(this.transparency, cellsColor.transparency);
      }

      @Override
      public int hashCode() {
        return Objects.hash(color, colorIndex, isShapeColor, tint, argb, themeColor, type, transparency);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CellsColor {\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
            sb.append("    colorIndex: ").append(toIndentedString(getColorIndex())).append("\n");
            sb.append("    isShapeColor: ").append(toIndentedString(getIsShapeColor())).append("\n");
            sb.append("    tint: ").append(toIndentedString(getTint())).append("\n");
            sb.append("    argb: ").append(toIndentedString(getArgb())).append("\n");
            sb.append("    themeColor: ").append(toIndentedString(getThemeColor())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
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

