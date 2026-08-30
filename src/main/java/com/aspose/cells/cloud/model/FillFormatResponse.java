package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FillFormatResponse — Represents the FillFormat Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FillFormatResponse extends CellsCloudResponse {
    /** Property Summary: Allows access to the FillFormat property to get or set fill formatting properties for an object. */
    @JsonProperty("FillFormat")
    private FillFormat fillFormat;

    public FillFormat getFillFormat() { return fillFormat; }
    public FillFormatResponse setFillFormat(FillFormat fillFormat) { this.fillFormat = fillFormat; return this; }


    /** Covariant override: keeps fluent chains returning FillFormatResponse. */
    @Override public FillFormatResponse setCode(Integer code) { return (FillFormatResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning FillFormatResponse. */
    @Override public FillFormatResponse setStatus(String status) { return (FillFormatResponse) super.setStatus(status); }

}
