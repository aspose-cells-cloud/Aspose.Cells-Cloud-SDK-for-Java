package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConvertTaskParameter — Represents convert task parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConvertTaskParameter extends TaskParameter {
    /** Represents data source of task object. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents data source of task object. */
    @JsonProperty("Workbook")
    private FileSource workbook;

    /** Represents destination file. */
    @JsonProperty("DestinationFile")
    private String destinationFile;

    /** Represents Excel data region. */
    @JsonProperty("Region")
    private String region;

    /** Represents save options. */
    @JsonProperty("SaveOptions")
    private SaveOptions saveOptions;

    public DataSource getDataSource() { return dataSource; }
    public ConvertTaskParameter setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getWorkbook() { return workbook; }
    public ConvertTaskParameter setWorkbook(FileSource workbook) { this.workbook = workbook; return this; }

    public String getDestinationFile() { return destinationFile; }
    public ConvertTaskParameter setDestinationFile(String destinationFile) { this.destinationFile = destinationFile; return this; }

    public String getRegion() { return region; }
    public ConvertTaskParameter setRegion(String region) { this.region = region; return this; }

    public SaveOptions getSaveOptions() { return saveOptions; }
    public ConvertTaskParameter setSaveOptions(SaveOptions saveOptions) { this.saveOptions = saveOptions; return this; }

}
