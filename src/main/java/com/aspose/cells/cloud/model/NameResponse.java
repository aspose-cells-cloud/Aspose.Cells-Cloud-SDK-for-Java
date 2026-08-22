package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NameResponse — Represents the Name Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NameResponse extends CellsCloudResponse {
    /** A public property that allows getting and setting a value of type "Name". */
    @JsonProperty("Name")
    private Name name;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Name getName() { return name; }
    public NameResponse setName(Name name) { this.name = name; return this; }

    public Integer getCode() { return code; }
    public NameResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public NameResponse setStatus(String status) { this.status = status; return this; }

}
