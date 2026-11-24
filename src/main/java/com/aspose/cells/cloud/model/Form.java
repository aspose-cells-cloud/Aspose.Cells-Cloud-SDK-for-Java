/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Form.java">
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

public class Form extends Shape {

    @SerializedName("FormType")
    @JsonProperty("FormType")
    private String formType;

    public Form formType(String formType) {
        this.formType = formType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormType() {
        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    @SerializedName("CheckedValue")
    @JsonProperty("CheckedValue")
    private String checkedValue;

    public Form checkedValue(String checkedValue) {
        this.checkedValue = checkedValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCheckedValue() {
        return checkedValue;
    }

    public void setCheckedValue(String checkedValue) {
        this.checkedValue = checkedValue;
    }

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private Boolean shadow;

    public Form shadow(Boolean shadow) {
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

    @SerializedName("InputRange")
    @JsonProperty("InputRange")
    private String inputRange;

    public Form inputRange(String inputRange) {
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

    @SerializedName("SelectedIndex")
    @JsonProperty("SelectedIndex")
    private Integer selectedIndex;

    public Form selectedIndex(Integer selectedIndex) {
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

    @SerializedName("SelectedValue")
    @JsonProperty("SelectedValue")
    private String selectedValue;

    public Form selectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
    }

    @SerializedName("SelectedCell")
    @JsonProperty("SelectedCell")
    private LinkElement selectedCell;

    public Form selectedCell(LinkElement selectedCell) {
        this.selectedCell = selectedCell;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getSelectedCell() {
        return selectedCell;
    }

    public void setSelectedCell(LinkElement selectedCell) {
        this.selectedCell = selectedCell;
    }

    @SerializedName("DropDownLines")
    @JsonProperty("DropDownLines")
    private Integer dropDownLines;

    public Form dropDownLines(Integer dropDownLines) {
        this.dropDownLines = dropDownLines;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getDropDownLines() {
        return dropDownLines;
    }

    public void setDropDownLines(Integer dropDownLines) {
        this.dropDownLines = dropDownLines;
    }

    @SerializedName("ItemCount")
    @JsonProperty("ItemCount")
    private Integer itemCount;

    public Form itemCount(Integer itemCount) {
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

    @SerializedName("SelectedCells")
    @JsonProperty("SelectedCells")
    private List<LinkElement> selectedCells;

    public Form selectedCells(List<LinkElement> selectedCells) {
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

    @SerializedName("SelectionType")
    @JsonProperty("SelectionType")
    private String selectionType;

    public Form selectionType(String selectionType) {
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

    @SerializedName("IsChecked")
    @JsonProperty("IsChecked")
    private Boolean isChecked;

    public Form isChecked(Boolean isChecked) {
        this.isChecked = isChecked;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Boolean isChecked) {
        this.isChecked = isChecked;
    }

    @SerializedName("CurrentValue")
    @JsonProperty("CurrentValue")
    private Integer currentValue;

    public Form currentValue(Integer currentValue) {
        this.currentValue = currentValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Integer currentValue) {
        this.currentValue = currentValue;
    }

    @SerializedName("Min")
    @JsonProperty("Min")
    private Integer min;

    public Form min(Integer min) {
        this.min = min;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    @SerializedName("Max")
    @JsonProperty("Max")
    private Integer max;

    public Form max(Integer max) {
        this.max = max;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    @SerializedName("IncrementalChange")
    @JsonProperty("IncrementalChange")
    private Integer incrementalChange;

    public Form incrementalChange(Integer incrementalChange) {
        this.incrementalChange = incrementalChange;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getIncrementalChange() {
        return incrementalChange;
    }

    public void setIncrementalChange(Integer incrementalChange) {
        this.incrementalChange = incrementalChange;
    }

    @SerializedName("PageChange")
    @JsonProperty("PageChange")
    private Integer pageChange;

    public Form pageChange(Integer pageChange) {
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

    @SerializedName("IsHorizontal")
    @JsonProperty("IsHorizontal")
    private Boolean isHorizontal;

    public Form isHorizontal(Boolean isHorizontal) {
        this.isHorizontal = isHorizontal;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsHorizontal() {
        return isHorizontal;
    }

    public void setIsHorizontal(Boolean isHorizontal) {
        this.isHorizontal = isHorizontal;
    }

    @SerializedName("link")
    @JsonProperty("link")
    private Link link;

    public Form link(Link link) {
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
        Form other = (Form) o;
        return Objects.equals(this.formType, other.formType)
            && Objects.equals(this.checkedValue, other.checkedValue)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.inputRange, other.inputRange)
            && Objects.equals(this.selectedIndex, other.selectedIndex)
            && Objects.equals(this.selectedValue, other.selectedValue)
            && Objects.equals(this.selectedCell, other.selectedCell)
            && Objects.equals(this.dropDownLines, other.dropDownLines)
            && Objects.equals(this.itemCount, other.itemCount)
            && Objects.equals(this.selectedCells, other.selectedCells)
            && Objects.equals(this.selectionType, other.selectionType)
            && Objects.equals(this.isChecked, other.isChecked)
            && Objects.equals(this.currentValue, other.currentValue)
            && Objects.equals(this.min, other.min)
            && Objects.equals(this.max, other.max)
            && Objects.equals(this.incrementalChange, other.incrementalChange)
            && Objects.equals(this.pageChange, other.pageChange)
            && Objects.equals(this.isHorizontal, other.isHorizontal)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(formType, checkedValue, shadow, inputRange, selectedIndex, selectedValue, selectedCell, dropDownLines, itemCount, selectedCells, selectionType, isChecked, currentValue, min, max, incrementalChange, pageChange, isHorizontal, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Form {\n");
        sb.append("    formType: ").append(formType).append("\n");
        sb.append("    checkedValue: ").append(checkedValue).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    inputRange: ").append(inputRange).append("\n");
        sb.append("    selectedIndex: ").append(selectedIndex).append("\n");
        sb.append("    selectedValue: ").append(selectedValue).append("\n");
        sb.append("    selectedCell: ").append(selectedCell).append("\n");
        sb.append("    dropDownLines: ").append(dropDownLines).append("\n");
        sb.append("    itemCount: ").append(itemCount).append("\n");
        sb.append("    selectedCells: ").append(selectedCells).append("\n");
        sb.append("    selectionType: ").append(selectionType).append("\n");
        sb.append("    isChecked: ").append(isChecked).append("\n");
        sb.append("    currentValue: ").append(currentValue).append("\n");
        sb.append("    min: ").append(min).append("\n");
        sb.append("    max: ").append(max).append("\n");
        sb.append("    incrementalChange: ").append(incrementalChange).append("\n");
        sb.append("    pageChange: ").append(pageChange).append("\n");
        sb.append("    isHorizontal: ").append(isHorizontal).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
