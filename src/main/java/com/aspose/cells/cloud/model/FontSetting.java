package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FontSetting — Represents a range of characters within the cell text. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FontSetting {
    /** Returns the font of this object. */
    @JsonProperty("Font")
    private Font font;

    /** Gets the length of the characters. */
    @JsonProperty("Length")
    private Integer length;

    /** Gets the start index of the characters. */
    @JsonProperty("StartIndex")
    private Integer startIndex;

    /** Returns the text options. */
    @JsonProperty("TextOptions")
    private TextOptions textOptions;

    /** Gets the type of text node. */
    @JsonProperty("Type")
    private String type;

    public Font getFont() { return font; }
    public FontSetting setFont(Font font) { this.font = font; return this; }

    public Integer getLength() { return length; }
    public FontSetting setLength(Integer length) { this.length = length; return this; }

    public Integer getStartIndex() { return startIndex; }
    public FontSetting setStartIndex(Integer startIndex) { this.startIndex = startIndex; return this; }

    public TextOptions getTextOptions() { return textOptions; }
    public FontSetting setTextOptions(TextOptions textOptions) { this.textOptions = textOptions; return this; }

    public String getType() { return type; }
    public FontSetting setType(String type) { this.type = type; return this; }

}
