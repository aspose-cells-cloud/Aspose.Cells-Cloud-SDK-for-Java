/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CheckExternalReferenceOptions.java">
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


public class CheckExternalReferenceOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  CheckExternalReferenceOptions  dataSource(DataSource  dataSource) {
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

        public  CheckExternalReferenceOptions  fileInfo(FileInfo  fileInfo) {
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

        @SerializedName("Worksheet")
        private String worksheet ;

        public  CheckExternalReferenceOptions  worksheet(String  worksheet) {
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

        @SerializedName("Ranged_Table")
        private String ranged_Table ;

        public  CheckExternalReferenceOptions  ranged_Table(String  ranged_Table) {
            this.ranged_Table =  ranged_Table;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRanged_Table() {
            return ranged_Table;
        }

        public void setRanged_Table(String ranged_Table) {
            this.ranged_Table = ranged_Table;
        }

        @SerializedName("ChartIndex")
        private Integer chartIndex ;

        public  CheckExternalReferenceOptions  chartIndex(Integer  chartIndex) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CheckExternalReferenceOptions checkExternalReferenceOptions = (CheckExternalReferenceOptions) o;
            return
                Objects.equals(this.dataSource, checkExternalReferenceOptions.dataSource) &&
                Objects.equals(this.fileInfo, checkExternalReferenceOptions.fileInfo) &&
                Objects.equals(this.worksheet, checkExternalReferenceOptions.worksheet) &&
                Objects.equals(this.ranged_Table, checkExternalReferenceOptions.ranged_Table) &&
                Objects.equals(this.chartIndex, checkExternalReferenceOptions.chartIndex);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, worksheet, ranged_Table, chartIndex);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CheckExternalReferenceOptions {\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    worksheet: ").append(toIndentedString(getWorksheet())).append("\n");
            sb.append("    ranged_Table: ").append(toIndentedString(getRanged_Table())).append("\n");
            sb.append("    chartIndex: ").append(toIndentedString(getChartIndex())).append("\n");
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

