package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Top10Filter — Represents the top 10 filter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Top10Filter {
    /** An integer property named FieldIndex that can be accessed and modified. */
    @JsonProperty("FieldIndex")
    private Integer fieldIndex;

    /** Gets or sets Criteria. */
    @JsonProperty("Criteria")
    private String criteria;

    /** Indicates whether the items is percent. */
    @JsonProperty("IsPercent")
    private Boolean isPercent;

    /** Indicates whether it's top filter. */
    @JsonProperty("IsTop")
    private Boolean isTop;

    /** Gets and sets the items of the filter. */
    @JsonProperty("Items")
    private Integer items;

    public Integer getFieldIndex() { return fieldIndex; }
    public Top10Filter setFieldIndex(Integer fieldIndex) { this.fieldIndex = fieldIndex; return this; }

    public String getCriteria() { return criteria; }
    public Top10Filter setCriteria(String criteria) { this.criteria = criteria; return this; }

    public Boolean getIsPercent() { return isPercent; }
    public Top10Filter setIsPercent(Boolean isPercent) { this.isPercent = isPercent; return this; }

    public Boolean getIsTop() { return isTop; }
    public Top10Filter setIsTop(Boolean isTop) { this.isTop = isTop; return this; }

    public Integer getItems() { return items; }
    public Top10Filter setItems(Integer items) { this.items = items; return this; }

}
