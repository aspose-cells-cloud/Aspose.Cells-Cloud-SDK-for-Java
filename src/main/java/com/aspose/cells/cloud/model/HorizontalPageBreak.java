package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HorizontalPageBreak — Encapsulates the object that represents a horizontal page break. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HorizontalPageBreak {
    /** Gets the zero based row index. */
    @JsonProperty("Row")
    private Integer row;

    /** Gets the end column index of this horizontal page break. */
    @JsonProperty("EndColumn")
    private Integer endColumn;

    /** Gets the start column index of this horizontal page break. */
    @JsonProperty("StartColumn")
    private Integer startColumn;

    public Integer getRow() { return row; }
    public HorizontalPageBreak setRow(Integer row) { this.row = row; return this; }

    public Integer getEndColumn() { return endColumn; }
    public HorizontalPageBreak setEndColumn(Integer endColumn) { this.endColumn = endColumn; return this; }

    public Integer getStartColumn() { return startColumn; }
    public HorizontalPageBreak setStartColumn(Integer startColumn) { this.startColumn = startColumn; return this; }

}
