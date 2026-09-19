/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ExtractTextOptions.java">
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


public class ExtractTextOptions  extends  BaseOperateOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  ExtractTextOptions  dataSource(DataSource  dataSource) {
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

        public  ExtractTextOptions  fileInfo(FileInfo  fileInfo) {
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

        public  ExtractTextOptions  worksheet(String  worksheet) {
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

        public  ExtractTextOptions  range(String  range) {
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

        @SerializedName("ExtractTextType")
        private String extractTextType ;

        public  ExtractTextOptions  extractTextType(String  extractTextType) {
            this.extractTextType =  extractTextType;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getExtractTextType() {
            return extractTextType;
        }

        public void setExtractTextType(String extractTextType) {
            this.extractTextType = extractTextType;
        }

        @SerializedName("BeforeText")
        private String beforeText ;

        public  ExtractTextOptions  beforeText(String  beforeText) {
            this.beforeText =  beforeText;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getBeforeText() {
            return beforeText;
        }

        public void setBeforeText(String beforeText) {
            this.beforeText = beforeText;
        }

        @SerializedName("AfterText")
        private String afterText ;

        public  ExtractTextOptions  afterText(String  afterText) {
            this.afterText =  afterText;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getAfterText() {
            return afterText;
        }

        public void setAfterText(String afterText) {
            this.afterText = afterText;
        }

        @SerializedName("BeforePosition")
        private Integer beforePosition ;

        public  ExtractTextOptions  beforePosition(Integer  beforePosition) {
            this.beforePosition =  beforePosition;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getBeforePosition() {
            return beforePosition;
        }

        public void setBeforePosition(Integer beforePosition) {
            this.beforePosition = beforePosition;
        }

        @SerializedName("AfterPosition")
        private Integer afterPosition ;

        public  ExtractTextOptions  afterPosition(Integer  afterPosition) {
            this.afterPosition =  afterPosition;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getAfterPosition() {
            return afterPosition;
        }

        public void setAfterPosition(Integer afterPosition) {
            this.afterPosition = afterPosition;
        }

        @SerializedName("OutPositionRange")
        private String outPositionRange ;

        public  ExtractTextOptions  outPositionRange(String  outPositionRange) {
            this.outPositionRange =  outPositionRange;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOutPositionRange() {
            return outPositionRange;
        }

        public void setOutPositionRange(String outPositionRange) {
            this.outPositionRange = outPositionRange;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ExtractTextOptions extractTextOptions = (ExtractTextOptions) o;
            return
                Objects.equals(this.dataSource, extractTextOptions.dataSource) &&
                Objects.equals(this.fileInfo, extractTextOptions.fileInfo) &&
                Objects.equals(this.worksheet, extractTextOptions.worksheet) &&
                Objects.equals(this.range, extractTextOptions.range) &&
                Objects.equals(this.extractTextType, extractTextOptions.extractTextType) &&
                Objects.equals(this.beforeText, extractTextOptions.beforeText) &&
                Objects.equals(this.afterText, extractTextOptions.afterText) &&
                Objects.equals(this.beforePosition, extractTextOptions.beforePosition) &&
                Objects.equals(this.afterPosition, extractTextOptions.afterPosition) &&
                Objects.equals(this.outPositionRange, extractTextOptions.outPositionRange) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, worksheet, range, extractTextType, beforeText, afterText, beforePosition, afterPosition, outPositionRange, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ExtractTextOptions {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    worksheet: ").append(toIndentedString(getWorksheet())).append("\n");
            sb.append("    range: ").append(toIndentedString(getRange())).append("\n");
            sb.append("    extractTextType: ").append(toIndentedString(getExtractTextType())).append("\n");
            sb.append("    beforeText: ").append(toIndentedString(getBeforeText())).append("\n");
            sb.append("    afterText: ").append(toIndentedString(getAfterText())).append("\n");
            sb.append("    beforePosition: ").append(toIndentedString(getBeforePosition())).append("\n");
            sb.append("    afterPosition: ").append(toIndentedString(getAfterPosition())).append("\n");
            sb.append("    outPositionRange: ").append(toIndentedString(getOutPositionRange())).append("\n");
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

