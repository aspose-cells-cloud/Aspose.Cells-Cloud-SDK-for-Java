package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Import2DimensionDoubleArrayOption — I can help summarize features, please provide the details you'd like me to summarize. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Import2DimensionDoubleArrayOption extends ImportOption {
    /** The class has a property named "FirstRow" of type integer with get and set accessors. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets Data. */
    @JsonProperty("Data")
    private List<Double> data;

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
    public Import2DimensionDoubleArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public Import2DimensionDoubleArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public List<Double> getData() { return data; }
    public Import2DimensionDoubleArrayOption setData(List<Double> data) { this.data = data; return this; }

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public Import2DimensionDoubleArrayOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public Import2DimensionDoubleArrayOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public Import2DimensionDoubleArrayOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public Import2DimensionDoubleArrayOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public Import2DimensionDoubleArrayOption setSource(FileSource source) { this.source = source; return this; }

}
