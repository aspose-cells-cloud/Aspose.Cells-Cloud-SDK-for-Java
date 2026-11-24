/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ColorScale.java">
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

public class ColorScale {

    @SerializedName("MaxCfvo")
    @JsonProperty("MaxCfvo")
    private ConditionalFormattingValue maxCfvo;

    public ColorScale maxCfvo(ConditionalFormattingValue maxCfvo) {
        this.maxCfvo = maxCfvo;
        return this;
    }

    @ApiModelProperty(value = "")
    public ConditionalFormattingValue getMaxCfvo() {
        return maxCfvo;
    }

    public void setMaxCfvo(ConditionalFormattingValue maxCfvo) {
        this.maxCfvo = maxCfvo;
    }

    @SerializedName("MaxColor")
    @JsonProperty("MaxColor")
    private Color maxColor;

    public ColorScale maxColor(Color maxColor) {
        this.maxColor = maxColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getMaxColor() {
        return maxColor;
    }

    public void setMaxColor(Color maxColor) {
        this.maxColor = maxColor;
    }

    @SerializedName("MidCfvo")
    @JsonProperty("MidCfvo")
    private ConditionalFormattingValue midCfvo;

    public ColorScale midCfvo(ConditionalFormattingValue midCfvo) {
        this.midCfvo = midCfvo;
        return this;
    }

    @ApiModelProperty(value = "")
    public ConditionalFormattingValue getMidCfvo() {
        return midCfvo;
    }

    public void setMidCfvo(ConditionalFormattingValue midCfvo) {
        this.midCfvo = midCfvo;
    }

    @SerializedName("MidColor")
    @JsonProperty("MidColor")
    private Color midColor;

    public ColorScale midColor(Color midColor) {
        this.midColor = midColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getMidColor() {
        return midColor;
    }

    public void setMidColor(Color midColor) {
        this.midColor = midColor;
    }

    @SerializedName("MinCfvo")
    @JsonProperty("MinCfvo")
    private ConditionalFormattingValue minCfvo;

    public ColorScale minCfvo(ConditionalFormattingValue minCfvo) {
        this.minCfvo = minCfvo;
        return this;
    }

    @ApiModelProperty(value = "")
    public ConditionalFormattingValue getMinCfvo() {
        return minCfvo;
    }

    public void setMinCfvo(ConditionalFormattingValue minCfvo) {
        this.minCfvo = minCfvo;
    }

    @SerializedName("MinColor")
    @JsonProperty("MinColor")
    private Color minColor;

    public ColorScale minColor(Color minColor) {
        this.minColor = minColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getMinColor() {
        return minColor;
    }

    public void setMinColor(Color minColor) {
        this.minColor = minColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ColorScale other = (ColorScale) o;
        return Objects.equals(this.maxCfvo, other.maxCfvo)
            && Objects.equals(this.maxColor, other.maxColor)
            && Objects.equals(this.midCfvo, other.midCfvo)
            && Objects.equals(this.midColor, other.midColor)
            && Objects.equals(this.minCfvo, other.minCfvo)
            && Objects.equals(this.minColor, other.minColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxCfvo, maxColor, midCfvo, midColor, minCfvo, minColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ColorScale {\n");
        sb.append("    maxCfvo: ").append(maxCfvo).append("\n");
        sb.append("    maxColor: ").append(maxColor).append("\n");
        sb.append("    midCfvo: ").append(midCfvo).append("\n");
        sb.append("    midColor: ").append(midColor).append("\n");
        sb.append("    minCfvo: ").append(minCfvo).append("\n");
        sb.append("    minColor: ").append(minColor).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
