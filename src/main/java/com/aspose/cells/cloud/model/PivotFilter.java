package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PivotFilter — Represents a PivotFilter in PivotFilter Collection. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PivotFilter {
    /** Gets the autofilter of the pivot filter. */
    @JsonProperty("AutoFilter")
    private AutoFilter autoFilter;

    /** Gets the Evaluation Order of the pivot filter. */
    @JsonProperty("EvaluationOrder")
    private Integer evaluationOrder;

    /** Gets the field index of the pivot filter. */
    @JsonProperty("FieldIndex")
    private Integer fieldIndex;

    /** Gets the autofilter type of the pivot filter. */
    @JsonProperty("FilterType")
    private String filterType;

    /** Gets the measure field index of the pivot filter. */
    @JsonProperty("ValueFieldIndex")
    private Integer valueFieldIndex;

    /** Gets the member property field index of the pivot filter. */
    @JsonProperty("MemberPropertyFieldIndex")
    private Integer memberPropertyFieldIndex;

    /** Gets the name of the pivot filter. */
    @JsonProperty("Name")
    private String name;

    /** Gets the string value1 of the label pivot filter. */
    @JsonProperty("Value1")
    private String value1;

    /** Gets the string value2 of the label pivot filter. */
    @JsonProperty("Value2")
    private String value2;

    /** A property that allows for setting and getting a Top10Filter object for filtering data. */
    @JsonProperty("Top10Filter")
    private Top10Filter top10Filter;

    public AutoFilter getAutoFilter() { return autoFilter; }
    public PivotFilter setAutoFilter(AutoFilter autoFilter) { this.autoFilter = autoFilter; return this; }

    public Integer getEvaluationOrder() { return evaluationOrder; }
    public PivotFilter setEvaluationOrder(Integer evaluationOrder) { this.evaluationOrder = evaluationOrder; return this; }

    public Integer getFieldIndex() { return fieldIndex; }
    public PivotFilter setFieldIndex(Integer fieldIndex) { this.fieldIndex = fieldIndex; return this; }

    public String getFilterType() { return filterType; }
    public PivotFilter setFilterType(String filterType) { this.filterType = filterType; return this; }

    public Integer getValueFieldIndex() { return valueFieldIndex; }
    public PivotFilter setValueFieldIndex(Integer valueFieldIndex) { this.valueFieldIndex = valueFieldIndex; return this; }

    public Integer getMemberPropertyFieldIndex() { return memberPropertyFieldIndex; }
    public PivotFilter setMemberPropertyFieldIndex(Integer memberPropertyFieldIndex) { this.memberPropertyFieldIndex = memberPropertyFieldIndex; return this; }

    public String getName() { return name; }
    public PivotFilter setName(String name) { this.name = name; return this; }

    public String getValue1() { return value1; }
    public PivotFilter setValue1(String value1) { this.value1 = value1; return this; }

    public String getValue2() { return value2; }
    public PivotFilter setValue2(String value2) { this.value2 = value2; return this; }

    public Top10Filter getTop10Filter() { return top10Filter; }
    public PivotFilter setTop10Filter(Top10Filter top10Filter) { this.top10Filter = top10Filter; return this; }

}
