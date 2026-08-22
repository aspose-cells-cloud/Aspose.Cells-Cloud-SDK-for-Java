package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** XmlDataBinding — Represents Xml Data Binding information. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XmlDataBinding {
    /** Gets source url of this data binding. */
    @JsonProperty("Url")
    private String url;

    public String getUrl() { return url; }
    public XmlDataBinding setUrl(String url) { this.url = url; return this; }

}
