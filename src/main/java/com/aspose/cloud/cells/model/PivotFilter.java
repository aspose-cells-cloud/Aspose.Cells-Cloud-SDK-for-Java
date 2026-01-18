/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PivotFilter.java">
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


public class PivotFilter {
        @SerializedName("AutoFilter")
        private AutoFilter autoFilter ;

        public  PivotFilter  autoFilter(AutoFilter  autoFilter) {
            this.autoFilter =  autoFilter;
            return this;
        }

        @ApiModelProperty(value = "")
        public AutoFilter getAutoFilter() {
            return autoFilter;
        }

        public void setAutoFilter(AutoFilter autoFilter) {
            this.autoFilter = autoFilter;
        }

        @SerializedName("EvaluationOrder")
        private Integer evaluationOrder ;

        public  PivotFilter  evaluationOrder(Integer  evaluationOrder) {
            this.evaluationOrder =  evaluationOrder;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getEvaluationOrder() {
            return evaluationOrder;
        }

        public void setEvaluationOrder(Integer evaluationOrder) {
            this.evaluationOrder = evaluationOrder;
        }

        @SerializedName("FieldIndex")
        private Integer fieldIndex ;

        public  PivotFilter  fieldIndex(Integer  fieldIndex) {
            this.fieldIndex =  fieldIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFieldIndex() {
            return fieldIndex;
        }

        public void setFieldIndex(Integer fieldIndex) {
            this.fieldIndex = fieldIndex;
        }

        @SerializedName("FilterType")
        private String filterType ;

        public  PivotFilter  filterType(String  filterType) {
            this.filterType =  filterType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFilterType() {
            return filterType;
        }

        public void setFilterType(String filterType) {
            this.filterType = filterType;
        }

        @SerializedName("ValueFieldIndex")
        private Integer valueFieldIndex ;

        public  PivotFilter  valueFieldIndex(Integer  valueFieldIndex) {
            this.valueFieldIndex =  valueFieldIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getValueFieldIndex() {
            return valueFieldIndex;
        }

        public void setValueFieldIndex(Integer valueFieldIndex) {
            this.valueFieldIndex = valueFieldIndex;
        }

        @SerializedName("MemberPropertyFieldIndex")
        private Integer memberPropertyFieldIndex ;

        public  PivotFilter  memberPropertyFieldIndex(Integer  memberPropertyFieldIndex) {
            this.memberPropertyFieldIndex =  memberPropertyFieldIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getMemberPropertyFieldIndex() {
            return memberPropertyFieldIndex;
        }

        public void setMemberPropertyFieldIndex(Integer memberPropertyFieldIndex) {
            this.memberPropertyFieldIndex = memberPropertyFieldIndex;
        }

        @SerializedName("Name")
        private String name ;

        public  PivotFilter  name(String  name) {
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

        @SerializedName("Value1")
        private String value1 ;

        public  PivotFilter  value1(String  value1) {
            this.value1 =  value1;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getValue1() {
            return value1;
        }

        public void setValue1(String value1) {
            this.value1 = value1;
        }

        @SerializedName("Value2")
        private String value2 ;

        public  PivotFilter  value2(String  value2) {
            this.value2 =  value2;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getValue2() {
            return value2;
        }

        public void setValue2(String value2) {
            this.value2 = value2;
        }

        @SerializedName("Top10Filter")
        private Top10Filter top10Filter ;

        public  PivotFilter  top10Filter(Top10Filter  top10Filter) {
            this.top10Filter =  top10Filter;
            return this;
        }

        @ApiModelProperty(value = "")
        public Top10Filter getTop10Filter() {
            return top10Filter;
        }

        public void setTop10Filter(Top10Filter top10Filter) {
            this.top10Filter = top10Filter;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PivotFilter pivotFilter = (PivotFilter) o;
            return
                Objects.equals(this.autoFilter, pivotFilter.autoFilter) &&
                Objects.equals(this.evaluationOrder, pivotFilter.evaluationOrder) &&
                Objects.equals(this.fieldIndex, pivotFilter.fieldIndex) &&
                Objects.equals(this.filterType, pivotFilter.filterType) &&
                Objects.equals(this.valueFieldIndex, pivotFilter.valueFieldIndex) &&
                Objects.equals(this.memberPropertyFieldIndex, pivotFilter.memberPropertyFieldIndex) &&
                Objects.equals(this.name, pivotFilter.name) &&
                Objects.equals(this.value1, pivotFilter.value1) &&
                Objects.equals(this.value2, pivotFilter.value2) &&
                Objects.equals(this.top10Filter, pivotFilter.top10Filter);
      }

      @Override
      public int hashCode() {
        return Objects.hash(autoFilter, evaluationOrder, fieldIndex, filterType, valueFieldIndex, memberPropertyFieldIndex, name, value1, value2, top10Filter);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PivotFilter {\n");
            sb.append("    autoFilter: ").append(toIndentedString(getAutoFilter())).append("\n");
            sb.append("    evaluationOrder: ").append(toIndentedString(getEvaluationOrder())).append("\n");
            sb.append("    fieldIndex: ").append(toIndentedString(getFieldIndex())).append("\n");
            sb.append("    filterType: ").append(toIndentedString(getFilterType())).append("\n");
            sb.append("    valueFieldIndex: ").append(toIndentedString(getValueFieldIndex())).append("\n");
            sb.append("    memberPropertyFieldIndex: ").append(toIndentedString(getMemberPropertyFieldIndex())).append("\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    value1: ").append(toIndentedString(getValue1())).append("\n");
            sb.append("    value2: ").append(toIndentedString(getValue2())).append("\n");
            sb.append("    top10Filter: ").append(toIndentedString(getTop10Filter())).append("\n");
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

