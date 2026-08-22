package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WordCaseOptions — I'm here to assist you. Please provide the features you would like me to summarize for the class. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WordCaseOptions {
    /** Represents data source.  There are three types of data, they are CloudFileSystem, RequestFiles, HttpUri. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents file information. Include of filename, filesize, and file content(base64String). */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Gets or sets WordCaseType. */
    @JsonProperty("WordCaseType")
    private String wordCaseType;

    /** Gets or sets ScopeOptions. */
    @JsonProperty("ScopeOptions")
    private ScopeOptions scopeOptions;

    public DataSource getDataSource() { return dataSource; }
    public WordCaseOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public WordCaseOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getWordCaseType() { return wordCaseType; }
    public WordCaseOptions setWordCaseType(String wordCaseType) { this.wordCaseType = wordCaseType; return this; }

    public ScopeOptions getScopeOptions() { return scopeOptions; }
    public WordCaseOptions setScopeOptions(ScopeOptions scopeOptions) { this.scopeOptions = scopeOptions; return this; }

}
