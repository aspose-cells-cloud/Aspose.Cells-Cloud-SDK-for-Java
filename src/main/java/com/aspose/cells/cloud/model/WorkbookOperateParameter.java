package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookOperateParameter — Represents workbook operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookOperateParameter extends OperateParameter {
    /** Gets or sets OperateType. */
    @JsonProperty("OperateType")
    private String operateType;

    public String getOperateType() { return operateType; }
    public WorkbookOperateParameter setOperateType(String operateType) { this.operateType = operateType; return this; }

}
