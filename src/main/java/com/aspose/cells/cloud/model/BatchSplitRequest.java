package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BatchSplitRequest — Class summary: Identifying key features of a statistical dataset and methods for data analysis. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchSplitRequest {
    /** The directory stores files that need to format conversion. */
    @JsonProperty("SourceFolder")
    private String sourceFolder;

    /** Aspose Cloud storage name */
    @JsonProperty("SourceStorage")
    private String sourceStorage;

    /** Indicates the match condition that needs to be processed for the file name. */
    @JsonProperty("MatchCondition")
    private MatchConditionRequest matchCondition;

    /** Output file format */
    @JsonProperty("Format")
    private String format;

    /** From worksheet index of workbook. */
    @JsonProperty("FromIndex")
    private Integer fromIndex;

    /** To worksheet index of workbook. */
    @JsonProperty("ToIndex")
    private Integer toIndex;

    /** The directory that stores files whose format conversion was successful. */
    @JsonProperty("OutFolder")
    private String outFolder;

    /** Aspose Cloud storage name. */
    @JsonProperty("OutStorage")
    private String outStorage;

    /** The regional settings for workbook. */
    @JsonProperty("Region")
    private String region;

    /** Indicates save options. */
    @JsonProperty("SaveOptions")
    private SaveOptions saveOptions;

    public String getSourceFolder() { return sourceFolder; }
    public BatchSplitRequest setSourceFolder(String sourceFolder) { this.sourceFolder = sourceFolder; return this; }

    public String getSourceStorage() { return sourceStorage; }
    public BatchSplitRequest setSourceStorage(String sourceStorage) { this.sourceStorage = sourceStorage; return this; }

    public MatchConditionRequest getMatchCondition() { return matchCondition; }
    public BatchSplitRequest setMatchCondition(MatchConditionRequest matchCondition) { this.matchCondition = matchCondition; return this; }

    public String getFormat() { return format; }
    public BatchSplitRequest setFormat(String format) { this.format = format; return this; }

    public Integer getFromIndex() { return fromIndex; }
    public BatchSplitRequest setFromIndex(Integer fromIndex) { this.fromIndex = fromIndex; return this; }

    public Integer getToIndex() { return toIndex; }
    public BatchSplitRequest setToIndex(Integer toIndex) { this.toIndex = toIndex; return this; }

    public String getOutFolder() { return outFolder; }
    public BatchSplitRequest setOutFolder(String outFolder) { this.outFolder = outFolder; return this; }

    public String getOutStorage() { return outStorage; }
    public BatchSplitRequest setOutStorage(String outStorage) { this.outStorage = outStorage; return this; }

    public String getRegion() { return region; }
    public BatchSplitRequest setRegion(String region) { this.region = region; return this; }

    public SaveOptions getSaveOptions() { return saveOptions; }
    public BatchSplitRequest setSaveOptions(SaveOptions saveOptions) { this.saveOptions = saveOptions; return this; }

}
