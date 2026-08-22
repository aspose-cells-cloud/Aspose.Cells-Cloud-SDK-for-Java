package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ListBoxResponse — Represents the ListBox Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ListBoxResponse extends CellsCloudResponse {
    /** A property "Shape" of type ListBox with read and write access is available for the class. */
    @JsonProperty("Shape")
    private ListBox shape;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public ListBox getShape() { return shape; }
    public ListBoxResponse setShape(ListBox shape) { this.shape = shape; return this; }

    public Integer getCode() { return code; }
    public ListBoxResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public ListBoxResponse setStatus(String status) { this.status = status; return this; }

}
