package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DiscoverPivotTable — Represents a pivot table, which is a pivot table created based on data analysis of a table. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscoverPivotTable {
    /** Represents pivot table name. */
    @JsonProperty("Name")
    private String name;

    /** Represents pivot table title. */
    @JsonProperty("Title")
    private String title;

    /** Represents pivot table data range. */
    @JsonProperty("DataRange")
    private String dataRange;

    /** Represents row fields in a PivotTable report. */
    @JsonProperty("PivotFieldRows")
    private List<Integer> pivotFieldRows;

    /** Represents column fields in a PivotTable report. */
    @JsonProperty("PivotFieldColumns")
    private List<Integer> pivotFieldColumns;

    /** Represents data fields in a PivotTable report. */
    @JsonProperty("PivotFieldData")
    private List<Integer> pivotFieldData;

    /** Represents pivot table thumbnail. Base64String */
    @JsonProperty("Thumbnail")
    private String thumbnail;

    public String getName() { return name; }
    public DiscoverPivotTable setName(String name) { this.name = name; return this; }

    public String getTitle() { return title; }
    public DiscoverPivotTable setTitle(String title) { this.title = title; return this; }

    public String getDataRange() { return dataRange; }
    public DiscoverPivotTable setDataRange(String dataRange) { this.dataRange = dataRange; return this; }

    public List<Integer> getPivotFieldRows() { return pivotFieldRows; }
    public DiscoverPivotTable setPivotFieldRows(List<Integer> pivotFieldRows) { this.pivotFieldRows = pivotFieldRows; return this; }

    public List<Integer> getPivotFieldColumns() { return pivotFieldColumns; }
    public DiscoverPivotTable setPivotFieldColumns(List<Integer> pivotFieldColumns) { this.pivotFieldColumns = pivotFieldColumns; return this; }

    public List<Integer> getPivotFieldData() { return pivotFieldData; }
    public DiscoverPivotTable setPivotFieldData(List<Integer> pivotFieldData) { this.pivotFieldData = pivotFieldData; return this; }

    public String getThumbnail() { return thumbnail; }
    public DiscoverPivotTable setThumbnail(String thumbnail) { this.thumbnail = thumbnail; return this; }

}
