package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Columns — Columns */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Columns extends LinkElement {
    /** The max column index. */
    @JsonProperty("MaxColumn")
    private Integer maxColumn;

    /** Column count. */
    @JsonProperty("ColumnsCount")
    private Integer columnsCount;

    /** Columns list. */
    @JsonProperty("ColumnsList")
    private List<LinkElement> columnsList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getMaxColumn() { return maxColumn; }
    public Columns setMaxColumn(Integer maxColumn) { this.maxColumn = maxColumn; return this; }

    public Integer getColumnsCount() { return columnsCount; }
    public Columns setColumnsCount(Integer columnsCount) { this.columnsCount = columnsCount; return this; }

    public List<LinkElement> getColumnsList() { return columnsList; }
    public Columns setColumnsList(List<LinkElement> columnsList) { this.columnsList = columnsList; return this; }

    public Link getLink() { return link; }
    public Columns setLink(Link link) { this.link = link; return this; }

}
