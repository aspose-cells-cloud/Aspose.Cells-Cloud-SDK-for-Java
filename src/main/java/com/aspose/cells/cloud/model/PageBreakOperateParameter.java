package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PageBreakOperateParameter — Represents page break operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageBreakOperateParameter extends OperateParameter {
    /** Represents page break type. */
    @JsonProperty("PageBreakType")
    private String pageBreakType;

    /** Represents page break index. */
    @JsonProperty("Index")
    private Integer index;

    /** Represents row index of page break. */
    @JsonProperty("Row")
    private Integer row;

    /** Represents column index of page break. */
    @JsonProperty("Column")
    private Integer column;

    /** Represents start row index of page break. */
    @JsonProperty("StartIndex")
    private Integer startIndex;

    /** Represents end row index of page break. */
    @JsonProperty("EndIndex")
    private Integer endIndex;

    public String getPageBreakType() { return pageBreakType; }
    public PageBreakOperateParameter setPageBreakType(String pageBreakType) { this.pageBreakType = pageBreakType; return this; }

    public Integer getIndex() { return index; }
    public PageBreakOperateParameter setIndex(Integer index) { this.index = index; return this; }

    public Integer getRow() { return row; }
    public PageBreakOperateParameter setRow(Integer row) { this.row = row; return this; }

    public Integer getColumn() { return column; }
    public PageBreakOperateParameter setColumn(Integer column) { this.column = column; return this; }

    public Integer getStartIndex() { return startIndex; }
    public PageBreakOperateParameter setStartIndex(Integer startIndex) { this.startIndex = startIndex; return this; }

    public Integer getEndIndex() { return endIndex; }
    public PageBreakOperateParameter setEndIndex(Integer endIndex) { this.endIndex = endIndex; return this; }


    /** Covariant override: keeps fluent chains returning PageBreakOperateParameter. */
    @Override public PageBreakOperateParameter setOperateType(String operateType) { return (PageBreakOperateParameter) super.setOperateType(operateType); }

}
