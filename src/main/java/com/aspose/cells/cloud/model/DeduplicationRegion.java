package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DeduplicationRegion — Represents data deduplication region. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeduplicationRegion {
    /** Represents data range. */
    @JsonProperty("Ranges")
    private List<Range> ranges;

    /** Represents worksheet name list. */
    @JsonProperty("WorksheetNameList")
    private List<String> worksheetNameList;

    public List<Range> getRanges() { return ranges; }
    public DeduplicationRegion setRanges(List<Range> ranges) { this.ranges = ranges; return this; }

    public List<String> getWorksheetNameList() { return worksheetNameList; }
    public DeduplicationRegion setWorksheetNameList(List<String> worksheetNameList) { this.worksheetNameList = worksheetNameList; return this; }

}
