/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataCleansingRequest.java">
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


public class DataCleansingRequest {
        @SerializedName("File")
        private FileInfo file ;

        public  DataCleansingRequest  file(FileInfo  file) {
            this.file =  file;
            return this;
        }

        @ApiModelProperty(value = "")
        public FileInfo getFile() {
            return file;
        }

        public void setFile(FileInfo file) {
            this.file = file;
        }

        @SerializedName("CheckExcelRestriction")
        private Boolean checkExcelRestriction ;

        public  DataCleansingRequest  checkExcelRestriction(Boolean  checkExcelRestriction) {
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

        public  DataCleansingRequest  region(String  region) {
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

        @SerializedName("OutFileFormat")
        private String outFileFormat ;

        public  DataCleansingRequest  outFileFormat(String  outFileFormat) {
            this.outFileFormat =  outFileFormat;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOutFileFormat() {
            return outFileFormat;
        }

        public void setOutFileFormat(String outFileFormat) {
            this.outFileFormat = outFileFormat;
        }

        @SerializedName("DataCleansing")
        private DataCleansing dataCleansing ;

        public  DataCleansingRequest  dataCleansing(DataCleansing  dataCleansing) {
            this.dataCleansing =  dataCleansing;
            return this;
        }

        @ApiModelProperty(value = "")
        public DataCleansing getDataCleansing() {
            return dataCleansing;
        }

        public void setDataCleansing(DataCleansing dataCleansing) {
            this.dataCleansing = dataCleansing;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            DataCleansingRequest dataCleansingRequest = (DataCleansingRequest) o;
            return
                Objects.equals(this.file, dataCleansingRequest.file) &&
                Objects.equals(this.checkExcelRestriction, dataCleansingRequest.checkExcelRestriction) &&
                Objects.equals(this.region, dataCleansingRequest.region) &&
                Objects.equals(this.outFileFormat, dataCleansingRequest.outFileFormat) &&
                Objects.equals(this.dataCleansing, dataCleansingRequest.dataCleansing);
      }

      @Override
      public int hashCode() {
        return Objects.hash(file, checkExcelRestriction, region, outFileFormat, dataCleansing);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class DataCleansingRequest {\n");
            sb.append("    file: ").append(toIndentedString(getFile())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
            sb.append("    region: ").append(toIndentedString(getRegion())).append("\n");
            sb.append("    outFileFormat: ").append(toIndentedString(getOutFileFormat())).append("\n");
            sb.append("    dataCleansing: ").append(toIndentedString(getDataCleansing())).append("\n");
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

