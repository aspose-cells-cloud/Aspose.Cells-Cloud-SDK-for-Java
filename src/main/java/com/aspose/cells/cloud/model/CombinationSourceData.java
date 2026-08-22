package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CombinationSourceData model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CombinationSourceData {
    /** Gets or sets Tag. */
    @JsonProperty("Tag")
    private String tag;

    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Gets or sets FileInfo. */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Gets or sets Worksheet. */
    @JsonProperty("Worksheet")
    private String worksheet;

    /** Gets or sets TableName. */
    @JsonProperty("TableName")
    private String tableName;

    /** Gets or sets CellArea. */
    @JsonProperty("CellArea")
    private String cellArea;

    /** Gets or sets HasHeader. */
    @JsonProperty("HasHeader")
    private Boolean hasHeader;

    public String getTag() { return tag; }
    public CombinationSourceData setTag(String tag) { this.tag = tag; return this; }

    public DataSource getDataSource() { return dataSource; }
    public CombinationSourceData setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public CombinationSourceData setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getWorksheet() { return worksheet; }
    public CombinationSourceData setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

    public String getTableName() { return tableName; }
    public CombinationSourceData setTableName(String tableName) { this.tableName = tableName; return this; }

    public String getCellArea() { return cellArea; }
    public CombinationSourceData setCellArea(String cellArea) { this.cellArea = cellArea; return this; }

    public Boolean getHasHeader() { return hasHeader; }
    public CombinationSourceData setHasHeader(Boolean hasHeader) { this.hasHeader = hasHeader; return this; }

}
