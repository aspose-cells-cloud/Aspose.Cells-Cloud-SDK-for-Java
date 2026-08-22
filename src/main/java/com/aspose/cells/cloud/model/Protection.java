package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Protection — Represents the various types of protection options available for a worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Protection {
    /** Represents if the deletion of columns is allowed on a protected worksheet. */
    @JsonProperty("AllowDeletingColumn")
    private Boolean allowDeletingColumn;

    /** Represents if the deletion of rows is allowed on a protected worksheet. */
    @JsonProperty("AllowDeletingRow")
    private Boolean allowDeletingRow;

    /** Represents if the user is allowed to make use of an AutoFilter that was created before the sheet was protected. */
    @JsonProperty("AllowFiltering")
    private Boolean allowFiltering;

    /** Represents if the formatting of cells is allowed on a protected worksheet. */
    @JsonProperty("AllowFormattingCell")
    private Boolean allowFormattingCell;

    /** Represents if the formatting of columns is allowed on a protected worksheet */
    @JsonProperty("AllowFormattingColumn")
    private Boolean allowFormattingColumn;

    /** Represents if the formatting of rows is allowed on a protected worksheet */
    @JsonProperty("AllowFormattingRow")
    private Boolean allowFormattingRow;

    /** Represents if the insertion of columns is allowed on a protected worksheet */
    @JsonProperty("AllowInsertingColumn")
    private Boolean allowInsertingColumn;

    /** Represents if the insertion of hyperlinks is allowed on a protected worksheet */
    @JsonProperty("AllowInsertingHyperlink")
    private Boolean allowInsertingHyperlink;

    /** Represents if the insertion of rows is allowed on a protected worksheet */
    @JsonProperty("AllowInsertingRow")
    private Boolean allowInsertingRow;

    /** Represents if the sorting option is allowed on a protected worksheet. */
    @JsonProperty("AllowSorting")
    private Boolean allowSorting;

    /** Represents if the user is allowed to manipulate pivot tables on a protected worksheet. */
    @JsonProperty("AllowUsingPivotTable")
    private Boolean allowUsingPivotTable;

    /** Represents if the user is allowed to edit contents of locked cells on a protected worksheet. */
    @JsonProperty("AllowEditingContent")
    private Boolean allowEditingContent;

    /** Represents if the user is allowed to manipulate drawing objects on a protected worksheet. */
    @JsonProperty("AllowEditingObject")
    private Boolean allowEditingObject;

    /** Represents if the user is allowed to edit scenarios on a protected worksheet. */
    @JsonProperty("AllowEditingScenario")
    private Boolean allowEditingScenario;

    /** Represents the password to protect the worksheet. */
    @JsonProperty("Password")
    private String password;

    /** Represents if the user is allowed to select locked cells on a protected worksheet. */
    @JsonProperty("AllowSelectingLockedCell")
    private Boolean allowSelectingLockedCell;

    /** Represents if the user is allowed to select unlocked cells on a protected worksheet. */
    @JsonProperty("AllowSelectingUnlockedCell")
    private Boolean allowSelectingUnlockedCell;

    public Boolean getAllowDeletingColumn() { return allowDeletingColumn; }
    public Protection setAllowDeletingColumn(Boolean allowDeletingColumn) { this.allowDeletingColumn = allowDeletingColumn; return this; }

    public Boolean getAllowDeletingRow() { return allowDeletingRow; }
    public Protection setAllowDeletingRow(Boolean allowDeletingRow) { this.allowDeletingRow = allowDeletingRow; return this; }

    public Boolean getAllowFiltering() { return allowFiltering; }
    public Protection setAllowFiltering(Boolean allowFiltering) { this.allowFiltering = allowFiltering; return this; }

    public Boolean getAllowFormattingCell() { return allowFormattingCell; }
    public Protection setAllowFormattingCell(Boolean allowFormattingCell) { this.allowFormattingCell = allowFormattingCell; return this; }

    public Boolean getAllowFormattingColumn() { return allowFormattingColumn; }
    public Protection setAllowFormattingColumn(Boolean allowFormattingColumn) { this.allowFormattingColumn = allowFormattingColumn; return this; }

    public Boolean getAllowFormattingRow() { return allowFormattingRow; }
    public Protection setAllowFormattingRow(Boolean allowFormattingRow) { this.allowFormattingRow = allowFormattingRow; return this; }

    public Boolean getAllowInsertingColumn() { return allowInsertingColumn; }
    public Protection setAllowInsertingColumn(Boolean allowInsertingColumn) { this.allowInsertingColumn = allowInsertingColumn; return this; }

    public Boolean getAllowInsertingHyperlink() { return allowInsertingHyperlink; }
    public Protection setAllowInsertingHyperlink(Boolean allowInsertingHyperlink) { this.allowInsertingHyperlink = allowInsertingHyperlink; return this; }

    public Boolean getAllowInsertingRow() { return allowInsertingRow; }
    public Protection setAllowInsertingRow(Boolean allowInsertingRow) { this.allowInsertingRow = allowInsertingRow; return this; }

    public Boolean getAllowSorting() { return allowSorting; }
    public Protection setAllowSorting(Boolean allowSorting) { this.allowSorting = allowSorting; return this; }

    public Boolean getAllowUsingPivotTable() { return allowUsingPivotTable; }
    public Protection setAllowUsingPivotTable(Boolean allowUsingPivotTable) { this.allowUsingPivotTable = allowUsingPivotTable; return this; }

    public Boolean getAllowEditingContent() { return allowEditingContent; }
    public Protection setAllowEditingContent(Boolean allowEditingContent) { this.allowEditingContent = allowEditingContent; return this; }

    public Boolean getAllowEditingObject() { return allowEditingObject; }
    public Protection setAllowEditingObject(Boolean allowEditingObject) { this.allowEditingObject = allowEditingObject; return this; }

    public Boolean getAllowEditingScenario() { return allowEditingScenario; }
    public Protection setAllowEditingScenario(Boolean allowEditingScenario) { this.allowEditingScenario = allowEditingScenario; return this; }

    public String getPassword() { return password; }
    public Protection setPassword(String password) { this.password = password; return this; }

    public Boolean getAllowSelectingLockedCell() { return allowSelectingLockedCell; }
    public Protection setAllowSelectingLockedCell(Boolean allowSelectingLockedCell) { this.allowSelectingLockedCell = allowSelectingLockedCell; return this; }

    public Boolean getAllowSelectingUnlockedCell() { return allowSelectingUnlockedCell; }
    public Protection setAllowSelectingUnlockedCell(Boolean allowSelectingUnlockedCell) { this.allowSelectingUnlockedCell = allowSelectingUnlockedCell; return this; }

}
