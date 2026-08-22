package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TrimContentOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TrimContentOptions {
    /** Represents data source.  There are three types of data, they are CloudFileSystem, RequestFiles, HttpUri. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents file information. Include of filename, filesize, and file content(base64String). */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Trim Content */
    @JsonProperty("TrimContent")
    private String trimContent;

    /** If the trim leading value is true, the trim content before and after cell values will be deleted. */
    @JsonProperty("TrimLeading")
    private Boolean trimLeading;

    /** If the trim trailing value is true, the trim content before and after cell values will be deleted. */
    @JsonProperty("TrimTrailing")
    private Boolean trimTrailing;

    /** When the trim space between word to 1 parameter is true, it enables the removal of extra spaces between words within a cell, ensuring that only a single space is maintained between words. */
    @JsonProperty("TrimSpaceBetweenWordTo1")
    private Boolean trimSpaceBetweenWordTo1;

    /** Gets or sets TrimNonBreakingSpaces. */
    @JsonProperty("TrimNonBreakingSpaces")
    private Boolean trimNonBreakingSpaces;

    /** When this parameter is enabled (set to True), it deletes extra line breaks within the selected range, ensuring that only necessary line breaks are retained. */
    @JsonProperty("RemoveExtraLineBreaks")
    private Boolean removeExtraLineBreaks;

    /** When this parameter is enabled (set to True), it removes all line breaks within the selected range, resulting in a continuous block of text without any line breaks. */
    @JsonProperty("RemoveAllLineBreaks")
    private Boolean removeAllLineBreaks;

    /** Specifies the range of cells within the worksheet where the spreadsheet operations will be performed. This parameter allows users to define the exact area to be processed, ensuring that operations are applied only to the designated cells. */
    @JsonProperty("ScopeOptions")
    private ScopeOptions scopeOptions;

    public DataSource getDataSource() { return dataSource; }
    public TrimContentOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public TrimContentOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getTrimContent() { return trimContent; }
    public TrimContentOptions setTrimContent(String trimContent) { this.trimContent = trimContent; return this; }

    public Boolean getTrimLeading() { return trimLeading; }
    public TrimContentOptions setTrimLeading(Boolean trimLeading) { this.trimLeading = trimLeading; return this; }

    public Boolean getTrimTrailing() { return trimTrailing; }
    public TrimContentOptions setTrimTrailing(Boolean trimTrailing) { this.trimTrailing = trimTrailing; return this; }

    public Boolean getTrimSpaceBetweenWordTo1() { return trimSpaceBetweenWordTo1; }
    public TrimContentOptions setTrimSpaceBetweenWordTo1(Boolean trimSpaceBetweenWordTo1) { this.trimSpaceBetweenWordTo1 = trimSpaceBetweenWordTo1; return this; }

    public Boolean getTrimNonBreakingSpaces() { return trimNonBreakingSpaces; }
    public TrimContentOptions setTrimNonBreakingSpaces(Boolean trimNonBreakingSpaces) { this.trimNonBreakingSpaces = trimNonBreakingSpaces; return this; }

    public Boolean getRemoveExtraLineBreaks() { return removeExtraLineBreaks; }
    public TrimContentOptions setRemoveExtraLineBreaks(Boolean removeExtraLineBreaks) { this.removeExtraLineBreaks = removeExtraLineBreaks; return this; }

    public Boolean getRemoveAllLineBreaks() { return removeAllLineBreaks; }
    public TrimContentOptions setRemoveAllLineBreaks(Boolean removeAllLineBreaks) { this.removeAllLineBreaks = removeAllLineBreaks; return this; }

    public ScopeOptions getScopeOptions() { return scopeOptions; }
    public TrimContentOptions setScopeOptions(ScopeOptions scopeOptions) { this.scopeOptions = scopeOptions; return this; }

}
