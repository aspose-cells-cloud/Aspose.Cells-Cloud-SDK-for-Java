package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartFrame — Encapsulates the object that represents the frame object in a chart. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartFrame {
    /** Gets the area. */
    @JsonProperty("Area")
    private Area area;

    /** True if the text in the object changes font size when the object size changes. The default value is True. */
    @JsonProperty("AutoScaleFont")
    private Boolean autoScaleFont;

    /** Gets and sets the display mode of the background */
    @JsonProperty("BackgroundMode")
    private String backgroundMode;

    /** Gets the border. */
    @JsonProperty("Border")
    private Line border;

    /** Gets a  object of the specified ChartFrame object. */
    @JsonProperty("Font")
    private Font font;

    /** Indicates whether the chart frame is automatic sized. */
    @JsonProperty("IsAutomaticSize")
    private Boolean isAutomaticSize;

    /** Indicates whether the size of the plot area size includes the tick marks, and the axis labels. False specifies that the size shall determine the size of the plot area, the tick marks, and the axis labels. */
    @JsonProperty("IsInnerMode")
    private Boolean isInnerMode;

    /** True if the frame has a shadow. */
    @JsonProperty("Shadow")
    private Boolean shadow;

    /** Gets or sets the width of frame in units of 1/4000 of the chart area. */
    @JsonProperty("Width")
    private Integer width;

    /** Gets or sets the height of frame in units of 1/4000 of the chart area. */
    @JsonProperty("Height")
    private Integer height;

    /** Gets or sets the x coordinate of the upper left corner in units of 1/4000 of the chart area. */
    @JsonProperty("X")
    private Integer x;

    /** Gets or sets the y coordinate of the upper left corner in units of 1/4000 of the chart area. */
    @JsonProperty("Y")
    private Integer y;

    public Area getArea() { return area; }
    public ChartFrame setArea(Area area) { this.area = area; return this; }

    public Boolean getAutoScaleFont() { return autoScaleFont; }
    public ChartFrame setAutoScaleFont(Boolean autoScaleFont) { this.autoScaleFont = autoScaleFont; return this; }

    public String getBackgroundMode() { return backgroundMode; }
    public ChartFrame setBackgroundMode(String backgroundMode) { this.backgroundMode = backgroundMode; return this; }

    public Line getBorder() { return border; }
    public ChartFrame setBorder(Line border) { this.border = border; return this; }

    public Font getFont() { return font; }
    public ChartFrame setFont(Font font) { this.font = font; return this; }

    public Boolean getIsAutomaticSize() { return isAutomaticSize; }
    public ChartFrame setIsAutomaticSize(Boolean isAutomaticSize) { this.isAutomaticSize = isAutomaticSize; return this; }

    public Boolean getIsInnerMode() { return isInnerMode; }
    public ChartFrame setIsInnerMode(Boolean isInnerMode) { this.isInnerMode = isInnerMode; return this; }

    public Boolean getShadow() { return shadow; }
    public ChartFrame setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Integer getWidth() { return width; }
    public ChartFrame setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public ChartFrame setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public ChartFrame setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public ChartFrame setY(Integer y) { this.y = y; return this; }

}
