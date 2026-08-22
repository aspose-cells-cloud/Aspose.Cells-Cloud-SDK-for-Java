package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ColorScale — Describe the ColorScale conditional formatting rule. This conditional formatting rule creates a gradated color scale on the cells. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ColorScale {
    /** Get or set this ColorScale's max value object. Cannot set null or CFValueObject with type FormatConditionValueType.Min to it. */
    @JsonProperty("MaxCfvo")
    private ConditionalFormattingValue maxCfvo;

    /** Get or set the gradient color for the maximum value in the range. */
    @JsonProperty("MaxColor")
    private Color maxColor;

    /** Get or set this ColorScale's mid value object. Cannot set CFValueObject with type FormatConditionValueType.Max or FormatConditionValueType.Min to it. */
    @JsonProperty("MidCfvo")
    private ConditionalFormattingValue midCfvo;

    /** Get or set the gradient color for the middle value in the range. */
    @JsonProperty("MidColor")
    private Color midColor;

    /** Get or set this ColorScale's min value object. Cannot set null or CFValueObject with type FormatConditionValueType.Max to it. */
    @JsonProperty("MinCfvo")
    private ConditionalFormattingValue minCfvo;

    /** Get or set the gradient color for the minimum value in the range. */
    @JsonProperty("MinColor")
    private Color minColor;

    public ConditionalFormattingValue getMaxCfvo() { return maxCfvo; }
    public ColorScale setMaxCfvo(ConditionalFormattingValue maxCfvo) { this.maxCfvo = maxCfvo; return this; }

    public Color getMaxColor() { return maxColor; }
    public ColorScale setMaxColor(Color maxColor) { this.maxColor = maxColor; return this; }

    public ConditionalFormattingValue getMidCfvo() { return midCfvo; }
    public ColorScale setMidCfvo(ConditionalFormattingValue midCfvo) { this.midCfvo = midCfvo; return this; }

    public Color getMidColor() { return midColor; }
    public ColorScale setMidColor(Color midColor) { this.midColor = midColor; return this; }

    public ConditionalFormattingValue getMinCfvo() { return minCfvo; }
    public ColorScale setMinCfvo(ConditionalFormattingValue minCfvo) { this.minCfvo = minCfvo; return this; }

    public Color getMinColor() { return minColor; }
    public ColorScale setMinColor(Color minColor) { this.minColor = minColor; return this; }

}
