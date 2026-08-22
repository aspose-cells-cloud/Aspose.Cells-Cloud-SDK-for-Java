package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SparklineGroupResponse — Represents the SparklineGroup Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SparklineGroupResponse extends CellsCloudResponse {
    /** A property that allows access to a Sparkline group containing multiple Sparkline objects. */
    @JsonProperty("SparklineGroup")
    private SparklineGroup sparklineGroup;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public SparklineGroup getSparklineGroup() { return sparklineGroup; }
    public SparklineGroupResponse setSparklineGroup(SparklineGroup sparklineGroup) { this.sparklineGroup = sparklineGroup; return this; }

    public Integer getCode() { return code; }
    public SparklineGroupResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public SparklineGroupResponse setStatus(String status) { this.status = status; return this; }

}
