/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ComboBox.java">
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

public class ComboBox extends Shape {

    @SerializedName("DropDownLines")
    @JsonProperty("DropDownLines")
    private Integer dropDownLines;

    public ComboBox dropDownLines(Integer dropDownLines) {
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

    @SerializedName("InputRange")
    @JsonProperty("InputRange")
    private String inputRange;

    public ComboBox inputRange(String inputRange) {
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

    @SerializedName("SelectedCell")
    @JsonProperty("SelectedCell")
    private LinkElement selectedCell;

    public ComboBox selectedCell(LinkElement selectedCell) {
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

    @SerializedName("SelectedIndex")
    @JsonProperty("SelectedIndex")
    private Integer selectedIndex;

    public ComboBox selectedIndex(Integer selectedIndex) {
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

    public ComboBox selectedValue(String selectedValue) {
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

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private Boolean shadow;

    public ComboBox shadow(Boolean shadow) {
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

    public ComboBox link(Link link) {
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
        ComboBox other = (ComboBox) o;
        return Objects.equals(this.dropDownLines, other.dropDownLines)
            && Objects.equals(this.inputRange, other.inputRange)
            && Objects.equals(this.selectedCell, other.selectedCell)
            && Objects.equals(this.selectedIndex, other.selectedIndex)
            && Objects.equals(this.selectedValue, other.selectedValue)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dropDownLines, inputRange, selectedCell, selectedIndex, selectedValue, shadow, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComboBox {\n");
        sb.append("    dropDownLines: ").append(dropDownLines).append("\n");
        sb.append("    inputRange: ").append(inputRange).append("\n");
        sb.append("    selectedCell: ").append(selectedCell).append("\n");
        sb.append("    selectedIndex: ").append(selectedIndex).append("\n");
        sb.append("    selectedValue: ").append(selectedValue).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
