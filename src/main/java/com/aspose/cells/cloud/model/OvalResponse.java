package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OvalResponse — Represents the Oval Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OvalResponse extends CellsCloudResponse {
    /** The class has a public property called "Shape" of type "Oval" with both get and set accessors. */
    @JsonProperty("Shape")
    private Oval shape;

    public Oval getShape() { return shape; }
    public OvalResponse setShape(Oval shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning OvalResponse. */
    @Override public OvalResponse setCode(Integer code) { return (OvalResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning OvalResponse. */
    @Override public OvalResponse setStatus(String status) { return (OvalResponse) super.setStatus(status); }

}
