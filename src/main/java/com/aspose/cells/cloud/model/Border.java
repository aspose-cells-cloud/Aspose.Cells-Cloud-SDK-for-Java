package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Border — Encapsulates the object that represents the cell border. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Border {
    /** Gets or sets the cell border type. */
    @JsonProperty("LineStyle")
    private String lineStyle;

    /** Gets or sets the  of the border. */
    @JsonProperty("Color")
    private Color color;

    /** This class has a property called "BorderType" of type string that can be both get and set. */
    @JsonProperty("BorderType")
    private String borderType;

    /** Gets and sets the theme color of the border. */
    @JsonProperty("ThemeColor")
    private ThemeColor themeColor;

    /** Gets and sets the color with a 32-bit ARGB value. */
    @JsonProperty("ArgbColor")
    private Integer argbColor;

    public String getLineStyle() { return lineStyle; }
    public Border setLineStyle(String lineStyle) { this.lineStyle = lineStyle; return this; }

    public Color getColor() { return color; }
    public Border setColor(Color color) { this.color = color; return this; }

    public String getBorderType() { return borderType; }
    public Border setBorderType(String borderType) { this.borderType = borderType; return this; }

    public ThemeColor getThemeColor() { return themeColor; }
    public Border setThemeColor(ThemeColor themeColor) { this.themeColor = themeColor; return this; }

    public Integer getArgbColor() { return argbColor; }
    public Border setArgbColor(Integer argbColor) { this.argbColor = argbColor; return this; }

}
