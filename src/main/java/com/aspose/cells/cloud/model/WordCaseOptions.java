/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WordCaseOptions.java">
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

public class WordCaseOptions {

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public WordCaseOptions dataSource(DataSource dataSource) {
        this.dataSource = dataSource;
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
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    public WordCaseOptions fileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
        return this;
    }

    @ApiModelProperty(value = "")
    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    @SerializedName("WordCaseType")
    @JsonProperty("WordCaseType")
    private String wordCaseType;

    public WordCaseOptions wordCaseType(String wordCaseType) {
        this.wordCaseType = wordCaseType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getWordCaseType() {
        return wordCaseType;
    }

    public void setWordCaseType(String wordCaseType) {
        this.wordCaseType = wordCaseType;
    }

    @SerializedName("ScopeOptions")
    @JsonProperty("ScopeOptions")
    private ScopeOptions scopeOptions;

    public WordCaseOptions scopeOptions(ScopeOptions scopeOptions) {
        this.scopeOptions = scopeOptions;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WordCaseOptions other = (WordCaseOptions) o;
        return Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.fileInfo, other.fileInfo)
            && Objects.equals(this.wordCaseType, other.wordCaseType)
            && Objects.equals(this.scopeOptions, other.scopeOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataSource, fileInfo, wordCaseType, scopeOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WordCaseOptions {\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    fileInfo: ").append(fileInfo).append("\n");
        sb.append("    wordCaseType: ").append(wordCaseType).append("\n");
        sb.append("    scopeOptions: ").append(scopeOptions).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
