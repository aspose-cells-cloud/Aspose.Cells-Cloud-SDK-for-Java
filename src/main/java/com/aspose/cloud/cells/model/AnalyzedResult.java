/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AnalyzedResult.java">
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


public class AnalyzedResult {
        @SerializedName("Filename")
        private String filename ;

        public  AnalyzedResult  filename(String  filename) {
            this.filename =  filename;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getFilename() {
            return filename;
        }

        public void setFilename(String filename) {
            this.filename = filename;
        }

        @SerializedName("Description")
        private String description ;

        public  AnalyzedResult  description(String  description) {
            this.description =  description;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @SerializedName("BasicStatistics")
        private ExcelDataStatistics basicStatistics ;

        public  AnalyzedResult  basicStatistics(ExcelDataStatistics  basicStatistics) {
            this.basicStatistics =  basicStatistics;
            return this;
        }

        @ApiModelProperty(value = "")
        public ExcelDataStatistics getBasicStatistics() {
            return basicStatistics;
        }

        public void setBasicStatistics(ExcelDataStatistics basicStatistics) {
            this.basicStatistics = basicStatistics;
        }

        @SerializedName("Results")
        private List<AnalyzedTableDescription> results ;

        public  AnalyzedResult  results(List<AnalyzedTableDescription>  results) {
            this.results =  results;
            return this;
        }

        @ApiModelProperty(value = "")
        public List<AnalyzedTableDescription> getResults() {
            return results;
        }

        public void setResults(List<AnalyzedTableDescription> results) {
            this.results = results;
        }

        @SerializedName("SuggestedFile")
        private String suggestedFile ;

        public  AnalyzedResult  suggestedFile(String  suggestedFile) {
            this.suggestedFile =  suggestedFile;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getSuggestedFile() {
            return suggestedFile;
        }

        public void setSuggestedFile(String suggestedFile) {
            this.suggestedFile = suggestedFile;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            AnalyzedResult analyzedResult = (AnalyzedResult) o;
            return
                Objects.equals(this.filename, analyzedResult.filename) &&
                Objects.equals(this.description, analyzedResult.description) &&
                Objects.equals(this.basicStatistics, analyzedResult.basicStatistics) &&
                Objects.equals(this.results, analyzedResult.results) &&
                Objects.equals(this.suggestedFile, analyzedResult.suggestedFile);
      }

      @Override
      public int hashCode() {
        return Objects.hash(filename, description, basicStatistics, results, suggestedFile);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class AnalyzedResult {\n");
            sb.append("    filename: ").append(toIndentedString(getFilename())).append("\n");
            sb.append("    description: ").append(toIndentedString(getDescription())).append("\n");
            sb.append("    basicStatistics: ").append(toIndentedString(getBasicStatistics())).append("\n");
            sb.append("    results: ").append(toIndentedString(getResults())).append("\n");
            sb.append("    suggestedFile: ").append(toIndentedString(getSuggestedFile())).append("\n");
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

