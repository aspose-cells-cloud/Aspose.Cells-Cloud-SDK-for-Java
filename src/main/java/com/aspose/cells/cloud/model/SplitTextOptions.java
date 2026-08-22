package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SplitTextOptions — Appliance features: 1. Automatic defrost system 2. Energy-efficient LED lighting 3. Adjustable glass shelves 4. Ice and water dispenser with filtration system */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SplitTextOptions extends BaseOperateOptions {
    /** The property "Name" is a publicly accessible and overridable property of type string in the class. */
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

    /** Gets or sets SplitDelimitersType. */
    @JsonProperty("SplitDelimitersType")
    private String splitDelimitersType;

    /** Gets or sets CustomDelimiter. */
    @JsonProperty("CustomDelimiter")
    private String customDelimiter;

    /** Gets or sets KeepDelimitersInResultingCells. */
    @JsonProperty("KeepDelimitersInResultingCells")
    private Boolean keepDelimitersInResultingCells;

    /** Gets or sets KeepDelimitersPosition. */
    @JsonProperty("KeepDelimitersPosition")
    private String keepDelimitersPosition;

    /** Gets or sets HowToSplit. */
    @JsonProperty("HowToSplit")
    private String howToSplit;

    public String getName() { return name; }
    public SplitTextOptions setName(String name) { this.name = name; return this; }

    public DataSource getDataSource() { return dataSource; }
    public SplitTextOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public SplitTextOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getWorksheet() { return worksheet; }
    public SplitTextOptions setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

    public String getRange() { return range; }
    public SplitTextOptions setRange(String range) { this.range = range; return this; }

    public String getSplitDelimitersType() { return splitDelimitersType; }
    public SplitTextOptions setSplitDelimitersType(String splitDelimitersType) { this.splitDelimitersType = splitDelimitersType; return this; }

    public String getCustomDelimiter() { return customDelimiter; }
    public SplitTextOptions setCustomDelimiter(String customDelimiter) { this.customDelimiter = customDelimiter; return this; }

    public Boolean getKeepDelimitersInResultingCells() { return keepDelimitersInResultingCells; }
    public SplitTextOptions setKeepDelimitersInResultingCells(Boolean keepDelimitersInResultingCells) { this.keepDelimitersInResultingCells = keepDelimitersInResultingCells; return this; }

    public String getKeepDelimitersPosition() { return keepDelimitersPosition; }
    public SplitTextOptions setKeepDelimitersPosition(String keepDelimitersPosition) { this.keepDelimitersPosition = keepDelimitersPosition; return this; }

    public String getHowToSplit() { return howToSplit; }
    public SplitTextOptions setHowToSplit(String howToSplit) { this.howToSplit = howToSplit; return this; }

}
