package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ImportPictureOption — Class summary: The features of the topic were explored, discussing its components, patterns, and significance. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportPictureOption extends ImportOption {
    /** A property "UpperLeftRow" of type integer with a public getter and setter is defined. */
    @JsonProperty("UpperLeftRow")
    private Integer upperLeftRow;

    /** Gets or sets UpperLeftColumn. */
    @JsonProperty("UpperLeftColumn")
    private Integer upperLeftColumn;

    /** Gets or sets LowerRightRow. */
    @JsonProperty("LowerRightRow")
    private Integer lowerRightRow;

    /** Gets or sets LowerRightColumn. */
    @JsonProperty("LowerRightColumn")
    private Integer lowerRightColumn;

    /** Gets or sets Filename. */
    @JsonProperty("Filename")
    private String filename;

    /** base64 */
    @JsonProperty("Data")
    private String data;

    /** Gets or sets DestinationWorksheet. */
    @JsonProperty("DestinationWorksheet")
    private String destinationWorksheet;

    /** Gets or sets IsInsert. */
    @JsonProperty("IsInsert")
    private Boolean isInsert;

    /** Gets or sets ImportDataType. */
    @JsonProperty("ImportDataType")
    private String importDataType;

    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Gets or sets Source. */
    @JsonProperty("Source")
    private FileSource source;

    public Integer getUpperLeftRow() { return upperLeftRow; }
    public ImportPictureOption setUpperLeftRow(Integer upperLeftRow) { this.upperLeftRow = upperLeftRow; return this; }

    public Integer getUpperLeftColumn() { return upperLeftColumn; }
    public ImportPictureOption setUpperLeftColumn(Integer upperLeftColumn) { this.upperLeftColumn = upperLeftColumn; return this; }

    public Integer getLowerRightRow() { return lowerRightRow; }
    public ImportPictureOption setLowerRightRow(Integer lowerRightRow) { this.lowerRightRow = lowerRightRow; return this; }

    public Integer getLowerRightColumn() { return lowerRightColumn; }
    public ImportPictureOption setLowerRightColumn(Integer lowerRightColumn) { this.lowerRightColumn = lowerRightColumn; return this; }

    public String getFilename() { return filename; }
    public ImportPictureOption setFilename(String filename) { this.filename = filename; return this; }

    public String getData() { return data; }
    public ImportPictureOption setData(String data) { this.data = data; return this; }

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public ImportPictureOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public ImportPictureOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public ImportPictureOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ImportPictureOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public ImportPictureOption setSource(FileSource source) { this.source = source; return this; }

}
