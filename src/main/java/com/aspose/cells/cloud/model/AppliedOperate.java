package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AppliedOperate — A data operation that is used to obtain a query of data. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class AppliedOperate {
    /** Property summary: Utilizes a custom JSON converter to serialize and deserialize an enum property. */
    @JsonProperty("AppliedOperateType")
    private String appliedOperateType;

    public String getAppliedOperateType() { return appliedOperateType; }
    public AppliedOperate setAppliedOperateType(String appliedOperateType) { this.appliedOperateType = appliedOperateType; return this; }

}
