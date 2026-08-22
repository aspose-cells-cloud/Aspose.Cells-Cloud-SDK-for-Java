package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OleObjectResponse — Represents the OleObject Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OleObjectResponse extends CellsCloudResponse {
    /** This class has a property named OleObject of type OleObject with both read and write capabilities. */
    @JsonProperty("OleObject")
    private OleObject oleObject;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public OleObject getOleObject() { return oleObject; }
    public OleObjectResponse setOleObject(OleObject oleObject) { this.oleObject = oleObject; return this; }

    public Integer getCode() { return code; }
    public OleObjectResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public OleObjectResponse setStatus(String status) { this.status = status; return this; }

}
