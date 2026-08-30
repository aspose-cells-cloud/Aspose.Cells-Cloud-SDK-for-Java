package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Import2DimensionStringArrayOption — I'm eager to assist you! Please provide me with the features you would like me to summarize into one sentence for your class summary. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Import2DimensionStringArrayOption extends ImportOption {
    /** This class has a property called FirstRow of type integer with a public getter and setter. */
    @JsonProperty("FirstRow")
    private Integer firstRow;

    /** Gets or sets FirstColumn. */
    @JsonProperty("FirstColumn")
    private Integer firstColumn;

    /** Gets or sets Data. */
    @JsonProperty("Data")
    private List<String> data;

    public Integer getFirstRow() { return firstRow; }
    public Import2DimensionStringArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public Import2DimensionStringArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public List<String> getData() { return data; }
    public Import2DimensionStringArrayOption setData(List<String> data) { this.data = data; return this; }


    /** Covariant override: keeps fluent chains returning Import2DimensionStringArrayOption. */
    @Override public Import2DimensionStringArrayOption setDestinationWorksheet(String destinationWorksheet) { return (Import2DimensionStringArrayOption) super.setDestinationWorksheet(destinationWorksheet); }
    /** Covariant override: keeps fluent chains returning Import2DimensionStringArrayOption. */
    @Override public Import2DimensionStringArrayOption setIsInsert(Boolean isInsert) { return (Import2DimensionStringArrayOption) super.setIsInsert(isInsert); }
    /** Covariant override: keeps fluent chains returning Import2DimensionStringArrayOption. */
    @Override public Import2DimensionStringArrayOption setImportDataType(String importDataType) { return (Import2DimensionStringArrayOption) super.setImportDataType(importDataType); }
    /** Covariant override: keeps fluent chains returning Import2DimensionStringArrayOption. */
    @Override public Import2DimensionStringArrayOption setDataSource(DataSource dataSource) { return (Import2DimensionStringArrayOption) super.setDataSource(dataSource); }
    /** Covariant override: keeps fluent chains returning Import2DimensionStringArrayOption. */
    @Override public Import2DimensionStringArrayOption setSource(FileSource source) { return (Import2DimensionStringArrayOption) super.setSource(source); }

}
