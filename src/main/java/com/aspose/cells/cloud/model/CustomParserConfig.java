package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CustomParserConfig — I'm happy to help! Please provide me with the features you would like me to summarize for the class. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CustomParserConfig {
    /** Point Column */
    @JsonProperty("ColumnIndex")
    private Integer columnIndex;

    /** data parser method. ToDateTime ToString */
    @JsonProperty("ParseMethod")
    private String parseMethod;

    /** A property that allows storing and retrieving custom styling information for an object. */
    @JsonProperty("CustomStyle")
    private String customStyle;

    public Integer getColumnIndex() { return columnIndex; }
    public CustomParserConfig setColumnIndex(Integer columnIndex) { this.columnIndex = columnIndex; return this; }

    public String getParseMethod() { return parseMethod; }
    public CustomParserConfig setParseMethod(String parseMethod) { this.parseMethod = parseMethod; return this; }

    public String getCustomStyle() { return customStyle; }
    public CustomParserConfig setCustomStyle(String customStyle) { this.customStyle = customStyle; return this; }

}
