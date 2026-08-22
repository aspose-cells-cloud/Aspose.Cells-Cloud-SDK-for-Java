package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RemoveDuplicatesOptions — I'm here to help! Just let me know the features you would like me to summarize for you. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveDuplicatesOptions extends BaseOperateOptions {
    /** The class has a public property "Name" of type string that can be both read and written. */
    @JsonProperty("Name")
    private String name;

    /** Represents data source.  There are three types of data, they are CloudFileSystem, RequestFiles, HttpUri. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents file information. Include of filename, filesize, and file content(base64String). */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Specifies the range of cells within the worksheet where the spreadsheet operations will be performed. This parameter allows users to define the exact area to be processed, ensuring that operations are applied only to the designated cells. */
    @JsonProperty("ScopeOptions")
    private ScopeOptions scopeOptions;

    public String getName() { return name; }
    public RemoveDuplicatesOptions setName(String name) { this.name = name; return this; }

    public DataSource getDataSource() { return dataSource; }
    public RemoveDuplicatesOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public RemoveDuplicatesOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public ScopeOptions getScopeOptions() { return scopeOptions; }
    public RemoveDuplicatesOptions setScopeOptions(ScopeOptions scopeOptions) { this.scopeOptions = scopeOptions; return this; }

}
