/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CheckedExternalReferenceResponse.java">
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


public class CheckedExternalReferenceResponse  extends  CellsCloudResponse {
        @SerializedName("ReferenceOtherWorkbook")
        private Boolean referenceOtherWorkbook ;

        public  CheckedExternalReferenceResponse  referenceOtherWorkbook(Boolean  referenceOtherWorkbook) {
            this.referenceOtherWorkbook =  referenceOtherWorkbook;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getReferenceOtherWorkbook() {
            return referenceOtherWorkbook;
        }

        public void setReferenceOtherWorkbook(Boolean referenceOtherWorkbook) {
            this.referenceOtherWorkbook = referenceOtherWorkbook;
        }

        @SerializedName("ReferenceOtherWorksheet")
        private Boolean referenceOtherWorksheet ;

        public  CheckedExternalReferenceResponse  referenceOtherWorksheet(Boolean  referenceOtherWorksheet) {
            this.referenceOtherWorksheet =  referenceOtherWorksheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getReferenceOtherWorksheet() {
            return referenceOtherWorksheet;
        }

        public void setReferenceOtherWorksheet(Boolean referenceOtherWorksheet) {
            this.referenceOtherWorksheet = referenceOtherWorksheet;
        }

        @SerializedName("Formulas")
        private List<String> formulas ;

        public  CheckedExternalReferenceResponse  formulas(List<String>  formulas) {
            this.formulas =  formulas;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<String> getFormulas() {
            return formulas;
        }

        public void setFormulas(List<String> formulas) {
            this.formulas = formulas;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CheckedExternalReferenceResponse checkedExternalReferenceResponse = (CheckedExternalReferenceResponse) o;
            return
                Objects.equals(this.referenceOtherWorkbook, checkedExternalReferenceResponse.referenceOtherWorkbook) &&
                Objects.equals(this.referenceOtherWorksheet, checkedExternalReferenceResponse.referenceOtherWorksheet) &&
                Objects.equals(this.formulas, checkedExternalReferenceResponse.formulas) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(referenceOtherWorkbook, referenceOtherWorksheet, formulas, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CheckedExternalReferenceResponse {\n");
            sb.append("    referenceOtherWorkbook: ").append(toIndentedString(getReferenceOtherWorkbook())).append("\n");
            sb.append("    referenceOtherWorksheet: ").append(toIndentedString(getReferenceOtherWorksheet())).append("\n");
            sb.append("    formulas: ").append(toIndentedString(getFormulas())).append("\n");
            sb.append("    code: ").append(toIndentedString(getCode())).append("\n");
            sb.append("    status: ").append(toIndentedString(getStatus())).append("\n");
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

