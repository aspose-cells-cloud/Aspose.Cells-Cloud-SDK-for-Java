package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StyleFormatCondition — Represents style format condition. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StyleFormatCondition extends FormatCondition {
    /** Gets or sets link. */
    @JsonProperty("link")
    private Link link;

    public Link getLink() { return link; }
    public StyleFormatCondition setLink(Link link) { this.link = link; return this; }


    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setPriority(Integer priority) { return (StyleFormatCondition) super.setPriority(priority); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setType(String type) { return (StyleFormatCondition) super.setType(type); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setStopIfTrue(Boolean stopIfTrue) { return (StyleFormatCondition) super.setStopIfTrue(stopIfTrue); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setAboveAverage(AboveAverage aboveAverage) { return (StyleFormatCondition) super.setAboveAverage(aboveAverage); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setColorScale(ColorScale colorScale) { return (StyleFormatCondition) super.setColorScale(colorScale); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setDataBar(DataBar dataBar) { return (StyleFormatCondition) super.setDataBar(dataBar); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setFormula1(String formula1) { return (StyleFormatCondition) super.setFormula1(formula1); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setFormula2(String formula2) { return (StyleFormatCondition) super.setFormula2(formula2); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setIconSet(IconSet iconSet) { return (StyleFormatCondition) super.setIconSet(iconSet); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setOperator(String operator) { return (StyleFormatCondition) super.setOperator(operator); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setStyle(Style style) { return (StyleFormatCondition) super.setStyle(style); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setText(String text) { return (StyleFormatCondition) super.setText(text); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setTimePeriod(String timePeriod) { return (StyleFormatCondition) super.setTimePeriod(timePeriod); }
    /** Covariant override: keeps fluent chains returning StyleFormatCondition. */
    @Override public StyleFormatCondition setTop10(Top10 top10) { return (StyleFormatCondition) super.setTop10(top10); }

}
