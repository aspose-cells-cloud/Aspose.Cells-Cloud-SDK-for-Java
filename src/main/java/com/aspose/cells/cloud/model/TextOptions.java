/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="TextOptions.java">
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

public class TextOptions extends Font {

    @SerializedName("Fill")
    @JsonProperty("Fill")
    private FillFormat fill;

    public TextOptions fill(FillFormat fill) {
        this.fill = fill;
        return this;
    }

    @ApiModelProperty(value = "")
    public FillFormat getFill() {
        return fill;
    }

    public void setFill(FillFormat fill) {
        this.fill = fill;
    }

    @SerializedName("Kerning")
    @JsonProperty("Kerning")
    private Double kerning;

    public TextOptions kerning(Double kerning) {
        this.kerning = kerning;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getKerning() {
        return kerning;
    }

    public void setKerning(Double kerning) {
        this.kerning = kerning;
    }

    @SerializedName("Outline")
    @JsonProperty("Outline")
    private LineFormat outline;

    public TextOptions outline(LineFormat outline) {
        this.outline = outline;
        return this;
    }

    @ApiModelProperty(value = "")
    public LineFormat getOutline() {
        return outline;
    }

    public void setOutline(LineFormat outline) {
        this.outline = outline;
    }

    @SerializedName("Shadow")
    @JsonProperty("Shadow")
    private ShadowEffect shadow;

    public TextOptions shadow(ShadowEffect shadow) {
        this.shadow = shadow;
        return this;
    }

    @ApiModelProperty(value = "")
    public ShadowEffect getShadow() {
        return shadow;
    }

    public void setShadow(ShadowEffect shadow) {
        this.shadow = shadow;
    }

    @SerializedName("Spacing")
    @JsonProperty("Spacing")
    private Double spacing;

    public TextOptions spacing(Double spacing) {
        this.spacing = spacing;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getSpacing() {
        return spacing;
    }

    public void setSpacing(Double spacing) {
        this.spacing = spacing;
    }

    @SerializedName("UnderlineColor")
    @JsonProperty("UnderlineColor")
    private CellsColor underlineColor;

    public TextOptions underlineColor(CellsColor underlineColor) {
        this.underlineColor = underlineColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getUnderlineColor() {
        return underlineColor;
    }

    public void setUnderlineColor(CellsColor underlineColor) {
        this.underlineColor = underlineColor;
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
        TextOptions other = (TextOptions) o;
        return Objects.equals(this.fill, other.fill)
            && Objects.equals(this.kerning, other.kerning)
            && Objects.equals(this.outline, other.outline)
            && Objects.equals(this.shadow, other.shadow)
            && Objects.equals(this.spacing, other.spacing)
            && Objects.equals(this.underlineColor, other.underlineColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fill, kerning, outline, shadow, spacing, underlineColor, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TextOptions {\n");
        sb.append("    fill: ").append(fill).append("\n");
        sb.append("    kerning: ").append(kerning).append("\n");
        sb.append("    outline: ").append(outline).append("\n");
        sb.append("    shadow: ").append(shadow).append("\n");
        sb.append("    spacing: ").append(spacing).append("\n");
        sb.append("    underlineColor: ").append(underlineColor).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
