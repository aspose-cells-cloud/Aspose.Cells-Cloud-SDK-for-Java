/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RangeSetOutlineBorderRequest.java">
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


public class RangeSetOutlineBorderRequest {
        @SerializedName("Range")
        private Range range ;

        public  RangeSetOutlineBorderRequest  range(Range  range) {
            this.range =  range;
            return this;
        }

        @ApiModelProperty(value = "")
        public Range getRange() {
            return range;
        }

        public void setRange(Range range) {
            this.range = range;
        }

        @SerializedName("BorderEdge")
        private String borderEdge ;

        public  RangeSetOutlineBorderRequest  borderEdge(String  borderEdge) {
            this.borderEdge =  borderEdge;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getBorderEdge() {
            return borderEdge;
        }

        public void setBorderEdge(String borderEdge) {
            this.borderEdge = borderEdge;
        }

        @SerializedName("BorderStyle")
        private String borderStyle ;

        public  RangeSetOutlineBorderRequest  borderStyle(String  borderStyle) {
            this.borderStyle =  borderStyle;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getBorderStyle() {
            return borderStyle;
        }

        public void setBorderStyle(String borderStyle) {
            this.borderStyle = borderStyle;
        }

        @SerializedName("BorderColor")
        private Color borderColor ;

        public  RangeSetOutlineBorderRequest  borderColor(Color  borderColor) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            RangeSetOutlineBorderRequest rangeSetOutlineBorderRequest = (RangeSetOutlineBorderRequest) o;
            return
                Objects.equals(this.range, rangeSetOutlineBorderRequest.range) &&
                Objects.equals(this.borderEdge, rangeSetOutlineBorderRequest.borderEdge) &&
                Objects.equals(this.borderStyle, rangeSetOutlineBorderRequest.borderStyle) &&
                Objects.equals(this.borderColor, rangeSetOutlineBorderRequest.borderColor);
      }

      @Override
      public int hashCode() {
        return Objects.hash(range, borderEdge, borderStyle, borderColor);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class RangeSetOutlineBorderRequest {\n");
            sb.append("    range: ").append(toIndentedString(getRange())).append("\n");
            sb.append("    borderEdge: ").append(toIndentedString(getBorderEdge())).append("\n");
            sb.append("    borderStyle: ").append(toIndentedString(getBorderStyle())).append("\n");
            sb.append("    borderColor: ").append(toIndentedString(getBorderColor())).append("\n");
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

