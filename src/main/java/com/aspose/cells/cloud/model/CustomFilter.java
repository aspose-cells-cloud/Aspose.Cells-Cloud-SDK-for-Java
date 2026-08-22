package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CustomFilter — Represents the custom filter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomFilter {
    /** Gets and sets the criteria. */
    @JsonProperty("Criteria")
    private Object criteria;

    /** Gets and sets the filter operator type. */
    @JsonProperty("FilterOperatorType")
    private String filterOperatorType;

    public Object getCriteria() { return criteria; }
    public CustomFilter setCriteria(Object criteria) { this.criteria = criteria; return this; }

    public String getFilterOperatorType() { return filterOperatorType; }
    public CustomFilter setFilterOperatorType(String filterOperatorType) { this.filterOperatorType = filterOperatorType; return this; }

}
