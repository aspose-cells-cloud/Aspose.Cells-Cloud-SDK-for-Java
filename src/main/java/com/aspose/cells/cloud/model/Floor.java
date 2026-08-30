package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Floor — Encapsulates the object that represents the floor of a 3-D chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Floor extends Area {
    /** Gets or sets the border . */
    @JsonProperty("Border")
    private Line border;

    public Line getBorder() { return border; }
    public Floor setBorder(Line border) { this.border = border; return this; }


    /** Covariant override: keeps fluent chains returning Floor. */
    @Override public Floor setBackgroundColor(Color backgroundColor) { return (Floor) super.setBackgroundColor(backgroundColor); }
    /** Covariant override: keeps fluent chains returning Floor. */
    @Override public Floor setFillFormat(FillFormat fillFormat) { return (Floor) super.setFillFormat(fillFormat); }
    /** Covariant override: keeps fluent chains returning Floor. */
    @Override public Floor setForegroundColor(Color foregroundColor) { return (Floor) super.setForegroundColor(foregroundColor); }
    /** Covariant override: keeps fluent chains returning Floor. */
    @Override public Floor setFormat(String format) { return (Floor) super.setFormat(format); }
    /** Covariant override: keeps fluent chains returning Floor. */
    @Override public Floor setInvertIfNegative(Boolean invertIfNegative) { return (Floor) super.setInvertIfNegative(invertIfNegative); }
    /** Covariant override: keeps fluent chains returning Floor. */
    @Override public Floor setTransparency(Double transparency) { return (Floor) super.setTransparency(transparency); }

}
