package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SingleValueResponse — Represents the SingleValue Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleValueResponse extends CellsCloudResponse {
    /** A property named "Value" of type "SingleValue" that can be accessed and modified is declared in the class. */
    @JsonProperty("Value")
    private SingleValue value;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public SingleValue getValue() { return value; }
    public SingleValueResponse setValue(SingleValue value) { this.value = value; return this; }

    public Integer getCode() { return code; }
    public SingleValueResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public SingleValueResponse setStatus(String status) { this.status = status; return this; }

}
