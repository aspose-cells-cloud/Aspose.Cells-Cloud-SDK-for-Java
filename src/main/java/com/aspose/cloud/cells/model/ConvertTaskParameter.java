/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertTaskParameter.java">
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


public class ConvertTaskParameter  extends  TaskParameter {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  ConvertTaskParameter  dataSource(DataSource  dataSource) {
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

        public  ConvertTaskParameter  workbook(FileSource  workbook) {
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

        @SerializedName("DestinationFile")
        private String destinationFile ;

        public  ConvertTaskParameter  destinationFile(String  destinationFile) {
            this.destinationFile =  destinationFile;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDestinationFile() {
            return destinationFile;
        }

        public void setDestinationFile(String destinationFile) {
            this.destinationFile = destinationFile;
        }

        @SerializedName("Region")
        private String region ;

        public  ConvertTaskParameter  region(String  region) {
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

        @SerializedName("SaveOptions")
        private SaveOptions saveOptions ;

        public  ConvertTaskParameter  saveOptions(SaveOptions  saveOptions) {
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

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ConvertTaskParameter convertTaskParameter = (ConvertTaskParameter) o;
            return
                Objects.equals(this.dataSource, convertTaskParameter.dataSource) &&
                Objects.equals(this.workbook, convertTaskParameter.workbook) &&
                Objects.equals(this.destinationFile, convertTaskParameter.destinationFile) &&
                Objects.equals(this.region, convertTaskParameter.region) &&
                Objects.equals(this.saveOptions, convertTaskParameter.saveOptions) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, workbook, destinationFile, region, saveOptions, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ConvertTaskParameter {\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    workbook: ").append(toIndentedString(getWorkbook())).append("\n");
            sb.append("    destinationFile: ").append(toIndentedString(getDestinationFile())).append("\n");
            sb.append("    region: ").append(toIndentedString(getRegion())).append("\n");
            sb.append("    saveOptions: ").append(toIndentedString(getSaveOptions())).append("\n");
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

