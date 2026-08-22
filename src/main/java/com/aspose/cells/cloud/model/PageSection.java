package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PageSection — Class summary: Includes interactive discussions, group projects, guest speakers, and practical applications of course material. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageSection {
    /** 0,1,2  left , middle ,right */
    @JsonProperty("Section")
    private Integer section;

    /** page context script */
    @JsonProperty("Context")
    private String context;

    /** A property named "Picture" with both getter and setter methods of type string is defined. */
    @JsonProperty("Picture")
    private String picture;

    /** fisrt page context script */
    @JsonProperty("FisrtPageContext")
    private String fisrtPageContext;

    /** Even page context script */
    @JsonProperty("EvenPageContext")
    private String evenPageContext;

    public Integer getSection() { return section; }
    public PageSection setSection(Integer section) { this.section = section; return this; }

    public String getContext() { return context; }
    public PageSection setContext(String context) { this.context = context; return this; }

    public String getPicture() { return picture; }
    public PageSection setPicture(String picture) { this.picture = picture; return this; }

    public String getFisrtPageContext() { return fisrtPageContext; }
    public PageSection setFisrtPageContext(String fisrtPageContext) { this.fisrtPageContext = fisrtPageContext; return this; }

    public String getEvenPageContext() { return evenPageContext; }
    public PageSection setEvenPageContext(String evenPageContext) { this.evenPageContext = evenPageContext; return this; }

}
