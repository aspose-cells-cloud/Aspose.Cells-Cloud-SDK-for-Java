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


    /** Covariant override: keeps fluent chains returning ImportPictureOption. */
    @Override public ImportPictureOption setDestinationWorksheet(String destinationWorksheet) { return (ImportPictureOption) super.setDestinationWorksheet(destinationWorksheet); }
    /** Covariant override: keeps fluent chains returning ImportPictureOption. */
    @Override public ImportPictureOption setIsInsert(Boolean isInsert) { return (ImportPictureOption) super.setIsInsert(isInsert); }
    /** Covariant override: keeps fluent chains returning ImportPictureOption. */
    @Override public ImportPictureOption setImportDataType(String importDataType) { return (ImportPictureOption) super.setImportDataType(importDataType); }
    /** Covariant override: keeps fluent chains returning ImportPictureOption. */
    @Override public ImportPictureOption setDataSource(DataSource dataSource) { return (ImportPictureOption) super.setDataSource(dataSource); }
    /** Covariant override: keeps fluent chains returning ImportPictureOption. */
    @Override public ImportPictureOption setSource(FileSource source) { return (ImportPictureOption) super.setSource(source); }

}
