package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DiscoverChart — Represents a chart, which is a chart created based on data analysis of a table. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DiscoverChart {
    /** Represents chart name. */
    @JsonProperty("Name")
    private String name;

    /** Represents worksheet name which is where the chart is located. */
    @JsonProperty("SheetName")
    private String sheetName;

    /** Represents chart title. */
    @JsonProperty("Title")
    private String title;

    /** Represents chart type. */
    @JsonProperty("Type")
    private String type;

    /** Represents chart data range. */
    @JsonProperty("DataRange")
    private String dataRange;

    /** Represents chart thumbnail. Base64String */
    @JsonProperty("Thumbnail")
    private String thumbnail;

    public String getName() { return name; }
    public DiscoverChart setName(String name) { this.name = name; return this; }

    public String getSheetName() { return sheetName; }
    public DiscoverChart setSheetName(String sheetName) { this.sheetName = sheetName; return this; }

    public String getTitle() { return title; }
    public DiscoverChart setTitle(String title) { this.title = title; return this; }

    public String getType() { return type; }
    public DiscoverChart setType(String type) { this.type = type; return this; }

    public String getDataRange() { return dataRange; }
    public DiscoverChart setDataRange(String dataRange) { this.dataRange = dataRange; return this; }

    public String getThumbnail() { return thumbnail; }
    public DiscoverChart setThumbnail(String thumbnail) { this.thumbnail = thumbnail; return this; }

}
