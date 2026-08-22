package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellArea model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellArea {
    /** Gets or sets EndColumn. */
    @JsonProperty("EndColumn")
    private Integer endColumn;

    /** Gets or sets EndRow. */
    @JsonProperty("EndRow")
    private Integer endRow;

    /** Gets or sets StartColumn. */
    @JsonProperty("StartColumn")
    private Integer startColumn;

    /** Gets or sets StartRow. */
    @JsonProperty("StartRow")
    private Integer startRow;

    public Integer getEndColumn() { return endColumn; }
    public CellArea setEndColumn(Integer endColumn) { this.endColumn = endColumn; return this; }

    public Integer getEndRow() { return endRow; }
    public CellArea setEndRow(Integer endRow) { this.endRow = endRow; return this; }

    public Integer getStartColumn() { return startColumn; }
    public CellArea setStartColumn(Integer startColumn) { this.startColumn = startColumn; return this; }

    public Integer getStartRow() { return startRow; }
    public CellArea setStartRow(Integer startRow) { this.startRow = startRow; return this; }

}
