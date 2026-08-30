package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Trendlines — Represents a collection of all the  objects for the specified data series. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Trendlines extends LinkElement {
    /** This property allows for a list of Trendline objects to be stored under the XmlElement "TrendLine". */
    @JsonProperty("TrendlineList")
    private List<Trendline> trendlineList;

    public List<Trendline> getTrendlineList() { return trendlineList; }
    public Trendlines setTrendlineList(List<Trendline> trendlineList) { this.trendlineList = trendlineList; return this; }


    /** Covariant override: keeps fluent chains returning Trendlines. */
    @Override public Trendlines setLink(Link link) { return (Trendlines) super.setLink(link); }

}
