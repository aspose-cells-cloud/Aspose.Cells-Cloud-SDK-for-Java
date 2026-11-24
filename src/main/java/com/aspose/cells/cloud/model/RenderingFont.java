/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RenderingFont.java">
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

public class RenderingFont {

    @SerializedName("Name")
    @JsonProperty("Name")
    private String name;

    public RenderingFont name(String name) {
        this.name = name;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @SerializedName("Size")
    @JsonProperty("Size")
    private Double size;

    public RenderingFont size(Double size) {
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

    @SerializedName("Bold")
    @JsonProperty("Bold")
    private Boolean bold;

    public RenderingFont bold(Boolean bold) {
        this.bold = bold;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getBold() {
        return bold;
    }

    public void setBold(Boolean bold) {
        this.bold = bold;
    }

    @SerializedName("Italic")
    @JsonProperty("Italic")
    private Boolean italic;

    public RenderingFont italic(Boolean italic) {
        this.italic = italic;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getItalic() {
        return italic;
    }

    public void setItalic(Boolean italic) {
        this.italic = italic;
    }

    @SerializedName("Color")
    @JsonProperty("Color")
    private Color color;

    public RenderingFont color(Color color) {
        this.color = color;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RenderingFont other = (RenderingFont) o;
        return Objects.equals(this.name, other.name)
            && Objects.equals(this.size, other.size)
            && Objects.equals(this.bold, other.bold)
            && Objects.equals(this.italic, other.italic)
            && Objects.equals(this.color, other.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, bold, italic, color);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RenderingFont {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    size: ").append(size).append("\n");
        sb.append("    bold: ").append(bold).append("\n");
        sb.append("    italic: ").append(italic).append("\n");
        sb.append("    color: ").append(color).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
