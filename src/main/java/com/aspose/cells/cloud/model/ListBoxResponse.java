package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ListBoxResponse — Represents the ListBox Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListBoxResponse extends CellsCloudResponse {
    /** A property "Shape" of type ListBox with read and write access is available for the class. */
    @JsonProperty("Shape")
    private ListBox shape;

    public ListBox getShape() { return shape; }
    public ListBoxResponse setShape(ListBox shape) { this.shape = shape; return this; }


    /** Covariant override: keeps fluent chains returning ListBoxResponse. */
    @Override public ListBoxResponse setCode(Integer code) { return (ListBoxResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning ListBoxResponse. */
    @Override public ListBoxResponse setStatus(String status) { return (ListBoxResponse) super.setStatus(status); }

}
