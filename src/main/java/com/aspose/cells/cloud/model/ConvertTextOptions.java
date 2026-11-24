/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertTextOptions.java">
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

public class ConvertTextOptions extends BaseOperateOptions {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public ConvertTextOptions name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("DataSource")
    @JsonProperty("DataSource")
    private DataSource dataSource;

    public ConvertTextOptions dataSource(DataSource dataSource) {
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

    public ConvertTextOptions fileInfo(FileInfo fileInfo) {
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

    @SerializedName("ScopeOptions")
    @JsonProperty("ScopeOptions")
    private ScopeOptions scopeOptions;

    public ConvertTextOptions scopeOptions(ScopeOptions scopeOptions) {
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

    @SerializedName("ConvertTextType")
    @JsonProperty("ConvertTextType")
    private String convertTextType;

    public ConvertTextOptions convertTextType(String convertTextType) {
        this.convertTextType = convertTextType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getConvertTextType() {
        return convertTextType;
    }

    public void setConvertTextType(String convertTextType) {
        this.convertTextType = convertTextType;
    }

    @SerializedName("SourceCharacters")
    @JsonProperty("SourceCharacters")
    private String sourceCharacters;

    public ConvertTextOptions sourceCharacters(String sourceCharacters) {
        this.sourceCharacters = sourceCharacters;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSourceCharacters() {
        return sourceCharacters;
    }

    public void setSourceCharacters(String sourceCharacters) {
        this.sourceCharacters = sourceCharacters;
    }

    @SerializedName("TargetCharacters")
    @JsonProperty("TargetCharacters")
    private String targetCharacters;

    public ConvertTextOptions targetCharacters(String targetCharacters) {
        this.targetCharacters = targetCharacters;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTargetCharacters() {
        return targetCharacters;
    }

    public void setTargetCharacters(String targetCharacters) {
        this.targetCharacters = targetCharacters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        ConvertTextOptions other = (ConvertTextOptions) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.fileInfo, other.fileInfo)
            && Objects.equals(this.scopeOptions, other.scopeOptions)
            && Objects.equals(this.convertTextType, other.convertTextType)
            && Objects.equals(this.sourceCharacters, other.sourceCharacters)
            && Objects.equals(this.targetCharacters, other.targetCharacters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataSource, fileInfo, scopeOptions, convertTextType, sourceCharacters, targetCharacters, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertTextOptions {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    fileInfo: ").append(fileInfo).append("\n");
        sb.append("    scopeOptions: ").append(scopeOptions).append("\n");
        sb.append("    convertTextType: ").append(convertTextType).append("\n");
        sb.append("    sourceCharacters: ").append(sourceCharacters).append("\n");
        sb.append("    targetCharacters: ").append(targetCharacters).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
