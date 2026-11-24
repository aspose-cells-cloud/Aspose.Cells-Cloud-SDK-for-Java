/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PlotArea.java">
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

public class PlotArea extends ChartFrame {

    @SerializedName("InnerHeight")
    @JsonProperty("InnerHeight")
    private Integer innerHeight;

    public PlotArea innerHeight(Integer innerHeight) {
        this.innerHeight = innerHeight;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getInnerHeight() {
        return innerHeight;
    }

    public void setInnerHeight(Integer innerHeight) {
        this.innerHeight = innerHeight;
    }

    @SerializedName("InnerWidth")
    @JsonProperty("InnerWidth")
    private Integer innerWidth;

    public PlotArea innerWidth(Integer innerWidth) {
        this.innerWidth = innerWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getInnerWidth() {
        return innerWidth;
    }

    public void setInnerWidth(Integer innerWidth) {
        this.innerWidth = innerWidth;
    }

    @SerializedName("InnerX")
    @JsonProperty("InnerX")
    private Integer innerX;

    public PlotArea innerX(Integer innerX) {
        this.innerX = innerX;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getInnerX() {
        return innerX;
    }

    public void setInnerX(Integer innerX) {
        this.innerX = innerX;
    }

    @SerializedName("InnerY")
    @JsonProperty("InnerY")
    private Integer innerY;

    public PlotArea innerY(Integer innerY) {
        this.innerY = innerY;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getInnerY() {
        return innerY;
    }

    public void setInnerY(Integer innerY) {
        this.innerY = innerY;
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
        PlotArea other = (PlotArea) o;
        return Objects.equals(this.innerHeight, other.innerHeight)
            && Objects.equals(this.innerWidth, other.innerWidth)
            && Objects.equals(this.innerX, other.innerX)
            && Objects.equals(this.innerY, other.innerY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(innerHeight, innerWidth, innerX, innerY, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlotArea {\n");
        sb.append("    innerHeight: ").append(innerHeight).append("\n");
        sb.append("    innerWidth: ").append(innerWidth).append("\n");
        sb.append("    innerX: ").append(innerX).append("\n");
        sb.append("    innerY: ").append(innerY).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
