package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ProtectSheetParameter — Class Summary: The features discussed include natural language processing, image recognition, data visualization, clustering, regression, classification, and recommendation systems. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProtectSheetParameter {
    /** Property Summary: Defines a public string property for the ProtectionType. */
    @JsonProperty("ProtectionType")
    private String protectionType;

    /** Gets or sets Password. */
    @JsonProperty("Password")
    private String password;

    /** Gets or sets AllowEditArea. */
    @JsonProperty("AllowEditArea")
    private List<String> allowEditArea;

    /** Gets or sets AllowDeletingColumn. */
    @JsonProperty("AllowDeletingColumn")
    private String allowDeletingColumn;

    /** Gets or sets AllowDeletingRow. */
    @JsonProperty("AllowDeletingRow")
    private String allowDeletingRow;

    /** Gets or sets AllowFiltering. */
    @JsonProperty("AllowFiltering")
    private String allowFiltering;

    /** Gets or sets AllowFormattingCell. */
    @JsonProperty("AllowFormattingCell")
    private String allowFormattingCell;

    /** Gets or sets AllowFormattingColumn. */
    @JsonProperty("AllowFormattingColumn")
    private String allowFormattingColumn;

    /** Gets or sets AllowFormattingRow. */
    @JsonProperty("AllowFormattingRow")
    private String allowFormattingRow;

    /** Gets or sets AllowInsertingColumn. */
    @JsonProperty("AllowInsertingColumn")
    private String allowInsertingColumn;

    /** Gets or sets AllowInsertingHyperlink. */
    @JsonProperty("AllowInsertingHyperlink")
    private String allowInsertingHyperlink;

    /** Gets or sets AllowInsertingRow. */
    @JsonProperty("AllowInsertingRow")
    private String allowInsertingRow;

    /** Gets or sets AllowSelectingLockedCell. */
    @JsonProperty("AllowSelectingLockedCell")
    private String allowSelectingLockedCell;

    /** Gets or sets AllowSelectingUnlockedCell. */
    @JsonProperty("AllowSelectingUnlockedCell")
    private String allowSelectingUnlockedCell;

    /** Gets or sets AllowSorting. */
    @JsonProperty("AllowSorting")
    private String allowSorting;

    /** Gets or sets AllowUsingPivotTable. */
    @JsonProperty("AllowUsingPivotTable")
    private String allowUsingPivotTable;

    public String getProtectionType() { return protectionType; }
    public ProtectSheetParameter setProtectionType(String protectionType) { this.protectionType = protectionType; return this; }

    public String getPassword() { return password; }
    public ProtectSheetParameter setPassword(String password) { this.password = password; return this; }

    public List<String> getAllowEditArea() { return allowEditArea; }
    public ProtectSheetParameter setAllowEditArea(List<String> allowEditArea) { this.allowEditArea = allowEditArea; return this; }

    public String getAllowDeletingColumn() { return allowDeletingColumn; }
    public ProtectSheetParameter setAllowDeletingColumn(String allowDeletingColumn) { this.allowDeletingColumn = allowDeletingColumn; return this; }

    public String getAllowDeletingRow() { return allowDeletingRow; }
    public ProtectSheetParameter setAllowDeletingRow(String allowDeletingRow) { this.allowDeletingRow = allowDeletingRow; return this; }

    public String getAllowFiltering() { return allowFiltering; }
    public ProtectSheetParameter setAllowFiltering(String allowFiltering) { this.allowFiltering = allowFiltering; return this; }

    public String getAllowFormattingCell() { return allowFormattingCell; }
    public ProtectSheetParameter setAllowFormattingCell(String allowFormattingCell) { this.allowFormattingCell = allowFormattingCell; return this; }

    public String getAllowFormattingColumn() { return allowFormattingColumn; }
    public ProtectSheetParameter setAllowFormattingColumn(String allowFormattingColumn) { this.allowFormattingColumn = allowFormattingColumn; return this; }

    public String getAllowFormattingRow() { return allowFormattingRow; }
    public ProtectSheetParameter setAllowFormattingRow(String allowFormattingRow) { this.allowFormattingRow = allowFormattingRow; return this; }

    public String getAllowInsertingColumn() { return allowInsertingColumn; }
    public ProtectSheetParameter setAllowInsertingColumn(String allowInsertingColumn) { this.allowInsertingColumn = allowInsertingColumn; return this; }

    public String getAllowInsertingHyperlink() { return allowInsertingHyperlink; }
    public ProtectSheetParameter setAllowInsertingHyperlink(String allowInsertingHyperlink) { this.allowInsertingHyperlink = allowInsertingHyperlink; return this; }

    public String getAllowInsertingRow() { return allowInsertingRow; }
    public ProtectSheetParameter setAllowInsertingRow(String allowInsertingRow) { this.allowInsertingRow = allowInsertingRow; return this; }

    public String getAllowSelectingLockedCell() { return allowSelectingLockedCell; }
    public ProtectSheetParameter setAllowSelectingLockedCell(String allowSelectingLockedCell) { this.allowSelectingLockedCell = allowSelectingLockedCell; return this; }

    public String getAllowSelectingUnlockedCell() { return allowSelectingUnlockedCell; }
    public ProtectSheetParameter setAllowSelectingUnlockedCell(String allowSelectingUnlockedCell) { this.allowSelectingUnlockedCell = allowSelectingUnlockedCell; return this; }

    public String getAllowSorting() { return allowSorting; }
    public ProtectSheetParameter setAllowSorting(String allowSorting) { this.allowSorting = allowSorting; return this; }

    public String getAllowUsingPivotTable() { return allowUsingPivotTable; }
    public ProtectSheetParameter setAllowUsingPivotTable(String allowUsingPivotTable) { this.allowUsingPivotTable = allowUsingPivotTable; return this; }

}
