package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataSource — Represents data source. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSource {
    /** Represents data source type. */
    @JsonProperty("DataSourceType")
    private String dataSourceType;

    /** Represents data path. */
    @JsonProperty("DataPath")
    private String dataPath;

    public String getDataSourceType() { return dataSourceType; }
    public DataSource setDataSourceType(String dataSourceType) { this.dataSourceType = dataSourceType; return this; }

    public String getDataPath() { return dataPath; }
    public DataSource setDataPath(String dataPath) { this.dataPath = dataPath; return this; }

}
