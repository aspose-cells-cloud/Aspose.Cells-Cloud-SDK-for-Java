/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GradientFill.java">
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


public class GradientFill {
        @SerializedName("FillType")
        private String fillType ;

        public  GradientFill  fillType(String  fillType) {
            this.fillType =  fillType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFillType() {
            return fillType;
        }

        public void setFillType(String fillType) {
            this.fillType = fillType;
        }

        @SerializedName("DirectionType")
        private String directionType ;

        public  GradientFill  directionType(String  directionType) {
            this.directionType =  directionType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDirectionType() {
            return directionType;
        }

        public void setDirectionType(String directionType) {
            this.directionType = directionType;
        }

        @SerializedName("Angle")
        private Double angle ;

        public  GradientFill  angle(Double  angle) {
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

        @SerializedName("GradientStops")
        private List<GradientFillStop> gradientStops ;

        public  GradientFill  gradientStops(List<GradientFillStop>  gradientStops) {
            this.gradientStops =  gradientStops;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<GradientFillStop> getGradientStops() {
            return gradientStops;
        }

        public void setGradientStops(List<GradientFillStop> gradientStops) {
            this.gradientStops = gradientStops;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            GradientFill gradientFill = (GradientFill) o;
            return
                Objects.equals(this.fillType, gradientFill.fillType) &&
                Objects.equals(this.directionType, gradientFill.directionType) &&
                Objects.equals(this.angle, gradientFill.angle) &&
                Objects.equals(this.gradientStops, gradientFill.gradientStops);
      }

      @Override
      public int hashCode() {
        return Objects.hash(fillType, directionType, angle, gradientStops);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class GradientFill {\n");
            sb.append("    fillType: ").append(toIndentedString(getFillType())).append("\n");
            sb.append("    directionType: ").append(toIndentedString(getDirectionType())).append("\n");
            sb.append("    angle: ").append(toIndentedString(getAngle())).append("\n");
            sb.append("    gradientStops: ").append(toIndentedString(getGradientStops())).append("\n");
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

