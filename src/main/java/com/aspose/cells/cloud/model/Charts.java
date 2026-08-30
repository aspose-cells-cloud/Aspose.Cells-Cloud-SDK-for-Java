package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Charts — Encapsulates a collection of  objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Charts extends LinkElement {
    /** A property named ChartList of type List LinkElement  that is publicly accessible with both read and write capabilities. */
    @JsonProperty("ChartList")
    private List<LinkElement> chartList;

    public List<LinkElement> getChartList() { return chartList; }
    public Charts setChartList(List<LinkElement> chartList) { this.chartList = chartList; return this; }


    /** Covariant override: keeps fluent chains returning Charts. */
    @Override public Charts setLink(Link link) { return (Charts) super.setLink(link); }

}
