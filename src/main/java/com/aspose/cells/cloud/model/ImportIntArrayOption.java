package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ImportIntArrayOption — I'm here to help! Just provide me with the features you'd like to summarize. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportIntArrayOption extends ImportOption {
    /** This class has a public property named "FirstRow" of type integer with both get and set accessors. */
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
    private List<Integer> data;

    public Integer getFirstRow() { return firstRow; }
    public ImportIntArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public ImportIntArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public Boolean getIsVertical() { return isVertical; }
    public ImportIntArrayOption setIsVertical(Boolean isVertical) { this.isVertical = isVertical; return this; }

    public List<Integer> getData() { return data; }
    public ImportIntArrayOption setData(List<Integer> data) { this.data = data; return this; }


    /** Covariant override: keeps fluent chains returning ImportIntArrayOption. */
    @Override public ImportIntArrayOption setDestinationWorksheet(String destinationWorksheet) { return (ImportIntArrayOption) super.setDestinationWorksheet(destinationWorksheet); }
    /** Covariant override: keeps fluent chains returning ImportIntArrayOption. */
    @Override public ImportIntArrayOption setIsInsert(Boolean isInsert) { return (ImportIntArrayOption) super.setIsInsert(isInsert); }
    /** Covariant override: keeps fluent chains returning ImportIntArrayOption. */
    @Override public ImportIntArrayOption setImportDataType(String importDataType) { return (ImportIntArrayOption) super.setImportDataType(importDataType); }
    /** Covariant override: keeps fluent chains returning ImportIntArrayOption. */
    @Override public ImportIntArrayOption setDataSource(DataSource dataSource) { return (ImportIntArrayOption) super.setDataSource(dataSource); }
    /** Covariant override: keeps fluent chains returning ImportIntArrayOption. */
    @Override public ImportIntArrayOption setSource(FileSource source) { return (ImportIntArrayOption) super.setSource(source); }

}
