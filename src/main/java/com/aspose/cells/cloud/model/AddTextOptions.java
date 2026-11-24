/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AddTextOptions.java">
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

public class AddTextOptions extends BaseOperateOptions {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public AddTextOptions name(String name) {
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

    public AddTextOptions dataSource(DataSource dataSource) {
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

    public AddTextOptions fileInfo(FileInfo fileInfo) {
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

    public AddTextOptions scopeOptions(ScopeOptions scopeOptions) {
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

    @SerializedName("Text")
    @JsonProperty("Text")
    private String text;

    public AddTextOptions text(String text) {
        this.text = text;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @SerializedName("SelectPoistion")
    @JsonProperty("SelectPoistion")
    private String selectPoistion;

    public AddTextOptions selectPoistion(String selectPoistion) {
        this.selectPoistion = selectPoistion;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSelectPoistion() {
        return selectPoistion;
    }

    public void setSelectPoistion(String selectPoistion) {
        this.selectPoistion = selectPoistion;
    }

    @SerializedName("SelectText")
    @JsonProperty("SelectText")
    private String selectText;

    public AddTextOptions selectText(String selectText) {
        this.selectText = selectText;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSelectText() {
        return selectText;
    }

    public void setSelectText(String selectText) {
        this.selectText = selectText;
    }

    @SerializedName("SkipEmptyCells")
    @JsonProperty("SkipEmptyCells")
    private Boolean skipEmptyCells;

    public AddTextOptions skipEmptyCells(Boolean skipEmptyCells) {
        this.skipEmptyCells = skipEmptyCells;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSkipEmptyCells() {
        return skipEmptyCells;
    }

    public void setSkipEmptyCells(Boolean skipEmptyCells) {
        this.skipEmptyCells = skipEmptyCells;
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
        AddTextOptions other = (AddTextOptions) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.fileInfo, other.fileInfo)
            && Objects.equals(this.scopeOptions, other.scopeOptions)
            && Objects.equals(this.text, other.text)
            && Objects.equals(this.selectPoistion, other.selectPoistion)
            && Objects.equals(this.selectText, other.selectText)
            && Objects.equals(this.skipEmptyCells, other.skipEmptyCells);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataSource, fileInfo, scopeOptions, text, selectPoistion, selectText, skipEmptyCells, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddTextOptions {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    fileInfo: ").append(fileInfo).append("\n");
        sb.append("    scopeOptions: ").append(scopeOptions).append("\n");
        sb.append("    text: ").append(text).append("\n");
        sb.append("    selectPoistion: ").append(selectPoistion).append("\n");
        sb.append("    selectText: ").append(selectText).append("\n");
        sb.append("    skipEmptyCells: ").append(skipEmptyCells).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
