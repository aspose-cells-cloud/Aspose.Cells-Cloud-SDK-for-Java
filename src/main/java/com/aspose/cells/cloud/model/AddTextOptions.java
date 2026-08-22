package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AddTextOptions — Class summary: The features of this class include hands-on learning activities, group projects, interactive discussions, guest speakers, and field trips to real-world applications. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddTextOptions extends BaseOperateOptions {
    /** The class has a public property named "Name" with a getter and setter method. */
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

    /** Add text content. */
    @JsonProperty("Text")
    private String text;

    /** Represents where text should be inserted or selected in the spreadsheet. */
    @JsonProperty("SelectPoistion")
    private String selectPoistion;

    /** Selected text of cell where text should be inserted or selected in the spreadsheet. */
    @JsonProperty("SelectText")
    private String selectText;

    /** Indicates whether empty cells should be skipped during processing. */
    @JsonProperty("SkipEmptyCells")
    private Boolean skipEmptyCells;

    public String getName() { return name; }
    public AddTextOptions setName(String name) { this.name = name; return this; }

    public DataSource getDataSource() { return dataSource; }
    public AddTextOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public AddTextOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public ScopeOptions getScopeOptions() { return scopeOptions; }
    public AddTextOptions setScopeOptions(ScopeOptions scopeOptions) { this.scopeOptions = scopeOptions; return this; }

    public String getText() { return text; }
    public AddTextOptions setText(String text) { this.text = text; return this; }

    public String getSelectPoistion() { return selectPoistion; }
    public AddTextOptions setSelectPoistion(String selectPoistion) { this.selectPoistion = selectPoistion; return this; }

    public String getSelectText() { return selectText; }
    public AddTextOptions setSelectText(String selectText) { this.selectText = selectText; return this; }

    public Boolean getSkipEmptyCells() { return skipEmptyCells; }
    public AddTextOptions setSkipEmptyCells(Boolean skipEmptyCells) { this.skipEmptyCells = skipEmptyCells; return this; }

}
