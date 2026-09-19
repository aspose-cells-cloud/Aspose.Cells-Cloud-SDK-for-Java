/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportDataTaskParameter.java">
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


public class ImportDataTaskParameter  extends  TaskParameter {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  ImportDataTaskParameter  dataSource(DataSource  dataSource) {
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

        public  ImportDataTaskParameter  workbook(FileSource  workbook) {
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

        @SerializedName("ImportOption")
        private ImportOption importOption ;

        public  ImportDataTaskParameter  importOption(ImportOption  importOption) {
            this.importOption =  importOption;
            return this;
        }

        @ApiModelProperty(value = "")
        public ImportOption getImportOption() {
            return importOption;
        }

        public void setImportOption(ImportOption importOption) {
            this.importOption = importOption;
        }

        @SerializedName("TargetDataSource")
        private DataSource targetDataSource ;

        public  ImportDataTaskParameter  targetDataSource(DataSource  targetDataSource) {
            this.targetDataSource =  targetDataSource;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataSource getTargetDataSource() {
            return targetDataSource;
        }

        public void setTargetDataSource(DataSource targetDataSource) {
            this.targetDataSource = targetDataSource;
        }

        @SerializedName("DestinationWorkbook")
        private FileSource destinationWorkbook ;

        public  ImportDataTaskParameter  destinationWorkbook(FileSource  destinationWorkbook) {
            this.destinationWorkbook =  destinationWorkbook;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileSource getDestinationWorkbook() {
            return destinationWorkbook;
        }

        public void setDestinationWorkbook(FileSource destinationWorkbook) {
            this.destinationWorkbook = destinationWorkbook;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ImportDataTaskParameter importDataTaskParameter = (ImportDataTaskParameter) o;
            return
                Objects.equals(this.dataSource, importDataTaskParameter.dataSource) &&
                Objects.equals(this.workbook, importDataTaskParameter.workbook) &&
                Objects.equals(this.importOption, importDataTaskParameter.importOption) &&
                Objects.equals(this.targetDataSource, importDataTaskParameter.targetDataSource) &&
                Objects.equals(this.destinationWorkbook, importDataTaskParameter.destinationWorkbook) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, workbook, importOption, targetDataSource, destinationWorkbook, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ImportDataTaskParameter {\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    workbook: ").append(toIndentedString(getWorkbook())).append("\n");
            sb.append("    importOption: ").append(toIndentedString(getImportOption())).append("\n");
            sb.append("    targetDataSource: ").append(toIndentedString(getTargetDataSource())).append("\n");
            sb.append("    destinationWorkbook: ").append(toIndentedString(getDestinationWorkbook())).append("\n");
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

