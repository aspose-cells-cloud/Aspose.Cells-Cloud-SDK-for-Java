package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ChartDataTable — Represents a chart data table. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ChartDataTable extends LinkElement {
    /** True if the text in the object changes font size when the object size changes. The default value is True. */
    @JsonProperty("AutoScaleFont")
    private Boolean autoScaleFont;

    /** Gets and sets the display mode of the background */
    @JsonProperty("BackgroundMode")
    private String backgroundMode;

    /** Returns a Border object that represents the border of the object */
    @JsonProperty("Border")
    private Line border;

    /** Gets a  object which represents the font setting of the specified chart data table. */
    @JsonProperty("Font")
    private Font font;

    /** True if the chart data table has horizontal cell borders */
    @JsonProperty("HasBorderHorizontal")
    private Boolean hasBorderHorizontal;

    /** True if the chart data table has outline borders */
    @JsonProperty("HasBorderOutline")
    private Boolean hasBorderOutline;

    /** True if the chart data table has vertical cell borders */
    @JsonProperty("HasBorderVertical")
    private Boolean hasBorderVertical;

    /** True if the data label legend key is visible. */
    @JsonProperty("ShowLegendKey")
    private Boolean showLegendKey;

    public Boolean getAutoScaleFont() { return autoScaleFont; }
    public ChartDataTable setAutoScaleFont(Boolean autoScaleFont) { this.autoScaleFont = autoScaleFont; return this; }

    public String getBackgroundMode() { return backgroundMode; }
    public ChartDataTable setBackgroundMode(String backgroundMode) { this.backgroundMode = backgroundMode; return this; }

    public Line getBorder() { return border; }
    public ChartDataTable setBorder(Line border) { this.border = border; return this; }

    public Font getFont() { return font; }
    public ChartDataTable setFont(Font font) { this.font = font; return this; }

    public Boolean getHasBorderHorizontal() { return hasBorderHorizontal; }
    public ChartDataTable setHasBorderHorizontal(Boolean hasBorderHorizontal) { this.hasBorderHorizontal = hasBorderHorizontal; return this; }

    public Boolean getHasBorderOutline() { return hasBorderOutline; }
    public ChartDataTable setHasBorderOutline(Boolean hasBorderOutline) { this.hasBorderOutline = hasBorderOutline; return this; }

    public Boolean getHasBorderVertical() { return hasBorderVertical; }
    public ChartDataTable setHasBorderVertical(Boolean hasBorderVertical) { this.hasBorderVertical = hasBorderVertical; return this; }

    public Boolean getShowLegendKey() { return showLegendKey; }
    public ChartDataTable setShowLegendKey(Boolean showLegendKey) { this.showLegendKey = showLegendKey; return this; }


    /** Covariant override: keeps fluent chains returning ChartDataTable. */
    @Override public ChartDataTable setLink(Link link) { return (ChartDataTable) super.setLink(link); }

}
