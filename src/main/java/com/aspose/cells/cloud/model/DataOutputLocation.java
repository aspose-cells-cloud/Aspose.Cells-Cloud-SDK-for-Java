package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataOutputLocation model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataOutputLocation {
    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Gets or sets FileInfo. */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Gets or sets Worksheet. */
    @JsonProperty("Worksheet")
    private String worksheet;

    /** Gets or sets BeginRowIndex. */
    @JsonProperty("BeginRowIndex")
    private Integer beginRowIndex;

    /** Gets or sets BeginColumnIndex. */
    @JsonProperty("BeginColumnIndex")
    private Integer beginColumnIndex;

    public DataSource getDataSource() { return dataSource; }
    public DataOutputLocation setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public DataOutputLocation setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getWorksheet() { return worksheet; }
    public DataOutputLocation setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

    public Integer getBeginRowIndex() { return beginRowIndex; }
    public DataOutputLocation setBeginRowIndex(Integer beginRowIndex) { this.beginRowIndex = beginRowIndex; return this; }

    public Integer getBeginColumnIndex() { return beginColumnIndex; }
    public DataOutputLocation setBeginColumnIndex(Integer beginColumnIndex) { this.beginColumnIndex = beginColumnIndex; return this; }

}
