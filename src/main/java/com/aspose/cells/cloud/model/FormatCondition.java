/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FormatCondition.java">
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

public class FormatCondition extends LinkElement {

    @SerializedName("Priority")
    @JsonProperty("Priority")
    private Integer priority;

    public FormatCondition priority(Integer priority) {
        this.priority = priority;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public FormatCondition type(String type) {
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

    @SerializedName("StopIfTrue")
    @JsonProperty("StopIfTrue")
    private Boolean stopIfTrue;

    public FormatCondition stopIfTrue(Boolean stopIfTrue) {
        this.stopIfTrue = stopIfTrue;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getStopIfTrue() {
        return stopIfTrue;
    }

    public void setStopIfTrue(Boolean stopIfTrue) {
        this.stopIfTrue = stopIfTrue;
    }

    @SerializedName("AboveAverage")
    @JsonProperty("AboveAverage")
    private AboveAverage aboveAverage;

    public FormatCondition aboveAverage(AboveAverage aboveAverage) {
        this.aboveAverage = aboveAverage;
        return this;
    }

    @ApiModelProperty(value = "")
    public AboveAverage getAboveAverage() {
        return aboveAverage;
    }

    public void setAboveAverage(AboveAverage aboveAverage) {
        this.aboveAverage = aboveAverage;
    }

    @SerializedName("ColorScale")
    @JsonProperty("ColorScale")
    private ColorScale colorScale;

    public FormatCondition colorScale(ColorScale colorScale) {
        this.colorScale = colorScale;
        return this;
    }

    @ApiModelProperty(value = "")
    public ColorScale getColorScale() {
        return colorScale;
    }

    public void setColorScale(ColorScale colorScale) {
        this.colorScale = colorScale;
    }

    @SerializedName("DataBar")
    @JsonProperty("DataBar")
    private DataBar dataBar;

    public FormatCondition dataBar(DataBar dataBar) {
        this.dataBar = dataBar;
        return this;
    }

    @ApiModelProperty(value = "")
    public DataBar getDataBar() {
        return dataBar;
    }

    public void setDataBar(DataBar dataBar) {
        this.dataBar = dataBar;
    }

    @SerializedName("Formula1")
    @JsonProperty("Formula1")
    private String formula1;

    public FormatCondition formula1(String formula1) {
        this.formula1 = formula1;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormula1() {
        return formula1;
    }

    public void setFormula1(String formula1) {
        this.formula1 = formula1;
    }

    @SerializedName("Formula2")
    @JsonProperty("Formula2")
    private String formula2;

    public FormatCondition formula2(String formula2) {
        this.formula2 = formula2;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFormula2() {
        return formula2;
    }

    public void setFormula2(String formula2) {
        this.formula2 = formula2;
    }

    @SerializedName("IconSet")
    @JsonProperty("IconSet")
    private IconSet iconSet;

    public FormatCondition iconSet(IconSet iconSet) {
        this.iconSet = iconSet;
        return this;
    }

    @ApiModelProperty(value = "")
    public IconSet getIconSet() {
        return iconSet;
    }

    public void setIconSet(IconSet iconSet) {
        this.iconSet = iconSet;
    }

    @SerializedName("Operator")
    @JsonProperty("Operator")
    private String operator;

    public FormatCondition operator(String operator) {
        this.operator = operator;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @SerializedName("Style")
    @JsonProperty("Style")
    private Style style;

    public FormatCondition style(Style style) {
        this.style = style;
        return this;
    }

    @ApiModelProperty(value = "")
    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    @SerializedName("Text")
    @JsonProperty("Text")
    private String text;

    public FormatCondition text(String text) {
        this.text = text;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @SerializedName("TimePeriod")
    @JsonProperty("TimePeriod")
    private String timePeriod;

    public FormatCondition timePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    @SerializedName("Top10")
    @JsonProperty("Top10")
    private Top10 top10;

    public FormatCondition top10(Top10 top10) {
        this.top10 = top10;
        return this;
    }

    @ApiModelProperty(value = "")
    public Top10 getTop10() {
        return top10;
    }

    public void setTop10(Top10 top10) {
        this.top10 = top10;
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
        FormatCondition other = (FormatCondition) o;
        return Objects.equals(this.priority, other.priority)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.stopIfTrue, other.stopIfTrue)
            && Objects.equals(this.aboveAverage, other.aboveAverage)
            && Objects.equals(this.colorScale, other.colorScale)
            && Objects.equals(this.dataBar, other.dataBar)
            && Objects.equals(this.formula1, other.formula1)
            && Objects.equals(this.formula2, other.formula2)
            && Objects.equals(this.iconSet, other.iconSet)
            && Objects.equals(this.operator, other.operator)
            && Objects.equals(this.style, other.style)
            && Objects.equals(this.text, other.text)
            && Objects.equals(this.timePeriod, other.timePeriod)
            && Objects.equals(this.top10, other.top10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority, type, stopIfTrue, aboveAverage, colorScale, dataBar, formula1, formula2, iconSet, operator, style, text, timePeriod, top10, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FormatCondition {\n");
        sb.append("    priority: ").append(priority).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    stopIfTrue: ").append(stopIfTrue).append("\n");
        sb.append("    aboveAverage: ").append(aboveAverage).append("\n");
        sb.append("    colorScale: ").append(colorScale).append("\n");
        sb.append("    dataBar: ").append(dataBar).append("\n");
        sb.append("    formula1: ").append(formula1).append("\n");
        sb.append("    formula2: ").append(formula2).append("\n");
        sb.append("    iconSet: ").append(iconSet).append("\n");
        sb.append("    operator: ").append(operator).append("\n");
        sb.append("    style: ").append(style).append("\n");
        sb.append("    text: ").append(text).append("\n");
        sb.append("    timePeriod: ").append(timePeriod).append("\n");
        sb.append("    top10: ").append(top10).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
