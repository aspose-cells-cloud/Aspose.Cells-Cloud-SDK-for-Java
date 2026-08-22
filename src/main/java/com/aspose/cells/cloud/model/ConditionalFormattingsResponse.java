package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConditionalFormattingsResponse — Represents the ConditionalFormattings Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalFormattingsResponse extends CellsCloudResponse {
    /** A property named ConditionalFormattings of type ConditionalFormattings is defined with both getter and setter methods in the class. */
    @JsonProperty("ConditionalFormattings")
    private ConditionalFormattings conditionalFormattings;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ConditionalFormattings getConditionalFormattings() { return conditionalFormattings; }
    public ConditionalFormattingsResponse setConditionalFormattings(ConditionalFormattings conditionalFormattings) { this.conditionalFormattings = conditionalFormattings; return this; }

    public Integer getCode() { return code; }
    public ConditionalFormattingsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ConditionalFormattingsResponse setStatus(String status) { this.status = status; return this; }

}
