package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TickLabelsResponse — Represents the TickLabels Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TickLabelsResponse extends CellsCloudResponse {
    /** Property that represents tick labels for a class. */
    @JsonProperty("TickLabels")
    private TickLabels tickLabels;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public TickLabels getTickLabels() { return tickLabels; }
    public TickLabelsResponse setTickLabels(TickLabels tickLabels) { this.tickLabels = tickLabels; return this; }

    public Integer getCode() { return code; }
    public TickLabelsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public TickLabelsResponse setStatus(String status) { this.status = status; return this; }

}
