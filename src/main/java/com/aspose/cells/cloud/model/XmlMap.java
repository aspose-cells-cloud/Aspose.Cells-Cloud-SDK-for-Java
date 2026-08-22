package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** XmlMap — Represents Xml map information. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XmlMap {
    /** Returns or sets the name of the object. */
    @JsonProperty("Name")
    private String name;

    /** Gets root element name. */
    @JsonProperty("RootElementName")
    private String rootElementName;

    /** Gets an  of this map. */
    @JsonProperty("DataBinding")
    private XmlDataBinding dataBinding;

    public String getName() { return name; }
    public XmlMap setName(String name) { this.name = name; return this; }

    public String getRootElementName() { return rootElementName; }
    public XmlMap setRootElementName(String rootElementName) { this.rootElementName = rootElementName; return this; }

    public XmlDataBinding getDataBinding() { return dataBinding; }
    public XmlMap setDataBinding(XmlDataBinding dataBinding) { this.dataBinding = dataBinding; return this; }

}
