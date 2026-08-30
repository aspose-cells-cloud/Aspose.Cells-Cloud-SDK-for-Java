package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AutoFilterResponse — Represents the AutoFilter Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoFilterResponse extends CellsCloudResponse {
    /** A property named "AutoFilter" with a type of "AutoFilter" that can be read from and written to. */
    @JsonProperty("AutoFilter")
    private AutoFilter autoFilter;

    public AutoFilter getAutoFilter() { return autoFilter; }
    public AutoFilterResponse setAutoFilter(AutoFilter autoFilter) { this.autoFilter = autoFilter; return this; }


    /** Covariant override: keeps fluent chains returning AutoFilterResponse. */
    @Override public AutoFilterResponse setCode(Integer code) { return (AutoFilterResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning AutoFilterResponse. */
    @Override public AutoFilterResponse setStatus(String status) { return (AutoFilterResponse) super.setStatus(status); }

}
