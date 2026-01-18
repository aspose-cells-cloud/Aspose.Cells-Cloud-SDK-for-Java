/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Marker.java">
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


public class Marker {
        @SerializedName("Border")
        private Line border ;

        public  Marker  border(Line  border) {
            this.border =  border;
            return this;
        }

        @ApiModelProperty(value = "")
        public Line getBorder() {
            return border;
        }

        public void setBorder(Line border) {
            this.border = border;
        }

        @SerializedName("Area")
        private Area area ;

        public  Marker  area(Area  area) {
            this.area =  area;
            return this;
        }

        @ApiModelProperty(value = "")
        public Area getArea() {
            return area;
        }

        public void setArea(Area area) {
            this.area = area;
        }

        @SerializedName("MarkerSize")
        private Integer markerSize ;

        public  Marker  markerSize(Integer  markerSize) {
            this.markerSize =  markerSize;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getMarkerSize() {
            return markerSize;
        }

        public void setMarkerSize(Integer markerSize) {
            this.markerSize = markerSize;
        }

        @SerializedName("MarkerStyle")
        private String markerStyle ;

        public  Marker  markerStyle(String  markerStyle) {
            this.markerStyle =  markerStyle;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getMarkerStyle() {
            return markerStyle;
        }

        public void setMarkerStyle(String markerStyle) {
            this.markerStyle = markerStyle;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            Marker marker = (Marker) o;
            return
                Objects.equals(this.border, marker.border) &&
                Objects.equals(this.area, marker.area) &&
                Objects.equals(this.markerSize, marker.markerSize) &&
                Objects.equals(this.markerStyle, marker.markerStyle);
      }

      @Override
      public int hashCode() {
        return Objects.hash(border, area, markerSize, markerStyle);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class Marker {\n");
            sb.append("    border: ").append(toIndentedString(getBorder())).append("\n");
            sb.append("    area: ").append(toIndentedString(getArea())).append("\n");
            sb.append("    markerSize: ").append(toIndentedString(getMarkerSize())).append("\n");
            sb.append("    markerStyle: ").append(toIndentedString(getMarkerStyle())).append("\n");
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

