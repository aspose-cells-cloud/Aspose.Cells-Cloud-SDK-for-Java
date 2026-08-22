package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextWaterMarkerRequest — Indicates text water marker request. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextWaterMarkerRequest {
    /** A property named Text of type string that can be accessed and modified. */
    @JsonProperty("Text")
    private String text;

    /** Indicates font name. */
    @JsonProperty("FontName")
    private String fontName;

    /** Indicates font size. */
    @JsonProperty("FontSize")
    private Integer fontSize;

    /** Indicates image height. */
    @JsonProperty("Height")
    private Integer height;

    /** Indicates image width. */
    @JsonProperty("Width")
    private Integer width;

    /** Gets or sets ImageAdaptOption. */
    @JsonProperty("ImageAdaptOption")
    private String imageAdaptOption;

    public String getText() { return text; }
    public TextWaterMarkerRequest setText(String text) { this.text = text; return this; }

    public String getFontName() { return fontName; }
    public TextWaterMarkerRequest setFontName(String fontName) { this.fontName = fontName; return this; }

    public Integer getFontSize() { return fontSize; }
    public TextWaterMarkerRequest setFontSize(Integer fontSize) { this.fontSize = fontSize; return this; }

    public Integer getHeight() { return height; }
    public TextWaterMarkerRequest setHeight(Integer height) { this.height = height; return this; }

    public Integer getWidth() { return width; }
    public TextWaterMarkerRequest setWidth(Integer width) { this.width = width; return this; }

    public String getImageAdaptOption() { return imageAdaptOption; }
    public TextWaterMarkerRequest setImageAdaptOption(String imageAdaptOption) { this.imageAdaptOption = imageAdaptOption; return this; }

}
