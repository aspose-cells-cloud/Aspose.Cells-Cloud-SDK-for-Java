package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OperateParameter — Represents operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OperateParameter {
    /** Represents task operate type. */
    @JsonProperty("OperateType")
    private String operateType;

    public String getOperateType() { return operateType; }
    public OperateParameter setOperateType(String operateType) { this.operateType = operateType; return this; }

}
