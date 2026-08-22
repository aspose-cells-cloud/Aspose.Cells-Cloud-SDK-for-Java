package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ImportBatchDataOption — I'm sorry, but it seems like you haven't provided any features for me to summarize. Could you please share the features you'd like me to summarize into a single sentence for your class? */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportBatchDataOption extends ImportOption {
    /** The class has a property named BatchData which is a list of CellValue objects and can be both read and written. */
    @JsonProperty("BatchData")
    private List<CellValue> batchData;

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

    public List<CellValue> getBatchData() { return batchData; }
    public ImportBatchDataOption setBatchData(List<CellValue> batchData) { this.batchData = batchData; return this; }

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public ImportBatchDataOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public ImportBatchDataOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public ImportBatchDataOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ImportBatchDataOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public ImportBatchDataOption setSource(FileSource source) { this.source = source; return this; }

}
