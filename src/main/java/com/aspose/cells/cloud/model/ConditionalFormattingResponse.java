package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConditionalFormattingResponse — Represents the ConditionalFormatting Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalFormattingResponse extends CellsCloudResponse {
    /** This class has a property named ConditionalFormatting of type ConditionalFormatting that can be accessed and modified. */
    @JsonProperty("ConditionalFormatting")
    private ConditionalFormatting conditionalFormatting;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ConditionalFormatting getConditionalFormatting() { return conditionalFormatting; }
    public ConditionalFormattingResponse setConditionalFormatting(ConditionalFormatting conditionalFormatting) { this.conditionalFormatting = conditionalFormatting; return this; }

    public Integer getCode() { return code; }
    public ConditionalFormattingResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ConditionalFormattingResponse setStatus(String status) { this.status = status; return this; }

}
