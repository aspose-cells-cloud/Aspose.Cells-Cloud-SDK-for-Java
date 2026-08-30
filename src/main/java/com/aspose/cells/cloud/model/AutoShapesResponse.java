package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AutoShapesResponse — Represents the AutoShapes Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AutoShapesResponse extends CellsCloudResponse {
    /** The class has a property named "AutoShapes" decorated with the XmlElement attribute "shapes". */
    @JsonProperty("AutoShapes")
    private AutoShapes autoShapes;

    public AutoShapes getAutoShapes() { return autoShapes; }
    public AutoShapesResponse setAutoShapes(AutoShapes autoShapes) { this.autoShapes = autoShapes; return this; }


    /** Covariant override: keeps fluent chains returning AutoShapesResponse. */
    @Override public AutoShapesResponse setCode(Integer code) { return (AutoShapesResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning AutoShapesResponse. */
    @Override public AutoShapesResponse setStatus(String status) { return (AutoShapesResponse) super.setStatus(status); }

}
