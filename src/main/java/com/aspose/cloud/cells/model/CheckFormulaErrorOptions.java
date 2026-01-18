/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CheckFormulaErrorOptions.java">
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


public class CheckFormulaErrorOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  CheckFormulaErrorOptions  dataSource(DataSource  dataSource) {
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

        @SerializedName("FileInfo")
        private FileInfo fileInfo ;

        public  CheckFormulaErrorOptions  fileInfo(FileInfo  fileInfo) {
            this.fileInfo =  fileInfo;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileInfo getFileInfo() {
            return fileInfo;
        }

        public void setFileInfo(FileInfo fileInfo) {
            this.fileInfo = fileInfo;
        }

        @SerializedName("SheetName")
        private String sheetName ;

        public  CheckFormulaErrorOptions  sheetName(String  sheetName) {
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

        public  CheckFormulaErrorOptions  chartIndex(Integer  chartIndex) {
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

        @SerializedName("Names")
        private List<String> names ;

        public  CheckFormulaErrorOptions  names(List<String>  names) {
            this.names =  names;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<String> getNames() {
            return names;
        }

        public void setNames(List<String> names) {
            this.names = names;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CheckFormulaErrorOptions checkFormulaErrorOptions = (CheckFormulaErrorOptions) o;
            return
                Objects.equals(this.dataSource, checkFormulaErrorOptions.dataSource) &&
                Objects.equals(this.fileInfo, checkFormulaErrorOptions.fileInfo) &&
                Objects.equals(this.sheetName, checkFormulaErrorOptions.sheetName) &&
                Objects.equals(this.chartIndex, checkFormulaErrorOptions.chartIndex) &&
                Objects.equals(this.names, checkFormulaErrorOptions.names);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, sheetName, chartIndex, names);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CheckFormulaErrorOptions {\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    sheetName: ").append(toIndentedString(getSheetName())).append("\n");
            sb.append("    chartIndex: ").append(toIndentedString(getChartIndex())).append("\n");
            sb.append("    names: ").append(toIndentedString(getNames())).append("\n");
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

