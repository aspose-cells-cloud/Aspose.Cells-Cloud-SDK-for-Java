/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Protection.java">
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

public class Protection {

    @SerializedName("AllowDeletingColumn")
    @JsonProperty("AllowDeletingColumn")
    private Boolean allowDeletingColumn;

    public Protection allowDeletingColumn(Boolean allowDeletingColumn) {
        this.allowDeletingColumn = allowDeletingColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowDeletingColumn() {
        return allowDeletingColumn;
    }

    public void setAllowDeletingColumn(Boolean allowDeletingColumn) {
        this.allowDeletingColumn = allowDeletingColumn;
    }

    @SerializedName("AllowDeletingRow")
    @JsonProperty("AllowDeletingRow")
    private Boolean allowDeletingRow;

    public Protection allowDeletingRow(Boolean allowDeletingRow) {
        this.allowDeletingRow = allowDeletingRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowDeletingRow() {
        return allowDeletingRow;
    }

    public void setAllowDeletingRow(Boolean allowDeletingRow) {
        this.allowDeletingRow = allowDeletingRow;
    }

    @SerializedName("AllowFiltering")
    @JsonProperty("AllowFiltering")
    private Boolean allowFiltering;

    public Protection allowFiltering(Boolean allowFiltering) {
        this.allowFiltering = allowFiltering;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowFiltering() {
        return allowFiltering;
    }

    public void setAllowFiltering(Boolean allowFiltering) {
        this.allowFiltering = allowFiltering;
    }

    @SerializedName("AllowFormattingCell")
    @JsonProperty("AllowFormattingCell")
    private Boolean allowFormattingCell;

    public Protection allowFormattingCell(Boolean allowFormattingCell) {
        this.allowFormattingCell = allowFormattingCell;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowFormattingCell() {
        return allowFormattingCell;
    }

    public void setAllowFormattingCell(Boolean allowFormattingCell) {
        this.allowFormattingCell = allowFormattingCell;
    }

    @SerializedName("AllowFormattingColumn")
    @JsonProperty("AllowFormattingColumn")
    private Boolean allowFormattingColumn;

    public Protection allowFormattingColumn(Boolean allowFormattingColumn) {
        this.allowFormattingColumn = allowFormattingColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowFormattingColumn() {
        return allowFormattingColumn;
    }

    public void setAllowFormattingColumn(Boolean allowFormattingColumn) {
        this.allowFormattingColumn = allowFormattingColumn;
    }

    @SerializedName("AllowFormattingRow")
    @JsonProperty("AllowFormattingRow")
    private Boolean allowFormattingRow;

    public Protection allowFormattingRow(Boolean allowFormattingRow) {
        this.allowFormattingRow = allowFormattingRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowFormattingRow() {
        return allowFormattingRow;
    }

    public void setAllowFormattingRow(Boolean allowFormattingRow) {
        this.allowFormattingRow = allowFormattingRow;
    }

    @SerializedName("AllowInsertingColumn")
    @JsonProperty("AllowInsertingColumn")
    private Boolean allowInsertingColumn;

    public Protection allowInsertingColumn(Boolean allowInsertingColumn) {
        this.allowInsertingColumn = allowInsertingColumn;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowInsertingColumn() {
        return allowInsertingColumn;
    }

    public void setAllowInsertingColumn(Boolean allowInsertingColumn) {
        this.allowInsertingColumn = allowInsertingColumn;
    }

    @SerializedName("AllowInsertingHyperlink")
    @JsonProperty("AllowInsertingHyperlink")
    private Boolean allowInsertingHyperlink;

    public Protection allowInsertingHyperlink(Boolean allowInsertingHyperlink) {
        this.allowInsertingHyperlink = allowInsertingHyperlink;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowInsertingHyperlink() {
        return allowInsertingHyperlink;
    }

    public void setAllowInsertingHyperlink(Boolean allowInsertingHyperlink) {
        this.allowInsertingHyperlink = allowInsertingHyperlink;
    }

    @SerializedName("AllowInsertingRow")
    @JsonProperty("AllowInsertingRow")
    private Boolean allowInsertingRow;

    public Protection allowInsertingRow(Boolean allowInsertingRow) {
        this.allowInsertingRow = allowInsertingRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowInsertingRow() {
        return allowInsertingRow;
    }

    public void setAllowInsertingRow(Boolean allowInsertingRow) {
        this.allowInsertingRow = allowInsertingRow;
    }

    @SerializedName("AllowSorting")
    @JsonProperty("AllowSorting")
    private Boolean allowSorting;

    public Protection allowSorting(Boolean allowSorting) {
        this.allowSorting = allowSorting;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowSorting() {
        return allowSorting;
    }

    public void setAllowSorting(Boolean allowSorting) {
        this.allowSorting = allowSorting;
    }

    @SerializedName("AllowUsingPivotTable")
    @JsonProperty("AllowUsingPivotTable")
    private Boolean allowUsingPivotTable;

    public Protection allowUsingPivotTable(Boolean allowUsingPivotTable) {
        this.allowUsingPivotTable = allowUsingPivotTable;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowUsingPivotTable() {
        return allowUsingPivotTable;
    }

    public void setAllowUsingPivotTable(Boolean allowUsingPivotTable) {
        this.allowUsingPivotTable = allowUsingPivotTable;
    }

    @SerializedName("AllowEditingContent")
    @JsonProperty("AllowEditingContent")
    private Boolean allowEditingContent;

    public Protection allowEditingContent(Boolean allowEditingContent) {
        this.allowEditingContent = allowEditingContent;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowEditingContent() {
        return allowEditingContent;
    }

    public void setAllowEditingContent(Boolean allowEditingContent) {
        this.allowEditingContent = allowEditingContent;
    }

    @SerializedName("AllowEditingObject")
    @JsonProperty("AllowEditingObject")
    private Boolean allowEditingObject;

    public Protection allowEditingObject(Boolean allowEditingObject) {
        this.allowEditingObject = allowEditingObject;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowEditingObject() {
        return allowEditingObject;
    }

    public void setAllowEditingObject(Boolean allowEditingObject) {
        this.allowEditingObject = allowEditingObject;
    }

    @SerializedName("AllowEditingScenario")
    @JsonProperty("AllowEditingScenario")
    private Boolean allowEditingScenario;

    public Protection allowEditingScenario(Boolean allowEditingScenario) {
        this.allowEditingScenario = allowEditingScenario;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowEditingScenario() {
        return allowEditingScenario;
    }

    public void setAllowEditingScenario(Boolean allowEditingScenario) {
        this.allowEditingScenario = allowEditingScenario;
    }

    @SerializedName("Password")
    @JsonProperty("Password")
    private String password;

    public Protection password(String password) {
        this.password = password;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @SerializedName("AllowSelectingLockedCell")
    @JsonProperty("AllowSelectingLockedCell")
    private Boolean allowSelectingLockedCell;

    public Protection allowSelectingLockedCell(Boolean allowSelectingLockedCell) {
        this.allowSelectingLockedCell = allowSelectingLockedCell;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowSelectingLockedCell() {
        return allowSelectingLockedCell;
    }

    public void setAllowSelectingLockedCell(Boolean allowSelectingLockedCell) {
        this.allowSelectingLockedCell = allowSelectingLockedCell;
    }

    @SerializedName("AllowSelectingUnlockedCell")
    @JsonProperty("AllowSelectingUnlockedCell")
    private Boolean allowSelectingUnlockedCell;

    public Protection allowSelectingUnlockedCell(Boolean allowSelectingUnlockedCell) {
        this.allowSelectingUnlockedCell = allowSelectingUnlockedCell;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getAllowSelectingUnlockedCell() {
        return allowSelectingUnlockedCell;
    }

    public void setAllowSelectingUnlockedCell(Boolean allowSelectingUnlockedCell) {
        this.allowSelectingUnlockedCell = allowSelectingUnlockedCell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Protection other = (Protection) o;
        return Objects.equals(this.allowDeletingColumn, other.allowDeletingColumn)
            && Objects.equals(this.allowDeletingRow, other.allowDeletingRow)
            && Objects.equals(this.allowFiltering, other.allowFiltering)
            && Objects.equals(this.allowFormattingCell, other.allowFormattingCell)
            && Objects.equals(this.allowFormattingColumn, other.allowFormattingColumn)
            && Objects.equals(this.allowFormattingRow, other.allowFormattingRow)
            && Objects.equals(this.allowInsertingColumn, other.allowInsertingColumn)
            && Objects.equals(this.allowInsertingHyperlink, other.allowInsertingHyperlink)
            && Objects.equals(this.allowInsertingRow, other.allowInsertingRow)
            && Objects.equals(this.allowSorting, other.allowSorting)
            && Objects.equals(this.allowUsingPivotTable, other.allowUsingPivotTable)
            && Objects.equals(this.allowEditingContent, other.allowEditingContent)
            && Objects.equals(this.allowEditingObject, other.allowEditingObject)
            && Objects.equals(this.allowEditingScenario, other.allowEditingScenario)
            && Objects.equals(this.password, other.password)
            && Objects.equals(this.allowSelectingLockedCell, other.allowSelectingLockedCell)
            && Objects.equals(this.allowSelectingUnlockedCell, other.allowSelectingUnlockedCell);
    }

    @Override
    public int hashCode() {
        return Objects.hash(allowDeletingColumn, allowDeletingRow, allowFiltering, allowFormattingCell, allowFormattingColumn, allowFormattingRow, allowInsertingColumn, allowInsertingHyperlink, allowInsertingRow, allowSorting, allowUsingPivotTable, allowEditingContent, allowEditingObject, allowEditingScenario, password, allowSelectingLockedCell, allowSelectingUnlockedCell);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Protection {\n");
        sb.append("    allowDeletingColumn: ").append(allowDeletingColumn).append("\n");
        sb.append("    allowDeletingRow: ").append(allowDeletingRow).append("\n");
        sb.append("    allowFiltering: ").append(allowFiltering).append("\n");
        sb.append("    allowFormattingCell: ").append(allowFormattingCell).append("\n");
        sb.append("    allowFormattingColumn: ").append(allowFormattingColumn).append("\n");
        sb.append("    allowFormattingRow: ").append(allowFormattingRow).append("\n");
        sb.append("    allowInsertingColumn: ").append(allowInsertingColumn).append("\n");
        sb.append("    allowInsertingHyperlink: ").append(allowInsertingHyperlink).append("\n");
        sb.append("    allowInsertingRow: ").append(allowInsertingRow).append("\n");
        sb.append("    allowSorting: ").append(allowSorting).append("\n");
        sb.append("    allowUsingPivotTable: ").append(allowUsingPivotTable).append("\n");
        sb.append("    allowEditingContent: ").append(allowEditingContent).append("\n");
        sb.append("    allowEditingObject: ").append(allowEditingObject).append("\n");
        sb.append("    allowEditingScenario: ").append(allowEditingScenario).append("\n");
        sb.append("    password: ").append(password).append("\n");
        sb.append("    allowSelectingLockedCell: ").append(allowSelectingLockedCell).append("\n");
        sb.append("    allowSelectingUnlockedCell: ").append(allowSelectingUnlockedCell).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
