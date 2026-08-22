package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ImportDoubleArrayOption — Class summary: The features include grammar and spell check, word count, readability analysis, and style suggestions for improving writing. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportDoubleArrayOption extends ImportOption {
    /** This class has a public property named FirstRow of type integer with both get and set accessors. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets IsVertical. */
    @JsonProperty("IsVertical")
    private Boolean isVertical;

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
    public ImportDoubleArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public ImportDoubleArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public Boolean getIsVertical() { return isVertical; }
    public ImportDoubleArrayOption setIsVertical(Boolean isVertical) { this.isVertical = isVertical; return this; }

    public List<Double> getData() { return data; }
    public ImportDoubleArrayOption setData(List<Double> data) { this.data = data; return this; }

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public ImportDoubleArrayOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public ImportDoubleArrayOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public ImportDoubleArrayOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ImportDoubleArrayOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public ImportDoubleArrayOption setSource(FileSource source) { this.source = source; return this; }

}
