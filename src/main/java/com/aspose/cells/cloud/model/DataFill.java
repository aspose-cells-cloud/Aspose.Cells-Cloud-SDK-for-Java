package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DataFill — Represents data filling. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataFill {
    /** Represents range of data filling. */
    @JsonProperty("Ranges")
    private List<Range> ranges;

    /** Represents that the data column is populated with the default value. */
    @JsonProperty("DataFillDefaultValue")
    private DataFillValue dataFillDefaultValue;

    /** Represents that the data column is populated with the specified value. */
    @JsonProperty("DataColumnFillValueList")
    private List<DataColumnFillValue> dataColumnFillValueList;

    public List<Range> getRanges() { return ranges; }
    public DataFill setRanges(List<Range> ranges) { this.ranges = ranges; return this; }

    public DataFillValue getDataFillDefaultValue() { return dataFillDefaultValue; }
    public DataFill setDataFillDefaultValue(DataFillValue dataFillDefaultValue) { this.dataFillDefaultValue = dataFillDefaultValue; return this; }

    public List<DataColumnFillValue> getDataColumnFillValueList() { return dataColumnFillValueList; }
    public DataFill setDataColumnFillValueList(List<DataColumnFillValue> dataColumnFillValueList) { this.dataColumnFillValueList = dataColumnFillValueList; return this; }

}
