/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CombinationSourceData.java">
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


public class CombinationSourceData {
        @SerializedName("Tag")
        private String tag ;

        public  CombinationSourceData  tag(String  tag) {
            this.tag =  tag;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  CombinationSourceData  dataSource(DataSource  dataSource) {
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

        public  CombinationSourceData  fileInfo(FileInfo  fileInfo) {
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

        public  CombinationSourceData  worksheet(String  worksheet) {
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

        @SerializedName("TableName")
        private String tableName ;

        public  CombinationSourceData  tableName(String  tableName) {
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

        @SerializedName("CellArea")
        private String cellArea ;

        public  CombinationSourceData  cellArea(String  cellArea) {
            this.cellArea =  cellArea;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCellArea() {
            return cellArea;
        }

        public void setCellArea(String cellArea) {
            this.cellArea = cellArea;
        }

        @SerializedName("HasHeader")
        private Boolean hasHeader ;

        public  CombinationSourceData  hasHeader(Boolean  hasHeader) {
            this.hasHeader =  hasHeader;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getHasHeader() {
            return hasHeader;
        }

        public void setHasHeader(Boolean hasHeader) {
            this.hasHeader = hasHeader;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CombinationSourceData combinationSourceData = (CombinationSourceData) o;
            return
                Objects.equals(this.tag, combinationSourceData.tag) &&
                Objects.equals(this.dataSource, combinationSourceData.dataSource) &&
                Objects.equals(this.fileInfo, combinationSourceData.fileInfo) &&
                Objects.equals(this.worksheet, combinationSourceData.worksheet) &&
                Objects.equals(this.tableName, combinationSourceData.tableName) &&
                Objects.equals(this.cellArea, combinationSourceData.cellArea) &&
                Objects.equals(this.hasHeader, combinationSourceData.hasHeader);
      }

      @Override
      public int hashCode() {
        return Objects.hash(tag, dataSource, fileInfo, worksheet, tableName, cellArea, hasHeader);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CombinationSourceData {\n");
            sb.append("    tag: ").append(toIndentedString(getTag())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    worksheet: ").append(toIndentedString(getWorksheet())).append("\n");
            sb.append("    tableName: ").append(toIndentedString(getTableName())).append("\n");
            sb.append("    cellArea: ").append(toIndentedString(getCellArea())).append("\n");
            sb.append("    hasHeader: ").append(toIndentedString(getHasHeader())).append("\n");
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

