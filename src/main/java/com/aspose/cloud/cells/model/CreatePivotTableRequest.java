/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CreatePivotTableRequest.java">
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


public class CreatePivotTableRequest {
        @SerializedName("Name")
        private String name ;

        public  CreatePivotTableRequest  name(String  name) {
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

        @SerializedName("SourceData")
        private String sourceData ;

        public  CreatePivotTableRequest  sourceData(String  sourceData) {
            this.sourceData =  sourceData;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSourceData() {
            return sourceData;
        }

        public void setSourceData(String sourceData) {
            this.sourceData = sourceData;
        }

        @SerializedName("DestCellName")
        private String destCellName ;

        public  CreatePivotTableRequest  destCellName(String  destCellName) {
            this.destCellName =  destCellName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDestCellName() {
            return destCellName;
        }

        public void setDestCellName(String destCellName) {
            this.destCellName = destCellName;
        }

        @SerializedName("UseSameSource")
        private Boolean useSameSource ;

        public  CreatePivotTableRequest  useSameSource(Boolean  useSameSource) {
            this.useSameSource =  useSameSource;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getUseSameSource() {
            return useSameSource;
        }

        public void setUseSameSource(Boolean useSameSource) {
            this.useSameSource = useSameSource;
        }

        @SerializedName("PivotFieldRows")
        private List<Integer> pivotFieldRows ;

        public  CreatePivotTableRequest  pivotFieldRows(List<Integer>  pivotFieldRows) {
            this.pivotFieldRows =  pivotFieldRows;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Integer> getPivotFieldRows() {
            return pivotFieldRows;
        }

        public void setPivotFieldRows(List<Integer> pivotFieldRows) {
            this.pivotFieldRows = pivotFieldRows;
        }

        @SerializedName("PivotFieldColumns")
        private List<Integer> pivotFieldColumns ;

        public  CreatePivotTableRequest  pivotFieldColumns(List<Integer>  pivotFieldColumns) {
            this.pivotFieldColumns =  pivotFieldColumns;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Integer> getPivotFieldColumns() {
            return pivotFieldColumns;
        }

        public void setPivotFieldColumns(List<Integer> pivotFieldColumns) {
            this.pivotFieldColumns = pivotFieldColumns;
        }

        @SerializedName("PivotFieldData")
        private List<Integer> pivotFieldData ;

        public  CreatePivotTableRequest  pivotFieldData(List<Integer>  pivotFieldData) {
            this.pivotFieldData =  pivotFieldData;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<Integer> getPivotFieldData() {
            return pivotFieldData;
        }

        public void setPivotFieldData(List<Integer> pivotFieldData) {
            this.pivotFieldData = pivotFieldData;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CreatePivotTableRequest createPivotTableRequest = (CreatePivotTableRequest) o;
            return
                Objects.equals(this.name, createPivotTableRequest.name) &&
                Objects.equals(this.sourceData, createPivotTableRequest.sourceData) &&
                Objects.equals(this.destCellName, createPivotTableRequest.destCellName) &&
                Objects.equals(this.useSameSource, createPivotTableRequest.useSameSource) &&
                Objects.equals(this.pivotFieldRows, createPivotTableRequest.pivotFieldRows) &&
                Objects.equals(this.pivotFieldColumns, createPivotTableRequest.pivotFieldColumns) &&
                Objects.equals(this.pivotFieldData, createPivotTableRequest.pivotFieldData);
      }

      @Override
      public int hashCode() {
        return Objects.hash(name, sourceData, destCellName, useSameSource, pivotFieldRows, pivotFieldColumns, pivotFieldData);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CreatePivotTableRequest {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    sourceData: ").append(toIndentedString(getSourceData())).append("\n");
            sb.append("    destCellName: ").append(toIndentedString(getDestCellName())).append("\n");
            sb.append("    useSameSource: ").append(toIndentedString(getUseSameSource())).append("\n");
            sb.append("    pivotFieldRows: ").append(toIndentedString(getPivotFieldRows())).append("\n");
            sb.append("    pivotFieldColumns: ").append(toIndentedString(getPivotFieldColumns())).append("\n");
            sb.append("    pivotFieldData: ").append(toIndentedString(getPivotFieldData())).append("\n");
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

