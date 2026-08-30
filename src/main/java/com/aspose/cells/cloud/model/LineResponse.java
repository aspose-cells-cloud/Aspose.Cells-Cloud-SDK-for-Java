package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LineResponse — Represents the Line Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LineResponse extends CellsCloudResponse {
    /** A public property named "Line" of type Line with both getter and setter methods. */
    @JsonProperty("Line")
    private Line line;

    public Line getLine() { return line; }
    public LineResponse setLine(Line line) { this.line = line; return this; }


    /** Covariant override: keeps fluent chains returning LineResponse. */
    @Override public LineResponse setCode(Integer code) { return (LineResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning LineResponse. */
    @Override public LineResponse setStatus(String status) { return (LineResponse) super.setStatus(status); }

}
