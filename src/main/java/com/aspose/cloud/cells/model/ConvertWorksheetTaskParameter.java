/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertWorksheetTaskParameter.java">
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


public class ConvertWorksheetTaskParameter  extends  TaskParameter {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  ConvertWorksheetTaskParameter  dataSource(DataSource  dataSource) {
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

        public  ConvertWorksheetTaskParameter  workbook(FileSource  workbook) {
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

        @SerializedName("Sheet")
        private String sheet ;

        public  ConvertWorksheetTaskParameter  sheet(String  sheet) {
            this.sheet =  sheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSheet() {
            return sheet;
        }

        public void setSheet(String sheet) {
            this.sheet = sheet;
        }

        @SerializedName("TargetDataSource")
        private DataSource targetDataSource ;

        public  ConvertWorksheetTaskParameter  targetDataSource(DataSource  targetDataSource) {
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

        @SerializedName("Target")
        private FileSource target ;

        public  ConvertWorksheetTaskParameter  target(FileSource  target) {
            this.target =  target;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileSource getTarget() {
            return target;
        }

        public void setTarget(FileSource target) {
            this.target = target;
        }

        @SerializedName("Format")
        private String format ;

        public  ConvertWorksheetTaskParameter  format(String  format) {
            this.format =  format;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        @SerializedName("Area")
        private String area ;

        public  ConvertWorksheetTaskParameter  area(String  area) {
            this.area =  area;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        @SerializedName("PageIndex")
        private Integer pageIndex ;

        public  ConvertWorksheetTaskParameter  pageIndex(Integer  pageIndex) {
            this.pageIndex =  pageIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getPageIndex() {
            return pageIndex;
        }

        public void setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
        }

        @SerializedName("VerticalResolution")
        private Integer verticalResolution ;

        public  ConvertWorksheetTaskParameter  verticalResolution(Integer  verticalResolution) {
            this.verticalResolution =  verticalResolution;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getVerticalResolution() {
            return verticalResolution;
        }

        public void setVerticalResolution(Integer verticalResolution) {
            this.verticalResolution = verticalResolution;
        }

        @SerializedName("HorizontalResolution")
        private Integer horizontalResolution ;

        public  ConvertWorksheetTaskParameter  horizontalResolution(Integer  horizontalResolution) {
            this.horizontalResolution =  horizontalResolution;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getHorizontalResolution() {
            return horizontalResolution;
        }

        public void setHorizontalResolution(Integer horizontalResolution) {
            this.horizontalResolution = horizontalResolution;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ConvertWorksheetTaskParameter convertWorksheetTaskParameter = (ConvertWorksheetTaskParameter) o;
            return
                Objects.equals(this.dataSource, convertWorksheetTaskParameter.dataSource) &&
                Objects.equals(this.workbook, convertWorksheetTaskParameter.workbook) &&
                Objects.equals(this.sheet, convertWorksheetTaskParameter.sheet) &&
                Objects.equals(this.targetDataSource, convertWorksheetTaskParameter.targetDataSource) &&
                Objects.equals(this.target, convertWorksheetTaskParameter.target) &&
                Objects.equals(this.format, convertWorksheetTaskParameter.format) &&
                Objects.equals(this.area, convertWorksheetTaskParameter.area) &&
                Objects.equals(this.pageIndex, convertWorksheetTaskParameter.pageIndex) &&
                Objects.equals(this.verticalResolution, convertWorksheetTaskParameter.verticalResolution) &&
                Objects.equals(this.horizontalResolution, convertWorksheetTaskParameter.horizontalResolution) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, workbook, sheet, targetDataSource, target, format, area, pageIndex, verticalResolution, horizontalResolution, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConvertWorksheetTaskParameter {\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    workbook: ").append(toIndentedString(getWorkbook())).append("\n");
            sb.append("    sheet: ").append(toIndentedString(getSheet())).append("\n");
            sb.append("    targetDataSource: ").append(toIndentedString(getTargetDataSource())).append("\n");
            sb.append("    target: ").append(toIndentedString(getTarget())).append("\n");
            sb.append("    format: ").append(toIndentedString(getFormat())).append("\n");
            sb.append("    area: ").append(toIndentedString(getArea())).append("\n");
            sb.append("    pageIndex: ").append(toIndentedString(getPageIndex())).append("\n");
            sb.append("    verticalResolution: ").append(toIndentedString(getVerticalResolution())).append("\n");
            sb.append("    horizontalResolution: ").append(toIndentedString(getHorizontalResolution())).append("\n");
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

