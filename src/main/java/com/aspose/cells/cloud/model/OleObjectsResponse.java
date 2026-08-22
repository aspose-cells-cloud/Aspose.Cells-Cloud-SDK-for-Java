package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OleObjectsResponse — Represents the OleObjects Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OleObjectsResponse extends CellsCloudResponse {
    /** Property `OleObjects` of type `OleObjects` that can be accessed and modified publicly within the class. */
    @JsonProperty("OleObjects")
    private OleObjects oleObjects;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public OleObjects getOleObjects() { return oleObjects; }
    public OleObjectsResponse setOleObjects(OleObjects oleObjects) { this.oleObjects = oleObjects; return this; }

    public Integer getCode() { return code; }
    public OleObjectsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public OleObjectsResponse setStatus(String status) { this.status = status; return this; }

}
