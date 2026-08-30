package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NamesResponse — Represents the Names Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NamesResponse extends CellsCloudResponse {
    /** Property: This property represents an XML element named "names" and holds a Names object. */
    @JsonProperty("Names")
    private Names names;

    public Names getNames() { return names; }
    public NamesResponse setNames(Names names) { this.names = names; return this; }


    /** Covariant override: keeps fluent chains returning NamesResponse. */
    @Override public NamesResponse setCode(Integer code) { return (NamesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning NamesResponse. */
    @Override public NamesResponse setStatus(String status) { return (NamesResponse) super.setStatus(status); }

}
