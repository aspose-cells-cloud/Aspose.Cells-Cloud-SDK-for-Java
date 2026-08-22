package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Import2DimensionIntArrayOption — I'm here to help! Please provide the features you'd like me to summarize. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Import2DimensionIntArrayOption extends ImportOption {
    /** This property allows getting and setting the value of the first row in a class. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets Data. */
    @JsonProperty("Data")
    private List<Integer> data;

    /** Gets or sets DestinationWorksheet. */
    @JsonProperty("DestinationWorksheet")
    private String destinationWorksheet;

    /** Gets or sets IsInsert. */
    @JsonProperty("IsInsert")
    private Boolean isInsert;

    /** Gets or sets ImportDataType. */
    @JsonProperty("ImportDataType")
    private String importDataType;

    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Gets or sets Source. */
    @JsonProperty("Source")
    private FileSource source;

    public Integer getFirstRow() { return firstRow; }
    public Import2DimensionIntArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public Import2DimensionIntArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public List<Integer> getData() { return data; }
    public Import2DimensionIntArrayOption setData(List<Integer> data) { this.data = data; return this; }

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public Import2DimensionIntArrayOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public Import2DimensionIntArrayOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public Import2DimensionIntArrayOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public Import2DimensionIntArrayOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public Import2DimensionIntArrayOption setSource(FileSource source) { this.source = source; return this; }

}
