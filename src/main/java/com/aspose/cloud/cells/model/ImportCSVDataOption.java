/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportCSVDataOption.java">
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


public class ImportCSVDataOption  extends  ImportOption {
        @SerializedName("SeparatorString")
        private String separatorString ;

        public  ImportCSVDataOption  separatorString(String  separatorString) {
            this.separatorString =  separatorString;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSeparatorString() {
            return separatorString;
        }

        public void setSeparatorString(String separatorString) {
            this.separatorString = separatorString;
        }

        @SerializedName("ConvertNumericData")
        private Boolean convertNumericData ;

        public  ImportCSVDataOption  convertNumericData(Boolean  convertNumericData) {
            this.convertNumericData =  convertNumericData;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getConvertNumericData() {
            return convertNumericData;
        }

        public void setConvertNumericData(Boolean convertNumericData) {
            this.convertNumericData = convertNumericData;
        }

        @SerializedName("FirstRow")
        private Integer firstRow ;

        public  ImportCSVDataOption  firstRow(Integer  firstRow) {
            this.firstRow =  firstRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFirstRow() {
            return firstRow;
        }

        public void setFirstRow(Integer firstRow) {
            this.firstRow = firstRow;
        }

        @SerializedName("FirstColumn")
        private Integer firstColumn ;

        public  ImportCSVDataOption  firstColumn(Integer  firstColumn) {
            this.firstColumn =  firstColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFirstColumn() {
            return firstColumn;
        }

        public void setFirstColumn(Integer firstColumn) {
            this.firstColumn = firstColumn;
        }

        @SerializedName("SourceFile")
        private String sourceFile ;

        public  ImportCSVDataOption  sourceFile(String  sourceFile) {
            this.sourceFile =  sourceFile;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSourceFile() {
            return sourceFile;
        }

        public void setSourceFile(String sourceFile) {
            this.sourceFile = sourceFile;
        }

        @SerializedName("CustomParsers")
        private List<CustomParserConfig> customParsers ;

        public  ImportCSVDataOption  customParsers(List<CustomParserConfig>  customParsers) {
            this.customParsers =  customParsers;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<CustomParserConfig> getCustomParsers() {
            return customParsers;
        }

        public void setCustomParsers(List<CustomParserConfig> customParsers) {
            this.customParsers = customParsers;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ImportCSVDataOption importCSVDataOption = (ImportCSVDataOption) o;
            return
                Objects.equals(this.separatorString, importCSVDataOption.separatorString) &&
                Objects.equals(this.convertNumericData, importCSVDataOption.convertNumericData) &&
                Objects.equals(this.firstRow, importCSVDataOption.firstRow) &&
                Objects.equals(this.firstColumn, importCSVDataOption.firstColumn) &&
                Objects.equals(this.sourceFile, importCSVDataOption.sourceFile) &&
                Objects.equals(this.customParsers, importCSVDataOption.customParsers) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(separatorString, convertNumericData, firstRow, firstColumn, sourceFile, customParsers, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ImportCSVDataOption {\n");
            sb.append("    separatorString: ").append(toIndentedString(getSeparatorString())).append("\n");
            sb.append("    convertNumericData: ").append(toIndentedString(getConvertNumericData())).append("\n");
            sb.append("    firstRow: ").append(toIndentedString(getFirstRow())).append("\n");
            sb.append("    firstColumn: ").append(toIndentedString(getFirstColumn())).append("\n");
            sb.append("    sourceFile: ").append(toIndentedString(getSourceFile())).append("\n");
            sb.append("    customParsers: ").append(toIndentedString(getCustomParsers())).append("\n");
            sb.append("    destinationWorksheet: ").append(toIndentedString(getDestinationWorksheet())).append("\n");
            sb.append("    isInsert: ").append(toIndentedString(getIsInsert())).append("\n");
            sb.append("    importDataType: ").append(toIndentedString(getImportDataType())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    source: ").append(toIndentedString(getSource())).append("\n");
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

