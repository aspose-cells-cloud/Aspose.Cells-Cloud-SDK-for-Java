package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AutoShapeResponse — Represents the AutoShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoShapeResponse extends CellsCloudResponse {
    /** A public property named "AutoShape" of type "AutoShape" with both getter and setter methods. */
    @JsonProperty("AutoShape")
    private AutoShape autoShape;

    public AutoShape getAutoShape() { return autoShape; }
    public AutoShapeResponse setAutoShape(AutoShape autoShape) { this.autoShape = autoShape; return this; }


    /** Covariant override: keeps fluent chains returning AutoShapeResponse. */
    @Override public AutoShapeResponse setCode(Integer code) { return (AutoShapeResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning AutoShapeResponse. */
    @Override public AutoShapeResponse setStatus(String status) { return (AutoShapeResponse) super.setStatus(status); }

}
