/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ListBox.java">
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

public class ListBox extends Shape {

    @SerializedName("InputRange")
    @JsonProperty("InputRange")
    private String inputRange;

    public ListBox inputRange(String inputRange) {
        this.inputRange = inputRange;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getInputRange() {
        return inputRange;
    }

    public void setInputRange(String inputRange) {
        this.inputRange = inputRange;
    }

    @SerializedName("ItemCount")
    @JsonProperty("ItemCount")
    private Integer itemCount;

    public ListBox itemCount(Integer itemCount) {
        this.itemCount = itemCount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getItemCount() {
        return itemCount;
    }

    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    @SerializedName("PageChange")
    @JsonProperty("PageChange")
    private Integer pageChange;

    public ListBox pageChange(Integer pageChange) {
        this.pageChange = pageChange;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPageChange() {
        return pageChange;
    }

    public void setPageChange(Integer pageChange) {
        this.pageChange = pageChange;
    }

    @SerializedName("SelectedCells")
    @JsonProperty("SelectedCells")
    private List<LinkElement> selectedCells;

    public ListBox selectedCells(List<LinkElement> selectedCells) {
        this.selectedCells = selectedCells;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<LinkElement> getSelectedCells() {
        return selectedCells;
    }

    public void setSelectedCells(List<LinkElement> selectedCells) {
        this.selectedCells = selectedCells;
    }

    @SerializedName("SelectedIndex")
    @JsonProperty("SelectedIndex")
    private Integer selectedIndex;

    public ListBox selectedIndex(Integer selectedIndex) {
        this.selectedIndex = selectedIndex;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(Integer selectedIndex) {
        this.selectedIndex = selectedIndex;
    }

    @SerializedName("SelectionType")
    @JsonProperty("SelectionType")
    private String selectionType;

    public ListBox selectionType(String selectionType) {
        this.selectionType = selectionType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSelectionType() {
        return selectionType;
    }

    public void setSelectionType(String selectionType) {
        this.selectionType = selectionType;
    }

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private Boolean shadow;

    public ListBox shadow(Boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShadow() {
        return shadow;
    }

    public void setShadow(Boolean shadow) {
        this.shadow = shadow;
    }

    @SerializedName("link")
    @JsonProperty("link")
    private Link link;

    public ListBox link(Link link) {
        this.link = link;
        return this;
    }

    @ApiModelProperty(value = "")
    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        ListBox other = (ListBox) o;
        return Objects.equals(this.inputRange, other.inputRange)
            && Objects.equals(this.itemCount, other.itemCount)
            && Objects.equals(this.pageChange, other.pageChange)
            && Objects.equals(this.selectedCells, other.selectedCells)
            && Objects.equals(this.selectedIndex, other.selectedIndex)
            && Objects.equals(this.selectionType, other.selectionType)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inputRange, itemCount, pageChange, selectedCells, selectedIndex, selectionType, shadow, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBox {\n");
        sb.append("    inputRange: ").append(inputRange).append("\n");
        sb.append("    itemCount: ").append(itemCount).append("\n");
        sb.append("    pageChange: ").append(pageChange).append("\n");
        sb.append("    selectedCells: ").append(selectedCells).append("\n");
        sb.append("    selectedIndex: ").append(selectedIndex).append("\n");
        sb.append("    selectionType: ").append(selectionType).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
