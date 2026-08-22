package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AutoShapeResponse — Represents the AutoShape Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoShapeResponse extends CellsCloudResponse {
    /** A public property named "AutoShape" of type "AutoShape" with both getter and setter methods. */
    @JsonProperty("AutoShape")
    private AutoShape autoShape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public AutoShape getAutoShape() { return autoShape; }
    public AutoShapeResponse setAutoShape(AutoShape autoShape) { this.autoShape = autoShape; return this; }

    public Integer getCode() { return code; }
    public AutoShapeResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public AutoShapeResponse setStatus(String status) { this.status = status; return this; }

}
