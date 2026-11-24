/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataSorter.java">
 *   Copyright (c) 2026 Aspose.Cells Cloud
 * </copyright>
 * <summary>
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 * </summary>
 * --------------------------------------------------------------------------------
 */

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class DataSorter {

    @SerializedName("CaseSensitive")
    @JsonProperty("CaseSensitive")
    private Boolean caseSensitive;

    public DataSorter caseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    @SerializedName("HasHeaders")
    @JsonProperty("HasHeaders")
    private Boolean hasHeaders;

    public DataSorter hasHeaders(Boolean hasHeaders) {
        this.hasHeaders = hasHeaders;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasHeaders() {
        return hasHeaders;
    }

    public void setHasHeaders(Boolean hasHeaders) {
        this.hasHeaders = hasHeaders;
    }

    @SerializedName("KeyList")
    @JsonProperty("KeyList")
    private List<SortKey> keyList;

    public DataSorter keyList(List<SortKey> keyList) {
        this.keyList = keyList;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<SortKey> getKeyList() {
        return keyList;
    }

    public void setKeyList(List<SortKey> keyList) {
        this.keyList = keyList;
    }

    @SerializedName("SortLeftToRight")
    @JsonProperty("SortLeftToRight")
    private Boolean sortLeftToRight;

    public DataSorter sortLeftToRight(Boolean sortLeftToRight) {
        this.sortLeftToRight = sortLeftToRight;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSortLeftToRight() {
        return sortLeftToRight;
    }

    public void setSortLeftToRight(Boolean sortLeftToRight) {
        this.sortLeftToRight = sortLeftToRight;
    }

    @SerializedName("SortAsNumber")
    @JsonProperty("SortAsNumber")
    private Boolean sortAsNumber;

    public DataSorter sortAsNumber(Boolean sortAsNumber) {
        this.sortAsNumber = sortAsNumber;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSortAsNumber() {
        return sortAsNumber;
    }

    public void setSortAsNumber(Boolean sortAsNumber) {
        this.sortAsNumber = sortAsNumber;
    }

    @SerializedName("Keys")
    @JsonProperty("Keys")
    private List<DataSorterKey> keys;

    public DataSorter keys(List<DataSorterKey> keys) {
        this.keys = keys;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<DataSorterKey> getKeys() {
        return keys;
    }

    public void setKeys(List<DataSorterKey> keys) {
        this.keys = keys;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataSorter other = (DataSorter) o;
        return Objects.equals(this.caseSensitive, other.caseSensitive)
            && Objects.equals(this.hasHeaders, other.hasHeaders)
            && Objects.equals(this.keyList, other.keyList)
            && Objects.equals(this.sortLeftToRight, other.sortLeftToRight)
            && Objects.equals(this.sortAsNumber, other.sortAsNumber)
            && Objects.equals(this.keys, other.keys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(caseSensitive, hasHeaders, keyList, sortLeftToRight, sortAsNumber, keys);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSorter {\n");
        sb.append("    caseSensitive: ").append(caseSensitive).append("\n");
        sb.append("    hasHeaders: ").append(hasHeaders).append("\n");
        sb.append("    keyList: ").append(keyList).append("\n");
        sb.append("    sortLeftToRight: ").append(sortLeftToRight).append("\n");
        sb.append("    sortAsNumber: ").append(sortAsNumber).append("\n");
        sb.append("    keys: ").append(keys).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
