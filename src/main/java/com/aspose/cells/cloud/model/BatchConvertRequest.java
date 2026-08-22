package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BatchConvertRequest — Indicates batch convert file request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchConvertRequest {
    /** The directory stores files that need to format conversion. */
    @JsonProperty("SourceFolder")
    private String sourceFolder;

    /** Aspose Cloud storage name. */
    @JsonProperty("SourceStorage")
    private String sourceStorage;

    /** Indicates the match condition that needs to be processed for the file name. */
    @JsonProperty("MatchCondition")
    private MatchConditionRequest matchCondition;

    /** Conversion format. */
    @JsonProperty("Format")
    private String format;

    /** The directory that stores files whose format conversion was successful. */
    @JsonProperty("OutFolder")
    private String outFolder;

    /** Aspose Cloud storage name. */
    @JsonProperty("OutStorage")
    private String outStorage;

    /** The regional settings for workbook. */
    @JsonProperty("Region")
    private String region;

    /** A nullable Boolean property that determines whether the content should be fit to the entire page width on each sheet. */
    @JsonProperty("PageWideFitOnPerSheet")
    private Boolean pageWideFitOnPerSheet;

    /** Gets or sets PageTallFitOnPerSheet. */
    @JsonProperty("PageTallFitOnPerSheet")
    private Boolean pageTallFitOnPerSheet;

    /** Indicates save options. */
    @JsonProperty("SaveOptions")
    private SaveOptions saveOptions;

    public String getSourceFolder() { return sourceFolder; }
    public BatchConvertRequest setSourceFolder(String sourceFolder) { this.sourceFolder = sourceFolder; return this; }

    public String getSourceStorage() { return sourceStorage; }
    public BatchConvertRequest setSourceStorage(String sourceStorage) { this.sourceStorage = sourceStorage; return this; }

    public MatchConditionRequest getMatchCondition() { return matchCondition; }
    public BatchConvertRequest setMatchCondition(MatchConditionRequest matchCondition) { this.matchCondition = matchCondition; return this; }

    public String getFormat() { return format; }
    public BatchConvertRequest setFormat(String format) { this.format = format; return this; }

    public String getOutFolder() { return outFolder; }
    public BatchConvertRequest setOutFolder(String outFolder) { this.outFolder = outFolder; return this; }

    public String getOutStorage() { return outStorage; }
    public BatchConvertRequest setOutStorage(String outStorage) { this.outStorage = outStorage; return this; }

    public String getRegion() { return region; }
    public BatchConvertRequest setRegion(String region) { this.region = region; return this; }

    public Boolean getPageWideFitOnPerSheet() { return pageWideFitOnPerSheet; }
    public BatchConvertRequest setPageWideFitOnPerSheet(Boolean pageWideFitOnPerSheet) { this.pageWideFitOnPerSheet = pageWideFitOnPerSheet; return this; }

    public Boolean getPageTallFitOnPerSheet() { return pageTallFitOnPerSheet; }
    public BatchConvertRequest setPageTallFitOnPerSheet(Boolean pageTallFitOnPerSheet) { this.pageTallFitOnPerSheet = pageTallFitOnPerSheet; return this; }

    public SaveOptions getSaveOptions() { return saveOptions; }
    public BatchConvertRequest setSaveOptions(SaveOptions saveOptions) { this.saveOptions = saveOptions; return this; }

}
