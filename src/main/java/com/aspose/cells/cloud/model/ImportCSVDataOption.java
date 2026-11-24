/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ImportCSVDataOption.java">
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

public class ImportCSVDataOption extends ImportOption {

    @SerializedName("SeparatorString")
    @JsonProperty("SeparatorString")
    private String separatorString;

    public ImportCSVDataOption separatorString(String separatorString) {
        this.separatorString = separatorString;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSeparatorString() {
        return separatorString;
    }

    public void setSeparatorString(String separatorString) {
        this.separatorString = separatorString;
    }

    @SerializedName("ConvertNumericData")
    @JsonProperty("ConvertNumericData")
    private Boolean convertNumericData;

    public ImportCSVDataOption convertNumericData(Boolean convertNumericData) {
        this.convertNumericData = convertNumericData;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getConvertNumericData() {
        return convertNumericData;
    }

    public void setConvertNumericData(Boolean convertNumericData) {
        this.convertNumericData = convertNumericData;
    }

    @SerializedName("FirstRow")
    @JsonProperty("FirstRow")
    private Integer firstRow;

    public ImportCSVDataOption firstRow(Integer firstRow) {
        this.firstRow = firstRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFirstRow() {
        return firstRow;
    }

    public void setFirstRow(Integer firstRow) {
        this.firstRow = firstRow;
    }

    @SerializedName("FirstColumn")
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    public ImportCSVDataOption firstColumn(Integer firstColumn) {
        this.firstColumn = firstColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFirstColumn() {
        return firstColumn;
    }

    public void setFirstColumn(Integer firstColumn) {
        this.firstColumn = firstColumn;
    }

    @SerializedName("SourceFile")
    @JsonProperty("SourceFile")
    private String sourceFile;

    public ImportCSVDataOption sourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSourceFile() {
        return sourceFile;
    }

    public void setSourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
    }

    @SerializedName("CustomParsers")
    @JsonProperty("CustomParsers")
    private List<CustomParserConfig> customParsers;

    public ImportCSVDataOption customParsers(List<CustomParserConfig> customParsers) {
        this.customParsers = customParsers;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<CustomParserConfig> getCustomParsers() {
        return customParsers;
    }

    public void setCustomParsers(List<CustomParserConfig> customParsers) {
        this.customParsers = customParsers;
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
        ImportCSVDataOption other = (ImportCSVDataOption) o;
        return Objects.equals(this.separatorString, other.separatorString)
            && Objects.equals(this.convertNumericData, other.convertNumericData)
            && Objects.equals(this.firstRow, other.firstRow)
            && Objects.equals(this.firstColumn, other.firstColumn)
            && Objects.equals(this.sourceFile, other.sourceFile)
            && Objects.equals(this.customParsers, other.customParsers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(separatorString, convertNumericData, firstRow, firstColumn, sourceFile, customParsers, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportCSVDataOption {\n");
        sb.append("    separatorString: ").append(separatorString).append("\n");
        sb.append("    convertNumericData: ").append(convertNumericData).append("\n");
        sb.append("    firstRow: ").append(firstRow).append("\n");
        sb.append("    firstColumn: ").append(firstColumn).append("\n");
        sb.append("    sourceFile: ").append(sourceFile).append("\n");
        sb.append("    customParsers: ").append(customParsers).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
