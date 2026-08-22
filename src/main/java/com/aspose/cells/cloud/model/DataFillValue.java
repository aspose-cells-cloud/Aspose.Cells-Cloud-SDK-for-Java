package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataFillValue — Represents that the data is populated with the specified value. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataFillValue {
    /** Represents default bool value. */
    @JsonProperty("DefaultBoolean")
    private Boolean defaultBoolean;

    /** Represents default string value. */
    @JsonProperty("DefaultString")
    private String defaultString;

    /** Represents default number value. */
    @JsonProperty("DefaultNumber")
    private Integer defaultNumber;

    /** Represents default double value. */
    @JsonProperty("DefaultDouble")
    private Double defaultDouble;

    /** Represents default date value. */
    @JsonProperty("DefaultDate")
    private String defaultDate;

    public Boolean getDefaultBoolean() { return defaultBoolean; }
    public DataFillValue setDefaultBoolean(Boolean defaultBoolean) { this.defaultBoolean = defaultBoolean; return this; }

    public String getDefaultString() { return defaultString; }
    public DataFillValue setDefaultString(String defaultString) { this.defaultString = defaultString; return this; }

    public Integer getDefaultNumber() { return defaultNumber; }
    public DataFillValue setDefaultNumber(Integer defaultNumber) { this.defaultNumber = defaultNumber; return this; }

    public Double getDefaultDouble() { return defaultDouble; }
    public DataFillValue setDefaultDouble(Double defaultDouble) { this.defaultDouble = defaultDouble; return this; }

    public String getDefaultDate() { return defaultDate; }
    public DataFillValue setDefaultDate(String defaultDate) { this.defaultDate = defaultDate; return this; }

}
