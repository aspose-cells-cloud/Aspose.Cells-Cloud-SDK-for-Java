package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** RenderingFont model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RenderingFont {
    /** Gets or sets Name. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets Size. */
    @JsonProperty("Size")
    private Double size;

    /** Gets or sets Bold. */
    @JsonProperty("Bold")
    private Boolean bold;

    /** Gets or sets Italic. */
    @JsonProperty("Italic")
    private Boolean italic;

    /** Gets or sets Color. */
    @JsonProperty("Color")
    private Color color;

    public String getName() { return name; }
    public RenderingFont setName(String name) { this.name = name; return this; }

    public Double getSize() { return size; }
    public RenderingFont setSize(Double size) { this.size = size; return this; }

    public Boolean getBold() { return bold; }
    public RenderingFont setBold(Boolean bold) { this.bold = bold; return this; }

    public Boolean getItalic() { return italic; }
    public RenderingFont setItalic(Boolean italic) { this.italic = italic; return this; }

    public Color getColor() { return color; }
    public RenderingFont setColor(Color color) { this.color = color; return this; }

}
