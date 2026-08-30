package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OleObjectResponse — Represents the OleObject Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OleObjectResponse extends CellsCloudResponse {
    /** This class has a property named OleObject of type OleObject with both read and write capabilities. */
    @JsonProperty("OleObject")
    private OleObject oleObject;

    public OleObject getOleObject() { return oleObject; }
    public OleObjectResponse setOleObject(OleObject oleObject) { this.oleObject = oleObject; return this; }


    /** Covariant override: keeps fluent chains returning OleObjectResponse. */
    @Override public OleObjectResponse setCode(Integer code) { return (OleObjectResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning OleObjectResponse. */
    @Override public OleObjectResponse setStatus(String status) { return (OleObjectResponse) super.setStatus(status); }

}
