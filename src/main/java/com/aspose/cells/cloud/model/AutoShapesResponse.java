package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AutoShapesResponse — Represents the AutoShapes Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoShapesResponse extends CellsCloudResponse {
    /** The class has a property named "AutoShapes" decorated with the XmlElement attribute "shapes". */
    @JsonProperty("AutoShapes")
    private AutoShapes autoShapes;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public AutoShapes getAutoShapes() { return autoShapes; }
    public AutoShapesResponse setAutoShapes(AutoShapes autoShapes) { this.autoShapes = autoShapes; return this; }

    public Integer getCode() { return code; }
    public AutoShapesResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public AutoShapesResponse setStatus(String status) { this.status = status; return this; }

}
