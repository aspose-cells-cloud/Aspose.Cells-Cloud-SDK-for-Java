/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportPictureOption.java">
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


public class ImportPictureOption  extends  ImportOption {
        @SerializedName("UpperLeftRow")
        private Integer upperLeftRow ;

        public  ImportPictureOption  upperLeftRow(Integer  upperLeftRow) {
            this.upperLeftRow =  upperLeftRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getUpperLeftRow() {
            return upperLeftRow;
        }

        public void setUpperLeftRow(Integer upperLeftRow) {
            this.upperLeftRow = upperLeftRow;
        }

        @SerializedName("UpperLeftColumn")
        private Integer upperLeftColumn ;

        public  ImportPictureOption  upperLeftColumn(Integer  upperLeftColumn) {
            this.upperLeftColumn =  upperLeftColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getUpperLeftColumn() {
            return upperLeftColumn;
        }

        public void setUpperLeftColumn(Integer upperLeftColumn) {
            this.upperLeftColumn = upperLeftColumn;
        }

        @SerializedName("LowerRightRow")
        private Integer lowerRightRow ;

        public  ImportPictureOption  lowerRightRow(Integer  lowerRightRow) {
            this.lowerRightRow =  lowerRightRow;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getLowerRightRow() {
            return lowerRightRow;
        }

        public void setLowerRightRow(Integer lowerRightRow) {
            this.lowerRightRow = lowerRightRow;
        }

        @SerializedName("LowerRightColumn")
        private Integer lowerRightColumn ;

        public  ImportPictureOption  lowerRightColumn(Integer  lowerRightColumn) {
            this.lowerRightColumn =  lowerRightColumn;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getLowerRightColumn() {
            return lowerRightColumn;
        }

        public void setLowerRightColumn(Integer lowerRightColumn) {
            this.lowerRightColumn = lowerRightColumn;
        }

        @SerializedName("Filename")
        private String filename ;

        public  ImportPictureOption  filename(String  filename) {
            this.filename =  filename;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        @SerializedName("Data")
        private String data ;

        public  ImportPictureOption  data(String  data) {
            this.data =  data;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ImportPictureOption importPictureOption = (ImportPictureOption) o;
            return
                Objects.equals(this.upperLeftRow, importPictureOption.upperLeftRow) &&
                Objects.equals(this.upperLeftColumn, importPictureOption.upperLeftColumn) &&
                Objects.equals(this.lowerRightRow, importPictureOption.lowerRightRow) &&
                Objects.equals(this.lowerRightColumn, importPictureOption.lowerRightColumn) &&
                Objects.equals(this.filename, importPictureOption.filename) &&
                Objects.equals(this.data, importPictureOption.data) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(upperLeftRow, upperLeftColumn, lowerRightRow, lowerRightColumn, filename, data, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ImportPictureOption {\n");
            sb.append("    upperLeftRow: ").append(toIndentedString(getUpperLeftRow())).append("\n");
            sb.append("    upperLeftColumn: ").append(toIndentedString(getUpperLeftColumn())).append("\n");
            sb.append("    lowerRightRow: ").append(toIndentedString(getLowerRightRow())).append("\n");
            sb.append("    lowerRightColumn: ").append(toIndentedString(getLowerRightColumn())).append("\n");
            sb.append("    filename: ").append(toIndentedString(getFilename())).append("\n");
            sb.append("    data: ").append(toIndentedString(getData())).append("\n");
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

