package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataDeduplicationRequest model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataDeduplicationRequest {
    /** Spreadsheet files that require data fulling. */
    @JsonProperty("File")
    private FileInfo file;

    /** This class has a property named "DeduplicationRegion" of type "DeduplicationRegion" with a default value of a new instance of the "DeduplicationRegion" class. */
    @JsonProperty("DeduplicationRegion")
    private DeduplicationRegion deduplicationRegion;

    /** finish to data cleansing, outfile`s file format. */
    @JsonProperty("OutFileFormat")
    private String outFileFormat;

    /** Whether check restriction of Spreadsheet file when user modify cells related objects. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    /** The regional settings for workbook. */
    @JsonProperty("Region")
    private String region;

    public FileInfo getFile() { return file; }
    public DataDeduplicationRequest setFile(FileInfo file) { this.file = file; return this; }

    public DeduplicationRegion getDeduplicationRegion() { return deduplicationRegion; }
    public DataDeduplicationRequest setDeduplicationRegion(DeduplicationRegion deduplicationRegion) { this.deduplicationRegion = deduplicationRegion; return this; }

    public String getOutFileFormat() { return outFileFormat; }
    public DataDeduplicationRequest setOutFileFormat(String outFileFormat) { this.outFileFormat = outFileFormat; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public DataDeduplicationRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public String getRegion() { return region; }
    public DataDeduplicationRequest setRegion(String region) { this.region = region; return this; }

}
