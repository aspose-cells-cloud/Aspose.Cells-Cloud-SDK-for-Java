package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LineResponse — Represents the Line Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineResponse extends CellsCloudResponse {
    /** A public property named "Line" of type Line with both getter and setter methods. */
    @JsonProperty("Line")
    private Line line;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Line getLine() { return line; }
    public LineResponse setLine(Line line) { this.line = line; return this; }

    public Integer getCode() { return code; }
    public LineResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public LineResponse setStatus(String status) { this.status = status; return this; }

}
