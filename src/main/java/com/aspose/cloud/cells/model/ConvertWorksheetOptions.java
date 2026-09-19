/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertWorksheetOptions.java">
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


public class ConvertWorksheetOptions  extends  BaseOperateOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  ConvertWorksheetOptions  dataSource(DataSource  dataSource) {
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

        public  ConvertWorksheetOptions  fileInfo(FileInfo  fileInfo) {
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

        @SerializedName("WorksheetName")
        private String worksheetName ;

        public  ConvertWorksheetOptions  worksheetName(String  worksheetName) {
            this.worksheetName =  worksheetName;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getWorksheetName() {
            return worksheetName;
        }

        public void setWorksheetName(String worksheetName) {
            this.worksheetName = worksheetName;
        }

        @SerializedName("PageSetup")
        private PageSetup pageSetup ;

        public  ConvertWorksheetOptions  pageSetup(PageSetup  pageSetup) {
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

        @SerializedName("ImageOrPrintOptions")
        private ImageOrPrintOptions imageOrPrintOptions ;

        public  ConvertWorksheetOptions  imageOrPrintOptions(ImageOrPrintOptions  imageOrPrintOptions) {
            this.imageOrPrintOptions =  imageOrPrintOptions;
            return this;
        }

        @ApiModelProperty(value = "")
        public ImageOrPrintOptions getImageOrPrintOptions() {
            return imageOrPrintOptions;
        }

        public void setImageOrPrintOptions(ImageOrPrintOptions imageOrPrintOptions) {
            this.imageOrPrintOptions = imageOrPrintOptions;
        }

        @SerializedName("ConvertFormat")
        private String convertFormat ;

        public  ConvertWorksheetOptions  convertFormat(String  convertFormat) {
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

        public  ConvertWorksheetOptions  checkExcelRestriction(Boolean  checkExcelRestriction) {
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

        @SerializedName("Region")
        private String region ;

        public  ConvertWorksheetOptions  region(String  region) {
            this.region =  region;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ConvertWorksheetOptions convertWorksheetOptions = (ConvertWorksheetOptions) o;
            return
                Objects.equals(this.dataSource, convertWorksheetOptions.dataSource) &&
                Objects.equals(this.fileInfo, convertWorksheetOptions.fileInfo) &&
                Objects.equals(this.worksheetName, convertWorksheetOptions.worksheetName) &&
                Objects.equals(this.pageSetup, convertWorksheetOptions.pageSetup) &&
                Objects.equals(this.imageOrPrintOptions, convertWorksheetOptions.imageOrPrintOptions) &&
                Objects.equals(this.convertFormat, convertWorksheetOptions.convertFormat) &&
                Objects.equals(this.checkExcelRestriction, convertWorksheetOptions.checkExcelRestriction) &&
                Objects.equals(this.region, convertWorksheetOptions.region) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, worksheetName, pageSetup, imageOrPrintOptions, convertFormat, checkExcelRestriction, region, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConvertWorksheetOptions {\n");
            sb.append("    name: ").append(toIndentedString(getName())).append("\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    worksheetName: ").append(toIndentedString(getWorksheetName())).append("\n");
            sb.append("    pageSetup: ").append(toIndentedString(getPageSetup())).append("\n");
            sb.append("    imageOrPrintOptions: ").append(toIndentedString(getImageOrPrintOptions())).append("\n");
            sb.append("    convertFormat: ").append(toIndentedString(getConvertFormat())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
            sb.append("    region: ").append(toIndentedString(getRegion())).append("\n");
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

