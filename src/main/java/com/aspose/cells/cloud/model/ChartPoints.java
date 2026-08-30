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

    public List<ChartPoint> getChartPointList() { return chartPointList; }
    public ChartPoints setChartPointList(List<ChartPoint> chartPointList) { this.chartPointList = chartPointList; return this; }


    /** Covariant override: keeps fluent chains returning ChartPoints. */
    @Override public ChartPoints setLink(Link link) { return (ChartPoints) super.setLink(link); }

}
