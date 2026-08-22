package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataBar — Describe the DataBar conditional formatting rule. This conditional formatting rule displays a gradated data bar in the range of cells. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataBar {
    /** Gets the color of the axis for cells with conditional formatting as data bars. */
    @JsonProperty("AxisColor")
    private Color axisColor;

    /** Gets or sets the position of the axis of the data bars specified by a conditional formatting rule. */
    @JsonProperty("AxisPosition")
    private String axisPosition;

    /** Gets an object that specifies the border of a data bar. */
    @JsonProperty("BarBorder")
    private DataBarBorder barBorder;

    /** Gets or sets how a data bar is filled with color. */
    @JsonProperty("BarFillType")
    private String barFillType;

    /** Get or set this DataBar's Color. */
    @JsonProperty("Color")
    private Color color;

    /** Gets or sets the direction the databar is displayed. */
    @JsonProperty("Direction")
    private String direction;

    /** Get or set this DataBar's max value object. Cannot set null or CFValueObject with type FormatConditionValueType.Min to it. */
    @JsonProperty("MaxCfvo")
    private ConditionalFormattingValue maxCfvo;

    /** Represents the max length of data bar . */
    @JsonProperty("MaxLength")
    private Integer maxLength;

    /** Get or set this DataBar's min value object. Cannot set null or CFValueObject with type FormatConditionValueType.Max to it. */
    @JsonProperty("MinCfvo")
    private ConditionalFormattingValue minCfvo;

    /** Represents the min length of data bar . */
    @JsonProperty("MinLength")
    private Integer minLength;

    /** Gets the NegativeBarFormat object associated with a data bar conditional formatting rule. */
    @JsonProperty("NegativeBarFormat")
    private NegativeBarFormat negativeBarFormat;

    /** Get or set the flag indicating whether to show the values of the cells on which this data bar is applied. Default value is true. */
    @JsonProperty("ShowValue")
    private Boolean showValue;

    public Color getAxisColor() { return axisColor; }
    public DataBar setAxisColor(Color axisColor) { this.axisColor = axisColor; return this; }

    public String getAxisPosition() { return axisPosition; }
    public DataBar setAxisPosition(String axisPosition) { this.axisPosition = axisPosition; return this; }

    public DataBarBorder getBarBorder() { return barBorder; }
    public DataBar setBarBorder(DataBarBorder barBorder) { this.barBorder = barBorder; return this; }

    public String getBarFillType() { return barFillType; }
    public DataBar setBarFillType(String barFillType) { this.barFillType = barFillType; return this; }

    public Color getColor() { return color; }
    public DataBar setColor(Color color) { this.color = color; return this; }

    public String getDirection() { return direction; }
    public DataBar setDirection(String direction) { this.direction = direction; return this; }

    public ConditionalFormattingValue getMaxCfvo() { return maxCfvo; }
    public DataBar setMaxCfvo(ConditionalFormattingValue maxCfvo) { this.maxCfvo = maxCfvo; return this; }

    public Integer getMaxLength() { return maxLength; }
    public DataBar setMaxLength(Integer maxLength) { this.maxLength = maxLength; return this; }

    public ConditionalFormattingValue getMinCfvo() { return minCfvo; }
    public DataBar setMinCfvo(ConditionalFormattingValue minCfvo) { this.minCfvo = minCfvo; return this; }

    public Integer getMinLength() { return minLength; }
    public DataBar setMinLength(Integer minLength) { this.minLength = minLength; return this; }

    public NegativeBarFormat getNegativeBarFormat() { return negativeBarFormat; }
    public DataBar setNegativeBarFormat(NegativeBarFormat negativeBarFormat) { this.negativeBarFormat = negativeBarFormat; return this; }

    public Boolean getShowValue() { return showValue; }
    public DataBar setShowValue(Boolean showValue) { this.showValue = showValue; return this; }

}
