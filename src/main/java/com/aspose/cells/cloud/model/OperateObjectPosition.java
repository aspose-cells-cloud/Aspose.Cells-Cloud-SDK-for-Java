package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OperateObjectPosition — Represents operate object position. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperateObjectPosition {
    /** Represents data source of operate object. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents data source of operate object. */
    @JsonProperty("Workbook")
    private FileSource workbook;

    /** Represents worksheet name of operate object. */
    @JsonProperty("SheetName")
    private String sheetName;

    /** Represents chart index of operate object. */
    @JsonProperty("ChartIndex")
    private Integer chartIndex;

    /** Represents shape index of operate object. */
    @JsonProperty("ShapeIndex")
    private Integer shapeIndex;

    /** Represents cell name of operate object. */
    @JsonProperty("CellName")
    private String cellName;

    /** Represents list object index of operate object. */
    @JsonProperty("ListObjectIndex")
    private Integer listObjectIndex;

    public DataSource getDataSource() { return dataSource; }
    public OperateObjectPosition setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getWorkbook() { return workbook; }
    public OperateObjectPosition setWorkbook(FileSource workbook) { this.workbook = workbook; return this; }

    public String getSheetName() { return sheetName; }
    public OperateObjectPosition setSheetName(String sheetName) { this.sheetName = sheetName; return this; }

    public Integer getChartIndex() { return chartIndex; }
    public OperateObjectPosition setChartIndex(Integer chartIndex) { this.chartIndex = chartIndex; return this; }

    public Integer getShapeIndex() { return shapeIndex; }
    public OperateObjectPosition setShapeIndex(Integer shapeIndex) { this.shapeIndex = shapeIndex; return this; }

    public String getCellName() { return cellName; }
    public OperateObjectPosition setCellName(String cellName) { this.cellName = cellName; return this; }

    public Integer getListObjectIndex() { return listObjectIndex; }
    public OperateObjectPosition setListObjectIndex(Integer listObjectIndex) { this.listObjectIndex = listObjectIndex; return this; }

}
