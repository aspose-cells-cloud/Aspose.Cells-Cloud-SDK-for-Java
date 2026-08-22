package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SparklineGroupsResponse — Represents the SparklineGroups Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SparklineGroupsResponse extends CellsCloudResponse {
    /** This class has a property named "SparklineGroups" of type "SparklineGroups" for managing sparkline groups. */
    @JsonProperty("SparklineGroups")
    private SparklineGroups sparklineGroups;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public SparklineGroups getSparklineGroups() { return sparklineGroups; }
    public SparklineGroupsResponse setSparklineGroups(SparklineGroups sparklineGroups) { this.sparklineGroups = sparklineGroups; return this; }

    public Integer getCode() { return code; }
    public SparklineGroupsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public SparklineGroupsResponse setStatus(String status) { this.status = status; return this; }

}
