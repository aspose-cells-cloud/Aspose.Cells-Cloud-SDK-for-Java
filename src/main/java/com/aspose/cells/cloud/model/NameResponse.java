package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NameResponse — Represents the Name Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NameResponse extends CellsCloudResponse {
    /** A public property that allows getting and setting a value of type "Name". */
    @JsonProperty("Name")
    private Name name;

    public Name getName() { return name; }
    public NameResponse setName(Name name) { this.name = name; return this; }


    /** Covariant override: keeps fluent chains returning NameResponse. */
    @Override public NameResponse setCode(Integer code) { return (NameResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning NameResponse. */
    @Override public NameResponse setStatus(String status) { return (NameResponse) super.setStatus(status); }

}
