package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AboveAverage — Describe the AboveAverage conditional formatting rule. This conditional formatting rule highlights cells that are above or below the average for all values in the range. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AboveAverage {
    /** Get or set the flag indicating whether the rule is an "above average" rule. 'true' indicates 'above average'. Default value is true. */
    @JsonProperty("IsAboveAverage")
    private Boolean isAboveAverage;

    /** Get or set the flag indicating whether the 'aboveAverage' and 'belowAverage' criteria is inclusive of the average itself, or exclusive of that value. 'true' indicates to include the average value in the criteria. Default value is false. */
    @JsonProperty("IsEqualAverage")
    private Boolean isEqualAverage;

    /** Get or set the number of standard deviations to include above or below the average in the conditional formatting rule. The input value must between 0 and 3 (include 0 and 3). Setting this value to 0 means stdDev is not set. The default value is 0. */
    @JsonProperty("StdDev")
    private Integer stdDev;

    public Boolean getIsAboveAverage() { return isAboveAverage; }
    public AboveAverage setIsAboveAverage(Boolean isAboveAverage) { this.isAboveAverage = isAboveAverage; return this; }

    public Boolean getIsEqualAverage() { return isEqualAverage; }
    public AboveAverage setIsEqualAverage(Boolean isEqualAverage) { this.isEqualAverage = isEqualAverage; return this; }

    public Integer getStdDev() { return stdDev; }
    public AboveAverage setStdDev(Integer stdDev) { this.stdDev = stdDev; return this; }

}
