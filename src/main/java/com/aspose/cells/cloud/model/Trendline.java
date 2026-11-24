/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Trendline.java">
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

public class Trendline extends Line {

    @SerializedName("link")
    @JsonProperty("link")
    private Link link;

    public Trendline link(Link link) {
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

    @SerializedName("Backward")
    @JsonProperty("Backward")
    private Double backward;

    public Trendline backward(Double backward) {
        this.backward = backward;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getBackward() {
        return backward;
    }

    public void setBackward(Double backward) {
        this.backward = backward;
    }

    @SerializedName("DataLabels")
    @JsonProperty("DataLabels")
    private DataLabels dataLabels;

    public Trendline dataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataLabels getDataLabels() {
        return dataLabels;
    }

    public void setDataLabels(DataLabels dataLabels) {
        this.dataLabels = dataLabels;
    }

    @SerializedName("DisplayEquation")
    @JsonProperty("DisplayEquation")
    private Boolean displayEquation;

    public Trendline displayEquation(Boolean displayEquation) {
        this.displayEquation = displayEquation;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDisplayEquation() {
        return displayEquation;
    }

    public void setDisplayEquation(Boolean displayEquation) {
        this.displayEquation = displayEquation;
    }

    @SerializedName("DisplayRSquared")
    @JsonProperty("DisplayRSquared")
    private Boolean displayRSquared;

    public Trendline displayRSquared(Boolean displayRSquared) {
        this.displayRSquared = displayRSquared;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDisplayRSquared() {
        return displayRSquared;
    }

    public void setDisplayRSquared(Boolean displayRSquared) {
        this.displayRSquared = displayRSquared;
    }

    @SerializedName("Forward")
    @JsonProperty("Forward")
    private Double forward;

    public Trendline forward(Double forward) {
        this.forward = forward;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getForward() {
        return forward;
    }

    public void setForward(Double forward) {
        this.forward = forward;
    }

    @SerializedName("Intercept")
    @JsonProperty("Intercept")
    private Double intercept;

    public Trendline intercept(Double intercept) {
        this.intercept = intercept;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getIntercept() {
        return intercept;
    }

    public void setIntercept(Double intercept) {
        this.intercept = intercept;
    }

    @SerializedName("IsNameAuto")
    @JsonProperty("IsNameAuto")
    private Boolean isNameAuto;

    public Trendline isNameAuto(Boolean isNameAuto) {
        this.isNameAuto = isNameAuto;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsNameAuto() {
        return isNameAuto;
    }

    public void setIsNameAuto(Boolean isNameAuto) {
        this.isNameAuto = isNameAuto;
    }

    @SerializedName("LegendEntry")
    @JsonProperty("LegendEntry")
    private LegendEntry legendEntry;

    public Trendline legendEntry(LegendEntry legendEntry) {
        this.legendEntry = legendEntry;
        return this;
    }

    @ApiModelProperty(value = "")
    public LegendEntry getLegendEntry() {
        return legendEntry;
    }

    public void setLegendEntry(LegendEntry legendEntry) {
        this.legendEntry = legendEntry;
    }

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public Trendline name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("Order")
    @JsonProperty("Order")
    private Integer order;

    public Trendline order(Integer order) {
        this.order = order;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    @SerializedName("Period")
    @JsonProperty("Period")
    private Integer period;

    public Trendline period(Integer period) {
        this.period = period;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public Trendline type(String type) {
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
        Trendline other = (Trendline) o;
        return Objects.equals(this.link, other.link)
            && Objects.equals(this.backward, other.backward)
            && Objects.equals(this.dataLabels, other.dataLabels)
            && Objects.equals(this.displayEquation, other.displayEquation)
            && Objects.equals(this.displayRSquared, other.displayRSquared)
            && Objects.equals(this.forward, other.forward)
            && Objects.equals(this.intercept, other.intercept)
            && Objects.equals(this.isNameAuto, other.isNameAuto)
            && Objects.equals(this.legendEntry, other.legendEntry)
            && Objects.equals(this.name, other.name)
            && Objects.equals(this.order, other.order)
            && Objects.equals(this.period, other.period)
            && Objects.equals(this.type, other.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(link, backward, dataLabels, displayEquation, displayRSquared, forward, intercept, isNameAuto, legendEntry, name, order, period, type, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Trendline {\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("    backward: ").append(backward).append("\n");
        sb.append("    dataLabels: ").append(dataLabels).append("\n");
        sb.append("    displayEquation: ").append(displayEquation).append("\n");
        sb.append("    displayRSquared: ").append(displayRSquared).append("\n");
        sb.append("    forward: ").append(forward).append("\n");
        sb.append("    intercept: ").append(intercept).append("\n");
        sb.append("    isNameAuto: ").append(isNameAuto).append("\n");
        sb.append("    legendEntry: ").append(legendEntry).append("\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    order: ").append(order).append("\n");
        sb.append("    period: ").append(period).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
