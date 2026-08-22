package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorksheetDataStatistics — Represents worksheet data statistics. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorksheetDataStatistics {
    /** Represents worksheet name. */
    @JsonProperty("Name")
    private String name;

    /** Represents chart number. */
    @JsonProperty("ChartsCount")
    private Integer chartsCount;

    /** Represents list object number. */
    @JsonProperty("TablesCount")
    private Integer tablesCount;

    /** Represents pivot table number. */
    @JsonProperty("PivotTablesCount")
    private Integer pivotTablesCount;

    /** Represents shape number. */
    @JsonProperty("ShapesCount")
    private Integer shapesCount;

    /** Represents shape number. */
    @JsonProperty("HyperlinksCount")
    private Integer hyperlinksCount;

    /** Represents hyperlink number. */
    @JsonProperty("QueryTablesCount")
    private Integer queryTablesCount;

    /** Represents query table number. */
    @JsonProperty("CellsCount")
    private Integer cellsCount;

    /** Represents cell number. */
    @JsonProperty("CellsCountInTable")
    private Integer cellsCountInTable;

    /** Represents formula number. */
    @JsonProperty("CellsCountIsFormula")
    private Integer cellsCountIsFormula;

    public String getName() { return name; }
    public WorksheetDataStatistics setName(String name) { this.name = name; return this; }

    public Integer getChartsCount() { return chartsCount; }
    public WorksheetDataStatistics setChartsCount(Integer chartsCount) { this.chartsCount = chartsCount; return this; }

    public Integer getTablesCount() { return tablesCount; }
    public WorksheetDataStatistics setTablesCount(Integer tablesCount) { this.tablesCount = tablesCount; return this; }

    public Integer getPivotTablesCount() { return pivotTablesCount; }
    public WorksheetDataStatistics setPivotTablesCount(Integer pivotTablesCount) { this.pivotTablesCount = pivotTablesCount; return this; }

    public Integer getShapesCount() { return shapesCount; }
    public WorksheetDataStatistics setShapesCount(Integer shapesCount) { this.shapesCount = shapesCount; return this; }

    public Integer getHyperlinksCount() { return hyperlinksCount; }
    public WorksheetDataStatistics setHyperlinksCount(Integer hyperlinksCount) { this.hyperlinksCount = hyperlinksCount; return this; }

    public Integer getQueryTablesCount() { return queryTablesCount; }
    public WorksheetDataStatistics setQueryTablesCount(Integer queryTablesCount) { this.queryTablesCount = queryTablesCount; return this; }

    public Integer getCellsCount() { return cellsCount; }
    public WorksheetDataStatistics setCellsCount(Integer cellsCount) { this.cellsCount = cellsCount; return this; }

    public Integer getCellsCountInTable() { return cellsCountInTable; }
    public WorksheetDataStatistics setCellsCountInTable(Integer cellsCountInTable) { this.cellsCountInTable = cellsCountInTable; return this; }

    public Integer getCellsCountIsFormula() { return cellsCountIsFormula; }
    public WorksheetDataStatistics setCellsCountIsFormula(Integer cellsCountIsFormula) { this.cellsCountIsFormula = cellsCountIsFormula; return this; }

}
