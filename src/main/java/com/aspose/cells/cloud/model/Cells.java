package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Cells — Encapsulates a collection of cell relevant objects, such as Aspose.Cells.Cell, Aspose.Cells.Row, ...etc. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Cells extends LinkElement {
    /** Maximum row index of cell which contains data or style. */
    @JsonProperty("MaxRow")
    private Integer maxRow;

    /** Maximum column index of those cells that have been instantiated in the collection(does not include the column where style is defined for the whole column but no cell has been instantiated in it). */
    @JsonProperty("MaxColumn")
    private Integer maxColumn;

    /** The class has a public property "CellCount" of type integer that can be read and modified. */
    @JsonProperty("CellCount")
    private Integer cellCount;

    /** Gets the collection of  objects that represents the individual rows in this worksheet. */
    @JsonProperty("Rows")
    private LinkElement rows;

    /** Gets the collection of  objects that represents the individual columns in this worksheet. */
    @JsonProperty("Columns")
    private LinkElement columns;

    /** Gets or sets CellList. */
    @JsonProperty("CellList")
    private List<LinkElement> cellList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getMaxRow() { return maxRow; }
    public Cells setMaxRow(Integer maxRow) { this.maxRow = maxRow; return this; }

    public Integer getMaxColumn() { return maxColumn; }
    public Cells setMaxColumn(Integer maxColumn) { this.maxColumn = maxColumn; return this; }

    public Integer getCellCount() { return cellCount; }
    public Cells setCellCount(Integer cellCount) { this.cellCount = cellCount; return this; }

    public LinkElement getRows() { return rows; }
    public Cells setRows(LinkElement rows) { this.rows = rows; return this; }

    public LinkElement getColumns() { return columns; }
    public Cells setColumns(LinkElement columns) { this.columns = columns; return this; }

    public List<LinkElement> getCellList() { return cellList; }
    public Cells setCellList(List<LinkElement> cellList) { this.cellList = cellList; return this; }

    public Link getLink() { return link; }
    public Cells setLink(Link link) { this.link = link; return this; }

}
