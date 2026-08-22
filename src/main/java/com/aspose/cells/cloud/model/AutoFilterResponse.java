package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AutoFilterResponse — Represents the AutoFilter Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoFilterResponse extends CellsCloudResponse {
    /** A property named "AutoFilter" with a type of "AutoFilter" that can be read from and written to. */
    @JsonProperty("AutoFilter")
    private AutoFilter autoFilter;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public AutoFilter getAutoFilter() { return autoFilter; }
    public AutoFilterResponse setAutoFilter(AutoFilter autoFilter) { this.autoFilter = autoFilter; return this; }

    public Integer getCode() { return code; }
    public AutoFilterResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public AutoFilterResponse setStatus(String status) { this.status = status; return this; }

}
