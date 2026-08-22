package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OperateObject — Represents operate object. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperateObject {
    /** Represents operate object type. */
    @JsonProperty("OperateObjectType")
    private String operateObjectType;

    /** Represents position of operate object. */
    @JsonProperty("Position")
    private OperateObjectPosition position;

    public String getOperateObjectType() { return operateObjectType; }
    public OperateObject setOperateObjectType(String operateObjectType) { this.operateObjectType = operateObjectType; return this; }

    public OperateObjectPosition getPosition() { return position; }
    public OperateObject setPosition(OperateObjectPosition position) { this.position = position; return this; }

}
