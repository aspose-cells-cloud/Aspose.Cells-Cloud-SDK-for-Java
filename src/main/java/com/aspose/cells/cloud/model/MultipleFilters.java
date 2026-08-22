package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** MultipleFilters — Represents the multiple filter collection. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MultipleFilters {
    /** A nullable boolean property that determines if a blank space should be matched. */
    @JsonProperty("MatchBlank")
    private Boolean matchBlank;

    /** Gets or sets MultipleFilterList. */
    @JsonProperty("MultipleFilterList")
    private List<MultipleFilter> multipleFilterList;

    public Boolean getMatchBlank() { return matchBlank; }
    public MultipleFilters setMatchBlank(Boolean matchBlank) { this.matchBlank = matchBlank; return this; }

    public List<MultipleFilter> getMultipleFilterList() { return multipleFilterList; }
    public MultipleFilters setMultipleFilterList(List<MultipleFilter> multipleFilterList) { this.multipleFilterList = multipleFilterList; return this; }

}
