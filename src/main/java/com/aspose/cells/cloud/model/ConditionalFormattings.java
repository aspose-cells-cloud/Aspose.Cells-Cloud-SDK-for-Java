package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ConditionalFormattings — Encapsulates a collection of  objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalFormattings extends LinkElement {
    /** The property "Count" is decorated with [XmlElement("count")] attribute for XML serialization. */
    @JsonProperty("Count")
    private Integer count;

    /** Gets or sets ConditionalFormattingList. */
    @JsonProperty("ConditionalFormattingList")
    private List<ConditionalFormatting> conditionalFormattingList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getCount() { return count; }
    public ConditionalFormattings setCount(Integer count) { this.count = count; return this; }

    public List<ConditionalFormatting> getConditionalFormattingList() { return conditionalFormattingList; }
    public ConditionalFormattings setConditionalFormattingList(List<ConditionalFormatting> conditionalFormattingList) { this.conditionalFormattingList = conditionalFormattingList; return this; }

    public Link getLink() { return link; }
    public ConditionalFormattings setLink(Link link) { this.link = link; return this; }

}
