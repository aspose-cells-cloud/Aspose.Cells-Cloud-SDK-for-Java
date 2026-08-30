package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConditionalFormattingResponse — Represents the ConditionalFormatting Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalFormattingResponse extends CellsCloudResponse {
    /** This class has a property named ConditionalFormatting of type ConditionalFormatting that can be accessed and modified. */
    @JsonProperty("ConditionalFormatting")
    private ConditionalFormatting conditionalFormatting;

    public ConditionalFormatting getConditionalFormatting() { return conditionalFormatting; }
    public ConditionalFormattingResponse setConditionalFormatting(ConditionalFormatting conditionalFormatting) { this.conditionalFormatting = conditionalFormatting; return this; }


    /** Covariant override: keeps fluent chains returning ConditionalFormattingResponse. */
    @Override public ConditionalFormattingResponse setCode(Integer code) { return (ConditionalFormattingResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ConditionalFormattingResponse. */
    @Override public ConditionalFormattingResponse setStatus(String status) { return (ConditionalFormattingResponse) super.setStatus(status); }

}
