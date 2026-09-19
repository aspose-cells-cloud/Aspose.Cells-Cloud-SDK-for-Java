/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PivotTableOperateParameter.java">
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


public class PivotTableOperateParameter  extends  OperateParameter {
        @SerializedName("SourceData")
        private String sourceData ;

        public  PivotTableOperateParameter  sourceData(String  sourceData) {
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

        public  PivotTableOperateParameter  destCellName(String  destCellName) {
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

        @SerializedName("TableName")
        private String tableName ;

        public  PivotTableOperateParameter  tableName(String  tableName) {
            this.tableName =  tableName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTableName() {
            return tableName;
        }

        public void setTableName(String tableName) {
            this.tableName = tableName;
        }

        @SerializedName("UseSameSource")
        private Boolean useSameSource ;

        public  PivotTableOperateParameter  useSameSource(Boolean  useSameSource) {
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

        @SerializedName("PivotTableIndex")
        private Integer pivotTableIndex ;

        public  PivotTableOperateParameter  pivotTableIndex(Integer  pivotTableIndex) {
            this.pivotTableIndex =  pivotTableIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPivotTableIndex() {
            return pivotTableIndex;
        }

        public void setPivotTableIndex(Integer pivotTableIndex) {
            this.pivotTableIndex = pivotTableIndex;
        }

        @SerializedName("PivotFieldRows")
        private List<Integer> pivotFieldRows ;

        public  PivotTableOperateParameter  pivotFieldRows(List<Integer>  pivotFieldRows) {
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

        public  PivotTableOperateParameter  pivotFieldColumns(List<Integer>  pivotFieldColumns) {
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

        public  PivotTableOperateParameter  pivotFieldData(List<Integer>  pivotFieldData) {
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

            PivotTableOperateParameter pivotTableOperateParameter = (PivotTableOperateParameter) o;
            return
                Objects.equals(this.sourceData, pivotTableOperateParameter.sourceData) &&
                Objects.equals(this.destCellName, pivotTableOperateParameter.destCellName) &&
                Objects.equals(this.tableName, pivotTableOperateParameter.tableName) &&
                Objects.equals(this.useSameSource, pivotTableOperateParameter.useSameSource) &&
                Objects.equals(this.pivotTableIndex, pivotTableOperateParameter.pivotTableIndex) &&
                Objects.equals(this.pivotFieldRows, pivotTableOperateParameter.pivotFieldRows) &&
                Objects.equals(this.pivotFieldColumns, pivotTableOperateParameter.pivotFieldColumns) &&
                Objects.equals(this.pivotFieldData, pivotTableOperateParameter.pivotFieldData) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(sourceData, destCellName, tableName, useSameSource, pivotTableIndex, pivotFieldRows, pivotFieldColumns, pivotFieldData, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PivotTableOperateParameter {\n");
            sb.append("    sourceData: ").append(toIndentedString(getSourceData())).append("\n");
            sb.append("    destCellName: ").append(toIndentedString(getDestCellName())).append("\n");
            sb.append("    tableName: ").append(toIndentedString(getTableName())).append("\n");
            sb.append("    useSameSource: ").append(toIndentedString(getUseSameSource())).append("\n");
            sb.append("    pivotTableIndex: ").append(toIndentedString(getPivotTableIndex())).append("\n");
            sb.append("    pivotFieldRows: ").append(toIndentedString(getPivotFieldRows())).append("\n");
            sb.append("    pivotFieldColumns: ").append(toIndentedString(getPivotFieldColumns())).append("\n");
            sb.append("    pivotFieldData: ").append(toIndentedString(getPivotFieldData())).append("\n");
            sb.append("    operateType: ").append(toIndentedString(getOperateType())).append("\n");
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

