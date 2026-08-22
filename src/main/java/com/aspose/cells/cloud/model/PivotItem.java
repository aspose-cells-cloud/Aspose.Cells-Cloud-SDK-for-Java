package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotItem — Represents a item in a PivotField report. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotItem {
    /** Gets the index of the pivot item in cache field. */
    @JsonProperty("Index")
    private Integer index;

    /** Represents whether the specified item visible. */
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    /** Gets the name */
    @JsonProperty("Name")
    private String name;

    /** Gets the value of the specified item. */
    @JsonProperty("Value")
    private String value;

    public Integer getIndex() { return index; }
    public PivotItem setIndex(Integer index) { this.index = index; return this; }

    public Boolean getIsHidden() { return isHidden; }
    public PivotItem setIsHidden(Boolean isHidden) { this.isHidden = isHidden; return this; }

    public String getName() { return name; }
    public PivotItem setName(String name) { this.name = name; return this; }

    public String getValue() { return value; }
    public PivotItem setValue(String value) { this.value = value; return this; }

}
