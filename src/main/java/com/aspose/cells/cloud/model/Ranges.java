package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Ranges — Encapsulates a collection of  objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ranges {
    /** Property Summary: Contains a list of ranges specified by the XmlElement "Range". */
    @JsonProperty("RangeList")
    private List<Range> rangeList;

    public List<Range> getRangeList() { return rangeList; }
    public Ranges setRangeList(List<Range> rangeList) { this.rangeList = rangeList; return this; }

}
