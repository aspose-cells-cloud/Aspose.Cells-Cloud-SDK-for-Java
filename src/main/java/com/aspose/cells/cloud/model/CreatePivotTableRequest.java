package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CreatePivotTableRequest — Indicates create pivot table request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreatePivotTableRequest {
    /** Pivot table name */
    @JsonProperty("Name")
    private String name;

    /** The data for the new PivotTable cache. */
    @JsonProperty("SourceData")
    private String sourceData;

    /** The cell in the upper-left corner of the PivotTable report's destination range. */
    @JsonProperty("DestCellName")
    private String destCellName;

    /** Indicates whether using same data source when another existing pivot table has used this data source.If the property is true, it will save memory. */
    @JsonProperty("UseSameSource")
    private Boolean useSameSource;

    /** Represents row fields in a PivotTable report. */
    @JsonProperty("PivotFieldRows")
    private List<Integer> pivotFieldRows;

    /** Represents column fields in a PivotTable report. */
    @JsonProperty("PivotFieldColumns")
    private List<Integer> pivotFieldColumns;

    /** Represents data fields in a PivotTable report. */
    @JsonProperty("PivotFieldData")
    private List<Integer> pivotFieldData;

    public String getName() { return name; }
    public CreatePivotTableRequest setName(String name) { this.name = name; return this; }

    public String getSourceData() { return sourceData; }
    public CreatePivotTableRequest setSourceData(String sourceData) { this.sourceData = sourceData; return this; }

    public String getDestCellName() { return destCellName; }
    public CreatePivotTableRequest setDestCellName(String destCellName) { this.destCellName = destCellName; return this; }

    public Boolean getUseSameSource() { return useSameSource; }
    public CreatePivotTableRequest setUseSameSource(Boolean useSameSource) { this.useSameSource = useSameSource; return this; }

    public List<Integer> getPivotFieldRows() { return pivotFieldRows; }
    public CreatePivotTableRequest setPivotFieldRows(List<Integer> pivotFieldRows) { this.pivotFieldRows = pivotFieldRows; return this; }

    public List<Integer> getPivotFieldColumns() { return pivotFieldColumns; }
    public CreatePivotTableRequest setPivotFieldColumns(List<Integer> pivotFieldColumns) { this.pivotFieldColumns = pivotFieldColumns; return this; }

    public List<Integer> getPivotFieldData() { return pivotFieldData; }
    public CreatePivotTableRequest setPivotFieldData(List<Integer> pivotFieldData) { this.pivotFieldData = pivotFieldData; return this; }

}
