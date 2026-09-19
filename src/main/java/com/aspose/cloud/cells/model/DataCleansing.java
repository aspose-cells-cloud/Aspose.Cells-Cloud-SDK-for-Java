/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataCleansing.java">
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


public class DataCleansing {
        @SerializedName("Ranges")
        private List<Range> ranges ;

        public  DataCleansing  ranges(List<Range>  ranges) {
            this.ranges =  ranges;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Range> getRanges() {
            return ranges;
        }

        public void setRanges(List<Range> ranges) {
            this.ranges = ranges;
        }

        @SerializedName("NeedFillData")
        private Boolean needFillData ;

        public  DataCleansing  needFillData(Boolean  needFillData) {
            this.needFillData =  needFillData;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getNeedFillData() {
            return needFillData;
        }

        public void setNeedFillData(Boolean needFillData) {
            this.needFillData = needFillData;
        }

        @SerializedName("DataFill")
        private DataFill dataFill ;

        public  DataCleansing  dataFill(DataFill  dataFill) {
            this.dataFill =  dataFill;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataFill getDataFill() {
            return dataFill;
        }

        public void setDataFill(DataFill dataFill) {
            this.dataFill = dataFill;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DataCleansing dataCleansing = (DataCleansing) o;
            return
                Objects.equals(this.ranges, dataCleansing.ranges) &&
                Objects.equals(this.needFillData, dataCleansing.needFillData) &&
                Objects.equals(this.dataFill, dataCleansing.dataFill);
      }

      @Override
      public int hashCode() {
        return Objects.hash(ranges, needFillData, dataFill);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataCleansing {\n");
            sb.append("    ranges: ").append(toIndentedString(getRanges())).append("\n");
            sb.append("    needFillData: ").append(toIndentedString(getNeedFillData())).append("\n");
            sb.append("    dataFill: ").append(toIndentedString(getDataFill())).append("\n");
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

