/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ShadowEffect.java">
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

public class ShadowEffect {

    @SerializedName("Angle")
    @JsonProperty("Angle")
    private Double angle;

    public ShadowEffect angle(Double angle) {
        this.angle = angle;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getAngle() {
        return angle;
    }

    public void setAngle(Double angle) {
        this.angle = angle;
    }

    @SerializedName("Blur")
    @JsonProperty("Blur")
    private Double blur;

    public ShadowEffect blur(Double blur) {
        this.blur = blur;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getBlur() {
        return blur;
    }

    public void setBlur(Double blur) {
        this.blur = blur;
    }

    @SerializedName("Color")
    @JsonProperty("Color")
    private CellsColor color;

    public ShadowEffect color(CellsColor color) {
        this.color = color;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getColor() {
        return color;
    }

    public void setColor(CellsColor color) {
        this.color = color;
    }

    @SerializedName("Distance")
    @JsonProperty("Distance")
    private Double distance;

    public ShadowEffect distance(Double distance) {
        this.distance = distance;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    @SerializedName("PresetType")
    @JsonProperty("PresetType")
    private String presetType;

    public ShadowEffect presetType(String presetType) {
        this.presetType = presetType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPresetType() {
        return presetType;
    }

    public void setPresetType(String presetType) {
        this.presetType = presetType;
    }

    @SerializedName("Size")
    @JsonProperty("Size")
    private Double size;

    public ShadowEffect size(Double size) {
        this.size = size;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @SerializedName("Transparency")
    @JsonProperty("Transparency")
    private Double transparency;

    public ShadowEffect transparency(Double transparency) {
        this.transparency = transparency;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getTransparency() {
        return transparency;
    }

    public void setTransparency(Double transparency) {
        this.transparency = transparency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShadowEffect other = (ShadowEffect) o;
        return Objects.equals(this.angle, other.angle)
            && Objects.equals(this.blur, other.blur)
            && Objects.equals(this.color, other.color)
            && Objects.equals(this.distance, other.distance)
            && Objects.equals(this.presetType, other.presetType)
            && Objects.equals(this.size, other.size)
            && Objects.equals(this.transparency, other.transparency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(angle, blur, color, distance, presetType, size, transparency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShadowEffect {\n");
        sb.append("    angle: ").append(angle).append("\n");
        sb.append("    blur: ").append(blur).append("\n");
        sb.append("    color: ").append(color).append("\n");
        sb.append("    distance: ").append(distance).append("\n");
        sb.append("    presetType: ").append(presetType).append("\n");
        sb.append("    size: ").append(size).append("\n");
        sb.append("    transparency: ").append(transparency).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
