/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OperateObjectPosition.java">
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


public class OperateObjectPosition {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  OperateObjectPosition  dataSource(DataSource  dataSource) {
            this.dataSource =  dataSource;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataSource getDataSource() {
            return dataSource;
        }

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        @SerializedName("Workbook")
        private FileSource workbook ;

        public  OperateObjectPosition  workbook(FileSource  workbook) {
            this.workbook =  workbook;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileSource getWorkbook() {
            return workbook;
        }

        public void setWorkbook(FileSource workbook) {
            this.workbook = workbook;
        }

        @SerializedName("SheetName")
        private String sheetName ;

        public  OperateObjectPosition  sheetName(String  sheetName) {
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

        @SerializedName("ChartIndex")
        private Integer chartIndex ;

        public  OperateObjectPosition  chartIndex(Integer  chartIndex) {
            this.chartIndex =  chartIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getChartIndex() {
            return chartIndex;
        }

        public void setChartIndex(Integer chartIndex) {
            this.chartIndex = chartIndex;
        }

        @SerializedName("ShapeIndex")
        private Integer shapeIndex ;

        public  OperateObjectPosition  shapeIndex(Integer  shapeIndex) {
            this.shapeIndex =  shapeIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getShapeIndex() {
            return shapeIndex;
        }

        public void setShapeIndex(Integer shapeIndex) {
            this.shapeIndex = shapeIndex;
        }

        @SerializedName("CellName")
        private String cellName ;

        public  OperateObjectPosition  cellName(String  cellName) {
            this.cellName =  cellName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCellName() {
            return cellName;
        }

        public void setCellName(String cellName) {
            this.cellName = cellName;
        }

        @SerializedName("ListObjectIndex")
        private Integer listObjectIndex ;

        public  OperateObjectPosition  listObjectIndex(Integer  listObjectIndex) {
            this.listObjectIndex =  listObjectIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getListObjectIndex() {
            return listObjectIndex;
        }

        public void setListObjectIndex(Integer listObjectIndex) {
            this.listObjectIndex = listObjectIndex;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            OperateObjectPosition operateObjectPosition = (OperateObjectPosition) o;
            return
                Objects.equals(this.dataSource, operateObjectPosition.dataSource) &&
                Objects.equals(this.workbook, operateObjectPosition.workbook) &&
                Objects.equals(this.sheetName, operateObjectPosition.sheetName) &&
                Objects.equals(this.chartIndex, operateObjectPosition.chartIndex) &&
                Objects.equals(this.shapeIndex, operateObjectPosition.shapeIndex) &&
                Objects.equals(this.cellName, operateObjectPosition.cellName) &&
                Objects.equals(this.listObjectIndex, operateObjectPosition.listObjectIndex);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, workbook, sheetName, chartIndex, shapeIndex, cellName, listObjectIndex);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OperateObjectPosition {\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    workbook: ").append(toIndentedString(getWorkbook())).append("\n");
            sb.append("    sheetName: ").append(toIndentedString(getSheetName())).append("\n");
            sb.append("    chartIndex: ").append(toIndentedString(getChartIndex())).append("\n");
            sb.append("    shapeIndex: ").append(toIndentedString(getShapeIndex())).append("\n");
            sb.append("    cellName: ").append(toIndentedString(getCellName())).append("\n");
            sb.append("    listObjectIndex: ").append(toIndentedString(getListObjectIndex())).append("\n");
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

