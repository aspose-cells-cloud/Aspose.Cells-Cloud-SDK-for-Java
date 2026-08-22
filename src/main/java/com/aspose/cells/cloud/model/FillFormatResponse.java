package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FillFormatResponse — Represents the FillFormat Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FillFormatResponse extends CellsCloudResponse {
    /** Property Summary: Allows access to the FillFormat property to get or set fill formatting properties for an object. */
    @JsonProperty("FillFormat")
    private FillFormat fillFormat;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public FillFormat getFillFormat() { return fillFormat; }
    public FillFormatResponse setFillFormat(FillFormat fillFormat) { this.fillFormat = fillFormat; return this; }

    public Integer getCode() { return code; }
    public FillFormatResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public FillFormatResponse setStatus(String status) { this.status = status; return this; }

}
