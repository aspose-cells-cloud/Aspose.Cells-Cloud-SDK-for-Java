package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Legend — Encapsulates the object that represents the chart legend. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Legend extends ChartFrame {
    /** Gets or sets the legend position type. */
    @JsonProperty("Position")
    private String position;

    /** Gets a collection of all the LegendEntry objects in the specified chart legend. Setting the legend entries of the surface chart is not supported. So it will return null if the chart type is surface chart type. */
    @JsonProperty("LegendEntries")
    private LinkElement legendEntries;

    /** Gets or sets Area. */
    @JsonProperty("Area")
    private Area area;

    /** Gets or sets AutoScaleFont. */
    @JsonProperty("AutoScaleFont")
    private Boolean autoScaleFont;

    /** Gets or sets BackgroundMode. */
    @JsonProperty("BackgroundMode")
    private String backgroundMode;

    /** Gets or sets Border. */
    @JsonProperty("Border")
    private Line border;

    /** Gets or sets Font. */
    @JsonProperty("Font")
    private Font font;

    /** Gets or sets IsAutomaticSize. */
    @JsonProperty("IsAutomaticSize")
    private Boolean isAutomaticSize;

    /** Gets or sets IsInnerMode. */
    @JsonProperty("IsInnerMode")
    private Boolean isInnerMode;

    /** Gets or sets Shadow. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets Width. */
    @JsonProperty("Width")
    private Integer width;

    /** Gets or sets Height. */
    @JsonProperty("Height")
    private Integer height;

    /** Gets or sets X. */
    @JsonProperty("X")
    private Integer x;

    /** Gets or sets Y. */
    @JsonProperty("Y")
    private Integer y;

    public String getPosition() { return position; }
    public Legend setPosition(String position) { this.position = position; return this; }

    public LinkElement getLegendEntries() { return legendEntries; }
    public Legend setLegendEntries(LinkElement legendEntries) { this.legendEntries = legendEntries; return this; }

    public Area getArea() { return area; }
    public Legend setArea(Area area) { this.area = area; return this; }

    public Boolean getAutoScaleFont() { return autoScaleFont; }
    public Legend setAutoScaleFont(Boolean autoScaleFont) { this.autoScaleFont = autoScaleFont; return this; }

    public String getBackgroundMode() { return backgroundMode; }
    public Legend setBackgroundMode(String backgroundMode) { this.backgroundMode = backgroundMode; return this; }

    public Line getBorder() { return border; }
    public Legend setBorder(Line border) { this.border = border; return this; }

    public Font getFont() { return font; }
    public Legend setFont(Font font) { this.font = font; return this; }

    public Boolean getIsAutomaticSize() { return isAutomaticSize; }
    public Legend setIsAutomaticSize(Boolean isAutomaticSize) { this.isAutomaticSize = isAutomaticSize; return this; }

    public Boolean getIsInnerMode() { return isInnerMode; }
    public Legend setIsInnerMode(Boolean isInnerMode) { this.isInnerMode = isInnerMode; return this; }

    public Boolean getShadow() { return shadow; }
    public Legend setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Integer getWidth() { return width; }
    public Legend setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public Legend setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public Legend setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public Legend setY(Integer y) { this.y = y; return this; }

}
