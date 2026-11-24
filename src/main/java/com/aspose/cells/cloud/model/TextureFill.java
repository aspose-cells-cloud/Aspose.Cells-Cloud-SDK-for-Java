/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextureFill.java">
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

public class TextureFill {

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public TextureFill type(String type) {
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

    @SerializedName("Transparency")
    @JsonProperty("Transparency")
    private Double transparency;

    public TextureFill transparency(Double transparency) {
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

    @SerializedName("Scale")
    @JsonProperty("Scale")
    private Double scale;

    public TextureFill scale(Double scale) {
        this.scale = scale;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    @SerializedName("TilePicOption")
    @JsonProperty("TilePicOption")
    private TilePicOption tilePicOption;

    public TextureFill tilePicOption(TilePicOption tilePicOption) {
        this.tilePicOption = tilePicOption;
        return this;
    }

    @ApiModelProperty(value = "")
    public TilePicOption getTilePicOption() {
        return tilePicOption;
    }

    public void setTilePicOption(TilePicOption tilePicOption) {
        this.tilePicOption = tilePicOption;
    }

    @SerializedName("PicFormatOption")
    @JsonProperty("PicFormatOption")
    private PicFormatOption picFormatOption;

    public TextureFill picFormatOption(PicFormatOption picFormatOption) {
        this.picFormatOption = picFormatOption;
        return this;
    }

    @ApiModelProperty(value = "")
    public PicFormatOption getPicFormatOption() {
        return picFormatOption;
    }

    public void setPicFormatOption(PicFormatOption picFormatOption) {
        this.picFormatOption = picFormatOption;
    }

    @SerializedName("Image")
    @JsonProperty("Image")
    private LinkElement image;

    public TextureFill image(LinkElement image) {
        this.image = image;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getImage() {
        return image;
    }

    public void setImage(LinkElement image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextureFill other = (TextureFill) o;
        return Objects.equals(this.type, other.type)
            && Objects.equals(this.transparency, other.transparency)
            && Objects.equals(this.scale, other.scale)
            && Objects.equals(this.tilePicOption, other.tilePicOption)
            && Objects.equals(this.picFormatOption, other.picFormatOption)
            && Objects.equals(this.image, other.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, transparency, scale, tilePicOption, picFormatOption, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextureFill {\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    transparency: ").append(transparency).append("\n");
        sb.append("    scale: ").append(scale).append("\n");
        sb.append("    tilePicOption: ").append(tilePicOption).append("\n");
        sb.append("    picFormatOption: ").append(picFormatOption).append("\n");
        sb.append("    image: ").append(image).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
