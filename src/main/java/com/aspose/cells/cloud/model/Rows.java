package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Rows — Collects the  objects that represent the individual rows in a worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Rows extends LinkElement {
    /** This property allows access to set and retrieve the maximum row value in the class. */
    @JsonProperty("MaxRow")
    private Integer maxRow;

    /** Gets or sets RowsCount. */
    @JsonProperty("RowsCount")
    private Integer rowsCount;

    /** Gets or sets RowsList. */
    @JsonProperty("RowsList")
    private List<LinkElement> rowsList;

    public Integer getMaxRow() { return maxRow; }
    public Rows setMaxRow(Integer maxRow) { this.maxRow = maxRow; return this; }

    public Integer getRowsCount() { return rowsCount; }
    public Rows setRowsCount(Integer rowsCount) { this.rowsCount = rowsCount; return this; }

    public List<LinkElement> getRowsList() { return rowsList; }
    public Rows setRowsList(List<LinkElement> rowsList) { this.rowsList = rowsList; return this; }


    /** Covariant override: keeps fluent chains returning Rows. */
    @Override public Rows setLink(Link link) { return (Rows) super.setLink(link); }

}
