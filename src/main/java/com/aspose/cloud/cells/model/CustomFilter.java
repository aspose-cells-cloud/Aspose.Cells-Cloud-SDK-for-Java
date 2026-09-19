/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CustomFilter.java">
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


public class CustomFilter {
        @SerializedName("Criteria")
        private Object criteria ;

        public  CustomFilter  criteria(Object  criteria) {
            this.criteria =  criteria;
            return this;
        }

        @ApiModelProperty(value = "")
        public Object getCriteria() {
            return criteria;
        }

        public void setCriteria(Object criteria) {
            this.criteria = criteria;
        }

        @SerializedName("FilterOperatorType")
        private String filterOperatorType ;

        public  CustomFilter  filterOperatorType(String  filterOperatorType) {
            this.filterOperatorType =  filterOperatorType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFilterOperatorType() {
            return filterOperatorType;
        }

        public void setFilterOperatorType(String filterOperatorType) {
            this.filterOperatorType = filterOperatorType;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CustomFilter customFilter = (CustomFilter) o;
            return
                Objects.equals(this.criteria, customFilter.criteria) &&
                Objects.equals(this.filterOperatorType, customFilter.filterOperatorType);
      }

      @Override
      public int hashCode() {
        return Objects.hash(criteria, filterOperatorType);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CustomFilter {\n");
            sb.append("    criteria: ").append(toIndentedString(getCriteria())).append("\n");
            sb.append("    filterOperatorType: ").append(toIndentedString(getFilterOperatorType())).append("\n");
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

