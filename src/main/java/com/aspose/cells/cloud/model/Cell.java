/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Cell.java">
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

public class Cell extends LinkElement {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public Cell name(String name) {
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

    @SerializedName("Row")
    @JsonProperty("Row")
    private Integer row;

    public Cell row(Integer row) {
        this.row = row;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    @SerializedName("Column")
    @JsonProperty("Column")
    private Integer column;

    public Cell column(Integer column) {
        this.column = column;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    @SerializedName("Value")
    @JsonProperty("Value")
    private String value;

    public Cell value(String value) {
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

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public Cell type(String type) {
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

    @SerializedName("Formula")
    @JsonProperty("Formula")
    private String formula;

    public Cell formula(String formula) {
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

    @SerializedName("IsFormula")
    @JsonProperty("IsFormula")
    private Boolean isFormula;

    public Cell isFormula(Boolean isFormula) {
        this.isFormula = isFormula;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsFormula() {
        return isFormula;
    }

    public void setIsFormula(Boolean isFormula) {
        this.isFormula = isFormula;
    }

    @SerializedName("IsMerged")
    @JsonProperty("IsMerged")
    private Boolean isMerged;

    public Cell isMerged(Boolean isMerged) {
        this.isMerged = isMerged;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsMerged() {
        return isMerged;
    }

    public void setIsMerged(Boolean isMerged) {
        this.isMerged = isMerged;
    }

    @SerializedName("IsArrayHeader")
    @JsonProperty("IsArrayHeader")
    private Boolean isArrayHeader;

    public Cell isArrayHeader(Boolean isArrayHeader) {
        this.isArrayHeader = isArrayHeader;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsArrayHeader() {
        return isArrayHeader;
    }

    public void setIsArrayHeader(Boolean isArrayHeader) {
        this.isArrayHeader = isArrayHeader;
    }

    @SerializedName("IsInArray")
    @JsonProperty("IsInArray")
    private Boolean isInArray;

    public Cell isInArray(Boolean isInArray) {
        this.isInArray = isInArray;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsInArray() {
        return isInArray;
    }

    public void setIsInArray(Boolean isInArray) {
        this.isInArray = isInArray;
    }

    @SerializedName("IsErrorValue")
    @JsonProperty("IsErrorValue")
    private Boolean isErrorValue;

    public Cell isErrorValue(Boolean isErrorValue) {
        this.isErrorValue = isErrorValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsErrorValue() {
        return isErrorValue;
    }

    public void setIsErrorValue(Boolean isErrorValue) {
        this.isErrorValue = isErrorValue;
    }

    @SerializedName("IsInTable")
    @JsonProperty("IsInTable")
    private Boolean isInTable;

    public Cell isInTable(Boolean isInTable) {
        this.isInTable = isInTable;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsInTable() {
        return isInTable;
    }

    public void setIsInTable(Boolean isInTable) {
        this.isInTable = isInTable;
    }

    @SerializedName("IsStyleSet")
    @JsonProperty("IsStyleSet")
    private Boolean isStyleSet;

    public Cell isStyleSet(Boolean isStyleSet) {
        this.isStyleSet = isStyleSet;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsStyleSet() {
        return isStyleSet;
    }

    public void setIsStyleSet(Boolean isStyleSet) {
        this.isStyleSet = isStyleSet;
    }

    @SerializedName("HtmlString")
    @JsonProperty("HtmlString")
    private String htmlString;

    public Cell htmlString(String htmlString) {
        this.htmlString = htmlString;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getHtmlString() {
        return htmlString;
    }

    public void setHtmlString(String htmlString) {
        this.htmlString = htmlString;
    }

    @SerializedName("Style")
    @JsonProperty("Style")
    private LinkElement style;

    public Cell style(LinkElement style) {
        this.style = style;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getStyle() {
        return style;
    }

    public void setStyle(LinkElement style) {
        this.style = style;
    }

    @SerializedName("Worksheet")
    @JsonProperty("Worksheet")
    private String worksheet;

    public Cell worksheet(String worksheet) {
        this.worksheet = worksheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getWorksheet() {
        return worksheet;
    }

    public void setWorksheet(String worksheet) {
        this.worksheet = worksheet;
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
        Cell other = (Cell) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.row, other.row)
            && Objects.equals(this.column, other.column)
            && Objects.equals(this.value, other.value)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.formula, other.formula)
            && Objects.equals(this.isFormula, other.isFormula)
            && Objects.equals(this.isMerged, other.isMerged)
            && Objects.equals(this.isArrayHeader, other.isArrayHeader)
            && Objects.equals(this.isInArray, other.isInArray)
            && Objects.equals(this.isErrorValue, other.isErrorValue)
            && Objects.equals(this.isInTable, other.isInTable)
            && Objects.equals(this.isStyleSet, other.isStyleSet)
            && Objects.equals(this.htmlString, other.htmlString)
            && Objects.equals(this.style, other.style)
            && Objects.equals(this.worksheet, other.worksheet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, row, column, value, type, formula, isFormula, isMerged, isArrayHeader, isInArray, isErrorValue, isInTable, isStyleSet, htmlString, style, worksheet, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cell {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    row: ").append(row).append("\n");
        sb.append("    column: ").append(column).append("\n");
        sb.append("    value: ").append(value).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    formula: ").append(formula).append("\n");
        sb.append("    isFormula: ").append(isFormula).append("\n");
        sb.append("    isMerged: ").append(isMerged).append("\n");
        sb.append("    isArrayHeader: ").append(isArrayHeader).append("\n");
        sb.append("    isInArray: ").append(isInArray).append("\n");
        sb.append("    isErrorValue: ").append(isErrorValue).append("\n");
        sb.append("    isInTable: ").append(isInTable).append("\n");
        sb.append("    isStyleSet: ").append(isStyleSet).append("\n");
        sb.append("    htmlString: ").append(htmlString).append("\n");
        sb.append("    style: ").append(style).append("\n");
        sb.append("    worksheet: ").append(worksheet).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
