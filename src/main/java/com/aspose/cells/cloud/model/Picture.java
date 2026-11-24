/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Picture.java">
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

public class Picture extends Shape {

    @SerializedName("BorderLineColor")
    @JsonProperty("BorderLineColor")
    private Color borderLineColor;

    public Picture borderLineColor(Color borderLineColor) {
        this.borderLineColor = borderLineColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getBorderLineColor() {
        return borderLineColor;
    }

    public void setBorderLineColor(Color borderLineColor) {
        this.borderLineColor = borderLineColor;
    }

    @SerializedName("BorderWeight")
    @JsonProperty("BorderWeight")
    private Double borderWeight;

    public Picture borderWeight(Double borderWeight) {
        this.borderWeight = borderWeight;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getBorderWeight() {
        return borderWeight;
    }

    public void setBorderWeight(Double borderWeight) {
        this.borderWeight = borderWeight;
    }

    @SerializedName("OriginalHeight")
    @JsonProperty("OriginalHeight")
    private Integer originalHeight;

    public Picture originalHeight(Integer originalHeight) {
        this.originalHeight = originalHeight;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getOriginalHeight() {
        return originalHeight;
    }

    public void setOriginalHeight(Integer originalHeight) {
        this.originalHeight = originalHeight;
    }

    @SerializedName("OriginalWidth")
    @JsonProperty("OriginalWidth")
    private Integer originalWidth;

    public Picture originalWidth(Integer originalWidth) {
        this.originalWidth = originalWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getOriginalWidth() {
        return originalWidth;
    }

    public void setOriginalWidth(Integer originalWidth) {
        this.originalWidth = originalWidth;
    }

    @SerializedName("ImageFormat")
    @JsonProperty("ImageFormat")
    private String imageFormat;

    public Picture imageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getImageFormat() {
        return imageFormat;
    }

    public void setImageFormat(String imageFormat) {
        this.imageFormat = imageFormat;
    }

    @SerializedName("SourceFullName")
    @JsonProperty("SourceFullName")
    private String sourceFullName;

    public Picture sourceFullName(String sourceFullName) {
        this.sourceFullName = sourceFullName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSourceFullName() {
        return sourceFullName;
    }

    public void setSourceFullName(String sourceFullName) {
        this.sourceFullName = sourceFullName;
    }

    @SerializedName("link")
    @JsonProperty("link")
    private Link link;

    public Picture link(Link link) {
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
        Picture other = (Picture) o;
        return Objects.equals(this.borderLineColor, other.borderLineColor)
            && Objects.equals(this.borderWeight, other.borderWeight)
            && Objects.equals(this.originalHeight, other.originalHeight)
            && Objects.equals(this.originalWidth, other.originalWidth)
            && Objects.equals(this.imageFormat, other.imageFormat)
            && Objects.equals(this.sourceFullName, other.sourceFullName)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(borderLineColor, borderWeight, originalHeight, originalWidth, imageFormat, sourceFullName, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Picture {\n");
        sb.append("    borderLineColor: ").append(borderLineColor).append("\n");
        sb.append("    borderWeight: ").append(borderWeight).append("\n");
        sb.append("    originalHeight: ").append(originalHeight).append("\n");
        sb.append("    originalWidth: ").append(originalWidth).append("\n");
        sb.append("    imageFormat: ").append(imageFormat).append("\n");
        sb.append("    sourceFullName: ").append(sourceFullName).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
