package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ShapeOperateParameter — Represents shape operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShapeOperateParameter extends OperateParameter {
    /** Represents shape object. */
    @JsonProperty("Shape")
    private Shape shape;

    public Shape getShape() { return shape; }
    public ShapeOperateParameter setShape(Shape shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning ShapeOperateParameter. */
    @Override public ShapeOperateParameter setOperateType(String operateType) { return (ShapeOperateParameter) super.setOperateType(operateType); }

}
