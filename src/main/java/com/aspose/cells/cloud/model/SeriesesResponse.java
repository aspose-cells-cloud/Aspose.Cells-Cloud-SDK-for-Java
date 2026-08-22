package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SeriesesResponse — Represents the Serieses Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeriesesResponse extends CellsCloudResponse {
    /** A property named "Serieses" of type "SeriesItems" is defined in the class with both getter and setter access. */
    @JsonProperty("Serieses")
    private SeriesItems serieses;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public SeriesItems getSerieses() { return serieses; }
    public SeriesesResponse setSerieses(SeriesItems serieses) { this.serieses = serieses; return this; }

    public Integer getCode() { return code; }
    public SeriesesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public SeriesesResponse setStatus(String status) { this.status = status; return this; }

}
