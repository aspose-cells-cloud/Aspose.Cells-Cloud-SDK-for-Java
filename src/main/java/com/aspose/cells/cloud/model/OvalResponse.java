package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OvalResponse — Represents the Oval Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OvalResponse extends CellsCloudResponse {
    /** The class has a public property called "Shape" of type "Oval" with both get and set accessors. */
    @JsonProperty("Shape")
    private Oval shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Oval getShape() { return shape; }
    public OvalResponse setShape(Oval shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public OvalResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public OvalResponse setStatus(String status) { this.status = status; return this; }

}
