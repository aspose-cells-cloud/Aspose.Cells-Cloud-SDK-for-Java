package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Range model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Range {
    /** Gets or sets ColumnCount. */
    @JsonProperty("ColumnCount")
    private Integer columnCount;

    /** Gets or sets ColumnWidth. */
    @JsonProperty("ColumnWidth")
    private Double columnWidth;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets FirstRow. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets Name. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets RefersTo. */
    @JsonProperty("RefersTo")
    private String refersTo;

    /** Gets or sets RowCount. */
    @JsonProperty("RowCount")
    private Integer rowCount;

    /** Gets or sets RowHeight. */
    @JsonProperty("RowHeight")
    private Double rowHeight;

    /** Gets or sets Worksheet. */
    @JsonProperty("Worksheet")
    private String worksheet;

    public Integer getColumnCount() { return columnCount; }
    public Range setColumnCount(Integer columnCount) { this.columnCount = columnCount; return this; }

    public Double getColumnWidth() { return columnWidth; }
    public Range setColumnWidth(Double columnWidth) { this.columnWidth = columnWidth; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public Range setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public Integer getFirstRow() { return firstRow; }
    public Range setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public String getName() { return name; }
    public Range setName(String name) { this.name = name; return this; }

    public String getRefersTo() { return refersTo; }
    public Range setRefersTo(String refersTo) { this.refersTo = refersTo; return this; }

    public Integer getRowCount() { return rowCount; }
    public Range setRowCount(Integer rowCount) { this.rowCount = rowCount; return this; }

    public Double getRowHeight() { return rowHeight; }
    public Range setRowHeight(Double rowHeight) { this.rowHeight = rowHeight; return this; }

    public String getWorksheet() { return worksheet; }
    public Range setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

}
