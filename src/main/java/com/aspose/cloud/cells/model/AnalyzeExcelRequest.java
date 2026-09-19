/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AnalyzeExcelRequest.java">
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


public class AnalyzeExcelRequest {
        @SerializedName("Files")
        private List<FileInfo> files ;

        public  AnalyzeExcelRequest  files(List<FileInfo>  files) {
            this.files =  files;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<FileInfo> getFiles() {
            return files;
        }

        public void setFiles(List<FileInfo> files) {
            this.files = files;
        }

        @SerializedName("NeedThumbnail")
        private Boolean needThumbnail ;

        public  AnalyzeExcelRequest  needThumbnail(Boolean  needThumbnail) {
            this.needThumbnail =  needThumbnail;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getNeedThumbnail() {
            return needThumbnail;
        }

        public void setNeedThumbnail(Boolean needThumbnail) {
            this.needThumbnail = needThumbnail;
        }

        @SerializedName("BuildSuggestoinSheet")
        private Boolean buildSuggestoinSheet ;

        public  AnalyzeExcelRequest  buildSuggestoinSheet(Boolean  buildSuggestoinSheet) {
            this.buildSuggestoinSheet =  buildSuggestoinSheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getBuildSuggestoinSheet() {
            return buildSuggestoinSheet;
        }

        public void setBuildSuggestoinSheet(Boolean buildSuggestoinSheet) {
            this.buildSuggestoinSheet = buildSuggestoinSheet;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AnalyzeExcelRequest analyzeExcelRequest = (AnalyzeExcelRequest) o;
            return
                Objects.equals(this.files, analyzeExcelRequest.files) &&
                Objects.equals(this.needThumbnail, analyzeExcelRequest.needThumbnail) &&
                Objects.equals(this.buildSuggestoinSheet, analyzeExcelRequest.buildSuggestoinSheet);
      }

      @Override
      public int hashCode() {
        return Objects.hash(files, needThumbnail, buildSuggestoinSheet);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnalyzeExcelRequest {\n");
            sb.append("    files: ").append(toIndentedString(getFiles())).append("\n");
            sb.append("    needThumbnail: ").append(toIndentedString(getNeedThumbnail())).append("\n");
            sb.append("    buildSuggestoinSheet: ").append(toIndentedString(getBuildSuggestoinSheet())).append("\n");
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

