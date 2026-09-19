/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TrimContentOptions.java">
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


public class TrimContentOptions {
        @SerializedName("DataSource")
        private DataSource dataSource ;

        public  TrimContentOptions  dataSource(DataSource  dataSource) {
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

        public  TrimContentOptions  fileInfo(FileInfo  fileInfo) {
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

        @SerializedName("TrimContent")
        private String trimContent ;

        public  TrimContentOptions  trimContent(String  trimContent) {
            this.trimContent =  trimContent;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getTrimContent() {
            return trimContent;
        }

        public void setTrimContent(String trimContent) {
            this.trimContent = trimContent;
        }

        @SerializedName("TrimLeading")
        private Boolean trimLeading ;

        public  TrimContentOptions  trimLeading(Boolean  trimLeading) {
            this.trimLeading =  trimLeading;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getTrimLeading() {
            return trimLeading;
        }

        public void setTrimLeading(Boolean trimLeading) {
            this.trimLeading = trimLeading;
        }

        @SerializedName("TrimTrailing")
        private Boolean trimTrailing ;

        public  TrimContentOptions  trimTrailing(Boolean  trimTrailing) {
            this.trimTrailing =  trimTrailing;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getTrimTrailing() {
            return trimTrailing;
        }

        public void setTrimTrailing(Boolean trimTrailing) {
            this.trimTrailing = trimTrailing;
        }

        @SerializedName("TrimSpaceBetweenWordTo1")
        private Boolean trimSpaceBetweenWordTo1 ;

        public  TrimContentOptions  trimSpaceBetweenWordTo1(Boolean  trimSpaceBetweenWordTo1) {
            this.trimSpaceBetweenWordTo1 =  trimSpaceBetweenWordTo1;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getTrimSpaceBetweenWordTo1() {
            return trimSpaceBetweenWordTo1;
        }

        public void setTrimSpaceBetweenWordTo1(Boolean trimSpaceBetweenWordTo1) {
            this.trimSpaceBetweenWordTo1 = trimSpaceBetweenWordTo1;
        }

        @SerializedName("TrimNonBreakingSpaces")
        private Boolean trimNonBreakingSpaces ;

        public  TrimContentOptions  trimNonBreakingSpaces(Boolean  trimNonBreakingSpaces) {
            this.trimNonBreakingSpaces =  trimNonBreakingSpaces;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getTrimNonBreakingSpaces() {
            return trimNonBreakingSpaces;
        }

        public void setTrimNonBreakingSpaces(Boolean trimNonBreakingSpaces) {
            this.trimNonBreakingSpaces = trimNonBreakingSpaces;
        }

        @SerializedName("RemoveExtraLineBreaks")
        private Boolean removeExtraLineBreaks ;

        public  TrimContentOptions  removeExtraLineBreaks(Boolean  removeExtraLineBreaks) {
            this.removeExtraLineBreaks =  removeExtraLineBreaks;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getRemoveExtraLineBreaks() {
            return removeExtraLineBreaks;
        }

        public void setRemoveExtraLineBreaks(Boolean removeExtraLineBreaks) {
            this.removeExtraLineBreaks = removeExtraLineBreaks;
        }

        @SerializedName("RemoveAllLineBreaks")
        private Boolean removeAllLineBreaks ;

        public  TrimContentOptions  removeAllLineBreaks(Boolean  removeAllLineBreaks) {
            this.removeAllLineBreaks =  removeAllLineBreaks;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getRemoveAllLineBreaks() {
            return removeAllLineBreaks;
        }

        public void setRemoveAllLineBreaks(Boolean removeAllLineBreaks) {
            this.removeAllLineBreaks = removeAllLineBreaks;
        }

        @SerializedName("ScopeOptions")
        private ScopeOptions scopeOptions ;

        public  TrimContentOptions  scopeOptions(ScopeOptions  scopeOptions) {
            this.scopeOptions =  scopeOptions;
            return this;
        }

        @ApiModelProperty(value = "")
        public ScopeOptions getScopeOptions() {
            return scopeOptions;
        }

        public void setScopeOptions(ScopeOptions scopeOptions) {
            this.scopeOptions = scopeOptions;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            TrimContentOptions trimContentOptions = (TrimContentOptions) o;
            return
                Objects.equals(this.dataSource, trimContentOptions.dataSource) &&
                Objects.equals(this.fileInfo, trimContentOptions.fileInfo) &&
                Objects.equals(this.trimContent, trimContentOptions.trimContent) &&
                Objects.equals(this.trimLeading, trimContentOptions.trimLeading) &&
                Objects.equals(this.trimTrailing, trimContentOptions.trimTrailing) &&
                Objects.equals(this.trimSpaceBetweenWordTo1, trimContentOptions.trimSpaceBetweenWordTo1) &&
                Objects.equals(this.trimNonBreakingSpaces, trimContentOptions.trimNonBreakingSpaces) &&
                Objects.equals(this.removeExtraLineBreaks, trimContentOptions.removeExtraLineBreaks) &&
                Objects.equals(this.removeAllLineBreaks, trimContentOptions.removeAllLineBreaks) &&
                Objects.equals(this.scopeOptions, trimContentOptions.scopeOptions);
      }

      @Override
      public int hashCode() {
        return Objects.hash(dataSource, fileInfo, trimContent, trimLeading, trimTrailing, trimSpaceBetweenWordTo1, trimNonBreakingSpaces, removeExtraLineBreaks, removeAllLineBreaks, scopeOptions);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class TrimContentOptions {\n");
            sb.append("    dataSource: ").append(toIndentedString(getDataSource())).append("\n");
            sb.append("    fileInfo: ").append(toIndentedString(getFileInfo())).append("\n");
            sb.append("    trimContent: ").append(toIndentedString(getTrimContent())).append("\n");
            sb.append("    trimLeading: ").append(toIndentedString(getTrimLeading())).append("\n");
            sb.append("    trimTrailing: ").append(toIndentedString(getTrimTrailing())).append("\n");
            sb.append("    trimSpaceBetweenWordTo1: ").append(toIndentedString(getTrimSpaceBetweenWordTo1())).append("\n");
            sb.append("    trimNonBreakingSpaces: ").append(toIndentedString(getTrimNonBreakingSpaces())).append("\n");
            sb.append("    removeExtraLineBreaks: ").append(toIndentedString(getRemoveExtraLineBreaks())).append("\n");
            sb.append("    removeAllLineBreaks: ").append(toIndentedString(getRemoveAllLineBreaks())).append("\n");
            sb.append("    scopeOptions: ").append(toIndentedString(getScopeOptions())).append("\n");
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

