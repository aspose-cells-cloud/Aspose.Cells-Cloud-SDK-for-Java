/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TableTotalRequest.java">
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


public class TableTotalRequest {
        @SerializedName("ListColumnIndex")
        private Integer listColumnIndex ;

        public  TableTotalRequest  listColumnIndex(Integer  listColumnIndex) {
            this.listColumnIndex =  listColumnIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getListColumnIndex() {
            return listColumnIndex;
        }

        public void setListColumnIndex(Integer listColumnIndex) {
            this.listColumnIndex = listColumnIndex;
        }

        @SerializedName("TotalsCalculation")
        private String totalsCalculation ;

        public  TableTotalRequest  totalsCalculation(String  totalsCalculation) {
            this.totalsCalculation =  totalsCalculation;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTotalsCalculation() {
            return totalsCalculation;
        }

        public void setTotalsCalculation(String totalsCalculation) {
            this.totalsCalculation = totalsCalculation;
        }

        @SerializedName("CustomFormula")
        private String customFormula ;

        public  TableTotalRequest  customFormula(String  customFormula) {
            this.customFormula =  customFormula;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCustomFormula() {
            return customFormula;
        }

        public void setCustomFormula(String customFormula) {
            this.customFormula = customFormula;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TableTotalRequest tableTotalRequest = (TableTotalRequest) o;
            return
                Objects.equals(this.listColumnIndex, tableTotalRequest.listColumnIndex) &&
                Objects.equals(this.totalsCalculation, tableTotalRequest.totalsCalculation) &&
                Objects.equals(this.customFormula, tableTotalRequest.customFormula);
      }

      @Override
      public int hashCode() {
        return Objects.hash(listColumnIndex, totalsCalculation, customFormula);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TableTotalRequest {\n");
            sb.append("    listColumnIndex: ").append(toIndentedString(getListColumnIndex())).append("\n");
            sb.append("    totalsCalculation: ").append(toIndentedString(getTotalsCalculation())).append("\n");
            sb.append("    customFormula: ").append(toIndentedString(getCustomFormula())).append("\n");
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

