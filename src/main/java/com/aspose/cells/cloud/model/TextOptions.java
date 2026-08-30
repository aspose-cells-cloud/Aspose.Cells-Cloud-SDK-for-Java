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


    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setColor(Color color) { return (TextOptions) super.setColor(color); }
    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setDoubleSize(Double doubleSize) { return (TextOptions) super.setDoubleSize(doubleSize); }
    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setIsBold(Boolean isBold) { return (TextOptions) super.setIsBold(isBold); }
    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setIsItalic(Boolean isItalic) { return (TextOptions) super.setIsItalic(isItalic); }
    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setIsStrikeout(Boolean isStrikeout) { return (TextOptions) super.setIsStrikeout(isStrikeout); }
    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setIsSubscript(Boolean isSubscript) { return (TextOptions) super.setIsSubscript(isSubscript); }
    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setIsSuperscript(Boolean isSuperscript) { return (TextOptions) super.setIsSuperscript(isSuperscript); }
    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setName(String name) { return (TextOptions) super.setName(name); }
    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setSize(Integer size) { return (TextOptions) super.setSize(size); }
    /** Covariant override: keeps fluent chains returning TextOptions. */
    @Override public TextOptions setUnderline(String underline) { return (TextOptions) super.setUnderline(underline); }

}
