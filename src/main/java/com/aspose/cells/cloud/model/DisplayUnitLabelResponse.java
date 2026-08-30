package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DisplayUnitLabelResponse — Represents the DisplayUnitLabel Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DisplayUnitLabelResponse extends CellsCloudResponse {
    /** This property allows access to the display unit label for the class. */
    @JsonProperty("DisplayUnitLabel")
    private DisplayUnitLabel displayUnitLabel;

    public DisplayUnitLabel getDisplayUnitLabel() { return displayUnitLabel; }
    public DisplayUnitLabelResponse setDisplayUnitLabel(DisplayUnitLabel displayUnitLabel) { this.displayUnitLabel = displayUnitLabel; return this; }


    /** Covariant override: keeps fluent chains returning DisplayUnitLabelResponse. */
    @Override public DisplayUnitLabelResponse setCode(Integer code) { return (DisplayUnitLabelResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning DisplayUnitLabelResponse. */
    @Override public DisplayUnitLabelResponse setStatus(String status) { return (DisplayUnitLabelResponse) super.setStatus(status); }

}
