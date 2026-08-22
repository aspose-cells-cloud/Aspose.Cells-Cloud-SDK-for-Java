package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Link — I'm glad to help! Please provide me with the features you would like me to summarize. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Link {
    /** Has a property named Href with the attribute ElementName set to "href". */
    @JsonProperty("Href")
    private String href;

    /** Gets or sets Rel. */
    @JsonProperty("Rel")
    private String rel;

    /** Gets or sets Title. */
    @JsonProperty("Title")
    private String title;

    /** Gets or sets Type. */
    @JsonProperty("Type")
    private String type;

    public String getHref() { return href; }
    public Link setHref(String href) { this.href = href; return this; }

    public String getRel() { return rel; }
    public Link setRel(String rel) { this.rel = rel; return this; }

    public String getTitle() { return title; }
    public Link setTitle(String title) { this.title = title; return this; }

    public String getType() { return type; }
    public Link setType(String type) { this.type = type; return this; }

}
