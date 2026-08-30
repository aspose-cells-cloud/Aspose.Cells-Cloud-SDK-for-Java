package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TickLabelsResponse — Represents the TickLabels Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TickLabelsResponse extends CellsCloudResponse {
    /** Property that represents tick labels for a class. */
    @JsonProperty("TickLabels")
    private TickLabels tickLabels;

    public TickLabels getTickLabels() { return tickLabels; }
    public TickLabelsResponse setTickLabels(TickLabels tickLabels) { this.tickLabels = tickLabels; return this; }


    /** Covariant override: keeps fluent chains returning TickLabelsResponse. */
    @Override public TickLabelsResponse setCode(Integer code) { return (TickLabelsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning TickLabelsResponse. */
    @Override public TickLabelsResponse setStatus(String status) { return (TickLabelsResponse) super.setStatus(status); }

}
