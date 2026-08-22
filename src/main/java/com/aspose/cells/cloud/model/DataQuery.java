package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataQuery — Data query. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataQuery {
    /** Define a name for data query. Unique identification. */
    @JsonProperty("Name")
    private String name;

    /** The specific data object type. When the value is File, DataItem is invalid. */
    @JsonProperty("DataSourceDataType")
    private String dataSourceDataType;

    /** Indicates the source of the mount data. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** When data souce is request files, FileInfo store the contents of the file. */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** The specific data object type and name. */
    @JsonProperty("DataItem")
    private DataItem dataItem;

    public String getName() { return name; }
    public DataQuery setName(String name) { this.name = name; return this; }

    public String getDataSourceDataType() { return dataSourceDataType; }
    public DataQuery setDataSourceDataType(String dataSourceDataType) { this.dataSourceDataType = dataSourceDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public DataQuery setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public DataQuery setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public DataItem getDataItem() { return dataItem; }
    public DataQuery setDataItem(DataItem dataItem) { this.dataItem = dataItem; return this; }

}
