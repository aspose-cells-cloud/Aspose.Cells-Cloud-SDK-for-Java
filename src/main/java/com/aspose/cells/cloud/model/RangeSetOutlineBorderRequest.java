package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RangeSetOutlineBorderRequest — Indicates range set outline border request. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RangeSetOutlineBorderRequest {
    /** Encapsulates the object that represents a range of cells within a spreadsheet. */
    @JsonProperty("Range")
    private Range range;

    /** LeftBorder, RightBorder, TopBorder, BottomBorder, DiagonalDown, DiagonalUp, Vertical and Horizontal. */
    @JsonProperty("borderEdge")
    private String borderEdge;

    /** None, Thin, Medium, Dashed, Dotted, Thick, Double, Hair, MediumDashed, DashDot, MediumDashDot, DashDotDot, MediumDashDotDot and SlantedDashDot. */
    @JsonProperty("borderStyle")
    private String borderStyle;

    /** Border color. */
    @JsonProperty("borderColor")
    private Color borderColor;

    public Range getRange() { return range; }
    public RangeSetOutlineBorderRequest setRange(Range range) { this.range = range; return this; }

    public String getBorderEdge() { return borderEdge; }
    public RangeSetOutlineBorderRequest setBorderEdge(String borderEdge) { this.borderEdge = borderEdge; return this; }

    public String getBorderStyle() { return borderStyle; }
    public RangeSetOutlineBorderRequest setBorderStyle(String borderStyle) { this.borderStyle = borderStyle; return this; }

    public Color getBorderColor() { return borderColor; }
    public RangeSetOutlineBorderRequest setBorderColor(Color borderColor) { this.borderColor = borderColor; return this; }

}
