package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellValue — Represents the cell value and corresponding type. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellValue {
    /** A public integer property called "rowIndex" with both getter and setter. */
    @JsonProperty("rowIndex")
    private Integer rowIndex;

    /** Gets or sets columnIndex. */
    @JsonProperty("columnIndex")
    private Integer columnIndex;

    /** Gets or sets type. */
    @JsonProperty("type")
    private String type;

    /** Gets or sets value. */
    @JsonProperty("value")
    private String value;

    /** Gets or sets formula. */
    @JsonProperty("formula")
    private String formula;

    /** Gets or sets style. */
    @JsonProperty("style")
    private Style style;

    public Integer getRowIndex() { return rowIndex; }
    public CellValue setRowIndex(Integer rowIndex) { this.rowIndex = rowIndex; return this; }

    public Integer getColumnIndex() { return columnIndex; }
    public CellValue setColumnIndex(Integer columnIndex) { this.columnIndex = columnIndex; return this; }

    public String getType() { return type; }
    public CellValue setType(String type) { this.type = type; return this; }

    public String getValue() { return value; }
    public CellValue setValue(String value) { this.value = value; return this; }

    public String getFormula() { return formula; }
    public CellValue setFormula(String formula) { this.formula = formula; return this; }

    public Style getStyle() { return style; }
    public CellValue setStyle(Style style) { this.style = style; return this; }

}
