package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** NegativeBarFormat — Represents the color settings of the data bars for negative values that are defined by a data bar conditional formating rule. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NegativeBarFormat {
    /** Gets or sets a FormatColor object that you can use to specify the border color for negative data bars. */
    @JsonProperty("BorderColor")
    private Color borderColor;

    /** Gets whether to use the same border color as positive data bars. */
    @JsonProperty("BorderColorType")
    private String borderColorType;

    /** Gets or sets a FormatColor object that you can use to specify the fill color for negative data bars. */
    @JsonProperty("Color")
    private Color color;

    /** Gets or sets whether to use the same fill color as positive data bars. */
    @JsonProperty("ColorType")
    private String colorType;

    public Color getBorderColor() { return borderColor; }
    public NegativeBarFormat setBorderColor(Color borderColor) { this.borderColor = borderColor; return this; }

    public String getBorderColorType() { return borderColorType; }
    public NegativeBarFormat setBorderColorType(String borderColorType) { this.borderColorType = borderColorType; return this; }

    public Color getColor() { return color; }
    public NegativeBarFormat setColor(Color color) { this.color = color; return this; }

    public String getColorType() { return colorType; }
    public NegativeBarFormat setColorType(String colorType) { this.colorType = colorType; return this; }

}
