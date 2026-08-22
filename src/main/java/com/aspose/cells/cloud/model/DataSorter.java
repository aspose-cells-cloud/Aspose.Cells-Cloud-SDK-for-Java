package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** DataSorter — Summary description for DataSorter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DataSorter {
    /** Gets and sets whether case sensitive when comparing string. */
    @JsonProperty("CaseSensitive")
    private Boolean caseSensitive;

    /** Represents whether the range has headers. */
    @JsonProperty("HasHeaders")
    private Boolean hasHeaders;

    /** Gets the key list of data sorter. */
    @JsonProperty("KeyList")
    private List<SortKey> keyList;

    /** True means that sorting orientation is from left to right. False means that sorting orientation is from top to bottom. The default value is false. */
    @JsonProperty("SortLeftToRight")
    private Boolean sortLeftToRight;

    /** Indicates whether sorting anything that looks like a number. */
    @JsonProperty("SortAsNumber")
    private Boolean sortAsNumber;

    /** Gets the key list of data sorter. */
    @JsonProperty("Keys")
    private List<DataSorterKey> keys;

    public Boolean getCaseSensitive() { return caseSensitive; }
    public DataSorter setCaseSensitive(Boolean caseSensitive) { this.caseSensitive = caseSensitive; return this; }

    public Boolean getHasHeaders() { return hasHeaders; }
    public DataSorter setHasHeaders(Boolean hasHeaders) { this.hasHeaders = hasHeaders; return this; }

    public List<SortKey> getKeyList() { return keyList; }
    public DataSorter setKeyList(List<SortKey> keyList) { this.keyList = keyList; return this; }

    public Boolean getSortLeftToRight() { return sortLeftToRight; }
    public DataSorter setSortLeftToRight(Boolean sortLeftToRight) { this.sortLeftToRight = sortLeftToRight; return this; }

    public Boolean getSortAsNumber() { return sortAsNumber; }
    public DataSorter setSortAsNumber(Boolean sortAsNumber) { this.sortAsNumber = sortAsNumber; return this; }

    public List<DataSorterKey> getKeys() { return keys; }
    public DataSorter setKeys(List<DataSorterKey> keys) { this.keys = keys; return this; }

}
