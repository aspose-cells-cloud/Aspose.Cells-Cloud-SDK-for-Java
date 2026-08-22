package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ImportOption — Class Summary: This class covers the features of artificial intelligence, machine learning, deep learning, and natural language processing. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportOption {
    /** Destination worksheet name. */
    @JsonProperty("DestinationWorksheet")
    private String destinationWorksheet;

    /** A boolean property `IsInsert` that can be both read and written. */
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

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public ImportOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public ImportOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public ImportOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ImportOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public ImportOption setSource(FileSource source) { this.source = source; return this; }

}
