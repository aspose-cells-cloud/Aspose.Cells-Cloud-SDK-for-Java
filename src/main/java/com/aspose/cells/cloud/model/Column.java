package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Column — Represents a single column in a worksheet. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Column extends LinkElement {
    /** Gets the group level of the column. */
    @JsonProperty("GroupLevel")
    private Integer groupLevel;

    /** Gets the index of this column. */
    @JsonProperty("Index")
    private Integer index;

    /** Indicates whether the column is hidden. */
    @JsonProperty("IsHidden")
    private Boolean isHidden;

    /** Gets and sets the column width in unit of characters. */
    @JsonProperty("Width")
    private Double width;

    /** Gets the style of this column. */
    @JsonProperty("Style")
    private LinkElement style;

    public Integer getGroupLevel() { return groupLevel; }
    public Column setGroupLevel(Integer groupLevel) { this.groupLevel = groupLevel; return this; }

    public Integer getIndex() { return index; }
    public Column setIndex(Integer index) { this.index = index; return this; }

    public Boolean getIsHidden() { return isHidden; }
    public Column setIsHidden(Boolean isHidden) { this.isHidden = isHidden; return this; }

    public Double getWidth() { return width; }
    public Column setWidth(Double width) { this.width = width; return this; }

    public LinkElement getStyle() { return style; }
    public Column setStyle(LinkElement style) { this.style = style; return this; }


    /** Covariant override: keeps fluent chains returning Column. */
    @Override public Column setLink(Link link) { return (Column) super.setLink(link); }

}
