/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ColorFilter.java">
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


public class ColorFilter {
        @SerializedName("FilterByFillColor")
        private Boolean filterByFillColor ;

        public  ColorFilter  filterByFillColor(Boolean  filterByFillColor) {
            this.filterByFillColor =  filterByFillColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getFilterByFillColor() {
            return filterByFillColor;
        }

        public void setFilterByFillColor(Boolean filterByFillColor) {
            this.filterByFillColor = filterByFillColor;
        }

        @SerializedName("Pattern")
        private String pattern ;

        public  ColorFilter  pattern(String  pattern) {
            this.pattern =  pattern;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPattern() {
            return pattern;
        }

        public void setPattern(String pattern) {
            this.pattern = pattern;
        }

        @SerializedName("Color")
        private CellsColor color ;

        public  ColorFilter  color(CellsColor  color) {
            this.color =  color;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellsColor getColor() {
            return color;
        }

        public void setColor(CellsColor color) {
            this.color = color;
        }

        @SerializedName("ForegroundColorColor")
        private CellsColor foregroundColorColor ;

        public  ColorFilter  foregroundColorColor(CellsColor  foregroundColorColor) {
            this.foregroundColorColor =  foregroundColorColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellsColor getForegroundColorColor() {
            return foregroundColorColor;
        }

        public void setForegroundColorColor(CellsColor foregroundColorColor) {
            this.foregroundColorColor = foregroundColorColor;
        }

        @SerializedName("BackgroundColor")
        private CellsColor backgroundColor ;

        public  ColorFilter  backgroundColor(CellsColor  backgroundColor) {
            this.backgroundColor =  backgroundColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellsColor getBackgroundColor() {
            return backgroundColor;
        }

        public void setBackgroundColor(CellsColor backgroundColor) {
            this.backgroundColor = backgroundColor;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ColorFilter colorFilter = (ColorFilter) o;
            return
                Objects.equals(this.filterByFillColor, colorFilter.filterByFillColor) &&
                Objects.equals(this.pattern, colorFilter.pattern) &&
                Objects.equals(this.color, colorFilter.color) &&
                Objects.equals(this.foregroundColorColor, colorFilter.foregroundColorColor) &&
                Objects.equals(this.backgroundColor, colorFilter.backgroundColor);
      }

      @Override
      public int hashCode() {
        return Objects.hash(filterByFillColor, pattern, color, foregroundColorColor, backgroundColor);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ColorFilter {\n");
            sb.append("    filterByFillColor: ").append(toIndentedString(getFilterByFillColor())).append("\n");
            sb.append("    pattern: ").append(toIndentedString(getPattern())).append("\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
            sb.append("    foregroundColorColor: ").append(toIndentedString(getForegroundColorColor())).append("\n");
            sb.append("    backgroundColor: ").append(toIndentedString(getBackgroundColor())).append("\n");
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

