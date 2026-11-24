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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class AnalyzedResult {

    @SerializedName("Filename")
    @JsonProperty("Filename")
    private String filename;

    public AnalyzedResult filename(String filename) {
        this.filename = filename;
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
    @JsonProperty("Description")
    private String description;

    public AnalyzedResult description(String description) {
        this.description = description;
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
    @JsonProperty("BasicStatistics")
    private ExcelDataStatistics basicStatistics;

    public AnalyzedResult basicStatistics(ExcelDataStatistics basicStatistics) {
        this.basicStatistics = basicStatistics;
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
    @JsonProperty("Results")
    private List<AnalyzedTableDescription> results;

    public AnalyzedResult results(List<AnalyzedTableDescription> results) {
        this.results = results;
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
    @JsonProperty("SuggestedFile")
    private String suggestedFile;

    public AnalyzedResult suggestedFile(String suggestedFile) {
        this.suggestedFile = suggestedFile;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalyzedResult other = (AnalyzedResult) o;
        return Objects.equals(this.filename, other.filename)
            && Objects.equals(this.description, other.description)
            && Objects.equals(this.basicStatistics, other.basicStatistics)
            && Objects.equals(this.results, other.results)
            && Objects.equals(this.suggestedFile, other.suggestedFile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filename, description, basicStatistics, results, suggestedFile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyzedResult {\n");
        sb.append("    filename: ").append(filename).append("\n");
        sb.append("    description: ").append(description).append("\n");
        sb.append("    basicStatistics: ").append(basicStatistics).append("\n");
        sb.append("    results: ").append(results).append("\n");
        sb.append("    suggestedFile: ").append(suggestedFile).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
