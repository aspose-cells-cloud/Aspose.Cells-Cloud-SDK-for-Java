package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextureFill — Encapsulates the object that represents texture fill format */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextureFill {
    /** Gets and sets the texture type */
    @JsonProperty("Type")
    private String type;

    /** Returns or sets the degree of transparency of the area as a value from 0.0 (opaque) through 1.0 (clear). */
    @JsonProperty("Transparency")
    private Double transparency;

    /** Gets and sets the picture format scale. */
    @JsonProperty("Scale")
    private Double scale;

    /** Gets or sets tile picture option. */
    @JsonProperty("TilePicOption")
    private TilePicOption tilePicOption;

    /** Gets or sets picture format option. */
    @JsonProperty("PicFormatOption")
    private PicFormatOption picFormatOption;

    /** The class has a public property named "Image" of type LinkElement that can be accessed and set. */
    @JsonProperty("Image")
    private LinkElement image;

    public String getType() { return type; }
    public TextureFill setType(String type) { this.type = type; return this; }

    public Double getTransparency() { return transparency; }
    public TextureFill setTransparency(Double transparency) { this.transparency = transparency; return this; }

    public Double getScale() { return scale; }
    public TextureFill setScale(Double scale) { this.scale = scale; return this; }

    public TilePicOption getTilePicOption() { return tilePicOption; }
    public TextureFill setTilePicOption(TilePicOption tilePicOption) { this.tilePicOption = tilePicOption; return this; }

    public PicFormatOption getPicFormatOption() { return picFormatOption; }
    public TextureFill setPicFormatOption(PicFormatOption picFormatOption) { this.picFormatOption = picFormatOption; return this; }

    public LinkElement getImage() { return image; }
    public TextureFill setImage(LinkElement image) { this.image = image; return this; }

}
