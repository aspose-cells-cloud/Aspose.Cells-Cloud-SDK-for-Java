package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SeriesResponse — Represents the Series Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeriesResponse extends CellsCloudResponse {
    /** A public property named "Series" of type Series with both getter and setter methods. */
    @JsonProperty("Series")
    private Series series;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Series getSeries() { return series; }
    public SeriesResponse setSeries(Series series) { this.series = series; return this; }

    public Integer getCode() { return code; }
    public SeriesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public SeriesResponse setStatus(String status) { this.status = status; return this; }

}
