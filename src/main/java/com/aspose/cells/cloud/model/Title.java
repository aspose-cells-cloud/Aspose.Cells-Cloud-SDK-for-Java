/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Title.java">
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

public class Title extends ChartFrame {

    @SerializedName("IsVisible")
    @JsonProperty("IsVisible")
    private Boolean isVisible;

    public Title isVisible(Boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    @SerializedName("LinkedSource")
    @JsonProperty("LinkedSource")
    private String linkedSource;

    public Title linkedSource(String linkedSource) {
        this.linkedSource = linkedSource;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getLinkedSource() {
        return linkedSource;
    }

    public void setLinkedSource(String linkedSource) {
        this.linkedSource = linkedSource;
    }

    @SerializedName("RotationAngle")
    @JsonProperty("RotationAngle")
    private Integer rotationAngle;

    public Title rotationAngle(Integer rotationAngle) {
        this.rotationAngle = rotationAngle;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRotationAngle() {
        return rotationAngle;
    }

    public void setRotationAngle(Integer rotationAngle) {
        this.rotationAngle = rotationAngle;
    }

    @SerializedName("Text")
    @JsonProperty("Text")
    private String text;

    public Title text(String text) {
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

    @SerializedName("TextDirection")
    @JsonProperty("TextDirection")
    private String textDirection;

    public Title textDirection(String textDirection) {
        this.textDirection = textDirection;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextDirection() {
        return textDirection;
    }

    public void setTextDirection(String textDirection) {
        this.textDirection = textDirection;
    }

    @SerializedName("TextHorizontalAlignment")
    @JsonProperty("TextHorizontalAlignment")
    private String textHorizontalAlignment;

    public Title textHorizontalAlignment(String textHorizontalAlignment) {
        this.textHorizontalAlignment = textHorizontalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextHorizontalAlignment() {
        return textHorizontalAlignment;
    }

    public void setTextHorizontalAlignment(String textHorizontalAlignment) {
        this.textHorizontalAlignment = textHorizontalAlignment;
    }

    @SerializedName("TextVerticalAlignment")
    @JsonProperty("TextVerticalAlignment")
    private String textVerticalAlignment;

    public Title textVerticalAlignment(String textVerticalAlignment) {
        this.textVerticalAlignment = textVerticalAlignment;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTextVerticalAlignment() {
        return textVerticalAlignment;
    }

    public void setTextVerticalAlignment(String textVerticalAlignment) {
        this.textVerticalAlignment = textVerticalAlignment;
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
        Title other = (Title) o;
        return Objects.equals(this.isVisible, other.isVisible)
            && Objects.equals(this.linkedSource, other.linkedSource)
            && Objects.equals(this.rotationAngle, other.rotationAngle)
            && Objects.equals(this.text, other.text)
            && Objects.equals(this.textDirection, other.textDirection)
            && Objects.equals(this.textHorizontalAlignment, other.textHorizontalAlignment)
            && Objects.equals(this.textVerticalAlignment, other.textVerticalAlignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isVisible, linkedSource, rotationAngle, text, textDirection, textHorizontalAlignment, textVerticalAlignment, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Title {\n");
        sb.append("    isVisible: ").append(isVisible).append("\n");
        sb.append("    linkedSource: ").append(linkedSource).append("\n");
        sb.append("    rotationAngle: ").append(rotationAngle).append("\n");
        sb.append("    text: ").append(text).append("\n");
        sb.append("    textDirection: ").append(textDirection).append("\n");
        sb.append("    textHorizontalAlignment: ").append(textHorizontalAlignment).append("\n");
        sb.append("    textVerticalAlignment: ").append(textVerticalAlignment).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
