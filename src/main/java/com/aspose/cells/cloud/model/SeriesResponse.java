package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SeriesResponse — Represents the Series Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeriesResponse extends CellsCloudResponse {
    /** A public property named "Series" of type Series with both getter and setter methods. */
    @JsonProperty("Series")
    private Series series;

    public Series getSeries() { return series; }
    public SeriesResponse setSeries(Series series) { this.series = series; return this; }


    /** Covariant override: keeps fluent chains returning SeriesResponse. */
    @Override public SeriesResponse setCode(Integer code) { return (SeriesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SeriesResponse. */
    @Override public SeriesResponse setStatus(String status) { return (SeriesResponse) super.setStatus(status); }

}
