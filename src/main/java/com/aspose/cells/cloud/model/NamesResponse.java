package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NamesResponse — Represents the Names Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NamesResponse extends CellsCloudResponse {
    /** Property: This property represents an XML element named "names" and holds a Names object. */
    @JsonProperty("Names")
    private Names names;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Names getNames() { return names; }
    public NamesResponse setNames(Names names) { this.names = names; return this; }

    public Integer getCode() { return code; }
    public NamesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public NamesResponse setStatus(String status) { this.status = status; return this; }

}
