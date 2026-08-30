package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SparklineGroupResponse — Represents the SparklineGroup Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SparklineGroupResponse extends CellsCloudResponse {
    /** A property that allows access to a Sparkline group containing multiple Sparkline objects. */
    @JsonProperty("SparklineGroup")
    private SparklineGroup sparklineGroup;

    public SparklineGroup getSparklineGroup() { return sparklineGroup; }
    public SparklineGroupResponse setSparklineGroup(SparklineGroup sparklineGroup) { this.sparklineGroup = sparklineGroup; return this; }


    /** Covariant override: keeps fluent chains returning SparklineGroupResponse. */
    @Override public SparklineGroupResponse setCode(Integer code) { return (SparklineGroupResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SparklineGroupResponse. */
    @Override public SparklineGroupResponse setStatus(String status) { return (SparklineGroupResponse) super.setStatus(status); }

}
