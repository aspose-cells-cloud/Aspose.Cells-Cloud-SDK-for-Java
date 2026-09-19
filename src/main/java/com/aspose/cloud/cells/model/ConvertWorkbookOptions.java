/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertWorkbookOptions.java">
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


public class ConvertWorkbookOptions  extends  BaseOperateOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  ConvertWorkbookOptions  dataSource(DataSource  dataSource) {
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

        public  ConvertWorkbookOptions  fileInfo(FileInfo  fileInfo) {
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

        @SerializedName("PageSetup")
        private PageSetup pageSetup ;

        public  ConvertWorkbookOptions  pageSetup(PageSetup  pageSetup) {
            this.pageSetup =  pageSetup;
            return this;
        }

        @ApiModelProperty(value = "")
        public PageSetup getPageSetup() {
            return pageSetup;
        }

        public void setPageSetup(PageSetup pageSetup) {
            this.pageSetup = pageSetup;
        }

        @SerializedName("SaveOptions")
        private SaveOptions saveOptions ;

        public  ConvertWorkbookOptions  saveOptions(SaveOptions  saveOptions) {
            this.saveOptions =  saveOptions;
            return this;
        }

        @ApiModelProperty(value = "")
        public SaveOptions getSaveOptions() {
            return saveOptions;
        }

        public void setSaveOptions(SaveOptions saveOptions) {
            this.saveOptions = saveOptions;
        }

        @SerializedName("ConvertFormat")
        private String convertFormat ;

        public  ConvertWorkbookOptions  convertFormat(String  convertFormat) {
            this.convertFormat =  convertFormat;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getConvertFormat() {
            return convertFormat;
        }

        public void setConvertFormat(String convertFormat) {
            this.convertFormat = convertFormat;
        }

        @SerializedName("CheckExcelRestriction")
        private Boolean checkExcelRestriction ;

        public  ConvertWorkbookOptions  checkExcelRestriction(Boolean  checkExcelRestriction) {
            this.checkExcelRestriction =  checkExcelRestriction;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getCheckExcelRestriction() {
            return checkExcelRestriction;
        }

        public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
            this.checkExcelRestriction = checkExcelRestriction;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ConvertWorkbookOptions convertWorkbookOptions = (ConvertWorkbookOptions) o;
            return
                Objects.equals(this.dataSource, convertWorkbookOptions.dataSource) &&
                Objects.equals(this.fileInfo, convertWorkbookOptions.fileInfo) &&
                Objects.equals(this.pageSetup, convertWorkbookOptions.pageSetup) &&
                Objects.equals(this.saveOptions, convertWorkbookOptions.saveOptions) &&
                Objects.equals(this.convertFormat, convertWorkbookOptions.convertFormat) &&
                Objects.equals(this.checkExcelRestriction, convertWorkbookOptions.checkExcelRestriction) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, pageSetup, saveOptions, convertFormat, checkExcelRestriction, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConvertWorkbookOptions {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    pageSetup: ").append(toIndentedString(getPageSetup())).append("\n");
            sb.append("    saveOptions: ").append(toIndentedString(getSaveOptions())).append("\n");
            sb.append("    convertFormat: ").append(toIndentedString(getConvertFormat())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
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

