package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PivotColumn — Represents pivot column for data table. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotColumn extends AppliedOperate {
    /** Represents pivot column name. */
    @JsonProperty("PivotColumnName")
    private String pivotColumnName;

    /** Represents column name that sets the column's value to the value of the pivot column. */
    @JsonProperty("ValueColumnNames")
    private List<String> valueColumnNames;

    public String getPivotColumnName() { return pivotColumnName; }
    public PivotColumn setPivotColumnName(String pivotColumnName) { this.pivotColumnName = pivotColumnName; return this; }

    public List<String> getValueColumnNames() { return valueColumnNames; }
    public PivotColumn setValueColumnNames(List<String> valueColumnNames) { this.valueColumnNames = valueColumnNames; return this; }


    /** Covariant override: keeps fluent chains returning PivotColumn. */
    @Override public PivotColumn setAppliedOperateType(String appliedOperateType) { return (PivotColumn) super.setAppliedOperateType(appliedOperateType); }

}
