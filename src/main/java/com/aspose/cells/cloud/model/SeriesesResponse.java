package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SeriesesResponse — Represents the Serieses Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeriesesResponse extends CellsCloudResponse {
    /** A property named "Serieses" of type "SeriesItems" is defined in the class with both getter and setter access. */
    @JsonProperty("Serieses")
    private SeriesItems serieses;

    public SeriesItems getSerieses() { return serieses; }
    public SeriesesResponse setSerieses(SeriesItems serieses) { this.serieses = serieses; return this; }


    /** Covariant override: keeps fluent chains returning SeriesesResponse. */
    @Override public SeriesesResponse setCode(Integer code) { return (SeriesesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning SeriesesResponse. */
    @Override public SeriesesResponse setStatus(String status) { return (SeriesesResponse) super.setStatus(status); }

}
