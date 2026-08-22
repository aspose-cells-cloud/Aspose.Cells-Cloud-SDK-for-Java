package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataFillRequest — I'm happy to help! Please provide the features you would like me to summarize. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataFillRequest {
    /** Spreadsheet files that require data fulling. */
    @JsonProperty("File")
    private FileInfo file;

    /** finish to data cleansing, outfile`s file format. */
    @JsonProperty("OutFileFormat")
    private String outFileFormat;

    /** Whether check restriction of Spreadsheet file when user modify cells related objects. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    /** The regional settings for workbook. */
    @JsonProperty("Region")
    private String region;

    /** Fill data default value. */
    @JsonProperty("DataFill")
    private DataFill dataFill;

    public FileInfo getFile() { return file; }
    public DataFillRequest setFile(FileInfo file) { this.file = file; return this; }

    public String getOutFileFormat() { return outFileFormat; }
    public DataFillRequest setOutFileFormat(String outFileFormat) { this.outFileFormat = outFileFormat; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public DataFillRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public String getRegion() { return region; }
    public DataFillRequest setRegion(String region) { this.region = region; return this; }

    public DataFill getDataFill() { return dataFill; }
    public DataFillRequest setDataFill(DataFill dataFill) { this.dataFill = dataFill; return this; }

}
