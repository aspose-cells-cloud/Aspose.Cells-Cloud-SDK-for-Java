package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StyleResponse — Represents the Style Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StyleResponse extends CellsCloudResponse {
    /** A property named "Style" of type "Style" is defined with both getter and setter methods. */
    @JsonProperty("Style")
    private Style style;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Style getStyle() { return style; }
    public StyleResponse setStyle(Style style) { this.style = style; return this; }

    public Integer getCode() { return code; }
    public StyleResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public StyleResponse setStatus(String status) { this.status = status; return this; }

}
