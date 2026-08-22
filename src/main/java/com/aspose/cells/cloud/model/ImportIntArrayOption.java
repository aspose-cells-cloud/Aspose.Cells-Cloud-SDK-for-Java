package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ImportIntArrayOption — I'm here to help! Just provide me with the features you'd like to summarize. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportIntArrayOption extends ImportOption {
    /** This class has a public property named "FirstRow" of type integer with both get and set accessors. */
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
    public ImportIntArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public ImportIntArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public Boolean getIsVertical() { return isVertical; }
    public ImportIntArrayOption setIsVertical(Boolean isVertical) { this.isVertical = isVertical; return this; }

    public List<Integer> getData() { return data; }
    public ImportIntArrayOption setData(List<Integer> data) { this.data = data; return this; }

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public ImportIntArrayOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public ImportIntArrayOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public ImportIntArrayOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ImportIntArrayOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public ImportIntArrayOption setSource(FileSource source) { this.source = source; return this; }

}
