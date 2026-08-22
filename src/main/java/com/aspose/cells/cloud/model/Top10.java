package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Top10 — Describe the Top10 conditional formatting rule. This conditional formatting rule highlights cells whose values fall in the top N or bottom N bracket, as specified. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Top10 {
    /** Get or set whether a "top/bottom n" rule is a "bottom n" rule. Default value is false. */
    @JsonProperty("IsBottom")
    private Boolean isBottom;

    /** Get or set whether a "top/bottom n" rule is a "top/bottom n percent" rule. Default value is false. */
    @JsonProperty("IsPercent")
    private Boolean isPercent;

    /** Get or set the value of "n" in a "top/bottom n" conditional formatting rule. If IsPercent is true, the value must between 0 and 100. Otherwise it must between 0 and 1000. Default value is 10. */
    @JsonProperty("Rank")
    private Integer rank;

    public Boolean getIsBottom() { return isBottom; }
    public Top10 setIsBottom(Boolean isBottom) { this.isBottom = isBottom; return this; }

    public Boolean getIsPercent() { return isPercent; }
    public Top10 setIsPercent(Boolean isPercent) { this.isPercent = isPercent; return this; }

    public Integer getRank() { return rank; }
    public Top10 setRank(Integer rank) { this.rank = rank; return this; }

}
