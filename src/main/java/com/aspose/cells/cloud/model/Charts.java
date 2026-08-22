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

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<LinkElement> getChartList() { return chartList; }
    public Charts setChartList(List<LinkElement> chartList) { this.chartList = chartList; return this; }

    public Link getLink() { return link; }
    public Charts setLink(Link link) { this.link = link; return this; }

}
