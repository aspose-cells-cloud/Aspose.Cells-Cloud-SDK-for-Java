package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Import2DimensionIntArrayOption — I'm here to help! Please provide the features you'd like me to summarize. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Import2DimensionIntArrayOption extends ImportOption {
    /** This property allows getting and setting the value of the first row in a class. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets Data. */
    @JsonProperty("Data")
    private List<Integer> data;

    public Integer getFirstRow() { return firstRow; }
    public Import2DimensionIntArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public Import2DimensionIntArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public List<Integer> getData() { return data; }
    public Import2DimensionIntArrayOption setData(List<Integer> data) { this.data = data; return this; }


    /** Covariant override: keeps fluent chains returning Import2DimensionIntArrayOption. */
    @Override public Import2DimensionIntArrayOption setDestinationWorksheet(String destinationWorksheet) { return (Import2DimensionIntArrayOption) super.setDestinationWorksheet(destinationWorksheet); }
    /** Covariant override: keeps fluent chains returning Import2DimensionIntArrayOption. */
    @Override public Import2DimensionIntArrayOption setIsInsert(Boolean isInsert) { return (Import2DimensionIntArrayOption) super.setIsInsert(isInsert); }
    /** Covariant override: keeps fluent chains returning Import2DimensionIntArrayOption. */
    @Override public Import2DimensionIntArrayOption setImportDataType(String importDataType) { return (Import2DimensionIntArrayOption) super.setImportDataType(importDataType); }
    /** Covariant override: keeps fluent chains returning Import2DimensionIntArrayOption. */
    @Override public Import2DimensionIntArrayOption setDataSource(DataSource dataSource) { return (Import2DimensionIntArrayOption) super.setDataSource(dataSource); }
    /** Covariant override: keeps fluent chains returning Import2DimensionIntArrayOption. */
    @Override public Import2DimensionIntArrayOption setSource(FileSource source) { return (Import2DimensionIntArrayOption) super.setSource(source); }

}
