/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConvertWorkbookOptions.java">
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

public class ConvertWorkbookOptions extends BaseOperateOptions {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public ConvertWorkbookOptions name(String name) {
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

    public ConvertWorkbookOptions dataSource(DataSource dataSource) {
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

    public ConvertWorkbookOptions fileInfo(FileInfo fileInfo) {
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

    @SerializedName("PageSetup")
    @JsonProperty("PageSetup")
    private PageSetup pageSetup;

    public ConvertWorkbookOptions pageSetup(PageSetup pageSetup) {
        this.pageSetup = pageSetup;
        return this;
    }

    @ApiModelProperty(value = "")
    public PageSetup getPageSetup() {
        return pageSetup;
    }

    public void setPageSetup(PageSetup pageSetup) {
        this.pageSetup = pageSetup;
    }

    @SerializedName("SaveOptions")
    @JsonProperty("SaveOptions")
    private SaveOptions saveOptions;

    public ConvertWorkbookOptions saveOptions(SaveOptions saveOptions) {
        this.saveOptions = saveOptions;
        return this;
    }

    @ApiModelProperty(value = "")
    public SaveOptions getSaveOptions() {
        return saveOptions;
    }

    public void setSaveOptions(SaveOptions saveOptions) {
        this.saveOptions = saveOptions;
    }

    @SerializedName("ConvertFormat")
    @JsonProperty("ConvertFormat")
    private String convertFormat;

    public ConvertWorkbookOptions convertFormat(String convertFormat) {
        this.convertFormat = convertFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getConvertFormat() {
        return convertFormat;
    }

    public void setConvertFormat(String convertFormat) {
        this.convertFormat = convertFormat;
    }

    @SerializedName("CheckExcelRestriction")
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    public ConvertWorkbookOptions checkExcelRestriction(Boolean checkExcelRestriction) {
        this.checkExcelRestriction = checkExcelRestriction;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCheckExcelRestriction() {
        return checkExcelRestriction;
    }

    public void setCheckExcelRestriction(Boolean checkExcelRestriction) {
        this.checkExcelRestriction = checkExcelRestriction;
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
        ConvertWorkbookOptions other = (ConvertWorkbookOptions) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.dataSource, other.dataSource)
            && Objects.equals(this.fileInfo, other.fileInfo)
            && Objects.equals(this.pageSetup, other.pageSetup)
            && Objects.equals(this.saveOptions, other.saveOptions)
            && Objects.equals(this.convertFormat, other.convertFormat)
            && Objects.equals(this.checkExcelRestriction, other.checkExcelRestriction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, dataSource, fileInfo, pageSetup, saveOptions, convertFormat, checkExcelRestriction, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertWorkbookOptions {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    dataSource: ").append(dataSource).append("\n");
        sb.append("    fileInfo: ").append(fileInfo).append("\n");
        sb.append("    pageSetup: ").append(pageSetup).append("\n");
        sb.append("    saveOptions: ").append(saveOptions).append("\n");
        sb.append("    convertFormat: ").append(convertFormat).append("\n");
        sb.append("    checkExcelRestriction: ").append(checkExcelRestriction).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
