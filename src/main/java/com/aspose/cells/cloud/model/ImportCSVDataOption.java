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

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public ImportCSVDataOption setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public Boolean getIsInsert() { return isInsert; }
    public ImportCSVDataOption setIsInsert(Boolean isInsert) { this.isInsert = isInsert; return this; }

    public String getImportDataType() { return importDataType; }
    public ImportCSVDataOption setImportDataType(String importDataType) { this.importDataType = importDataType; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ImportCSVDataOption setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getSource() { return source; }
    public ImportCSVDataOption setSource(FileSource source) { this.source = source; return this; }

}
