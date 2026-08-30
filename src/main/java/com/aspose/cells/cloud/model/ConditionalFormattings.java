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

    public Integer getCount() { return count; }
    public ConditionalFormattings setCount(Integer count) { this.count = count; return this; }

    public List<ConditionalFormatting> getConditionalFormattingList() { return conditionalFormattingList; }
    public ConditionalFormattings setConditionalFormattingList(List<ConditionalFormatting> conditionalFormattingList) { this.conditionalFormattingList = conditionalFormattingList; return this; }


    /** Covariant override: keeps fluent chains returning ConditionalFormattings. */
    @Override public ConditionalFormattings setLink(Link link) { return (ConditionalFormattings) super.setLink(link); }

}
