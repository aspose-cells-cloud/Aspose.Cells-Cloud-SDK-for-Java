/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AnalyzedColumnDescription.java">
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

public class AnalyzedColumnDescription {

    @SerializedName("Index")
    @JsonProperty("Index")
    private Integer index;

    public AnalyzedColumnDescription index(Integer index) {
        this.index = index;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    @SerializedName("ColumnIndex")
    @JsonProperty("ColumnIndex")
    private Integer columnIndex;

    public AnalyzedColumnDescription columnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
    }

    @SerializedName("Title")
    @JsonProperty("Title")
    private String title;

    public AnalyzedColumnDescription title(String title) {
        this.title = title;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @SerializedName("RepetitionRate")
    @JsonProperty("RepetitionRate")
    private Double repetitionRate;

    public AnalyzedColumnDescription repetitionRate(Double repetitionRate) {
        this.repetitionRate = repetitionRate;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getRepetitionRate() {
        return repetitionRate;
    }

    public void setRepetitionRate(Double repetitionRate) {
        this.repetitionRate = repetitionRate;
    }

    @SerializedName("ColumnDataDataType")
    @JsonProperty("ColumnDataDataType")
    private String columnDataDataType;

    public AnalyzedColumnDescription columnDataDataType(String columnDataDataType) {
        this.columnDataDataType = columnDataDataType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getColumnDataDataType() {
        return columnDataDataType;
    }

    public void setColumnDataDataType(String columnDataDataType) {
        this.columnDataDataType = columnDataDataType;
    }

    @SerializedName("NumberCategoryType")
    @JsonProperty("NumberCategoryType")
    private String numberCategoryType;

    public AnalyzedColumnDescription numberCategoryType(String numberCategoryType) {
        this.numberCategoryType = numberCategoryType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getNumberCategoryType() {
        return numberCategoryType;
    }

    public void setNumberCategoryType(String numberCategoryType) {
        this.numberCategoryType = numberCategoryType;
    }

    @SerializedName("TextCategoryType")
    @JsonProperty("TextCategoryType")
    private String textCategoryType;

    public AnalyzedColumnDescription textCategoryType(String textCategoryType) {
        this.textCategoryType = textCategoryType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextCategoryType() {
        return textCategoryType;
    }

    public void setTextCategoryType(String textCategoryType) {
        this.textCategoryType = textCategoryType;
    }

    @SerializedName("StyleNumber")
    @JsonProperty("StyleNumber")
    private Integer styleNumber;

    public AnalyzedColumnDescription styleNumber(Integer styleNumber) {
        this.styleNumber = styleNumber;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getStyleNumber() {
        return styleNumber;
    }

    public void setStyleNumber(Integer styleNumber) {
        this.styleNumber = styleNumber;
    }

    @SerializedName("columnDataExceptionDescription")
    @JsonProperty("columnDataExceptionDescription")
    private String columnDataExceptionDescription;

    public AnalyzedColumnDescription columnDataExceptionDescription(String columnDataExceptionDescription) {
        this.columnDataExceptionDescription = columnDataExceptionDescription;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getColumnDataExceptionDescription() {
        return columnDataExceptionDescription;
    }

    public void setColumnDataExceptionDescription(String columnDataExceptionDescription) {
        this.columnDataExceptionDescription = columnDataExceptionDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AnalyzedColumnDescription other = (AnalyzedColumnDescription) o;
        return Objects.equals(this.index, other.index)
            && Objects.equals(this.columnIndex, other.columnIndex)
            && Objects.equals(this.title, other.title)
            && Objects.equals(this.repetitionRate, other.repetitionRate)
            && Objects.equals(this.columnDataDataType, other.columnDataDataType)
            && Objects.equals(this.numberCategoryType, other.numberCategoryType)
            && Objects.equals(this.textCategoryType, other.textCategoryType)
            && Objects.equals(this.styleNumber, other.styleNumber)
            && Objects.equals(this.columnDataExceptionDescription, other.columnDataExceptionDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, columnIndex, title, repetitionRate, columnDataDataType, numberCategoryType, textCategoryType, styleNumber, columnDataExceptionDescription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AnalyzedColumnDescription {\n");
        sb.append("    index: ").append(index).append("\n");
        sb.append("    columnIndex: ").append(columnIndex).append("\n");
        sb.append("    title: ").append(title).append("\n");
        sb.append("    repetitionRate: ").append(repetitionRate).append("\n");
        sb.append("    columnDataDataType: ").append(columnDataDataType).append("\n");
        sb.append("    numberCategoryType: ").append(numberCategoryType).append("\n");
        sb.append("    textCategoryType: ").append(textCategoryType).append("\n");
        sb.append("    styleNumber: ").append(styleNumber).append("\n");
        sb.append("    columnDataExceptionDescription: ").append(columnDataExceptionDescription).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
