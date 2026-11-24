/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="FillFormat.java">
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

public class FillFormat {

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public FillFormat type(String type) {
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

    @SerializedName("SolidFill")
    @JsonProperty("SolidFill")
    private SolidFill solidFill;

    public FillFormat solidFill(SolidFill solidFill) {
        this.solidFill = solidFill;
        return this;
    }

    @ApiModelProperty(value = "")
    public SolidFill getSolidFill() {
        return solidFill;
    }

    public void setSolidFill(SolidFill solidFill) {
        this.solidFill = solidFill;
    }

    @SerializedName("PatternFill")
    @JsonProperty("PatternFill")
    private PatternFill patternFill;

    public FillFormat patternFill(PatternFill patternFill) {
        this.patternFill = patternFill;
        return this;
    }

    @ApiModelProperty(value = "")
    public PatternFill getPatternFill() {
        return patternFill;
    }

    public void setPatternFill(PatternFill patternFill) {
        this.patternFill = patternFill;
    }

    @SerializedName("TextureFill")
    @JsonProperty("TextureFill")
    private TextureFill textureFill;

    public FillFormat textureFill(TextureFill textureFill) {
        this.textureFill = textureFill;
        return this;
    }

    @ApiModelProperty(value = "")
    public TextureFill getTextureFill() {
        return textureFill;
    }

    public void setTextureFill(TextureFill textureFill) {
        this.textureFill = textureFill;
    }

    @SerializedName("GradientFill")
    @JsonProperty("GradientFill")
    private GradientFill gradientFill;

    public FillFormat gradientFill(GradientFill gradientFill) {
        this.gradientFill = gradientFill;
        return this;
    }

    @ApiModelProperty(value = "")
    public GradientFill getGradientFill() {
        return gradientFill;
    }

    public void setGradientFill(GradientFill gradientFill) {
        this.gradientFill = gradientFill;
    }

    @SerializedName("ImageData")
    @JsonProperty("ImageData")
    private String imageData;

    public FillFormat imageData(String imageData) {
        this.imageData = imageData;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getImageData() {
        return imageData;
    }

    public void setImageData(String imageData) {
        this.imageData = imageData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FillFormat other = (FillFormat) o;
        return Objects.equals(this.type, other.type)
            && Objects.equals(this.solidFill, other.solidFill)
            && Objects.equals(this.patternFill, other.patternFill)
            && Objects.equals(this.textureFill, other.textureFill)
            && Objects.equals(this.gradientFill, other.gradientFill)
            && Objects.equals(this.imageData, other.imageData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, solidFill, patternFill, textureFill, gradientFill, imageData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FillFormat {\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    solidFill: ").append(solidFill).append("\n");
        sb.append("    patternFill: ").append(patternFill).append("\n");
        sb.append("    textureFill: ").append(textureFill).append("\n");
        sb.append("    gradientFill: ").append(gradientFill).append("\n");
        sb.append("    imageData: ").append(imageData).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
