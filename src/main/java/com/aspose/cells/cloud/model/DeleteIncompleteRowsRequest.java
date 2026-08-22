package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DeleteIncompleteRowsRequest — I'm here to help! Could you please provide the features you would like me to summarize? */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteIncompleteRowsRequest {
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

    /** A property named "Ranges" of type IList of Range, with a default value of an empty List of Range. */
    @JsonProperty("Ranges")
    private List<Range> ranges;

    public FileInfo getFile() { return file; }
    public DeleteIncompleteRowsRequest setFile(FileInfo file) { this.file = file; return this; }

    public String getOutFileFormat() { return outFileFormat; }
    public DeleteIncompleteRowsRequest setOutFileFormat(String outFileFormat) { this.outFileFormat = outFileFormat; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public DeleteIncompleteRowsRequest setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public String getRegion() { return region; }
    public DeleteIncompleteRowsRequest setRegion(String region) { this.region = region; return this; }

    public List<Range> getRanges() { return ranges; }
    public DeleteIncompleteRowsRequest setRanges(List<Range> ranges) { this.ranges = ranges; return this; }

}
