package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConditionalFormattingsResponse — Represents the ConditionalFormattings Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalFormattingsResponse extends CellsCloudResponse {
    /** A property named ConditionalFormattings of type ConditionalFormattings is defined with both getter and setter methods in the class. */
    @JsonProperty("ConditionalFormattings")
    private ConditionalFormattings conditionalFormattings;

    public ConditionalFormattings getConditionalFormattings() { return conditionalFormattings; }
    public ConditionalFormattingsResponse setConditionalFormattings(ConditionalFormattings conditionalFormattings) { this.conditionalFormattings = conditionalFormattings; return this; }


    /** Covariant override: keeps fluent chains returning ConditionalFormattingsResponse. */
    @Override public ConditionalFormattingsResponse setCode(Integer code) { return (ConditionalFormattingsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ConditionalFormattingsResponse. */
    @Override public ConditionalFormattingsResponse setStatus(String status) { return (ConditionalFormattingsResponse) super.setStatus(status); }

}
