package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** IconFilter — Represents icon filter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IconFilter {
    /** Gets and sets Zero-based index of an icon in an icon set. */
    @JsonProperty("IconId")
    private Integer iconId;

    /** Gets and sets which icon set is used in the filter criteria. */
    @JsonProperty("IconSetType")
    private String iconSetType;

    public Integer getIconId() { return iconId; }
    public IconFilter setIconId(Integer iconId) { this.iconId = iconId; return this; }

    public String getIconSetType() { return iconSetType; }
    public IconFilter setIconSetType(String iconSetType) { this.iconSetType = iconSetType; return this; }

}
