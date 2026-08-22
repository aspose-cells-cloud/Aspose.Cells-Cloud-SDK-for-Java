package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ExtractTextOptions — I'm happy to help! Could you please provide me with the features you would like me to summarize for you? */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExtractTextOptions extends BaseOperateOptions {
    /** This class has a public property for storing and retrieving a name value. */
    @JsonProperty("Name")
    private String name;

    /** Represents data source.  There are three types of data, they are CloudFileSystem, RequestFiles, HttpUri. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents file information. Include of filename, filesize, and file content(base64String). */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Gets or sets Worksheet. */
    @JsonProperty("Worksheet")
    private String worksheet;

    /** Gets or sets Range. */
    @JsonProperty("Range")
    private String range;

    /** Gets or sets ExtractTextType. */
    @JsonProperty("ExtractTextType")
    private String extractTextType;

    /** Gets or sets BeforeText. */
    @JsonProperty("BeforeText")
    private String beforeText;

    /** Gets or sets AfterText. */
    @JsonProperty("AfterText")
    private String afterText;

    /** Gets or sets BeforePosition. */
    @JsonProperty("BeforePosition")
    private Integer beforePosition;

    /** Gets or sets AfterPosition. */
    @JsonProperty("AfterPosition")
    private Integer afterPosition;

    /** Gets or sets OutPositionRange. */
    @JsonProperty("OutPositionRange")
    private String outPositionRange;

    public String getName() { return name; }
    public ExtractTextOptions setName(String name) { this.name = name; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ExtractTextOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public ExtractTextOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getWorksheet() { return worksheet; }
    public ExtractTextOptions setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

    public String getRange() { return range; }
    public ExtractTextOptions setRange(String range) { this.range = range; return this; }

    public String getExtractTextType() { return extractTextType; }
    public ExtractTextOptions setExtractTextType(String extractTextType) { this.extractTextType = extractTextType; return this; }

    public String getBeforeText() { return beforeText; }
    public ExtractTextOptions setBeforeText(String beforeText) { this.beforeText = beforeText; return this; }

    public String getAfterText() { return afterText; }
    public ExtractTextOptions setAfterText(String afterText) { this.afterText = afterText; return this; }

    public Integer getBeforePosition() { return beforePosition; }
    public ExtractTextOptions setBeforePosition(Integer beforePosition) { this.beforePosition = beforePosition; return this; }

    public Integer getAfterPosition() { return afterPosition; }
    public ExtractTextOptions setAfterPosition(Integer afterPosition) { this.afterPosition = afterPosition; return this; }

    public String getOutPositionRange() { return outPositionRange; }
    public ExtractTextOptions setOutPositionRange(String outPositionRange) { this.outPositionRange = outPositionRange; return this; }

}
