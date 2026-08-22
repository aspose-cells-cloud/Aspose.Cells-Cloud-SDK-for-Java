package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TimePeriodFormatCondition — Represents time period format condition. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TimePeriodFormatCondition {
    /** The applicable time period in a "date occurring…" conditional formatting rule. Valid only for type = timePeriod.  The default value is TimePeriodType.Today */
    @JsonProperty("TimePeriod")
    private String timePeriod;

    public String getTimePeriod() { return timePeriod; }
    public TimePeriodFormatCondition setTimePeriod(String timePeriod) { this.timePeriod = timePeriod; return this; }

}
