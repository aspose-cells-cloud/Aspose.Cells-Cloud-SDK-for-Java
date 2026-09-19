/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DiscoverChart.java">
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


public class DiscoverChart {
        @SerializedName("Name")
        private String name ;

        public  DiscoverChart  name(String  name) {
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

        @SerializedName("SheetName")
        private String sheetName ;

        public  DiscoverChart  sheetName(String  sheetName) {
            this.sheetName =  sheetName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSheetName() {
            return sheetName;
        }

        public void setSheetName(String sheetName) {
            this.sheetName = sheetName;
        }

        @SerializedName("Title")
        private String title ;

        public  DiscoverChart  title(String  title) {
            this.title =  title;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        @SerializedName("Type")
        private String type ;

        public  DiscoverChart  type(String  type) {
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

        @SerializedName("DataRange")
        private String dataRange ;

        public  DiscoverChart  dataRange(String  dataRange) {
            this.dataRange =  dataRange;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDataRange() {
            return dataRange;
        }

        public void setDataRange(String dataRange) {
            this.dataRange = dataRange;
        }

        @SerializedName("Thumbnail")
        private String thumbnail ;

        public  DiscoverChart  thumbnail(String  thumbnail) {
            this.thumbnail =  thumbnail;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DiscoverChart discoverChart = (DiscoverChart) o;
            return
                Objects.equals(this.name, discoverChart.name) &&
                Objects.equals(this.sheetName, discoverChart.sheetName) &&
                Objects.equals(this.title, discoverChart.title) &&
                Objects.equals(this.type, discoverChart.type) &&
                Objects.equals(this.dataRange, discoverChart.dataRange) &&
                Objects.equals(this.thumbnail, discoverChart.thumbnail);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, sheetName, title, type, dataRange, thumbnail);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DiscoverChart {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    sheetName: ").append(toIndentedString(getSheetName())).append("\n");
            sb.append("    title: ").append(toIndentedString(getTitle())).append("\n");
            sb.append("    type: ").append(toIndentedString(getType())).append("\n");
            sb.append("    dataRange: ").append(toIndentedString(getDataRange())).append("\n");
            sb.append("    thumbnail: ").append(toIndentedString(getThumbnail())).append("\n");
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

