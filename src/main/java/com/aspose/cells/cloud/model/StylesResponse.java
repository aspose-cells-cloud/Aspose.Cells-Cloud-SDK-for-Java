package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StylesResponse — Represents the Styles Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StylesResponse extends CellsCloudResponse {
    /** collection of styles. */
    @JsonProperty("Styles")
    private Styles styles;

    public Styles getStyles() { return styles; }
    public StylesResponse setStyles(Styles styles) { this.styles = styles; return this; }


    /** Covariant override: keeps fluent chains returning StylesResponse. */
    @Override public StylesResponse setCode(Integer code) { return (StylesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning StylesResponse. */
    @Override public StylesResponse setStatus(String status) { return (StylesResponse) super.setStatus(status); }

}
