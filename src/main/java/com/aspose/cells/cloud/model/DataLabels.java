package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataLabels — Encapsulates a collection of all the DataLabel objects for the specified Series. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataLabels extends ChartFrame {
    /** Indicates the text is auto generated. */
    @JsonProperty("IsAutoText")
    private Boolean isAutoText;

    /** A nullable boolean property "IsDeleted" indicating whether an object has been deleted. */
    @JsonProperty("IsDeleted")
    private Boolean isDeleted;

    /** Gets or sets LinkedSource. */
    @JsonProperty("LinkedSource")
    private String linkedSource;

    /** Gets and sets the built-in number format. */
    @JsonProperty("Number")
    private Integer number;

    /** Represents the format string for the DataLabels object. */
    @JsonProperty("NumberFormat")
    private String numberFormat;

    /** True if the number format is linked to the cells (so that the number format changes in the labels when it changes in the cells). */
    @JsonProperty("NumberFormatLinked")
    private Boolean numberFormatLinked;

    /** Represents the position of the data label. */
    @JsonProperty("Position")
    private String position;

    /** Gets or sets RotationAngle. */
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    /** Gets or sets the separator type used for the data labels on a chart. */
    @JsonProperty("Separator")
    private String separator;

    /** Represents a specified chart's data label percentage value display behavior. True displays the percentage value. False to hide. */
    @JsonProperty("ShowBubbleSize")
    private Boolean showBubbleSize;

    /** Represents a specified chart's data label category name display behavior.True to display the category name for the data labels on a chart. False to hide. */
    @JsonProperty("ShowCategoryName")
    private Boolean showCategoryName;

    /** Represents a specified chart's data label legend key display behavior. True if the data label legend key is visible. */
    @JsonProperty("ShowLegendKey")
    private Boolean showLegendKey;

    /** Represents a specified chart's data label percentage value display behavior. True displays the percentage value. False to hide. */
    @JsonProperty("ShowPercentage")
    private Boolean showPercentage;

    /** Returns or sets a Boolean to indicate the series name display behavior for the data labels on a chart. True to show the series name. False to hide. */
    @JsonProperty("ShowSeriesName")
    private Boolean showSeriesName;

    /** Represents a specified chart's data label values display behavior. True displays the values. False to hide. */
    @JsonProperty("ShowValue")
    private Boolean showValue;

    /** Gets or sets the text of data label. */
    @JsonProperty("Text")
    private String text;

    /** Gets or sets TextDirection. */
    @JsonProperty("TextDirection")
    private String textDirection;

    /** Gets or sets TextHorizontalAlignment. */
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    /** Gets or sets TextVerticalAlignment. */
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

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

    public Boolean getIsAutoText() { return isAutoText; }
    public DataLabels setIsAutoText(Boolean isAutoText) { this.isAutoText = isAutoText; return this; }

    public Boolean getIsDeleted() { return isDeleted; }
    public DataLabels setIsDeleted(Boolean isDeleted) { this.isDeleted = isDeleted; return this; }

    public String getLinkedSource() { return linkedSource; }
    public DataLabels setLinkedSource(String linkedSource) { this.linkedSource = linkedSource; return this; }

    public Integer getNumber() { return number; }
    public DataLabels setNumber(Integer number) { this.number = number; return this; }

    public String getNumberFormat() { return numberFormat; }
    public DataLabels setNumberFormat(String numberFormat) { this.numberFormat = numberFormat; return this; }

    public Boolean getNumberFormatLinked() { return numberFormatLinked; }
    public DataLabels setNumberFormatLinked(Boolean numberFormatLinked) { this.numberFormatLinked = numberFormatLinked; return this; }

    public String getPosition() { return position; }
    public DataLabels setPosition(String position) { this.position = position; return this; }

    public Integer getRotationAngle() { return rotationAngle; }
    public DataLabels setRotationAngle(Integer rotationAngle) { this.rotationAngle = rotationAngle; return this; }

    public String getSeparator() { return separator; }
    public DataLabels setSeparator(String separator) { this.separator = separator; return this; }

    public Boolean getShowBubbleSize() { return showBubbleSize; }
    public DataLabels setShowBubbleSize(Boolean showBubbleSize) { this.showBubbleSize = showBubbleSize; return this; }

    public Boolean getShowCategoryName() { return showCategoryName; }
    public DataLabels setShowCategoryName(Boolean showCategoryName) { this.showCategoryName = showCategoryName; return this; }

    public Boolean getShowLegendKey() { return showLegendKey; }
    public DataLabels setShowLegendKey(Boolean showLegendKey) { this.showLegendKey = showLegendKey; return this; }

    public Boolean getShowPercentage() { return showPercentage; }
    public DataLabels setShowPercentage(Boolean showPercentage) { this.showPercentage = showPercentage; return this; }

    public Boolean getShowSeriesName() { return showSeriesName; }
    public DataLabels setShowSeriesName(Boolean showSeriesName) { this.showSeriesName = showSeriesName; return this; }

    public Boolean getShowValue() { return showValue; }
    public DataLabels setShowValue(Boolean showValue) { this.showValue = showValue; return this; }

    public String getText() { return text; }
    public DataLabels setText(String text) { this.text = text; return this; }

    public String getTextDirection() { return textDirection; }
    public DataLabels setTextDirection(String textDirection) { this.textDirection = textDirection; return this; }

    public String getTextHorizontalAlignment() { return textHorizontalAlignment; }
    public DataLabels setTextHorizontalAlignment(String textHorizontalAlignment) { this.textHorizontalAlignment = textHorizontalAlignment; return this; }

    public String getTextVerticalAlignment() { return textVerticalAlignment; }
    public DataLabels setTextVerticalAlignment(String textVerticalAlignment) { this.textVerticalAlignment = textVerticalAlignment; return this; }

    public Area getArea() { return area; }
    public DataLabels setArea(Area area) { this.area = area; return this; }

    public Boolean getAutoScaleFont() { return autoScaleFont; }
    public DataLabels setAutoScaleFont(Boolean autoScaleFont) { this.autoScaleFont = autoScaleFont; return this; }

    public String getBackgroundMode() { return backgroundMode; }
    public DataLabels setBackgroundMode(String backgroundMode) { this.backgroundMode = backgroundMode; return this; }

    public Line getBorder() { return border; }
    public DataLabels setBorder(Line border) { this.border = border; return this; }

    public Font getFont() { return font; }
    public DataLabels setFont(Font font) { this.font = font; return this; }

    public Boolean getIsAutomaticSize() { return isAutomaticSize; }
    public DataLabels setIsAutomaticSize(Boolean isAutomaticSize) { this.isAutomaticSize = isAutomaticSize; return this; }

    public Boolean getIsInnerMode() { return isInnerMode; }
    public DataLabels setIsInnerMode(Boolean isInnerMode) { this.isInnerMode = isInnerMode; return this; }

    public Boolean getShadow() { return shadow; }
    public DataLabels setShadow(Boolean shadow) { this.shadow = shadow; return this; }

    public Integer getWidth() { return width; }
    public DataLabels setWidth(Integer width) { this.width = width; return this; }

    public Integer getHeight() { return height; }
    public DataLabels setHeight(Integer height) { this.height = height; return this; }

    public Integer getX() { return x; }
    public DataLabels setX(Integer x) { this.x = x; return this; }

    public Integer getY() { return y; }
    public DataLabels setY(Integer y) { this.y = y; return this; }

}
