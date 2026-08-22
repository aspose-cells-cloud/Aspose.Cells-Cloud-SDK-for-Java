package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ImportDataTaskParameter — Represents import data task parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportDataTaskParameter extends TaskParameter {
    /** Represents data source of task object. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents data source of task object. */
    @JsonProperty("Workbook")
    private FileSource workbook;

    /** Represents import option. */
    @JsonProperty("ImportOption")
    private ImportOption importOption;

    /** Represents destination data source. */
    @JsonProperty("TargetDataSource")
    private DataSource targetDataSource;

    /** Represents destination data source. */
    @JsonProperty("DestinationWorkbook")
    private FileSource destinationWorkbook;

    public DataSource getDataSource() { return dataSource; }
    public ImportDataTaskParameter setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getWorkbook() { return workbook; }
    public ImportDataTaskParameter setWorkbook(FileSource workbook) { this.workbook = workbook; return this; }

    public ImportOption getImportOption() { return importOption; }
    public ImportDataTaskParameter setImportOption(ImportOption importOption) { this.importOption = importOption; return this; }

    public DataSource getTargetDataSource() { return targetDataSource; }
    public ImportDataTaskParameter setTargetDataSource(DataSource targetDataSource) { this.targetDataSource = targetDataSource; return this; }

    public FileSource getDestinationWorkbook() { return destinationWorkbook; }
    public ImportDataTaskParameter setDestinationWorkbook(FileSource destinationWorkbook) { this.destinationWorkbook = destinationWorkbook; return this; }

}
