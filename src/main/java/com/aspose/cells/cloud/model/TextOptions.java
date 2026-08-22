package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextOptions — Represents the text options. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextOptions extends Font {
    /** Represents fill format. */
    @JsonProperty("Fill")
    private FillFormat fill;

    /** Represents kerning. */
    @JsonProperty("Kerning")
    private Double kerning;

    /** Represents outline format. */
    @JsonProperty("Outline")
    private LineFormat outline;

    /** Represents shadow effect. */
    @JsonProperty("Shadow")
    private ShadowEffect shadow;

    /** Represents spacing. */
    @JsonProperty("Spacing")
    private Double spacing;

    /** Represents under line color. */
    @JsonProperty("UnderlineColor")
    private CellsColor underlineColor;

    /** Gets or sets Color. */
    @JsonProperty("Color")
    private Color color;

    /** Gets or sets DoubleSize. */
    @JsonProperty("DoubleSize")
    private Double doubleSize;

    /** Gets or sets IsBold. */
    @JsonProperty("IsBold")
    private Boolean isBold;

    /** Gets or sets IsItalic. */
    @JsonProperty("IsItalic")
    private Boolean isItalic;

    /** Gets or sets IsStrikeout. */
    @JsonProperty("IsStrikeout")
    private Boolean isStrikeout;

    /** Gets or sets IsSubscript. */
    @JsonProperty("IsSubscript")
    private Boolean isSubscript;

    /** Gets or sets IsSuperscript. */
    @JsonProperty("IsSuperscript")
    private Boolean isSuperscript;

    /** The class has a public property named "Name" with a getter and setter method. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets Size. */
    @JsonProperty("Size")
    private Integer size;

    /** Gets or sets Underline. */
    @JsonProperty("Underline")
    private String underline;

    public FillFormat getFill() { return fill; }
    public TextOptions setFill(FillFormat fill) { this.fill = fill; return this; }

    public Double getKerning() { return kerning; }
    public TextOptions setKerning(Double kerning) { this.kerning = kerning; return this; }

    public LineFormat getOutline() { return outline; }
    public TextOptions setOutline(LineFormat outline) { this.outline = outline; return this; }

    public ShadowEffect getShadow() { return shadow; }
    public TextOptions setShadow(ShadowEffect shadow) { this.shadow = shadow; return this; }

    public Double getSpacing() { return spacing; }
    public TextOptions setSpacing(Double spacing) { this.spacing = spacing; return this; }

    public CellsColor getUnderlineColor() { return underlineColor; }
    public TextOptions setUnderlineColor(CellsColor underlineColor) { this.underlineColor = underlineColor; return this; }

    public Color getColor() { return color; }
    public TextOptions setColor(Color color) { this.color = color; return this; }

    public Double getDoubleSize() { return doubleSize; }
    public TextOptions setDoubleSize(Double doubleSize) { this.doubleSize = doubleSize; return this; }

    public Boolean getIsBold() { return isBold; }
    public TextOptions setIsBold(Boolean isBold) { this.isBold = isBold; return this; }

    public Boolean getIsItalic() { return isItalic; }
    public TextOptions setIsItalic(Boolean isItalic) { this.isItalic = isItalic; return this; }

    public Boolean getIsStrikeout() { return isStrikeout; }
    public TextOptions setIsStrikeout(Boolean isStrikeout) { this.isStrikeout = isStrikeout; return this; }

    public Boolean getIsSubscript() { return isSubscript; }
    public TextOptions setIsSubscript(Boolean isSubscript) { this.isSubscript = isSubscript; return this; }

    public Boolean getIsSuperscript() { return isSuperscript; }
    public TextOptions setIsSuperscript(Boolean isSuperscript) { this.isSuperscript = isSuperscript; return this; }

    public String getName() { return name; }
    public TextOptions setName(String name) { this.name = name; return this; }

    public Integer getSize() { return size; }
    public TextOptions setSize(Integer size) { this.size = size; return this; }

    public String getUnderline() { return underline; }
    public TextOptions setUnderline(String underline) { this.underline = underline; return this; }

}
