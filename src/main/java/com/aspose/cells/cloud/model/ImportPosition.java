package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ImportPosition — I can help with that. Just provide me with the features you'd like me to summarize. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportPosition {
    /** "Property SheetName of type string with a public get and set accessor." */
    @JsonProperty("SheetName")
    private String sheetName;

    /** Gets or sets RowIndex. */
    @JsonProperty("RowIndex")
    private Integer rowIndex;

    /** Gets or sets ColumnIndex. */
    @JsonProperty("ColumnIndex")
    private Integer columnIndex;

    public String getSheetName() { return sheetName; }
    public ImportPosition setSheetName(String sheetName) { this.sheetName = sheetName; return this; }

    public Integer getRowIndex() { return rowIndex; }
    public ImportPosition setRowIndex(Integer rowIndex) { this.rowIndex = rowIndex; return this; }

    public Integer getColumnIndex() { return columnIndex; }
    public ImportPosition setColumnIndex(Integer columnIndex) { this.columnIndex = columnIndex; return this; }

}
