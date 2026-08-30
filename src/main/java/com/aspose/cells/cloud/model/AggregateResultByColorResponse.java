package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AggregateResultByColorResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AggregateResultByColorResponse extends CellsCloudResponse {
    /** Gets or sets AggregateResults. */
    @JsonProperty("AggregateResults")
    private List<AggregateResultByColor> aggregateResults;

    public List<AggregateResultByColor> getAggregateResults() { return aggregateResults; }
    public AggregateResultByColorResponse setAggregateResults(List<AggregateResultByColor> aggregateResults) { this.aggregateResults = aggregateResults; return this; }


    /** Covariant override: keeps fluent chains returning AggregateResultByColorResponse. */
    @Override public AggregateResultByColorResponse setCode(Integer code) { return (AggregateResultByColorResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning AggregateResultByColorResponse. */
    @Override public AggregateResultByColorResponse setStatus(String status) { return (AggregateResultByColorResponse) super.setStatus(status); }

}
