package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MergeQueries — Represents merge quesies. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MergeQueries extends AppliedOperate {
    /** Indicates the name of the data query , it is matched in the data query set. */
    @JsonProperty("DataQueryNameA")
    private String dataQueryNameA;

    /** Represents index field  of DataA. */
    @JsonProperty("DataAIndexField")
    private String dataAIndexField;

    /** Indicates the name of the data query , it is matched in the data query set. */
    @JsonProperty("DataQueryNameB")
    private String dataQueryNameB;

    /** Represents index field  of DataB. */
    @JsonProperty("DataBIndexField")
    private String dataBIndexField;

    /** Represents ethods of data consolidation. */
    @JsonProperty("JoinType")
    private String joinType;

    /** Gets or sets AppliedOperateType. */
    @JsonProperty("AppliedOperateType")
    private String appliedOperateType;

    public String getDataQueryNameA() { return dataQueryNameA; }
    public MergeQueries setDataQueryNameA(String dataQueryNameA) { this.dataQueryNameA = dataQueryNameA; return this; }

    public String getDataAIndexField() { return dataAIndexField; }
    public MergeQueries setDataAIndexField(String dataAIndexField) { this.dataAIndexField = dataAIndexField; return this; }

    public String getDataQueryNameB() { return dataQueryNameB; }
    public MergeQueries setDataQueryNameB(String dataQueryNameB) { this.dataQueryNameB = dataQueryNameB; return this; }

    public String getDataBIndexField() { return dataBIndexField; }
    public MergeQueries setDataBIndexField(String dataBIndexField) { this.dataBIndexField = dataBIndexField; return this; }

    public String getJoinType() { return joinType; }
    public MergeQueries setJoinType(String joinType) { this.joinType = joinType; return this; }

    public String getAppliedOperateType() { return appliedOperateType; }
    public MergeQueries setAppliedOperateType(String appliedOperateType) { this.appliedOperateType = appliedOperateType; return this; }

}
