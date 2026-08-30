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

    public List<CellValue> getBatchData() { return batchData; }
    public ImportBatchDataOption setBatchData(List<CellValue> batchData) { this.batchData = batchData; return this; }


    /** Covariant override: keeps fluent chains returning ImportBatchDataOption. */
    @Override public ImportBatchDataOption setDestinationWorksheet(String destinationWorksheet) { return (ImportBatchDataOption) super.setDestinationWorksheet(destinationWorksheet); }
    /** Covariant override: keeps fluent chains returning ImportBatchDataOption. */
    @Override public ImportBatchDataOption setIsInsert(Boolean isInsert) { return (ImportBatchDataOption) super.setIsInsert(isInsert); }
    /** Covariant override: keeps fluent chains returning ImportBatchDataOption. */
    @Override public ImportBatchDataOption setImportDataType(String importDataType) { return (ImportBatchDataOption) super.setImportDataType(importDataType); }
    /** Covariant override: keeps fluent chains returning ImportBatchDataOption. */
    @Override public ImportBatchDataOption setDataSource(DataSource dataSource) { return (ImportBatchDataOption) super.setDataSource(dataSource); }
    /** Covariant override: keeps fluent chains returning ImportBatchDataOption. */
    @Override public ImportBatchDataOption setSource(FileSource source) { return (ImportBatchDataOption) super.setSource(source); }

}
