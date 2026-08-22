package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BorderResponse — Represents the Border Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BorderResponse extends CellsCloudResponse {
    /** This class has a public property named Border of type Border that can be both read from and written to. */
    @JsonProperty("Border")
    private Border border;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Border getBorder() { return border; }
    public BorderResponse setBorder(Border border) { this.border = border; return this; }

    public Integer getCode() { return code; }
    public BorderResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public BorderResponse setStatus(String status) { this.status = status; return this; }

}
