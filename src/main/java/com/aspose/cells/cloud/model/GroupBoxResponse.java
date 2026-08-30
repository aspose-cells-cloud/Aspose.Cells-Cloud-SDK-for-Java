package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** GroupBoxResponse — Represents the GroupBox Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GroupBoxResponse extends CellsCloudResponse {
    /** The class has a property named "Shape" of type GroupBox that can be accessed and modified. */
    @JsonProperty("Shape")
    private GroupBox shape;

    public GroupBox getShape() { return shape; }
    public GroupBoxResponse setShape(GroupBox shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning GroupBoxResponse. */
    @Override public GroupBoxResponse setCode(Integer code) { return (GroupBoxResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning GroupBoxResponse. */
    @Override public GroupBoxResponse setStatus(String status) { return (GroupBoxResponse) super.setStatus(status); }

}
