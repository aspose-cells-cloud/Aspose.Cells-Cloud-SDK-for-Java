package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ScrollBarResponse — Represents the ScrollBar Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScrollBarResponse extends CellsCloudResponse {
    /** The class has a public property named `Shape` of type `ScrollBar` that can be both read and written. */
    @JsonProperty("Shape")
    private ScrollBar shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ScrollBar getShape() { return shape; }
    public ScrollBarResponse setShape(ScrollBar shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public ScrollBarResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ScrollBarResponse setStatus(String status) { this.status = status; return this; }

}
