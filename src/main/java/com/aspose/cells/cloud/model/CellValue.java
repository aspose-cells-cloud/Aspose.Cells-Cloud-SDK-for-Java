/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CellValue.java">
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

public class CellValue {

    @SerializedName("rowIndex")
    @JsonProperty("rowIndex")
    private Integer rowIndex;

    public CellValue rowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRowIndex() {
        return rowIndex;
    }

    public void setRowIndex(Integer rowIndex) {
        this.rowIndex = rowIndex;
    }

    @SerializedName("columnIndex")
    @JsonProperty("columnIndex")
    private Integer columnIndex;

    public CellValue columnIndex(Integer columnIndex) {
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

    @SerializedName("type")
    @JsonProperty("type")
    private String type;

    public CellValue type(String type) {
        this.type = type;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @SerializedName("value")
    @JsonProperty("value")
    private String value;

    public CellValue value(String value) {
        this.value = value;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @SerializedName("formula")
    @JsonProperty("formula")
    private String formula;

    public CellValue formula(String formula) {
        this.formula = formula;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @SerializedName("style")
    @JsonProperty("style")
    private Style style;

    public CellValue style(Style style) {
        this.style = style;
        return this;
    }

    @ApiModelProperty(value = "")
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CellValue other = (CellValue) o;
        return Objects.equals(this.rowIndex, other.rowIndex)
            && Objects.equals(this.columnIndex, other.columnIndex)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.value, other.value)
            && Objects.equals(this.formula, other.formula)
            && Objects.equals(this.style, other.style);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowIndex, columnIndex, type, value, formula, style);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CellValue {\n");
        sb.append("    rowIndex: ").append(rowIndex).append("\n");
        sb.append("    columnIndex: ").append(columnIndex).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    value: ").append(value).append("\n");
        sb.append("    formula: ").append(formula).append("\n");
        sb.append("    style: ").append(style).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
