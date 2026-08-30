package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StyleResponse — Represents the Style Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StyleResponse extends CellsCloudResponse {
    /** A property named "Style" of type "Style" is defined with both getter and setter methods. */
    @JsonProperty("Style")
    private Style style;

    public Style getStyle() { return style; }
    public StyleResponse setStyle(Style style) { this.style = style; return this; }


    /** Covariant override: keeps fluent chains returning StyleResponse. */
    @Override public StyleResponse setCode(Integer code) { return (StyleResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning StyleResponse. */
    @Override public StyleResponse setStatus(String status) { return (StyleResponse) super.setStatus(status); }

}
