/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LoadTo.java">
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


public class LoadTo {
        @SerializedName("Worksheet")
        private String worksheet ;

        public  LoadTo  worksheet(String  worksheet) {
            this.worksheet =  worksheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getWorksheet() {
            return worksheet;
        }

        public void setWorksheet(String worksheet) {
            this.worksheet = worksheet;
        }

        @SerializedName("BeginRowIndex")
        private Integer beginRowIndex ;

        public  LoadTo  beginRowIndex(Integer  beginRowIndex) {
            this.beginRowIndex =  beginRowIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getBeginRowIndex() {
            return beginRowIndex;
        }

        public void setBeginRowIndex(Integer beginRowIndex) {
            this.beginRowIndex = beginRowIndex;
        }

        @SerializedName("BeginColumnIndex")
        private Integer beginColumnIndex ;

        public  LoadTo  beginColumnIndex(Integer  beginColumnIndex) {
            this.beginColumnIndex =  beginColumnIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getBeginColumnIndex() {
            return beginColumnIndex;
        }

        public void setBeginColumnIndex(Integer beginColumnIndex) {
            this.beginColumnIndex = beginColumnIndex;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            LoadTo loadTo = (LoadTo) o;
            return
                Objects.equals(this.worksheet, loadTo.worksheet) &&
                Objects.equals(this.beginRowIndex, loadTo.beginRowIndex) &&
                Objects.equals(this.beginColumnIndex, loadTo.beginColumnIndex);
      }

      @Override
      public int hashCode() {
        return Objects.hash(worksheet, beginRowIndex, beginColumnIndex);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class LoadTo {\n");
            sb.append("    worksheet: ").append(toIndentedString(getWorksheet())).append("\n");
            sb.append("    beginRowIndex: ").append(toIndentedString(getBeginRowIndex())).append("\n");
            sb.append("    beginColumnIndex: ").append(toIndentedString(getBeginColumnIndex())).append("\n");
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

