package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** UnpivotColumn — Unpivot column. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UnpivotColumn extends AppliedOperate {
    /** Indicates unpivot column names. */
    @JsonProperty("UnpivotColumnNames")
    private List<String> unpivotColumnNames;

    /** Indicates the column is used to store the name of unpivot columns. */
    @JsonProperty("ColumnMapName")
    private String columnMapName;

    /** Indicates the column is used to store the value of unpivot columns. */
    @JsonProperty("ValueMapName")
    private String valueMapName;

    public List<String> getUnpivotColumnNames() { return unpivotColumnNames; }
    public UnpivotColumn setUnpivotColumnNames(List<String> unpivotColumnNames) { this.unpivotColumnNames = unpivotColumnNames; return this; }

    public String getColumnMapName() { return columnMapName; }
    public UnpivotColumn setColumnMapName(String columnMapName) { this.columnMapName = columnMapName; return this; }

    public String getValueMapName() { return valueMapName; }
    public UnpivotColumn setValueMapName(String valueMapName) { this.valueMapName = valueMapName; return this; }


    /** Covariant override: keeps fluent chains returning UnpivotColumn. */
    @Override public UnpivotColumn setAppliedOperateType(String appliedOperateType) { return (UnpivotColumn) super.setAppliedOperateType(appliedOperateType); }

}
