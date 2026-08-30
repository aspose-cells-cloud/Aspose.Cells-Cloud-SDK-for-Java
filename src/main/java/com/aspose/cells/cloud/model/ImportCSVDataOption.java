package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ImportCSVDataOption — I'm happy to help! Could you please provide me with the features you would like me to summarize into a class summary? */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportCSVDataOption extends ImportOption {
    /** A property named SeparatorString of type string that can be accessed and modified publicly. */
    @JsonProperty("SeparatorString")
    private String separatorString;

    /** Gets or sets ConvertNumericData. */
    @JsonProperty("ConvertNumericData")
    private Boolean convertNumericData;

    /** Gets or sets FirstRow. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets SourceFile. */
    @JsonProperty("SourceFile")
    private String sourceFile;

    /** Gets or sets CustomParsers. */
    @JsonProperty("CustomParsers")
    private List<CustomParserConfig> customParsers;

    public String getSeparatorString() { return separatorString; }
    public ImportCSVDataOption setSeparatorString(String separatorString) { this.separatorString = separatorString; return this; }

    public Boolean getConvertNumericData() { return convertNumericData; }
    public ImportCSVDataOption setConvertNumericData(Boolean convertNumericData) { this.convertNumericData = convertNumericData; return this; }

    public Integer getFirstRow() { return firstRow; }
    public ImportCSVDataOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public ImportCSVDataOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public String getSourceFile() { return sourceFile; }
    public ImportCSVDataOption setSourceFile(String sourceFile) { this.sourceFile = sourceFile; return this; }

    public List<CustomParserConfig> getCustomParsers() { return customParsers; }
    public ImportCSVDataOption setCustomParsers(List<CustomParserConfig> customParsers) { this.customParsers = customParsers; return this; }


    /** Covariant override: keeps fluent chains returning ImportCSVDataOption. */
    @Override public ImportCSVDataOption setDestinationWorksheet(String destinationWorksheet) { return (ImportCSVDataOption) super.setDestinationWorksheet(destinationWorksheet); }
    /** Covariant override: keeps fluent chains returning ImportCSVDataOption. */
    @Override public ImportCSVDataOption setIsInsert(Boolean isInsert) { return (ImportCSVDataOption) super.setIsInsert(isInsert); }
    /** Covariant override: keeps fluent chains returning ImportCSVDataOption. */
    @Override public ImportCSVDataOption setImportDataType(String importDataType) { return (ImportCSVDataOption) super.setImportDataType(importDataType); }
    /** Covariant override: keeps fluent chains returning ImportCSVDataOption. */
    @Override public ImportCSVDataOption setDataSource(DataSource dataSource) { return (ImportCSVDataOption) super.setDataSource(dataSource); }
    /** Covariant override: keeps fluent chains returning ImportCSVDataOption. */
    @Override public ImportCSVDataOption setSource(FileSource source) { return (ImportCSVDataOption) super.setSource(source); }

}
