package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ShapesResponse — Represents the Shapes Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShapesResponse extends CellsCloudResponse {
    /** The class has a property called "Shapes" with XML serialization attribute "XmlElement" for specifying the element name in the XML representation. */
    @JsonProperty("Shapes")
    private Shapes shapes;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Shapes getShapes() { return shapes; }
    public ShapesResponse setShapes(Shapes shapes) { this.shapes = shapes; return this; }

    public Integer getCode() { return code; }
    public ShapesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ShapesResponse setStatus(String status) { this.status = status; return this; }

}
