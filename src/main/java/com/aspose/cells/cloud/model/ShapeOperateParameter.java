package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ShapeOperateParameter — Represents shape operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShapeOperateParameter extends OperateParameter {
    /** Represents shape object. */
    @JsonProperty("Shape")
    private Shape shape;

    /** Gets or sets OperateType. */
    @JsonProperty("OperateType")
    private String operateType;

    public Shape getShape() { return shape; }
    public ShapeOperateParameter setShape(Shape shape) { this.shape = shape; return this; }

    public String getOperateType() { return operateType; }
    public ShapeOperateParameter setOperateType(String operateType) { this.operateType = operateType; return this; }

}
