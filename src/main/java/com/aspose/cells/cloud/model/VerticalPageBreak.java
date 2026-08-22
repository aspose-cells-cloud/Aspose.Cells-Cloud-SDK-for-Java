package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** VerticalPageBreak — Encapsulates the object that represents a vertical page break. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class VerticalPageBreak {
    /** Gets the column index of the vertical page break. */
    @JsonProperty("Column")
    private Integer column;

    /** Gets the end row index of the vertical page break. */
    @JsonProperty("EndRow")
    private Integer endRow;

    /** Gets the start row index of the vertical page break. */
    @JsonProperty("StartRow")
    private Integer startRow;

    public Integer getColumn() { return column; }
    public VerticalPageBreak setColumn(Integer column) { this.column = column; return this; }

    public Integer getEndRow() { return endRow; }
    public VerticalPageBreak setEndRow(Integer endRow) { this.endRow = endRow; return this; }

    public Integer getStartRow() { return startRow; }
    public VerticalPageBreak setStartRow(Integer startRow) { this.startRow = startRow; return this; }

}
