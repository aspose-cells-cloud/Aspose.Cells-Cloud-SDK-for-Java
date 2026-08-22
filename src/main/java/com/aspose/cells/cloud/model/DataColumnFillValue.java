package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataColumnFillValue — Represents that the data column is populated with the specified value. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataColumnFillValue {
    /** Represents specified column index. */
    @JsonProperty("ColumnIndex")
    private Integer columnIndex;

    /** Represents specified data fill value. */
    @JsonProperty("DataFillValue")
    private DataFillValue dataFillValue;

    public Integer getColumnIndex() { return columnIndex; }
    public DataColumnFillValue setColumnIndex(Integer columnIndex) { this.columnIndex = columnIndex; return this; }

    public DataFillValue getDataFillValue() { return dataFillValue; }
    public DataColumnFillValue setDataFillValue(DataFillValue dataFillValue) { this.dataFillValue = dataFillValue; return this; }

}
