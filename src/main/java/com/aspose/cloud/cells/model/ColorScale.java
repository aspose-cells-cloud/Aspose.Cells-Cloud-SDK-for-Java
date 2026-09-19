/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ColorScale.java">
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


public class ColorScale {
        @SerializedName("MaxCfvo")
        private ConditionalFormattingValue maxCfvo ;

        public  ColorScale  maxCfvo(ConditionalFormattingValue  maxCfvo) {
            this.maxCfvo =  maxCfvo;
            return this;
        }

        @ApiModelProperty(value = "")
        public ConditionalFormattingValue getMaxCfvo() {
            return maxCfvo;
        }

        public void setMaxCfvo(ConditionalFormattingValue maxCfvo) {
            this.maxCfvo = maxCfvo;
        }

        @SerializedName("MaxColor")
        private Color maxColor ;

        public  ColorScale  maxColor(Color  maxColor) {
            this.maxColor =  maxColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Color getMaxColor() {
            return maxColor;
        }

        public void setMaxColor(Color maxColor) {
            this.maxColor = maxColor;
        }

        @SerializedName("MidCfvo")
        private ConditionalFormattingValue midCfvo ;

        public  ColorScale  midCfvo(ConditionalFormattingValue  midCfvo) {
            this.midCfvo =  midCfvo;
            return this;
        }

        @ApiModelProperty(value = "")
        public ConditionalFormattingValue getMidCfvo() {
            return midCfvo;
        }

        public void setMidCfvo(ConditionalFormattingValue midCfvo) {
            this.midCfvo = midCfvo;
        }

        @SerializedName("MidColor")
        private Color midColor ;

        public  ColorScale  midColor(Color  midColor) {
            this.midColor =  midColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Color getMidColor() {
            return midColor;
        }

        public void setMidColor(Color midColor) {
            this.midColor = midColor;
        }

        @SerializedName("MinCfvo")
        private ConditionalFormattingValue minCfvo ;

        public  ColorScale  minCfvo(ConditionalFormattingValue  minCfvo) {
            this.minCfvo =  minCfvo;
            return this;
        }

        @ApiModelProperty(value = "")
        public ConditionalFormattingValue getMinCfvo() {
            return minCfvo;
        }

        public void setMinCfvo(ConditionalFormattingValue minCfvo) {
            this.minCfvo = minCfvo;
        }

        @SerializedName("MinColor")
        private Color minColor ;

        public  ColorScale  minColor(Color  minColor) {
            this.minColor =  minColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Color getMinColor() {
            return minColor;
        }

        public void setMinColor(Color minColor) {
            this.minColor = minColor;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ColorScale colorScale = (ColorScale) o;
            return
                Objects.equals(this.maxCfvo, colorScale.maxCfvo) &&
                Objects.equals(this.maxColor, colorScale.maxColor) &&
                Objects.equals(this.midCfvo, colorScale.midCfvo) &&
                Objects.equals(this.midColor, colorScale.midColor) &&
                Objects.equals(this.minCfvo, colorScale.minCfvo) &&
                Objects.equals(this.minColor, colorScale.minColor);
      }

      @Override
      public int hashCode() {
        return Objects.hash(maxCfvo, maxColor, midCfvo, midColor, minCfvo, minColor);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ColorScale {\n");
            sb.append("    maxCfvo: ").append(toIndentedString(getMaxCfvo())).append("\n");
            sb.append("    maxColor: ").append(toIndentedString(getMaxColor())).append("\n");
            sb.append("    midCfvo: ").append(toIndentedString(getMidCfvo())).append("\n");
            sb.append("    midColor: ").append(toIndentedString(getMidColor())).append("\n");
            sb.append("    minCfvo: ").append(toIndentedString(getMinCfvo())).append("\n");
            sb.append("    minColor: ").append(toIndentedString(getMinColor())).append("\n");
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

