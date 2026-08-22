package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ThemeColor — Represents a theme color. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ThemeColor {
    /** Gets and sets the theme type. */
    @JsonProperty("ColorType")
    private String colorType;

    /** Gets and sets the tint value. */
    @JsonProperty("Tint")
    private Double tint;

    public String getColorType() { return colorType; }
    public ThemeColor setColorType(String colorType) { this.colorType = colorType; return this; }

    public Double getTint() { return tint; }
    public ThemeColor setTint(Double tint) { this.tint = tint; return this; }

}
