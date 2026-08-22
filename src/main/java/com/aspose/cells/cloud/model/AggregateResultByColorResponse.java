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

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public List<AggregateResultByColor> getAggregateResults() { return aggregateResults; }
    public AggregateResultByColorResponse setAggregateResults(List<AggregateResultByColor> aggregateResults) { this.aggregateResults = aggregateResults; return this; }

    public Integer getCode() { return code; }
    public AggregateResultByColorResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public AggregateResultByColorResponse setStatus(String status) { this.status = status; return this; }

}
