package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SpecifyCellsObject model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpecifyCellsObject {
    /** Gets or sets WorksheetName. */
    @JsonProperty("WorksheetName")
    private String worksheetName;

    /** Gets or sets PageIndex. */
    @JsonProperty("PageIndex")
    private Integer pageIndex;

    /** Gets or sets Region. */
    @JsonProperty("Region")
    private String region;

    public String getWorksheetName() { return worksheetName; }
    public SpecifyCellsObject setWorksheetName(String worksheetName) { this.worksheetName = worksheetName; return this; }

    public Integer getPageIndex() { return pageIndex; }
    public SpecifyCellsObject setPageIndex(Integer pageIndex) { this.pageIndex = pageIndex; return this; }

    public String getRegion() { return region; }
    public SpecifyCellsObject setRegion(String region) { this.region = region; return this; }

}
