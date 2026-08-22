package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BaseOperateOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class BaseOperateOptions {
    /** The property "Name" is a virtual string type with a public access modifier and a default value of an empty string. */
    @JsonProperty("Name")
    private String name;

    public String getName() { return name; }
    public BaseOperateOptions setName(String name) { this.name = name; return this; }

}
