package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Validations — Represents data validation collection. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Validations extends LinkElement {
    /** Property summary: The property "Count" with an XML element name "count" returns the number of items in the "ValidationList". */
    @JsonProperty("Count")
    private Integer count;

    /** Gets or sets ValidationList. */
    @JsonProperty("ValidationList")
    private List<LinkElement> validationList;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getCount() { return count; }
    public Validations setCount(Integer count) { this.count = count; return this; }

    public List<LinkElement> getValidationList() { return validationList; }
    public Validations setValidationList(List<LinkElement> validationList) { this.validationList = validationList; return this; }

    public Link getLink() { return link; }
    public Validations setLink(Link link) { this.link = link; return this; }

}
