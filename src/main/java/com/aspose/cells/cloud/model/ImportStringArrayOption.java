package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ImportStringArrayOption — I'm happy to help! Could you please provide me with the features you would like me to summarize for the class? */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportStringArrayOption extends ImportOption {
    /** A property named "FirstRow" of type integer with both a getter and a setter is defined in the class. */
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
    public ImportStringArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public ImportStringArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public Boolean getIsVertical() { return isVertical; }
    public ImportStringArrayOption setIsVertical(Boolean isVertical) { this.isVertical = isVertical; return this; }

    public List<String> getData() { return data; }
    public ImportStringArrayOption setData(List<String> data) { this.data = data; return this; }

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public ImportStringArrayOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public ImportStringArrayOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public ImportStringArrayOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ImportStringArrayOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public ImportStringArrayOption setSource(FileSource source) { this.source = source; return this; }

}
