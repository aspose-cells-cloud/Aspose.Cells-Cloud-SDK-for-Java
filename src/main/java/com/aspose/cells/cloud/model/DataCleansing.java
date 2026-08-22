package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DataCleansing — Represents data cleansing. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataCleansing {
    /** A property named "Ranges" of type IList Range with a default value of an empty List of Range objects. */
    @JsonProperty("Ranges")
    private List<Range> ranges;

    /** Represents whether the data needs to be populated. */
    @JsonProperty("NeedFillData")
    private Boolean needFillData;

    /** Represents data fill. */
    @JsonProperty("DataFill")
    private DataFill dataFill;

    public List<Range> getRanges() { return ranges; }
    public DataCleansing setRanges(List<Range> ranges) { this.ranges = ranges; return this; }

    public Boolean getNeedFillData() { return needFillData; }
    public DataCleansing setNeedFillData(Boolean needFillData) { this.needFillData = needFillData; return this; }

    public DataFill getDataFill() { return dataFill; }
    public DataCleansing setDataFill(DataFill dataFill) { this.dataFill = dataFill; return this; }

}
