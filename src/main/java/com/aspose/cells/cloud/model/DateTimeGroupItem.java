package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DateTimeGroupItem — Represents the datetime's group setting. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DateTimeGroupItem extends MultipleFilter {
    /** Gets and sets the group type. */
    @JsonProperty("DateTimeGroupingType")
    private String dateTimeGroupingType;

    /** Gets and sets the day of the grouped date time. */
    @JsonProperty("Day")
    private Integer day;

    /** Gets and sets the hour of the grouped date time. */
    @JsonProperty("Hour")
    private Integer hour;

    /** Gets and sets the minute of the grouped date time. */
    @JsonProperty("Minute")
    private Integer minute;

    /** Gets and sets the month of the grouped date time. */
    @JsonProperty("Month")
    private Integer month;

    /** Gets and sets the second of the grouped date time. */
    @JsonProperty("Second")
    private Integer second;

    /** Gets and sets the year of the grouped date time. */
    @JsonProperty("Year")
    private Integer year;

    public String getDateTimeGroupingType() { return dateTimeGroupingType; }
    public DateTimeGroupItem setDateTimeGroupingType(String dateTimeGroupingType) { this.dateTimeGroupingType = dateTimeGroupingType; return this; }

    public Integer getDay() { return day; }
    public DateTimeGroupItem setDay(Integer day) { this.day = day; return this; }

    public Integer getHour() { return hour; }
    public DateTimeGroupItem setHour(Integer hour) { this.hour = hour; return this; }

    public Integer getMinute() { return minute; }
    public DateTimeGroupItem setMinute(Integer minute) { this.minute = minute; return this; }

    public Integer getMonth() { return month; }
    public DateTimeGroupItem setMonth(Integer month) { this.month = month; return this; }

    public Integer getSecond() { return second; }
    public DateTimeGroupItem setSecond(Integer second) { this.second = second; return this; }

    public Integer getYear() { return year; }
    public DateTimeGroupItem setYear(Integer year) { this.year = year; return this; }

}
