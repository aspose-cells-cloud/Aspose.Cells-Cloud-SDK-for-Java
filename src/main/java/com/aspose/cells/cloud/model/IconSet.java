/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="IconSet.java">
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

public class IconSet {

    @SerializedName("CfIcons")
    @JsonProperty("CfIcons")
    private List<ConditionalFormattingIcon> cfIcons;

    public IconSet cfIcons(List<ConditionalFormattingIcon> cfIcons) {
        this.cfIcons = cfIcons;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<ConditionalFormattingIcon> getCfIcons() {
        return cfIcons;
    }

    public void setCfIcons(List<ConditionalFormattingIcon> cfIcons) {
        this.cfIcons = cfIcons;
    }

    @SerializedName("Cfvos")
    @JsonProperty("Cfvos")
    private List<ConditionalFormattingValue> cfvos;

    public IconSet cfvos(List<ConditionalFormattingValue> cfvos) {
        this.cfvos = cfvos;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<ConditionalFormattingValue> getCfvos() {
        return cfvos;
    }

    public void setCfvos(List<ConditionalFormattingValue> cfvos) {
        this.cfvos = cfvos;
    }

    @SerializedName("IsCustom")
    @JsonProperty("IsCustom")
    private Boolean isCustom;

    public IconSet isCustom(Boolean isCustom) {
        this.isCustom = isCustom;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(Boolean isCustom) {
        this.isCustom = isCustom;
    }

    @SerializedName("Reverse")
    @JsonProperty("Reverse")
    private Boolean reverse;

    public IconSet reverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getReverse() {
        return reverse;
    }

    public void setReverse(Boolean reverse) {
        this.reverse = reverse;
    }

    @SerializedName("ShowValue")
    @JsonProperty("ShowValue")
    private Boolean showValue;

    public IconSet showValue(Boolean showValue) {
        this.showValue = showValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowValue() {
        return showValue;
    }

    public void setShowValue(Boolean showValue) {
        this.showValue = showValue;
    }

    @SerializedName("IconSetType")
    @JsonProperty("IconSetType")
    private String iconSetType;

    public IconSet iconSetType(String iconSetType) {
        this.iconSetType = iconSetType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getIconSetType() {
        return iconSetType;
    }

    public void setIconSetType(String iconSetType) {
        this.iconSetType = iconSetType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IconSet other = (IconSet) o;
        return Objects.equals(this.cfIcons, other.cfIcons)
            && Objects.equals(this.cfvos, other.cfvos)
            && Objects.equals(this.isCustom, other.isCustom)
            && Objects.equals(this.reverse, other.reverse)
            && Objects.equals(this.showValue, other.showValue)
            && Objects.equals(this.iconSetType, other.iconSetType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cfIcons, cfvos, isCustom, reverse, showValue, iconSetType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IconSet {\n");
        sb.append("    cfIcons: ").append(cfIcons).append("\n");
        sb.append("    cfvos: ").append(cfvos).append("\n");
        sb.append("    isCustom: ").append(isCustom).append("\n");
        sb.append("    reverse: ").append(reverse).append("\n");
        sb.append("    showValue: ").append(showValue).append("\n");
        sb.append("    iconSetType: ").append(iconSetType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
