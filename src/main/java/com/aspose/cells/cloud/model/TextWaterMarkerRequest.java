/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextWaterMarkerRequest.java">
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

public class TextWaterMarkerRequest {

    @SerializedName("Text")
    @JsonProperty("Text")
    private String text;

    public TextWaterMarkerRequest text(String text) {
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

    @SerializedName("FontName")
    @JsonProperty("FontName")
    private String fontName;

    public TextWaterMarkerRequest fontName(String fontName) {
        this.fontName = fontName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    @SerializedName("FontSize")
    @JsonProperty("FontSize")
    private Integer fontSize;

    public TextWaterMarkerRequest fontSize(Integer fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    @SerializedName("Height")
    @JsonProperty("Height")
    private Integer height;

    public TextWaterMarkerRequest height(Integer height) {
        this.height = height;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @SerializedName("Width")
    @JsonProperty("Width")
    private Integer width;

    public TextWaterMarkerRequest width(Integer width) {
        this.width = width;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    @SerializedName("ImageAdaptOption")
    @JsonProperty("ImageAdaptOption")
    private String imageAdaptOption;

    public TextWaterMarkerRequest imageAdaptOption(String imageAdaptOption) {
        this.imageAdaptOption = imageAdaptOption;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getImageAdaptOption() {
        return imageAdaptOption;
    }

    public void setImageAdaptOption(String imageAdaptOption) {
        this.imageAdaptOption = imageAdaptOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TextWaterMarkerRequest other = (TextWaterMarkerRequest) o;
        return Objects.equals(this.text, other.text)
            && Objects.equals(this.fontName, other.fontName)
            && Objects.equals(this.fontSize, other.fontSize)
            && Objects.equals(this.height, other.height)
            && Objects.equals(this.width, other.width)
            && Objects.equals(this.imageAdaptOption, other.imageAdaptOption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, fontName, fontSize, height, width, imageAdaptOption);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextWaterMarkerRequest {\n");
        sb.append("    text: ").append(text).append("\n");
        sb.append("    fontName: ").append(fontName).append("\n");
        sb.append("    fontSize: ").append(fontSize).append("\n");
        sb.append("    height: ").append(height).append("\n");
        sb.append("    width: ").append(width).append("\n");
        sb.append("    imageAdaptOption: ").append(imageAdaptOption).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
