package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RemoveCharactersOptions — Class summary: The class features discussing effective communication strategies, developing problem-solving skills, and increasing self-awareness for personal growth. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RemoveCharactersOptions extends BaseOperateOptions {
    /** Name property with a getter and setter override that returns a string. */
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

    /** Gets or sets RemoveCharactersByCharacter. */
    @JsonProperty("RemoveCharactersByCharacter")
    private RemoveCharactersByCharacter removeCharactersByCharacter;

    /** Gets or sets RemoveCharactersByPosition. */
    @JsonProperty("RemoveCharactersByPosition")
    private RemoveCharactersByPosition removeCharactersByPosition;

    public String getName() { return name; }
    public RemoveCharactersOptions setName(String name) { this.name = name; return this; }

    public DataSource getDataSource() { return dataSource; }
    public RemoveCharactersOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public RemoveCharactersOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public ScopeOptions getScopeOptions() { return scopeOptions; }
    public RemoveCharactersOptions setScopeOptions(ScopeOptions scopeOptions) { this.scopeOptions = scopeOptions; return this; }

    public RemoveCharactersByCharacter getRemoveCharactersByCharacter() { return removeCharactersByCharacter; }
    public RemoveCharactersOptions setRemoveCharactersByCharacter(RemoveCharactersByCharacter removeCharactersByCharacter) { this.removeCharactersByCharacter = removeCharactersByCharacter; return this; }

    public RemoveCharactersByPosition getRemoveCharactersByPosition() { return removeCharactersByPosition; }
    public RemoveCharactersOptions setRemoveCharactersByPosition(RemoveCharactersByPosition removeCharactersByPosition) { this.removeCharactersByPosition = removeCharactersByPosition; return this; }

}
