package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ImportDoubleArrayOption — Class summary: The features include grammar and spell check, word count, readability analysis, and style suggestions for improving writing. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportDoubleArrayOption extends ImportOption {
    /** This class has a public property named FirstRow of type integer with both get and set accessors. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets IsVertical. */
    @JsonProperty("IsVertical")
    private Boolean isVertical;

    /** Gets or sets Data. */
    @JsonProperty("Data")
    private List<Double> data;

    public Integer getFirstRow() { return firstRow; }
    public ImportDoubleArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public ImportDoubleArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public Boolean getIsVertical() { return isVertical; }
    public ImportDoubleArrayOption setIsVertical(Boolean isVertical) { this.isVertical = isVertical; return this; }

    public List<Double> getData() { return data; }
    public ImportDoubleArrayOption setData(List<Double> data) { this.data = data; return this; }


    /** Covariant override: keeps fluent chains returning ImportDoubleArrayOption. */
    @Override public ImportDoubleArrayOption setDestinationWorksheet(String destinationWorksheet) { return (ImportDoubleArrayOption) super.setDestinationWorksheet(destinationWorksheet); }
    /** Covariant override: keeps fluent chains returning ImportDoubleArrayOption. */
    @Override public ImportDoubleArrayOption setIsInsert(Boolean isInsert) { return (ImportDoubleArrayOption) super.setIsInsert(isInsert); }
    /** Covariant override: keeps fluent chains returning ImportDoubleArrayOption. */
    @Override public ImportDoubleArrayOption setImportDataType(String importDataType) { return (ImportDoubleArrayOption) super.setImportDataType(importDataType); }
    /** Covariant override: keeps fluent chains returning ImportDoubleArrayOption. */
    @Override public ImportDoubleArrayOption setDataSource(DataSource dataSource) { return (ImportDoubleArrayOption) super.setDataSource(dataSource); }
    /** Covariant override: keeps fluent chains returning ImportDoubleArrayOption. */
    @Override public ImportDoubleArrayOption setSource(FileSource source) { return (ImportDoubleArrayOption) super.setSource(source); }

}
