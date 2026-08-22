package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Sparkline — A sparkline represents a tiny chart or graphic in a worksheet cell that provides a visual representation of data. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Sparkline {
    /** Gets the column index of the sparkline. */
    @JsonProperty("Column")
    private Integer column;

    /** Represents the data range of the sparkline. */
    @JsonProperty("DataRange")
    private String dataRange;

    /** Gets the row index of the sparkline. */
    @JsonProperty("Row")
    private Integer row;

    public Integer getColumn() { return column; }
    public Sparkline setColumn(Integer column) { this.column = column; return this; }

    public String getDataRange() { return dataRange; }
    public Sparkline setDataRange(String dataRange) { this.dataRange = dataRange; return this; }

    public Integer getRow() { return row; }
    public Sparkline setRow(Integer row) { this.row = row; return this; }

}
