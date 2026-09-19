/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="BatchSplitRequest.java">
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


public class BatchSplitRequest {
        @SerializedName("SourceFolder")
        private String sourceFolder ;

        public  BatchSplitRequest  sourceFolder(String  sourceFolder) {
            this.sourceFolder =  sourceFolder;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSourceFolder() {
            return sourceFolder;
        }

        public void setSourceFolder(String sourceFolder) {
            this.sourceFolder = sourceFolder;
        }

        @SerializedName("SourceStorage")
        private String sourceStorage ;

        public  BatchSplitRequest  sourceStorage(String  sourceStorage) {
            this.sourceStorage =  sourceStorage;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSourceStorage() {
            return sourceStorage;
        }

        public void setSourceStorage(String sourceStorage) {
            this.sourceStorage = sourceStorage;
        }

        @SerializedName("MatchCondition")
        private MatchConditionRequest matchCondition ;

        public  BatchSplitRequest  matchCondition(MatchConditionRequest  matchCondition) {
            this.matchCondition =  matchCondition;
            return this;
        }

        @ApiModelProperty(value = "")
        public MatchConditionRequest getMatchCondition() {
            return matchCondition;
        }

        public void setMatchCondition(MatchConditionRequest matchCondition) {
            this.matchCondition = matchCondition;
        }

        @SerializedName("Format")
        private String format ;

        public  BatchSplitRequest  format(String  format) {
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

        @SerializedName("FromIndex")
        private Integer fromIndex ;

        public  BatchSplitRequest  fromIndex(Integer  fromIndex) {
            this.fromIndex =  fromIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getFromIndex() {
            return fromIndex;
        }

        public void setFromIndex(Integer fromIndex) {
            this.fromIndex = fromIndex;
        }

        @SerializedName("ToIndex")
        private Integer toIndex ;

        public  BatchSplitRequest  toIndex(Integer  toIndex) {
            this.toIndex =  toIndex;
            return this;
        }

        @ApiModelProperty(value = "")
        public Integer getToIndex() {
            return toIndex;
        }

        public void setToIndex(Integer toIndex) {
            this.toIndex = toIndex;
        }

        @SerializedName("OutFolder")
        private String outFolder ;

        public  BatchSplitRequest  outFolder(String  outFolder) {
            this.outFolder =  outFolder;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOutFolder() {
            return outFolder;
        }

        public void setOutFolder(String outFolder) {
            this.outFolder = outFolder;
        }

        @SerializedName("OutStorage")
        private String outStorage ;

        public  BatchSplitRequest  outStorage(String  outStorage) {
            this.outStorage =  outStorage;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOutStorage() {
            return outStorage;
        }

        public void setOutStorage(String outStorage) {
            this.outStorage = outStorage;
        }

        @SerializedName("Region")
        private String region ;

        public  BatchSplitRequest  region(String  region) {
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

        public  BatchSplitRequest  saveOptions(SaveOptions  saveOptions) {
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

            BatchSplitRequest batchSplitRequest = (BatchSplitRequest) o;
            return
                Objects.equals(this.sourceFolder, batchSplitRequest.sourceFolder) &&
                Objects.equals(this.sourceStorage, batchSplitRequest.sourceStorage) &&
                Objects.equals(this.matchCondition, batchSplitRequest.matchCondition) &&
                Objects.equals(this.format, batchSplitRequest.format) &&
                Objects.equals(this.fromIndex, batchSplitRequest.fromIndex) &&
                Objects.equals(this.toIndex, batchSplitRequest.toIndex) &&
                Objects.equals(this.outFolder, batchSplitRequest.outFolder) &&
                Objects.equals(this.outStorage, batchSplitRequest.outStorage) &&
                Objects.equals(this.region, batchSplitRequest.region) &&
                Objects.equals(this.saveOptions, batchSplitRequest.saveOptions);
      }

      @Override
      public int hashCode() {
        return Objects.hash(sourceFolder, sourceStorage, matchCondition, format, fromIndex, toIndex, outFolder, outStorage, region, saveOptions);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class BatchSplitRequest {\n");
            sb.append("    sourceFolder: ").append(toIndentedString(getSourceFolder())).append("\n");
            sb.append("    sourceStorage: ").append(toIndentedString(getSourceStorage())).append("\n");
            sb.append("    matchCondition: ").append(toIndentedString(getMatchCondition())).append("\n");
            sb.append("    format: ").append(toIndentedString(getFormat())).append("\n");
            sb.append("    fromIndex: ").append(toIndentedString(getFromIndex())).append("\n");
            sb.append("    toIndex: ").append(toIndentedString(getToIndex())).append("\n");
            sb.append("    outFolder: ").append(toIndentedString(getOutFolder())).append("\n");
            sb.append("    outStorage: ").append(toIndentedString(getOutStorage())).append("\n");
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

