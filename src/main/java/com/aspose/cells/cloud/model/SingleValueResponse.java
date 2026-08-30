package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SingleValueResponse — Represents the SingleValue Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SingleValueResponse extends CellsCloudResponse {
    /** A property named "Value" of type "SingleValue" that can be accessed and modified is declared in the class. */
    @JsonProperty("Value")
    private SingleValue value;

    public SingleValue getValue() { return value; }
    public SingleValueResponse setValue(SingleValue value) { this.value = value; return this; }


    /** Covariant override: keeps fluent chains returning SingleValueResponse. */
    @Override public SingleValueResponse setCode(Integer code) { return (SingleValueResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SingleValueResponse. */
    @Override public SingleValueResponse setStatus(String status) { return (SingleValueResponse) super.setStatus(status); }

}
