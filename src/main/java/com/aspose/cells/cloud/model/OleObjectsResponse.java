package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OleObjectsResponse — Represents the OleObjects Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OleObjectsResponse extends CellsCloudResponse {
    /** Property `OleObjects` of type `OleObjects` that can be accessed and modified publicly within the class. */
    @JsonProperty("OleObjects")
    private OleObjects oleObjects;

    public OleObjects getOleObjects() { return oleObjects; }
    public OleObjectsResponse setOleObjects(OleObjects oleObjects) { this.oleObjects = oleObjects; return this; }


    /** Covariant override: keeps fluent chains returning OleObjectsResponse. */
    @Override public OleObjectsResponse setCode(Integer code) { return (OleObjectsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning OleObjectsResponse. */
    @Override public OleObjectsResponse setStatus(String status) { return (OleObjectsResponse) super.setStatus(status); }

}
