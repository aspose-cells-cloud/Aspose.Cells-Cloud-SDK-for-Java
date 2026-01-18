/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PatternFill.java">
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


public class PatternFill {
        @SerializedName("Pattern")
        private String pattern ;

        public  PatternFill  pattern(String  pattern) {
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

        @SerializedName("BackgroundCellsColor")
        private CellsColor backgroundCellsColor ;

        public  PatternFill  backgroundCellsColor(CellsColor  backgroundCellsColor) {
            this.backgroundCellsColor =  backgroundCellsColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellsColor getBackgroundCellsColor() {
            return backgroundCellsColor;
        }

        public void setBackgroundCellsColor(CellsColor backgroundCellsColor) {
            this.backgroundCellsColor = backgroundCellsColor;
        }

        @SerializedName("ForegroundCellsColor")
        private CellsColor foregroundCellsColor ;

        public  PatternFill  foregroundCellsColor(CellsColor  foregroundCellsColor) {
            this.foregroundCellsColor =  foregroundCellsColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public CellsColor getForegroundCellsColor() {
            return foregroundCellsColor;
        }

        public void setForegroundCellsColor(CellsColor foregroundCellsColor) {
            this.foregroundCellsColor = foregroundCellsColor;
        }

        @SerializedName("ForegroundColor")
        private Color foregroundColor ;

        public  PatternFill  foregroundColor(Color  foregroundColor) {
            this.foregroundColor =  foregroundColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Color getForegroundColor() {
            return foregroundColor;
        }

        public void setForegroundColor(Color foregroundColor) {
            this.foregroundColor = foregroundColor;
        }

        @SerializedName("BackgroundColor")
        private Color backgroundColor ;

        public  PatternFill  backgroundColor(Color  backgroundColor) {
            this.backgroundColor =  backgroundColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Color getBackgroundColor() {
            return backgroundColor;
        }

        public void setBackgroundColor(Color backgroundColor) {
            this.backgroundColor = backgroundColor;
        }

        @SerializedName("BackTransparency")
        private Double backTransparency ;

        public  PatternFill  backTransparency(Double  backTransparency) {
            this.backTransparency =  backTransparency;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getBackTransparency() {
            return backTransparency;
        }

        public void setBackTransparency(Double backTransparency) {
            this.backTransparency = backTransparency;
        }

        @SerializedName("ForeTransparency")
        private Double foreTransparency ;

        public  PatternFill  foreTransparency(Double  foreTransparency) {
            this.foreTransparency =  foreTransparency;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getForeTransparency() {
            return foreTransparency;
        }

        public void setForeTransparency(Double foreTransparency) {
            this.foreTransparency = foreTransparency;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PatternFill patternFill = (PatternFill) o;
            return
                Objects.equals(this.pattern, patternFill.pattern) &&
                Objects.equals(this.backgroundCellsColor, patternFill.backgroundCellsColor) &&
                Objects.equals(this.foregroundCellsColor, patternFill.foregroundCellsColor) &&
                Objects.equals(this.foregroundColor, patternFill.foregroundColor) &&
                Objects.equals(this.backgroundColor, patternFill.backgroundColor) &&
                Objects.equals(this.backTransparency, patternFill.backTransparency) &&
                Objects.equals(this.foreTransparency, patternFill.foreTransparency);
      }

      @Override
      public int hashCode() {
        return Objects.hash(pattern, backgroundCellsColor, foregroundCellsColor, foregroundColor, backgroundColor, backTransparency, foreTransparency);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PatternFill {\n");
            sb.append("    pattern: ").append(toIndentedString(getPattern())).append("\n");
            sb.append("    backgroundCellsColor: ").append(toIndentedString(getBackgroundCellsColor())).append("\n");
            sb.append("    foregroundCellsColor: ").append(toIndentedString(getForegroundCellsColor())).append("\n");
            sb.append("    foregroundColor: ").append(toIndentedString(getForegroundColor())).append("\n");
            sb.append("    backgroundColor: ").append(toIndentedString(getBackgroundColor())).append("\n");
            sb.append("    backTransparency: ").append(toIndentedString(getBackTransparency())).append("\n");
            sb.append("    foreTransparency: ").append(toIndentedString(getForeTransparency())).append("\n");
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

