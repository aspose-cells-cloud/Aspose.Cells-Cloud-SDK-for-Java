package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ShapesResponse — Represents the Shapes Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShapesResponse extends CellsCloudResponse {
    /** The class has a property called "Shapes" with XML serialization attribute "XmlElement" for specifying the element name in the XML representation. */
    @JsonProperty("Shapes")
    private Shapes shapes;

    public Shapes getShapes() { return shapes; }
    public ShapesResponse setShapes(Shapes shapes) { this.shapes = shapes; return this; }


    /** Covariant override: keeps fluent chains returning ShapesResponse. */
    @Override public ShapesResponse setCode(Integer code) { return (ShapesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ShapesResponse. */
    @Override public ShapesResponse setStatus(String status) { return (ShapesResponse) super.setStatus(status); }

}
