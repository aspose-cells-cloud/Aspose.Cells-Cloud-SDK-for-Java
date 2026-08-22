package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DataSorterKey — Represents the key of the data sorter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSorterKey {
    /** Indicates the order of sorting. */
    @JsonProperty("Order")
    private String order;

    /** Gets the sorted column index(absolute position, column A is 0, B is 1, ...). */
    @JsonProperty("Index")
    private Integer index;

    /** Represents the type of sorting. */
    @JsonProperty("Type")
    private String type;

    /** Represents the icon set type. */
    @JsonProperty("IconSetType")
    private String iconSetType;

    /** Represents the id of the icon set type. */
    @JsonProperty("IconId")
    private Integer iconId;

    /** Gets the sorted color. */
    @JsonProperty("Color")
    private Color color;

    public String getOrder() { return order; }
    public DataSorterKey setOrder(String order) { this.order = order; return this; }

    public Integer getIndex() { return index; }
    public DataSorterKey setIndex(Integer index) { this.index = index; return this; }

    public String getType() { return type; }
    public DataSorterKey setType(String type) { this.type = type; return this; }

    public String getIconSetType() { return iconSetType; }
    public DataSorterKey setIconSetType(String iconSetType) { this.iconSetType = iconSetType; return this; }

    public Integer getIconId() { return iconId; }
    public DataSorterKey setIconId(Integer iconId) { this.iconId = iconId; return this; }

    public Color getColor() { return color; }
    public DataSorterKey setColor(Color color) { this.color = color; return this; }

}
