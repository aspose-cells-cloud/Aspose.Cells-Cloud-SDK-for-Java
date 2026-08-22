package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DisplayUnitLabelResponse — Represents the DisplayUnitLabel Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisplayUnitLabelResponse extends CellsCloudResponse {
    /** This property allows access to the display unit label for the class. */
    @JsonProperty("DisplayUnitLabel")
    private DisplayUnitLabel displayUnitLabel;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public DisplayUnitLabel getDisplayUnitLabel() { return displayUnitLabel; }
    public DisplayUnitLabelResponse setDisplayUnitLabel(DisplayUnitLabel displayUnitLabel) { this.displayUnitLabel = displayUnitLabel; return this; }

    public Integer getCode() { return code; }
    public DisplayUnitLabelResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public DisplayUnitLabelResponse setStatus(String status) { this.status = status; return this; }

}
