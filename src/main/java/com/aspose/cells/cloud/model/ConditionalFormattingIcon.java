package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConditionalFormattingIcon — Represents  the custom  icon of conditional formatting rule. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConditionalFormattingIcon {
    /** Gets the icon set data. */
    @JsonProperty("ImageData")
    private String imageData;

    /** Gets and sets the icon's index in the icon set. */
    @JsonProperty("Index")
    private Integer index;

    /** Gets and sets the icon set type. */
    @JsonProperty("Type")
    private String type;

    public String getImageData() { return imageData; }
    public ConditionalFormattingIcon setImageData(String imageData) { this.imageData = imageData; return this; }

    public Integer getIndex() { return index; }
    public ConditionalFormattingIcon setIndex(Integer index) { this.index = index; return this; }

    public String getType() { return type; }
    public ConditionalFormattingIcon setType(String type) { this.type = type; return this; }

}
