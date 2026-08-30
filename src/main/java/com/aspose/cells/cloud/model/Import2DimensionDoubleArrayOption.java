package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Import2DimensionDoubleArrayOption — I can help summarize features, please provide the details you'd like me to summarize. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Import2DimensionDoubleArrayOption extends ImportOption {
    /** The class has a property named "FirstRow" of type integer with get and set accessors. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets Data. */
    @JsonProperty("Data")
    private List<Double> data;

    public Integer getFirstRow() { return firstRow; }
    public Import2DimensionDoubleArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public Import2DimensionDoubleArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public List<Double> getData() { return data; }
    public Import2DimensionDoubleArrayOption setData(List<Double> data) { this.data = data; return this; }


    /** Covariant override: keeps fluent chains returning Import2DimensionDoubleArrayOption. */
    @Override public Import2DimensionDoubleArrayOption setDestinationWorksheet(String destinationWorksheet) { return (Import2DimensionDoubleArrayOption) super.setDestinationWorksheet(destinationWorksheet); }
    /** Covariant override: keeps fluent chains returning Import2DimensionDoubleArrayOption. */
    @Override public Import2DimensionDoubleArrayOption setIsInsert(Boolean isInsert) { return (Import2DimensionDoubleArrayOption) super.setIsInsert(isInsert); }
    /** Covariant override: keeps fluent chains returning Import2DimensionDoubleArrayOption. */
    @Override public Import2DimensionDoubleArrayOption setImportDataType(String importDataType) { return (Import2DimensionDoubleArrayOption) super.setImportDataType(importDataType); }
    /** Covariant override: keeps fluent chains returning Import2DimensionDoubleArrayOption. */
    @Override public Import2DimensionDoubleArrayOption setDataSource(DataSource dataSource) { return (Import2DimensionDoubleArrayOption) super.setDataSource(dataSource); }
    /** Covariant override: keeps fluent chains returning Import2DimensionDoubleArrayOption. */
    @Override public Import2DimensionDoubleArrayOption setSource(FileSource source) { return (Import2DimensionDoubleArrayOption) super.setSource(source); }

}
