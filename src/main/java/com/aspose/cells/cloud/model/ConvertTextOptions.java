package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConvertTextOptions — Class summary: The features of the new smartphone include a high-resolution display, multiple camera lenses for versatile photography, a fast processor for seamless performance, and a larger battery for extended usage time. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConvertTextOptions extends BaseOperateOptions {
    /** The class has a public property called "Name" of type string that can be accessed and modified. */
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

    /** Gets or sets ConvertTextType. */
    @JsonProperty("ConvertTextType")
    private String convertTextType;

    /** Gets or sets SourceCharacters. */
    @JsonProperty("SourceCharacters")
    private String sourceCharacters;

    /** Gets or sets TargetCharacters. */
    @JsonProperty("TargetCharacters")
    private String targetCharacters;

    public String getName() { return name; }
    public ConvertTextOptions setName(String name) { this.name = name; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ConvertTextOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public ConvertTextOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public ScopeOptions getScopeOptions() { return scopeOptions; }
    public ConvertTextOptions setScopeOptions(ScopeOptions scopeOptions) { this.scopeOptions = scopeOptions; return this; }

    public String getConvertTextType() { return convertTextType; }
    public ConvertTextOptions setConvertTextType(String convertTextType) { this.convertTextType = convertTextType; return this; }

    public String getSourceCharacters() { return sourceCharacters; }
    public ConvertTextOptions setSourceCharacters(String sourceCharacters) { this.sourceCharacters = sourceCharacters; return this; }

    public String getTargetCharacters() { return targetCharacters; }
    public ConvertTextOptions setTargetCharacters(String targetCharacters) { this.targetCharacters = targetCharacters; return this; }

}
