/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="GradientFill.java">
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

public class GradientFill {

    @SerializedName("FillType")
    @JsonProperty("FillType")
    private String fillType;

    public GradientFill fillType(String fillType) {
        this.fillType = fillType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFillType() {
        return fillType;
    }

    public void setFillType(String fillType) {
        this.fillType = fillType;
    }

    @SerializedName("DirectionType")
    @JsonProperty("DirectionType")
    private String directionType;

    public GradientFill directionType(String directionType) {
        this.directionType = directionType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDirectionType() {
        return directionType;
    }

    public void setDirectionType(String directionType) {
        this.directionType = directionType;
    }

    @SerializedName("Angle")
    @JsonProperty("Angle")
    private Double angle;

    public GradientFill angle(Double angle) {
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

    @SerializedName("GradientStops")
    @JsonProperty("GradientStops")
    private List<GradientFillStop> gradientStops;

    public GradientFill gradientStops(List<GradientFillStop> gradientStops) {
        this.gradientStops = gradientStops;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<GradientFillStop> getGradientStops() {
        return gradientStops;
    }

    public void setGradientStops(List<GradientFillStop> gradientStops) {
        this.gradientStops = gradientStops;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GradientFill other = (GradientFill) o;
        return Objects.equals(this.fillType, other.fillType)
            && Objects.equals(this.directionType, other.directionType)
            && Objects.equals(this.angle, other.angle)
            && Objects.equals(this.gradientStops, other.gradientStops);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fillType, directionType, angle, gradientStops);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GradientFill {\n");
        sb.append("    fillType: ").append(fillType).append("\n");
        sb.append("    directionType: ").append(directionType).append("\n");
        sb.append("    angle: ").append(angle).append("\n");
        sb.append("    gradientStops: ").append(gradientStops).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
