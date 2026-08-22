package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SparklineGroups — Encapsulates a collection of Aspose.Cells.Charts.SparklineGroup objects. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SparklineGroups {
    /** Encapsulates a collection of Aspose.Cells.Charts.SparklineGroup objects. */
    @JsonProperty("SparklineGroupList")
    private List<SparklineGroup> sparklineGroupList;

    public List<SparklineGroup> getSparklineGroupList() { return sparklineGroupList; }
    public SparklineGroups setSparklineGroupList(List<SparklineGroup> sparklineGroupList) { this.sparklineGroupList = sparklineGroupList; return this; }

}
