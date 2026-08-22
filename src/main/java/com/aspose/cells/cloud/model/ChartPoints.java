package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ChartPoints — Represents a collection that contains all the points in one series. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartPoints extends LinkElement {
    /** This class has a property named ChartPointList of type List ChartPoint  with an XmlElement attribute "ChartPoint". */
    @JsonProperty("ChartPointList")
    private List<ChartPoint> chartPointList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<ChartPoint> getChartPointList() { return chartPointList; }
    public ChartPoints setChartPointList(List<ChartPoint> chartPointList) { this.chartPointList = chartPointList; return this; }

    public Link getLink() { return link; }
    public ChartPoints setLink(Link link) { this.link = link; return this; }

}
