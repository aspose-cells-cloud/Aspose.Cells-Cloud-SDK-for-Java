package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** LegendEntries — Sure, please provide me with the features you would like me to summarize in one sentence for the class summary. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LegendEntries extends LinkElement {
    /** Property: Utilizes XML element "LengendEntry" to represent a list of LinkElement items in the class. */
    @JsonProperty("legendEntryList")
    private List<LinkElement> legendEntryList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public List<LinkElement> getLegendEntryList() { return legendEntryList; }
    public LegendEntries setLegendEntryList(List<LinkElement> legendEntryList) { this.legendEntryList = legendEntryList; return this; }

    public Link getLink() { return link; }
    public LegendEntries setLink(Link link) { this.link = link; return this; }

}
