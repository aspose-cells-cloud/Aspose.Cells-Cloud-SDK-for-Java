package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FormatCondition — Represents conditional formatting condition. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FormatCondition extends LinkElement {
    /** The priority of this conditional formatting rule. This value is used to determine which format should be evaluated and rendered. Lower numeric values are higher priority than higher numeric values, where '1' is the highest priority. */
    @JsonProperty("Priority")
    private Integer priority;

    /** Gets and sets whether the conditional format Type. */
    @JsonProperty("Type")
    private String type;

    /** True, no rules with lower priority may be applied over this rule, when this rule evaluates to true. Only applies for Excel 2007; */
    @JsonProperty("StopIfTrue")
    private Boolean stopIfTrue;

    /** Get the conditional formatting's "AboveAverage" instance. The default instance's rule highlights cells that are above the average for all values in the range. Valid only for type = AboveAverage. */
    @JsonProperty("AboveAverage")
    private AboveAverage aboveAverage;

    /** Get the conditional formatting's "ColorScale" instance. The default instance is a "green-yellow-red" 3ColorScale . Valid only for type = ColorScale. */
    @JsonProperty("ColorScale")
    private ColorScale colorScale;

    /** Get the conditional formatting's "DataBar" instance. The default instance's color is blue. Valid only for type is DataBar. */
    @JsonProperty("DataBar")
    private DataBar dataBar;

    /** Gets and sets the value or expression associated with conditional formatting. */
    @JsonProperty("Formula1")
    private String formula1;

    /** Gets and sets the value or expression associated with conditional formatting. */
    @JsonProperty("Formula2")
    private String formula2;

    /** Get the conditional formatting's "IconSet" instance. The default instance's IconSetType is TrafficLights31. Valid only for type = IconSet. */
    @JsonProperty("IconSet")
    private IconSet iconSet;

    /** Gets and sets the conditional format operator type. */
    @JsonProperty("Operator")
    private String operator;

    /** Gets or setts style of conditional formatted cell ranges. */
    @JsonProperty("Style")
    private Style style;

    /** The text value in a "text contains" conditional formatting rule. Valid only for type = containsText, notContainsText, beginsWith and endsWith. The default value is null. */
    @JsonProperty("Text")
    private String text;

    /** The applicable time period in a "date occurring…" conditional formatting rule. Valid only for type = timePeriod. The default value is TimePeriodType.Today. */
    @JsonProperty("TimePeriod")
    private String timePeriod;

    /** Get the conditional formatting's "Top10" instance. The default instance's rule highlights cells whose values fall in the top 10 bracket. Valid only for type is Top10. */
    @JsonProperty("Top10")
    private Top10 top10;

    public Integer getPriority() { return priority; }
    public FormatCondition setPriority(Integer priority) { this.priority = priority; return this; }

    public String getType() { return type; }
    public FormatCondition setType(String type) { this.type = type; return this; }

    public Boolean getStopIfTrue() { return stopIfTrue; }
    public FormatCondition setStopIfTrue(Boolean stopIfTrue) { this.stopIfTrue = stopIfTrue; return this; }

    public AboveAverage getAboveAverage() { return aboveAverage; }
    public FormatCondition setAboveAverage(AboveAverage aboveAverage) { this.aboveAverage = aboveAverage; return this; }

    public ColorScale getColorScale() { return colorScale; }
    public FormatCondition setColorScale(ColorScale colorScale) { this.colorScale = colorScale; return this; }

    public DataBar getDataBar() { return dataBar; }
    public FormatCondition setDataBar(DataBar dataBar) { this.dataBar = dataBar; return this; }

    public String getFormula1() { return formula1; }
    public FormatCondition setFormula1(String formula1) { this.formula1 = formula1; return this; }

    public String getFormula2() { return formula2; }
    public FormatCondition setFormula2(String formula2) { this.formula2 = formula2; return this; }

    public IconSet getIconSet() { return iconSet; }
    public FormatCondition setIconSet(IconSet iconSet) { this.iconSet = iconSet; return this; }

    public String getOperator() { return operator; }
    public FormatCondition setOperator(String operator) { this.operator = operator; return this; }

    public Style getStyle() { return style; }
    public FormatCondition setStyle(Style style) { this.style = style; return this; }

    public String getText() { return text; }
    public FormatCondition setText(String text) { this.text = text; return this; }

    public String getTimePeriod() { return timePeriod; }
    public FormatCondition setTimePeriod(String timePeriod) { this.timePeriod = timePeriod; return this; }

    public Top10 getTop10() { return top10; }
    public FormatCondition setTop10(Top10 top10) { this.top10 = top10; return this; }


    /** Covariant override: keeps fluent chains returning FormatCondition. */
    @Override public FormatCondition setLink(Link link) { return (FormatCondition) super.setLink(link); }

}
