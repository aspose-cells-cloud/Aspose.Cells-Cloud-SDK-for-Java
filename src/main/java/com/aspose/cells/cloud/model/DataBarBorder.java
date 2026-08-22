package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataBarBorder — Represents the border of the data bars specified by a conditional formatting rule. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataBarBorder {
    /** Gets or sets the border's color of data bars specified by a conditional formatting rule. */
    @JsonProperty("Color")
    private Color color;

    /** Gets or sets the border's type of data bars specified by a conditional formatting rule. */
    @JsonProperty("Type")
    private String type;

    public Color getColor() { return color; }
    public DataBarBorder setColor(Color color) { this.color = color; return this; }

    public String getType() { return type; }
    public DataBarBorder setType(String type) { this.type = type; return this; }

}
