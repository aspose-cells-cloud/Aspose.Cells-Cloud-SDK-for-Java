package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WordsCountOptions — Words Count Options */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WordsCountOptions {
    /** Represents data source.  There are three types of data, they are CloudFileSystem, RequestFiles, HttpUri. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents file information. Include of filename, filesize, and file content(base64String). */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    public DataSource getDataSource() { return dataSource; }
    public WordsCountOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public WordsCountOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

}
