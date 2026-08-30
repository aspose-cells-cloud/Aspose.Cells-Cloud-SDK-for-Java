package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Row — Represents a single row in a worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Row extends LinkElement {
    /** Gets the group level of the row. */
    @JsonProperty("GroupLevel")
    private Integer groupLevel;

    /** Gets and sets the row height in unit of Points. */
    @JsonProperty("Height")
    private Double height;

    /** Gets the index of this row. */
    @JsonProperty("Index")
    private Integer index;

    /** Indicates whether the row contains any data */
    @JsonProperty("IsBlank")
    private Boolean isBlank;

    /** Indicates that row height and default font height matches. */
    @JsonProperty("IsHeightMatched")
    private Boolean isHeightMatched;

    /** Indicates whether the row is hidden. */
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    /** Represents the style of this row. */
    @JsonProperty("Style")
    private LinkElement style;

    public Integer getGroupLevel() { return groupLevel; }
    public Row setGroupLevel(Integer groupLevel) { this.groupLevel = groupLevel; return this; }

    public Double getHeight() { return height; }
    public Row setHeight(Double height) { this.height = height; return this; }

    public Integer getIndex() { return index; }
    public Row setIndex(Integer index) { this.index = index; return this; }

    public Boolean getIsBlank() { return isBlank; }
    public Row setIsBlank(Boolean isBlank) { this.isBlank = isBlank; return this; }

    public Boolean getIsHeightMatched() { return isHeightMatched; }
    public Row setIsHeightMatched(Boolean isHeightMatched) { this.isHeightMatched = isHeightMatched; return this; }

    public Boolean getIsHidden() { return isHidden; }
    public Row setIsHidden(Boolean isHidden) { this.isHidden = isHidden; return this; }

    public LinkElement getStyle() { return style; }
    public Row setStyle(LinkElement style) { this.style = style; return this; }


    /** Covariant override: keeps fluent chains returning Row. */
    @Override public Row setLink(Link link) { return (Row) super.setLink(link); }

}
