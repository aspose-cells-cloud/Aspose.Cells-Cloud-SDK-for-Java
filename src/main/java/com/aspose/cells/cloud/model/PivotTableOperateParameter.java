package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** PivotTableOperateParameter — Represents pivot table operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotTableOperateParameter extends OperateParameter {
    /** Represents source data of pivot table. */
    @JsonProperty("SourceData")
    private String sourceData;

    /** Represents start cell name of the pivot table. */
    @JsonProperty("DestCellName")
    private String destCellName;

    /** Represents table name of pivot table. */
    @JsonProperty("TableName")
    private String tableName;

    /** Represents whether the same source is used. */
    @JsonProperty("UseSameSource")
    private Boolean useSameSource;

    /** Represents pivot table index. */
    @JsonProperty("PivotTableIndex")
    private Integer pivotTableIndex;

    /** Represents pivot row fields. */
    @JsonProperty("PivotFieldRows")
    private List<Integer> pivotFieldRows;

    /** Represents pivot column fields. */
    @JsonProperty("PivotFieldColumns")
    private List<Integer> pivotFieldColumns;

    /** Represents pivot data field. */
    @JsonProperty("PivotFieldData")
    private List<Integer> pivotFieldData;

    /** Gets or sets OperateType. */
    @JsonProperty("OperateType")
    private String operateType;

    public String getSourceData() { return sourceData; }
    public PivotTableOperateParameter setSourceData(String sourceData) { this.sourceData = sourceData; return this; }

    public String getDestCellName() { return destCellName; }
    public PivotTableOperateParameter setDestCellName(String destCellName) { this.destCellName = destCellName; return this; }

    public String getTableName() { return tableName; }
    public PivotTableOperateParameter setTableName(String tableName) { this.tableName = tableName; return this; }

    public Boolean getUseSameSource() { return useSameSource; }
    public PivotTableOperateParameter setUseSameSource(Boolean useSameSource) { this.useSameSource = useSameSource; return this; }

    public Integer getPivotTableIndex() { return pivotTableIndex; }
    public PivotTableOperateParameter setPivotTableIndex(Integer pivotTableIndex) { this.pivotTableIndex = pivotTableIndex; return this; }

    public List<Integer> getPivotFieldRows() { return pivotFieldRows; }
    public PivotTableOperateParameter setPivotFieldRows(List<Integer> pivotFieldRows) { this.pivotFieldRows = pivotFieldRows; return this; }

    public List<Integer> getPivotFieldColumns() { return pivotFieldColumns; }
    public PivotTableOperateParameter setPivotFieldColumns(List<Integer> pivotFieldColumns) { this.pivotFieldColumns = pivotFieldColumns; return this; }

    public List<Integer> getPivotFieldData() { return pivotFieldData; }
    public PivotTableOperateParameter setPivotFieldData(List<Integer> pivotFieldData) { this.pivotFieldData = pivotFieldData; return this; }

    public String getOperateType() { return operateType; }
    public PivotTableOperateParameter setOperateType(String operateType) { this.operateType = operateType; return this; }

}
