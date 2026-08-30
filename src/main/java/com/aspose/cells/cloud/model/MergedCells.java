package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** MergedCells — Sure, could you please provide me with the features you would like me to summarize? */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MergedCells extends LinkElement {
    /** An integer property labeled as "count" and marked as an XML element in the class. */
    @JsonProperty("Count")
    private Integer count;

    /** Gets or sets MergedCellList. */
    @JsonProperty("MergedCellList")
    private List<LinkElement> mergedCellList;

    public Integer getCount() { return count; }
    public MergedCells setCount(Integer count) { this.count = count; return this; }

    public List<LinkElement> getMergedCellList() { return mergedCellList; }
    public MergedCells setMergedCellList(List<LinkElement> mergedCellList) { this.mergedCellList = mergedCellList; return this; }


    /** Covariant override: keeps fluent chains returning MergedCells. */
    @Override public MergedCells setLink(Link link) { return (MergedCells) super.setLink(link); }

}
