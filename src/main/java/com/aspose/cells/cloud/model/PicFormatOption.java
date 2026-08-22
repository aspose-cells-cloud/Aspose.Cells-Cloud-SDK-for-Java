package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PicFormatOption — Represents picture format option */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PicFormatOption {
    /** Gets or sets the picture fill type. */
    @JsonProperty("Type")
    private String type;

    /** Gets or sets how many the picture stack and scale with. */
    @JsonProperty("Scale")
    private Double scale;

    /** Gets or sets the left offset for stretching picture. */
    @JsonProperty("Left")
    private Double left;

    /** Gets or sets the right offset for stretching picture. */
    @JsonProperty("Right")
    private Double right;

    /** Gets or sets the top offset for stretching picture. */
    @JsonProperty("Top")
    private Double top;

    /** Gets or sets the bottom offset for stretching picture. */
    @JsonProperty("Bottom")
    private Double bottom;

    public String getType() { return type; }
    public PicFormatOption setType(String type) { this.type = type; return this; }

    public Double getScale() { return scale; }
    public PicFormatOption setScale(Double scale) { this.scale = scale; return this; }

    public Double getLeft() { return left; }
    public PicFormatOption setLeft(Double left) { this.left = left; return this; }

    public Double getRight() { return right; }
    public PicFormatOption setRight(Double right) { this.right = right; return this; }

    public Double getTop() { return top; }
    public PicFormatOption setTop(Double top) { this.top = top; return this; }

    public Double getBottom() { return bottom; }
    public PicFormatOption setBottom(Double bottom) { this.bottom = bottom; return this; }

}
