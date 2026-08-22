package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataCleansingRequest — A data cleansing request for an Spreadsheet file. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataCleansingRequest {
    /** Spreadsheet files that require data cleaning. */
    @JsonProperty("File")
    private FileInfo file;

    /** Whether check restriction of Spreadsheet file when user modify cells related objects. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    /** The regional settings for workbook. */
    @JsonProperty("Region")
    private String region;

    /** finish to data cleansing, outfile`s file format. */
    @JsonProperty("OutFileFormat")
    private String outFileFormat;

    /** Data cleansing content */
    @JsonProperty("DataCleansing")
    private DataCleansing dataCleansing;

    public FileInfo getFile() { return file; }
    public DataCleansingRequest setFile(FileInfo file) { this.file = file; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public DataCleansingRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public String getRegion() { return region; }
    public DataCleansingRequest setRegion(String region) { this.region = region; return this; }

    public String getOutFileFormat() { return outFileFormat; }
    public DataCleansingRequest setOutFileFormat(String outFileFormat) { this.outFileFormat = outFileFormat; return this; }

    public DataCleansing getDataCleansing() { return dataCleansing; }
    public DataCleansingRequest setDataCleansing(DataCleansing dataCleansing) { this.dataCleansing = dataCleansing; return this; }

}
