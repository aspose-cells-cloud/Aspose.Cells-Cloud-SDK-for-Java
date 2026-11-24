/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ErrorBar.java">
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

public class ErrorBar extends Line {

    @SerializedName("Link")
    @JsonProperty("Link")
    private Link link;

    public ErrorBar link(Link link) {
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

    @SerializedName("Amount")
    @JsonProperty("Amount")
    private Double amount;

    public ErrorBar amount(Double amount) {
        this.amount = amount;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @SerializedName("DisplayType")
    @JsonProperty("DisplayType")
    private String displayType;

    public ErrorBar displayType(String displayType) {
        this.displayType = displayType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    @SerializedName("MinusValue")
    @JsonProperty("MinusValue")
    private String minusValue;

    public ErrorBar minusValue(String minusValue) {
        this.minusValue = minusValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMinusValue() {
        return minusValue;
    }

    public void setMinusValue(String minusValue) {
        this.minusValue = minusValue;
    }

    @SerializedName("PlusValue")
    @JsonProperty("PlusValue")
    private String plusValue;

    public ErrorBar plusValue(String plusValue) {
        this.plusValue = plusValue;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPlusValue() {
        return plusValue;
    }

    public void setPlusValue(String plusValue) {
        this.plusValue = plusValue;
    }

    @SerializedName("ShowMarkerTTop")
    @JsonProperty("ShowMarkerTTop")
    private Boolean showMarkerTTop;

    public ErrorBar showMarkerTTop(Boolean showMarkerTTop) {
        this.showMarkerTTop = showMarkerTTop;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getShowMarkerTTop() {
        return showMarkerTTop;
    }

    public void setShowMarkerTTop(Boolean showMarkerTTop) {
        this.showMarkerTTop = showMarkerTTop;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public ErrorBar type(String type) {
        this.type = type;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        ErrorBar other = (ErrorBar) o;
        return Objects.equals(this.link, other.link)
            && Objects.equals(this.amount, other.amount)
            && Objects.equals(this.displayType, other.displayType)
            && Objects.equals(this.minusValue, other.minusValue)
            && Objects.equals(this.plusValue, other.plusValue)
            && Objects.equals(this.showMarkerTTop, other.showMarkerTTop)
            && Objects.equals(this.type, other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, amount, displayType, minusValue, plusValue, showMarkerTTop, type, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorBar {\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("    amount: ").append(amount).append("\n");
        sb.append("    displayType: ").append(displayType).append("\n");
        sb.append("    minusValue: ").append(minusValue).append("\n");
        sb.append("    plusValue: ").append(plusValue).append("\n");
        sb.append("    showMarkerTTop: ").append(showMarkerTTop).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
