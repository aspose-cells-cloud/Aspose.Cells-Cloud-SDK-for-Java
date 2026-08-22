package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataItem — Represents data item. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataItem {
    /** Represents data item type. */
    @JsonProperty("DataItemType")
    private String dataItemType;

    /** Represents data item value. */
    @JsonProperty("Value")
    private String value;

    public String getDataItemType() { return dataItemType; }
    public DataItem setDataItemType(String dataItemType) { this.dataItemType = dataItemType; return this; }

    public String getValue() { return value; }
    public DataItem setValue(String value) { this.value = value; return this; }

}
