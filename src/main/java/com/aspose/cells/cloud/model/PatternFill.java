package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PatternFill — Encapsulates the object that represents pattern fill format */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PatternFill {
    /** Gets or sets the fill pattern type */
    @JsonProperty("Pattern")
    private String pattern;

    /** Gets and sets the foreground  object. */
    @JsonProperty("BackgroundCellsColor")
    private CellsColor backgroundCellsColor;

    /** Gets and sets the foreground  object. */
    @JsonProperty("ForegroundCellsColor")
    private CellsColor foregroundCellsColor;

    /** Gets or sets the foreground . */
    @JsonProperty("ForegroundColor")
    private Color foregroundColor;

    /** Gets or sets the background  of the . */
    @JsonProperty("BackgroundColor")
    private Color backgroundColor;

    /** Gets or sets the transparency of background color. */
    @JsonProperty("BackTransparency")
    private Double backTransparency;

    /** Gets or sets the transparency of foreground color. */
    @JsonProperty("ForeTransparency")
    private Double foreTransparency;

    public String getPattern() { return pattern; }
    public PatternFill setPattern(String pattern) { this.pattern = pattern; return this; }

    public CellsColor getBackgroundCellsColor() { return backgroundCellsColor; }
    public PatternFill setBackgroundCellsColor(CellsColor backgroundCellsColor) { this.backgroundCellsColor = backgroundCellsColor; return this; }

    public CellsColor getForegroundCellsColor() { return foregroundCellsColor; }
    public PatternFill setForegroundCellsColor(CellsColor foregroundCellsColor) { this.foregroundCellsColor = foregroundCellsColor; return this; }

    public Color getForegroundColor() { return foregroundColor; }
    public PatternFill setForegroundColor(Color foregroundColor) { this.foregroundColor = foregroundColor; return this; }

    public Color getBackgroundColor() { return backgroundColor; }
    public PatternFill setBackgroundColor(Color backgroundColor) { this.backgroundColor = backgroundColor; return this; }

    public Double getBackTransparency() { return backTransparency; }
    public PatternFill setBackTransparency(Double backTransparency) { this.backTransparency = backTransparency; return this; }

    public Double getForeTransparency() { return foreTransparency; }
    public PatternFill setForeTransparency(Double foreTransparency) { this.foreTransparency = foreTransparency; return this; }

}
