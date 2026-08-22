package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RangeSortRequest — Indicates range sort request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RangeSortRequest {
    /** Summary description for DataSorter. */
    @JsonProperty("DataSorter")
    private DataSorter dataSorter;

    /** Encapsulates the object that represents a range of cells within a spreadsheet. */
    @JsonProperty("CellArea")
    private Range cellArea;

    public DataSorter getDataSorter() { return dataSorter; }
    public RangeSortRequest setDataSorter(DataSorter dataSorter) { this.dataSorter = dataSorter; return this; }

    public Range getCellArea() { return cellArea; }
    public RangeSortRequest setCellArea(Range cellArea) { this.cellArea = cellArea; return this; }

}
