package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConvertParameter — Indicates convert parameter */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConvertParameter {
    /** A property "Name" of type string with a getter and setter is declared in the class. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets Value. */
    @JsonProperty("Value")
    private String value;

    public String getName() { return name; }
    public ConvertParameter setName(String name) { this.name = name; return this; }

    public String getValue() { return value; }
    public ConvertParameter setValue(String value) { this.value = value; return this; }

}
