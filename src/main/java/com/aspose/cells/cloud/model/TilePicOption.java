/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TilePicOption.java">
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

public class TilePicOption {

    @SerializedName("OffsetX")
    @JsonProperty("OffsetX")
    private Double offsetX;

    public TilePicOption offsetX(Double offsetX) {
        this.offsetX = offsetX;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    @SerializedName("OffsetY")
    @JsonProperty("OffsetY")
    private Double offsetY;

    public TilePicOption offsetY(Double offsetY) {
        this.offsetY = offsetY;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    @SerializedName("ScaleX")
    @JsonProperty("ScaleX")
    private Double scaleX;

    public TilePicOption scaleX(Double scaleX) {
        this.scaleX = scaleX;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getScaleX() {
        return scaleX;
    }

    public void setScaleX(Double scaleX) {
        this.scaleX = scaleX;
    }

    @SerializedName("ScaleY")
    @JsonProperty("ScaleY")
    private Double scaleY;

    public TilePicOption scaleY(Double scaleY) {
        this.scaleY = scaleY;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getScaleY() {
        return scaleY;
    }

    public void setScaleY(Double scaleY) {
        this.scaleY = scaleY;
    }

    @SerializedName("AlignmentType")
    @JsonProperty("AlignmentType")
    private String alignmentType;

    public TilePicOption alignmentType(String alignmentType) {
        this.alignmentType = alignmentType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getAlignmentType() {
        return alignmentType;
    }

    public void setAlignmentType(String alignmentType) {
        this.alignmentType = alignmentType;
    }

    @SerializedName("MirrorType")
    @JsonProperty("MirrorType")
    private String mirrorType;

    public TilePicOption mirrorType(String mirrorType) {
        this.mirrorType = mirrorType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getMirrorType() {
        return mirrorType;
    }

    public void setMirrorType(String mirrorType) {
        this.mirrorType = mirrorType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TilePicOption other = (TilePicOption) o;
        return Objects.equals(this.offsetX, other.offsetX)
            && Objects.equals(this.offsetY, other.offsetY)
            && Objects.equals(this.scaleX, other.scaleX)
            && Objects.equals(this.scaleY, other.scaleY)
            && Objects.equals(this.alignmentType, other.alignmentType)
            && Objects.equals(this.mirrorType, other.mirrorType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offsetX, offsetY, scaleX, scaleY, alignmentType, mirrorType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TilePicOption {\n");
        sb.append("    offsetX: ").append(offsetX).append("\n");
        sb.append("    offsetY: ").append(offsetY).append("\n");
        sb.append("    scaleX: ").append(scaleX).append("\n");
        sb.append("    scaleY: ").append(scaleY).append("\n");
        sb.append("    alignmentType: ").append(alignmentType).append("\n");
        sb.append("    mirrorType: ").append(mirrorType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
