package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Import2DimensionStringArrayOption — I'm eager to assist you! Please provide me with the features you would like me to summarize into one sentence for your class summary. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Import2DimensionStringArrayOption extends ImportOption {
    /** This class has a property called FirstRow of type integer with a public getter and setter. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets Data. */
    @JsonProperty("Data")
    private List<String> data;

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
    public Import2DimensionStringArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public Import2DimensionStringArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public List<String> getData() { return data; }
    public Import2DimensionStringArrayOption setData(List<String> data) { this.data = data; return this; }

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public Import2DimensionStringArrayOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public Import2DimensionStringArrayOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public Import2DimensionStringArrayOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public Import2DimensionStringArrayOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public Import2DimensionStringArrayOption setSource(FileSource source) { this.source = source; return this; }

}
