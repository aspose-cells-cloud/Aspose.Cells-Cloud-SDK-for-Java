package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LoadData — Loading data information. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoadData {
    /** Indicates begin position for loading data. */
    @JsonProperty("LoadTo")
    private LoadTo loadTo;

    /** Indicates data query for data loading. */
    @JsonProperty("DataQuery")
    private DataQuery dataQuery;

    public LoadTo getLoadTo() { return loadTo; }
    public LoadData setLoadTo(LoadTo loadTo) { this.loadTo = loadTo; return this; }

    public DataQuery getDataQuery() { return dataQuery; }
    public LoadData setDataQuery(DataQuery dataQuery) { this.dataQuery = dataQuery; return this; }

}
