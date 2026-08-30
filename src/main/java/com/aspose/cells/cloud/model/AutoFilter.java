package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AutoFilter — Represents autofiltering for the specified worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoFilter extends LinkElement {
    /** Gets the collection of the filter columns. */
    @JsonProperty("FilterColumns")
    private List<FilterColumn> filterColumns;

    /** Represents the range to which the specified AutoFilter applies. */
    @JsonProperty("Range")
    private String range;

    /** Gets the data sorter. */
    @JsonProperty("Sorter")
    private DataSorter sorter;

    /** Indicates whether the AutoFilter button for this column is visible. */
    @JsonProperty("ShowFilterButton")
    private Boolean showFilterButton;

    public List<FilterColumn> getFilterColumns() { return filterColumns; }
    public AutoFilter setFilterColumns(List<FilterColumn> filterColumns) { this.filterColumns = filterColumns; return this; }

    public String getRange() { return range; }
    public AutoFilter setRange(String range) { this.range = range; return this; }

    public DataSorter getSorter() { return sorter; }
    public AutoFilter setSorter(DataSorter sorter) { this.sorter = sorter; return this; }

    public Boolean getShowFilterButton() { return showFilterButton; }
    public AutoFilter setShowFilterButton(Boolean showFilterButton) { this.showFilterButton = showFilterButton; return this; }


    /** Covariant override: keeps fluent chains returning AutoFilter. */
    @Override public AutoFilter setLink(Link link) { return (AutoFilter) super.setLink(link); }

}
