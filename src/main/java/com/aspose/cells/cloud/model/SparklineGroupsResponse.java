package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SparklineGroupsResponse — Represents the SparklineGroups Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SparklineGroupsResponse extends CellsCloudResponse {
    /** This class has a property named "SparklineGroups" of type "SparklineGroups" for managing sparkline groups. */
    @JsonProperty("SparklineGroups")
    private SparklineGroups sparklineGroups;

    public SparklineGroups getSparklineGroups() { return sparklineGroups; }
    public SparklineGroupsResponse setSparklineGroups(SparklineGroups sparklineGroups) { this.sparklineGroups = sparklineGroups; return this; }


    /** Covariant override: keeps fluent chains returning SparklineGroupsResponse. */
    @Override public SparklineGroupsResponse setCode(Integer code) { return (SparklineGroupsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SparklineGroupsResponse. */
    @Override public SparklineGroupsResponse setStatus(String status) { return (SparklineGroupsResponse) super.setStatus(status); }

}
