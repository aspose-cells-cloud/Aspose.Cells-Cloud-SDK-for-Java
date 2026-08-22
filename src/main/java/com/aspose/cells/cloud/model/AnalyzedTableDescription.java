package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AnalyzedTableDescription — Represents analyzed table description. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyzedTableDescription {
    /** Represents table name. */
    @JsonProperty("Name")
    private String name;

    /** Represents worksheet name which is where the table is located. */
    @JsonProperty("SheetName")
    private String sheetName;

    /** Represents analyzed description about table columns. */
    @JsonProperty("Columns")
    private List<AnalyzedColumnDescription> columns;

    /** Represents date columns list. */
    @JsonProperty("DateColumns")
    private List<Integer> dateColumns;

    /** Represents number columns list. */
    @JsonProperty("NumberColumns")
    private List<Integer> numberColumns;

    /** Represents string columns list. */
    @JsonProperty("TextColumns")
    private List<Integer> textColumns;

    /** Represents exception columns list. */
    @JsonProperty("ExceptionColumns")
    private List<Integer> exceptionColumns;

    /** Represents there is a table header in the table. */
    @JsonProperty("HasTableHeaderRow")
    private Boolean hasTableHeaderRow;

    /** Represents there is a total row in the table. */
    @JsonProperty("HasTableTotalRow")
    private Boolean hasTableTotalRow;

    /** Represents the column index as the start data column. */
    @JsonProperty("StartDataColumnIndex")
    private Integer startDataColumnIndex;

    /** Represents the column index as the end data column. */
    @JsonProperty("EndDataColumnIndex")
    private Integer endDataColumnIndex;

    /** Represents the row index as the start data row. */
    @JsonProperty("StartDataRowIndex")
    private Integer startDataRowIndex;

    /** Represents the row index as the end data row. */
    @JsonProperty("EndDataRowIndex")
    private Integer endDataRowIndex;

    /** Represents table thumbnail. Base64String */
    @JsonProperty("Thumbnail")
    private String thumbnail;

    /** Represents a collection of charts, which is a collection of charts created based on data analysis of a table. */
    @JsonProperty("DiscoverCharts")
    private List<DiscoverChart> discoverCharts;

    /** Represents a collection of pivot tables, which is a collection of pivot tables created based on data analysis of a table. */
    @JsonProperty("DiscoverPivotTables")
    private List<DiscoverPivotTable> discoverPivotTables;

    public String getName() { return name; }
    public AnalyzedTableDescription setName(String name) { this.name = name; return this; }

    public String getSheetName() { return sheetName; }
    public AnalyzedTableDescription setSheetName(String sheetName) { this.sheetName = sheetName; return this; }

    public List<AnalyzedColumnDescription> getColumns() { return columns; }
    public AnalyzedTableDescription setColumns(List<AnalyzedColumnDescription> columns) { this.columns = columns; return this; }

    public List<Integer> getDateColumns() { return dateColumns; }
    public AnalyzedTableDescription setDateColumns(List<Integer> dateColumns) { this.dateColumns = dateColumns; return this; }

    public List<Integer> getNumberColumns() { return numberColumns; }
    public AnalyzedTableDescription setNumberColumns(List<Integer> numberColumns) { this.numberColumns = numberColumns; return this; }

    public List<Integer> getTextColumns() { return textColumns; }
    public AnalyzedTableDescription setTextColumns(List<Integer> textColumns) { this.textColumns = textColumns; return this; }

    public List<Integer> getExceptionColumns() { return exceptionColumns; }
    public AnalyzedTableDescription setExceptionColumns(List<Integer> exceptionColumns) { this.exceptionColumns = exceptionColumns; return this; }

    public Boolean getHasTableHeaderRow() { return hasTableHeaderRow; }
    public AnalyzedTableDescription setHasTableHeaderRow(Boolean hasTableHeaderRow) { this.hasTableHeaderRow = hasTableHeaderRow; return this; }

    public Boolean getHasTableTotalRow() { return hasTableTotalRow; }
    public AnalyzedTableDescription setHasTableTotalRow(Boolean hasTableTotalRow) { this.hasTableTotalRow = hasTableTotalRow; return this; }

    public Integer getStartDataColumnIndex() { return startDataColumnIndex; }
    public AnalyzedTableDescription setStartDataColumnIndex(Integer startDataColumnIndex) { this.startDataColumnIndex = startDataColumnIndex; return this; }

    public Integer getEndDataColumnIndex() { return endDataColumnIndex; }
    public AnalyzedTableDescription setEndDataColumnIndex(Integer endDataColumnIndex) { this.endDataColumnIndex = endDataColumnIndex; return this; }

    public Integer getStartDataRowIndex() { return startDataRowIndex; }
    public AnalyzedTableDescription setStartDataRowIndex(Integer startDataRowIndex) { this.startDataRowIndex = startDataRowIndex; return this; }

    public Integer getEndDataRowIndex() { return endDataRowIndex; }
    public AnalyzedTableDescription setEndDataRowIndex(Integer endDataRowIndex) { this.endDataRowIndex = endDataRowIndex; return this; }

    public String getThumbnail() { return thumbnail; }
    public AnalyzedTableDescription setThumbnail(String thumbnail) { this.thumbnail = thumbnail; return this; }

    public List<DiscoverChart> getDiscoverCharts() { return discoverCharts; }
    public AnalyzedTableDescription setDiscoverCharts(List<DiscoverChart> discoverCharts) { this.discoverCharts = discoverCharts; return this; }

    public List<DiscoverPivotTable> getDiscoverPivotTables() { return discoverPivotTables; }
    public AnalyzedTableDescription setDiscoverPivotTables(List<DiscoverPivotTable> discoverPivotTables) { this.discoverPivotTables = discoverPivotTables; return this; }

}
