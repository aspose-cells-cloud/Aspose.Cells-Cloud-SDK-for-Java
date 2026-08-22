package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FillFormat — Encapsulates the object that represents fill formatting for a shape. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FillFormat {
    /** Gets and sets the fill type. */
    @JsonProperty("Type")
    private String type;

    /** Gets  object. */
    @JsonProperty("SolidFill")
    private SolidFill solidFill;

    /** Gets  object. */
    @JsonProperty("PatternFill")
    private PatternFill patternFill;

    /** Gets  object. */
    @JsonProperty("TextureFill")
    private TextureFill textureFill;

    /** Gets  object. */
    @JsonProperty("GradientFill")
    private GradientFill gradientFill;

    /** Gets and sets the picture image data. */
    @JsonProperty("ImageData")
    private String imageData;

    public String getType() { return type; }
    public FillFormat setType(String type) { this.type = type; return this; }

    public SolidFill getSolidFill() { return solidFill; }
    public FillFormat setSolidFill(SolidFill solidFill) { this.solidFill = solidFill; return this; }

    public PatternFill getPatternFill() { return patternFill; }
    public FillFormat setPatternFill(PatternFill patternFill) { this.patternFill = patternFill; return this; }

    public TextureFill getTextureFill() { return textureFill; }
    public FillFormat setTextureFill(TextureFill textureFill) { this.textureFill = textureFill; return this; }

    public GradientFill getGradientFill() { return gradientFill; }
    public FillFormat setGradientFill(GradientFill gradientFill) { this.gradientFill = gradientFill; return this; }

    public String getImageData() { return imageData; }
    public FillFormat setImageData(String imageData) { this.imageData = imageData; return this; }

}
