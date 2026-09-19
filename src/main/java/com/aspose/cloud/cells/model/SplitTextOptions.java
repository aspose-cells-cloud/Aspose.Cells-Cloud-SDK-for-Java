/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SplitTextOptions.java">
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


public class SplitTextOptions  extends  BaseOperateOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  SplitTextOptions  dataSource(DataSource  dataSource) {
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

        public  SplitTextOptions  fileInfo(FileInfo  fileInfo) {
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

        public  SplitTextOptions  worksheet(String  worksheet) {
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

        @SerializedName("Range")
        private String range ;

        public  SplitTextOptions  range(String  range) {
            this.range =  range;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRange() {
            return range;
        }

        public void setRange(String range) {
            this.range = range;
        }

        @SerializedName("SplitDelimitersType")
        private String splitDelimitersType ;

        public  SplitTextOptions  splitDelimitersType(String  splitDelimitersType) {
            this.splitDelimitersType =  splitDelimitersType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSplitDelimitersType() {
            return splitDelimitersType;
        }

        public void setSplitDelimitersType(String splitDelimitersType) {
            this.splitDelimitersType = splitDelimitersType;
        }

        @SerializedName("CustomDelimiter")
        private String customDelimiter ;

        public  SplitTextOptions  customDelimiter(String  customDelimiter) {
            this.customDelimiter =  customDelimiter;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getCustomDelimiter() {
            return customDelimiter;
        }

        public void setCustomDelimiter(String customDelimiter) {
            this.customDelimiter = customDelimiter;
        }

        @SerializedName("KeepDelimitersInResultingCells")
        private Boolean keepDelimitersInResultingCells ;

        public  SplitTextOptions  keepDelimitersInResultingCells(Boolean  keepDelimitersInResultingCells) {
            this.keepDelimitersInResultingCells =  keepDelimitersInResultingCells;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getKeepDelimitersInResultingCells() {
            return keepDelimitersInResultingCells;
        }

        public void setKeepDelimitersInResultingCells(Boolean keepDelimitersInResultingCells) {
            this.keepDelimitersInResultingCells = keepDelimitersInResultingCells;
        }

        @SerializedName("KeepDelimitersPosition")
        private String keepDelimitersPosition ;

        public  SplitTextOptions  keepDelimitersPosition(String  keepDelimitersPosition) {
            this.keepDelimitersPosition =  keepDelimitersPosition;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getKeepDelimitersPosition() {
            return keepDelimitersPosition;
        }

        public void setKeepDelimitersPosition(String keepDelimitersPosition) {
            this.keepDelimitersPosition = keepDelimitersPosition;
        }

        @SerializedName("HowToSplit")
        private String howToSplit ;

        public  SplitTextOptions  howToSplit(String  howToSplit) {
            this.howToSplit =  howToSplit;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getHowToSplit() {
            return howToSplit;
        }

        public void setHowToSplit(String howToSplit) {
            this.howToSplit = howToSplit;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            SplitTextOptions splitTextOptions = (SplitTextOptions) o;
            return
                Objects.equals(this.dataSource, splitTextOptions.dataSource) &&
                Objects.equals(this.fileInfo, splitTextOptions.fileInfo) &&
                Objects.equals(this.worksheet, splitTextOptions.worksheet) &&
                Objects.equals(this.range, splitTextOptions.range) &&
                Objects.equals(this.splitDelimitersType, splitTextOptions.splitDelimitersType) &&
                Objects.equals(this.customDelimiter, splitTextOptions.customDelimiter) &&
                Objects.equals(this.keepDelimitersInResultingCells, splitTextOptions.keepDelimitersInResultingCells) &&
                Objects.equals(this.keepDelimitersPosition, splitTextOptions.keepDelimitersPosition) &&
                Objects.equals(this.howToSplit, splitTextOptions.howToSplit) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, worksheet, range, splitDelimitersType, customDelimiter, keepDelimitersInResultingCells, keepDelimitersPosition, howToSplit, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SplitTextOptions {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    worksheet: ").append(toIndentedString(getWorksheet())).append("\n");
            sb.append("    range: ").append(toIndentedString(getRange())).append("\n");
            sb.append("    splitDelimitersType: ").append(toIndentedString(getSplitDelimitersType())).append("\n");
            sb.append("    customDelimiter: ").append(toIndentedString(getCustomDelimiter())).append("\n");
            sb.append("    keepDelimitersInResultingCells: ").append(toIndentedString(getKeepDelimitersInResultingCells())).append("\n");
            sb.append("    keepDelimitersPosition: ").append(toIndentedString(getKeepDelimitersPosition())).append("\n");
            sb.append("    howToSplit: ").append(toIndentedString(getHowToSplit())).append("\n");
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

