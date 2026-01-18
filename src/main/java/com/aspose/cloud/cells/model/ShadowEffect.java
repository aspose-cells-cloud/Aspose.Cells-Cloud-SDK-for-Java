/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ShadowEffect.java">
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


public class ShadowEffect {
        @SerializedName("Angle")
        private Double angle ;

        public  ShadowEffect  angle(Double  angle) {
            this.angle =  angle;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getAngle() {
            return angle;
        }

        public void setAngle(Double angle) {
            this.angle = angle;
        }

        @SerializedName("Blur")
        private Double blur ;

        public  ShadowEffect  blur(Double  blur) {
            this.blur =  blur;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getBlur() {
            return blur;
        }

        public void setBlur(Double blur) {
            this.blur = blur;
        }

        @SerializedName("Color")
        private CellsColor color ;

        public  ShadowEffect  color(CellsColor  color) {
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

        @SerializedName("Distance")
        private Double distance ;

        public  ShadowEffect  distance(Double  distance) {
            this.distance =  distance;
            return this;
        }

        @ApiModelProperty(value = "")
        public Double getDistance() {
            return distance;
        }

        public void setDistance(Double distance) {
            this.distance = distance;
        }

        @SerializedName("PresetType")
        private String presetType ;

        public  ShadowEffect  presetType(String  presetType) {
            this.presetType =  presetType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getPresetType() {
            return presetType;
        }

        public void setPresetType(String presetType) {
            this.presetType = presetType;
        }

        @SerializedName("Size")
        private Double size ;

        public  ShadowEffect  size(Double  size) {
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

        @SerializedName("Transparency")
        private Double transparency ;

        public  ShadowEffect  transparency(Double  transparency) {
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

            ShadowEffect shadowEffect = (ShadowEffect) o;
            return
                Objects.equals(this.angle, shadowEffect.angle) &&
                Objects.equals(this.blur, shadowEffect.blur) &&
                Objects.equals(this.color, shadowEffect.color) &&
                Objects.equals(this.distance, shadowEffect.distance) &&
                Objects.equals(this.presetType, shadowEffect.presetType) &&
                Objects.equals(this.size, shadowEffect.size) &&
                Objects.equals(this.transparency, shadowEffect.transparency);
      }

      @Override
      public int hashCode() {
        return Objects.hash(angle, blur, color, distance, presetType, size, transparency);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ShadowEffect {\n");
            sb.append("    angle: ").append(toIndentedString(getAngle())).append("\n");
            sb.append("    blur: ").append(toIndentedString(getBlur())).append("\n");
            sb.append("    color: ").append(toIndentedString(getColor())).append("\n");
            sb.append("    distance: ").append(toIndentedString(getDistance())).append("\n");
            sb.append("    presetType: ").append(toIndentedString(getPresetType())).append("\n");
            sb.append("    size: ").append(toIndentedString(getSize())).append("\n");
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

