/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SpecifyCellsObject.java">
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


public class SpecifyCellsObject {
        @SerializedName("WorksheetName")
        private String worksheetName ;

        public  SpecifyCellsObject  worksheetName(String  worksheetName) {
            this.worksheetName =  worksheetName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getWorksheetName() {
            return worksheetName;
        }

        public void setWorksheetName(String worksheetName) {
            this.worksheetName = worksheetName;
        }

        @SerializedName("PageIndex")
        private Integer pageIndex ;

        public  SpecifyCellsObject  pageIndex(Integer  pageIndex) {
            this.pageIndex =  pageIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPageIndex() {
            return pageIndex;
        }

        public void setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
        }

        @SerializedName("Region")
        private String region ;

        public  SpecifyCellsObject  region(String  region) {
            this.region =  region;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            SpecifyCellsObject specifyCellsObject = (SpecifyCellsObject) o;
            return
                Objects.equals(this.worksheetName, specifyCellsObject.worksheetName) &&
                Objects.equals(this.pageIndex, specifyCellsObject.pageIndex) &&
                Objects.equals(this.region, specifyCellsObject.region);
      }

      @Override
      public int hashCode() {
        return Objects.hash(worksheetName, pageIndex, region);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SpecifyCellsObject {\n");
            sb.append("    worksheetName: ").append(toIndentedString(getWorksheetName())).append("\n");
            sb.append("    pageIndex: ").append(toIndentedString(getPageIndex())).append("\n");
            sb.append("    region: ").append(toIndentedString(getRegion())).append("\n");
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

