package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SortKey — Represents sort key. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SortKey {
    /** Represents the key of sorting. */
    @JsonProperty("Key")
    private Integer key;

    /** Represents the order of sorting. */
    @JsonProperty("SortOrder")
    private String sortOrder;

    /** This class includes a property named CustomList that is an array of strings with both getter and setter methods. */
    @JsonProperty("CustomList")
    private List<String> customList;

    /** Indicates the order of sorting. */
    @JsonProperty("Order")
    private String order;

    /** Gets the sorted column index(absolute position, column A is 0, B is 1, ...). */
    @JsonProperty("Index")
    private Integer index;

    /** Represents the type of sorting. */
    @JsonProperty("Type")
    private String type;

    public Integer getKey() { return key; }
    public SortKey setKey(Integer key) { this.key = key; return this; }

    public String getSortOrder() { return sortOrder; }
    public SortKey setSortOrder(String sortOrder) { this.sortOrder = sortOrder; return this; }

    public List<String> getCustomList() { return customList; }
    public SortKey setCustomList(List<String> customList) { this.customList = customList; return this; }

    public String getOrder() { return order; }
    public SortKey setOrder(String order) { this.order = order; return this; }

    public Integer getIndex() { return index; }
    public SortKey setIndex(Integer index) { this.index = index; return this; }

    public String getType() { return type; }
    public SortKey setType(String type) { this.type = type; return this; }

}
