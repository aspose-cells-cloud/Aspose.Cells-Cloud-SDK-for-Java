package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ColorFilterRequest — Indicates color filter request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColorFilterRequest {
    /** Gets or sets the fill pattern type */
    @JsonProperty("Pattern")
    private String pattern;

    /** Foreground color */
    @JsonProperty("ForegroundColor")
    private CellsColor foregroundColor;

    /** Background color */
    @JsonProperty("BackgroundColor")
    private CellsColor backgroundColor;

    public String getPattern() { return pattern; }
    public ColorFilterRequest setPattern(String pattern) { this.pattern = pattern; return this; }

    public CellsColor getForegroundColor() { return foregroundColor; }
    public ColorFilterRequest setForegroundColor(CellsColor foregroundColor) { this.foregroundColor = foregroundColor; return this; }

    public CellsColor getBackgroundColor() { return backgroundColor; }
    public ColorFilterRequest setBackgroundColor(CellsColor backgroundColor) { this.backgroundColor = backgroundColor; return this; }

}
