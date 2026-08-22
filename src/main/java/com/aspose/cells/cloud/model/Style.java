package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Style — Represents display style of excel document,such as font,color,alignment,border,etc.            The Style object contains all style attributes (font, number format, alignment, and so on) as properties. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Style {
    /** Gets a  object. */
    @JsonProperty("Font")
    private Font font;

    /** Gets or sets the name of the style. */
    @JsonProperty("Name")
    private String name;

    /** Gets and sets the culture-dependent pattern string for number format. If no number format has been set for this object, null will be returned. If number format is builtin, the pattern string corresponding to the builtin number will be returned. */
    @JsonProperty("CultureCustom")
    private String cultureCustom;

    /** Represents the custom number format string of this style object. If the custom number format is not set(For example, the number format is builtin), "" will be returned. */
    @JsonProperty("Custom")
    private String custom;

    /** Gets or sets a style's background color. */
    @JsonProperty("BackgroundColor")
    private Color backgroundColor;

    /** Gets or sets a style's foreground color. */
    @JsonProperty("ForegroundColor")
    private Color foregroundColor;

    /** Represents if the formula will be hidden when the worksheet is protected. */
    @JsonProperty("IsFormulaHidden")
    private Boolean isFormulaHidden;

    /** Indicates whether the number format is a date format. */
    @JsonProperty("IsDateTime")
    private Boolean isDateTime;

    /** Gets or sets a value indicating whether the text within a cell is wrapped. */
    @JsonProperty("IsTextWrapped")
    private Boolean isTextWrapped;

    /** Indicates whether the cell shading is a gradient pattern. */
    @JsonProperty("IsGradient")
    private Boolean isGradient;

    /** Gets or sets a value indicating whether a cell can be modified or not. */
    @JsonProperty("IsLocked")
    private Boolean isLocked;

    /** Indicates whether the number format is a percent format. */
    @JsonProperty("IsPercent")
    private Boolean isPercent;

    /** Represents if text automatically shrinks to fit in the available column width. */
    @JsonProperty("ShrinkToFit")
    private Boolean shrinkToFit;

    /** Represents the indent level for the cell or range. Can only be an integer from 0 to 250. */
    @JsonProperty("IndentLevel")
    private Integer indentLevel;

    /** Gets or sets the display format of numbers and dates. The formatting patterns are different for different regions. */
    @JsonProperty("Number")
    private Integer number;

    /** Represents text rotation angle. */
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    /** Gets or sets the cell background pattern type. */
    @JsonProperty("Pattern")
    private String pattern;

    /** Represents text reading order. */
    @JsonProperty("TextDirection")
    private String textDirection;

    /** Gets or sets the vertical alignment type of the text in a cell. */
    @JsonProperty("VerticalAlignment")
    private String verticalAlignment;

    /** Gets or sets the horizontal alignment type of the text in a cell. */
    @JsonProperty("HorizontalAlignment")
    private String horizontalAlignment;

    /** A public property named `BorderCollection` that is a list of `Border` objects. */
    @JsonProperty("BorderCollection")
    private List<Border> borderCollection;

    /** Gets and sets the background theme color. */
    @JsonProperty("BackgroundThemeColor")
    private ThemeColor backgroundThemeColor;

    /** Gets and sets the foreground theme color. */
    @JsonProperty("ForegroundThemeColor")
    private ThemeColor foregroundThemeColor;

    public Font getFont() { return font; }
    public Style setFont(Font font) { this.font = font; return this; }

    public String getName() { return name; }
    public Style setName(String name) { this.name = name; return this; }

    public String getCultureCustom() { return cultureCustom; }
    public Style setCultureCustom(String cultureCustom) { this.cultureCustom = cultureCustom; return this; }

    public String getCustom() { return custom; }
    public Style setCustom(String custom) { this.custom = custom; return this; }

    public Color getBackgroundColor() { return backgroundColor; }
    public Style setBackgroundColor(Color backgroundColor) { this.backgroundColor = backgroundColor; return this; }

    public Color getForegroundColor() { return foregroundColor; }
    public Style setForegroundColor(Color foregroundColor) { this.foregroundColor = foregroundColor; return this; }

    public Boolean getIsFormulaHidden() { return isFormulaHidden; }
    public Style setIsFormulaHidden(Boolean isFormulaHidden) { this.isFormulaHidden = isFormulaHidden; return this; }

    public Boolean getIsDateTime() { return isDateTime; }
    public Style setIsDateTime(Boolean isDateTime) { this.isDateTime = isDateTime; return this; }

    public Boolean getIsTextWrapped() { return isTextWrapped; }
    public Style setIsTextWrapped(Boolean isTextWrapped) { this.isTextWrapped = isTextWrapped; return this; }

    public Boolean getIsGradient() { return isGradient; }
    public Style setIsGradient(Boolean isGradient) { this.isGradient = isGradient; return this; }

    public Boolean getIsLocked() { return isLocked; }
    public Style setIsLocked(Boolean isLocked) { this.isLocked = isLocked; return this; }

    public Boolean getIsPercent() { return isPercent; }
    public Style setIsPercent(Boolean isPercent) { this.isPercent = isPercent; return this; }

    public Boolean getShrinkToFit() { return shrinkToFit; }
    public Style setShrinkToFit(Boolean shrinkToFit) { this.shrinkToFit = shrinkToFit; return this; }

    public Integer getIndentLevel() { return indentLevel; }
    public Style setIndentLevel(Integer indentLevel) { this.indentLevel = indentLevel; return this; }

    public Integer getNumber() { return number; }
    public Style setNumber(Integer number) { this.number = number; return this; }

    public Integer getRotationAngle() { return rotationAngle; }
    public Style setRotationAngle(Integer rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getPattern() { return pattern; }
    public Style setPattern(String pattern) { this.pattern = pattern; return this; }

    public String getTextDirection() { return textDirection; }
    public Style setTextDirection(String textDirection) { this.textDirection = textDirection; return this; }

    public String getVerticalAlignment() { return verticalAlignment; }
    public Style setVerticalAlignment(String verticalAlignment) { this.verticalAlignment = verticalAlignment; return this; }

    public String getHorizontalAlignment() { return horizontalAlignment; }
    public Style setHorizontalAlignment(String horizontalAlignment) { this.horizontalAlignment = horizontalAlignment; return this; }

    public List<Border> getBorderCollection() { return borderCollection; }
    public Style setBorderCollection(List<Border> borderCollection) { this.borderCollection = borderCollection; return this; }

    public ThemeColor getBackgroundThemeColor() { return backgroundThemeColor; }
    public Style setBackgroundThemeColor(ThemeColor backgroundThemeColor) { this.backgroundThemeColor = backgroundThemeColor; return this; }

    public ThemeColor getForegroundThemeColor() { return foregroundThemeColor; }
    public Style setForegroundThemeColor(ThemeColor foregroundThemeColor) { this.foregroundThemeColor = foregroundThemeColor; return this; }

}
