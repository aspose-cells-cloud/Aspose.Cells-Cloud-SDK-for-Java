/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RenderingWatermark.java">
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

public class RenderingWatermark {

    @SerializedName("Rotation")
    @JsonProperty("Rotation")
    private Double rotation;

    public RenderingWatermark rotation(Double rotation) {
        this.rotation = rotation;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getRotation() {
        return rotation;
    }

    public void setRotation(Double rotation) {
        this.rotation = rotation;
    }

    @SerializedName("ScaleToPagePercent")
    @JsonProperty("ScaleToPagePercent")
    private Integer scaleToPagePercent;

    public RenderingWatermark scaleToPagePercent(Integer scaleToPagePercent) {
        this.scaleToPagePercent = scaleToPagePercent;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getScaleToPagePercent() {
        return scaleToPagePercent;
    }

    public void setScaleToPagePercent(Integer scaleToPagePercent) {
        this.scaleToPagePercent = scaleToPagePercent;
    }

    @SerializedName("Opacity")
    @JsonProperty("Opacity")
    private Double opacity;

    public RenderingWatermark opacity(Double opacity) {
        this.opacity = opacity;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getOpacity() {
        return opacity;
    }

    public void setOpacity(Double opacity) {
        this.opacity = opacity;
    }

    @SerializedName("IsBackground")
    @JsonProperty("IsBackground")
    private Boolean isBackground;

    public RenderingWatermark isBackground(Boolean isBackground) {
        this.isBackground = isBackground;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsBackground() {
        return isBackground;
    }

    public void setIsBackground(Boolean isBackground) {
        this.isBackground = isBackground;
    }

    @SerializedName("Text")
    @JsonProperty("Text")
    private String text;

    public RenderingWatermark text(String text) {
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

    @SerializedName("Font")
    @JsonProperty("Font")
    private RenderingFont font;

    public RenderingWatermark font(RenderingFont font) {
        this.font = font;
        return this;
    }

    @ApiModelProperty(value = "")
    public RenderingFont getFont() {
        return font;
    }

    public void setFont(RenderingFont font) {
        this.font = font;
    }

    @SerializedName("Image")
    @JsonProperty("Image")
    private List<Integer> image;

    public RenderingWatermark image(List<Integer> image) {
        this.image = image;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<Integer> getImage() {
        return image;
    }

    public void setImage(List<Integer> image) {
        this.image = image;
    }

    @SerializedName("HAlignment")
    @JsonProperty("HAlignment")
    private String hAlignment;

    public RenderingWatermark hAlignment(String hAlignment) {
        this.hAlignment = hAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getHAlignment() {
        return hAlignment;
    }

    public void setHAlignment(String hAlignment) {
        this.hAlignment = hAlignment;
    }

    @SerializedName("VAlignment")
    @JsonProperty("VAlignment")
    private String vAlignment;

    public RenderingWatermark vAlignment(String vAlignment) {
        this.vAlignment = vAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getVAlignment() {
        return vAlignment;
    }

    public void setVAlignment(String vAlignment) {
        this.vAlignment = vAlignment;
    }

    @SerializedName("OffsetX")
    @JsonProperty("OffsetX")
    private Double offsetX;

    public RenderingWatermark offsetX(Double offsetX) {
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

    public RenderingWatermark offsetY(Double offsetY) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RenderingWatermark other = (RenderingWatermark) o;
        return Objects.equals(this.rotation, other.rotation)
            && Objects.equals(this.scaleToPagePercent, other.scaleToPagePercent)
            && Objects.equals(this.opacity, other.opacity)
            && Objects.equals(this.isBackground, other.isBackground)
            && Objects.equals(this.text, other.text)
            && Objects.equals(this.font, other.font)
            && Objects.equals(this.image, other.image)
            && Objects.equals(this.hAlignment, other.hAlignment)
            && Objects.equals(this.vAlignment, other.vAlignment)
            && Objects.equals(this.offsetX, other.offsetX)
            && Objects.equals(this.offsetY, other.offsetY);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rotation, scaleToPagePercent, opacity, isBackground, text, font, image, hAlignment, vAlignment, offsetX, offsetY);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenderingWatermark {\n");
        sb.append("    rotation: ").append(rotation).append("\n");
        sb.append("    scaleToPagePercent: ").append(scaleToPagePercent).append("\n");
        sb.append("    opacity: ").append(opacity).append("\n");
        sb.append("    isBackground: ").append(isBackground).append("\n");
        sb.append("    text: ").append(text).append("\n");
        sb.append("    font: ").append(font).append("\n");
        sb.append("    image: ").append(image).append("\n");
        sb.append("    hAlignment: ").append(hAlignment).append("\n");
        sb.append("    vAlignment: ").append(vAlignment).append("\n");
        sb.append("    offsetX: ").append(offsetX).append("\n");
        sb.append("    offsetY: ").append(offsetY).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
