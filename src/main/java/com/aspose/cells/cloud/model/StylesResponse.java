package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StylesResponse — Represents the Styles Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StylesResponse extends CellsCloudResponse {
    /** collection of styles. */
    @JsonProperty("Styles")
    private Styles styles;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Styles getStyles() { return styles; }
    public StylesResponse setStyles(Styles styles) { this.styles = styles; return this; }

    public Integer getCode() { return code; }
    public StylesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public StylesResponse setStatus(String status) { this.status = status; return this; }

}
