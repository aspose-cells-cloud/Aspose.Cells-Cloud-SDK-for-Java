package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Font — Encapsulates the font object used in a spreadsheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Font {
    /** Gets or sets the  of the font. */
    @JsonProperty("Color")
    private Color color;

    /** Gets and sets the double size of the font. */
    @JsonProperty("DoubleSize")
    private Double doubleSize;

    /** Gets or sets a value indicating whether the font is bold. */
    @JsonProperty("IsBold")
    private Boolean isBold;

    /** Gets or sets a value indicating whether the font is italic. */
    @JsonProperty("IsItalic")
    private Boolean isItalic;

    /** Gets or sets a value indicating whether the font is single strikeout. */
    @JsonProperty("IsStrikeout")
    private Boolean isStrikeout;

    /** Gets or sets a value indicating whether the font is subscript. */
    @JsonProperty("IsSubscript")
    private Boolean isSubscript;

    /** Gets or sets a value indicating whether the font is super script. */
    @JsonProperty("IsSuperscript")
    private Boolean isSuperscript;

    /** Gets  or sets the name of the . */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets the size of the font. */
    @JsonProperty("Size")
    private Integer size;

    /** Gets or sets the font underline type. */
    @JsonProperty("Underline")
    private String underline;

    public Color getColor() { return color; }
    public Font setColor(Color color) { this.color = color; return this; }

    public Double getDoubleSize() { return doubleSize; }
    public Font setDoubleSize(Double doubleSize) { this.doubleSize = doubleSize; return this; }

    public Boolean getIsBold() { return isBold; }
    public Font setIsBold(Boolean isBold) { this.isBold = isBold; return this; }

    public Boolean getIsItalic() { return isItalic; }
    public Font setIsItalic(Boolean isItalic) { this.isItalic = isItalic; return this; }

    public Boolean getIsStrikeout() { return isStrikeout; }
    public Font setIsStrikeout(Boolean isStrikeout) { this.isStrikeout = isStrikeout; return this; }

    public Boolean getIsSubscript() { return isSubscript; }
    public Font setIsSubscript(Boolean isSubscript) { this.isSubscript = isSubscript; return this; }

    public Boolean getIsSuperscript() { return isSuperscript; }
    public Font setIsSuperscript(Boolean isSuperscript) { this.isSuperscript = isSuperscript; return this; }

    public String getName() { return name; }
    public Font setName(String name) { this.name = name; return this; }

    public Integer getSize() { return size; }
    public Font setSize(Integer size) { this.size = size; return this; }

    public String getUnderline() { return underline; }
    public Font setUnderline(String underline) { this.underline = underline; return this; }

}
