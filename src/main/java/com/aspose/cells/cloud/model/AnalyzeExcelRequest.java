package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AnalyzeExcelRequest — Can you please provide the features that you would like me to summarize for the class? */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyzeExcelRequest {
    /** The class has a property called "Files" that is a list of FileInfo objects with a default value of an empty list. */
    @JsonProperty("Files")
    private List<FileInfo> files;

    /** Gets or sets NeedThumbnail. */
    @JsonProperty("NeedThumbnail")
    private Boolean needThumbnail;

    /** Gets or sets BuildSuggestoinSheet. */
    @JsonProperty("BuildSuggestoinSheet")
    private Boolean buildSuggestoinSheet;

    public List<FileInfo> getFiles() { return files; }
    public AnalyzeExcelRequest setFiles(List<FileInfo> files) { this.files = files; return this; }

    public Boolean getNeedThumbnail() { return needThumbnail; }
    public AnalyzeExcelRequest setNeedThumbnail(Boolean needThumbnail) { this.needThumbnail = needThumbnail; return this; }

    public Boolean getBuildSuggestoinSheet() { return buildSuggestoinSheet; }
    public AnalyzeExcelRequest setBuildSuggestoinSheet(Boolean buildSuggestoinSheet) { this.buildSuggestoinSheet = buildSuggestoinSheet; return this; }

}
