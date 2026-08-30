package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BorderResponse — Represents the Border Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BorderResponse extends CellsCloudResponse {
    /** This class has a public property named Border of type Border that can be both read from and written to. */
    @JsonProperty("Border")
    private Border border;

    public Border getBorder() { return border; }
    public BorderResponse setBorder(Border border) { this.border = border; return this; }


    /** Covariant override: keeps fluent chains returning BorderResponse. */
    @Override public BorderResponse setCode(Integer code) { return (BorderResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning BorderResponse. */
    @Override public BorderResponse setStatus(String status) { return (BorderResponse) super.setStatus(status); }

}
