package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ImportStringArrayOption — I'm happy to help! Could you please provide me with the features you would like me to summarize for the class? */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportStringArrayOption extends ImportOption {
    /** A property named "FirstRow" of type integer with both a getter and a setter is defined in the class. */
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
    private List<String> data;

    public Integer getFirstRow() { return firstRow; }
    public ImportStringArrayOption setFirstRow(Integer firstRow) { this.firstRow = firstRow; return this; }

    public Integer getFirstColumn() { return firstColumn; }
    public ImportStringArrayOption setFirstColumn(Integer firstColumn) { this.firstColumn = firstColumn; return this; }

    public Boolean getIsVertical() { return isVertical; }
    public ImportStringArrayOption setIsVertical(Boolean isVertical) { this.isVertical = isVertical; return this; }

    public List<String> getData() { return data; }
    public ImportStringArrayOption setData(List<String> data) { this.data = data; return this; }


    /** Covariant override: keeps fluent chains returning ImportStringArrayOption. */
    @Override public ImportStringArrayOption setDestinationWorksheet(String destinationWorksheet) { return (ImportStringArrayOption) super.setDestinationWorksheet(destinationWorksheet); }
    /** Covariant override: keeps fluent chains returning ImportStringArrayOption. */
    @Override public ImportStringArrayOption setIsInsert(Boolean isInsert) { return (ImportStringArrayOption) super.setIsInsert(isInsert); }
    /** Covariant override: keeps fluent chains returning ImportStringArrayOption. */
    @Override public ImportStringArrayOption setImportDataType(String importDataType) { return (ImportStringArrayOption) super.setImportDataType(importDataType); }
    /** Covariant override: keeps fluent chains returning ImportStringArrayOption. */
    @Override public ImportStringArrayOption setDataSource(DataSource dataSource) { return (ImportStringArrayOption) super.setDataSource(dataSource); }
    /** Covariant override: keeps fluent chains returning ImportStringArrayOption. */
    @Override public ImportStringArrayOption setSource(FileSource source) { return (ImportStringArrayOption) super.setSource(source); }

}
