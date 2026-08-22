package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StyleFormatCondition — Represents style format condition. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StyleFormatCondition extends FormatCondition {
    /** Gets or sets Priority. */
    @JsonProperty("Priority")
    private Integer priority;

    /** Gets or sets Type. */
    @JsonProperty("Type")
    private String type;

    /** Gets or sets StopIfTrue. */
    @JsonProperty("StopIfTrue")
    private Boolean stopIfTrue;

    /** Gets or sets AboveAverage. */
    @JsonProperty("AboveAverage")
    private AboveAverage aboveAverage;

    /** Gets or sets ColorScale. */
    @JsonProperty("ColorScale")
    private ColorScale colorScale;

    /** Gets or sets DataBar. */
    @JsonProperty("DataBar")
    private DataBar dataBar;

    /** Gets or sets Formula1. */
    @JsonProperty("Formula1")
    private String formula1;

    /** Gets or sets Formula2. */
    @JsonProperty("Formula2")
    private String formula2;

    /** Gets or sets IconSet. */
    @JsonProperty("IconSet")
    private IconSet iconSet;

    /** Gets or sets Operator. */
    @JsonProperty("Operator")
    private String operator;

    /** Gets or sets Style. */
    @JsonProperty("Style")
    private Style style;

    /** Gets or sets Text. */
    @JsonProperty("Text")
    private String text;

    /** Gets or sets TimePeriod. */
    @JsonProperty("TimePeriod")
    private String timePeriod;

    /** Gets or sets Top10. */
    @JsonProperty("Top10")
    private Top10 top10;

    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Integer getPriority() { return priority; }
    public StyleFormatCondition setPriority(Integer priority) { this.priority = priority; return this; }

    public String getType() { return type; }
    public StyleFormatCondition setType(String type) { this.type = type; return this; }

    public Boolean getStopIfTrue() { return stopIfTrue; }
    public StyleFormatCondition setStopIfTrue(Boolean stopIfTrue) { this.stopIfTrue = stopIfTrue; return this; }

    public AboveAverage getAboveAverage() { return aboveAverage; }
    public StyleFormatCondition setAboveAverage(AboveAverage aboveAverage) { this.aboveAverage = aboveAverage; return this; }

    public ColorScale getColorScale() { return colorScale; }
    public StyleFormatCondition setColorScale(ColorScale colorScale) { this.colorScale = colorScale; return this; }

    public DataBar getDataBar() { return dataBar; }
    public StyleFormatCondition setDataBar(DataBar dataBar) { this.dataBar = dataBar; return this; }

    public String getFormula1() { return formula1; }
    public StyleFormatCondition setFormula1(String formula1) { this.formula1 = formula1; return this; }

    public String getFormula2() { return formula2; }
    public StyleFormatCondition setFormula2(String formula2) { this.formula2 = formula2; return this; }

    public IconSet getIconSet() { return iconSet; }
    public StyleFormatCondition setIconSet(IconSet iconSet) { this.iconSet = iconSet; return this; }

    public String getOperator() { return operator; }
    public StyleFormatCondition setOperator(String operator) { this.operator = operator; return this; }

    public Style getStyle() { return style; }
    public StyleFormatCondition setStyle(Style style) { this.style = style; return this; }

    public String getText() { return text; }
    public StyleFormatCondition setText(String text) { this.text = text; return this; }

    public String getTimePeriod() { return timePeriod; }
    public StyleFormatCondition setTimePeriod(String timePeriod) { this.timePeriod = timePeriod; return this; }

    public Top10 getTop10() { return top10; }
    public StyleFormatCondition setTop10(Top10 top10) { this.top10 = top10; return this; }

    public Link getLink() { return link; }
    public StyleFormatCondition setLink(Link link) { this.link = link; return this; }

}
