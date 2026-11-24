/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PatternFill.java">
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

public class PatternFill {

    @SerializedName("Pattern")
    @JsonProperty("Pattern")
    private String pattern;

    public PatternFill pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @SerializedName("BackgroundCellsColor")
    @JsonProperty("BackgroundCellsColor")
    private CellsColor backgroundCellsColor;

    public PatternFill backgroundCellsColor(CellsColor backgroundCellsColor) {
        this.backgroundCellsColor = backgroundCellsColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getBackgroundCellsColor() {
        return backgroundCellsColor;
    }

    public void setBackgroundCellsColor(CellsColor backgroundCellsColor) {
        this.backgroundCellsColor = backgroundCellsColor;
    }

    @SerializedName("ForegroundCellsColor")
    @JsonProperty("ForegroundCellsColor")
    private CellsColor foregroundCellsColor;

    public PatternFill foregroundCellsColor(CellsColor foregroundCellsColor) {
        this.foregroundCellsColor = foregroundCellsColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellsColor getForegroundCellsColor() {
        return foregroundCellsColor;
    }

    public void setForegroundCellsColor(CellsColor foregroundCellsColor) {
        this.foregroundCellsColor = foregroundCellsColor;
    }

    @SerializedName("ForegroundColor")
    @JsonProperty("ForegroundColor")
    private Color foregroundColor;

    public PatternFill foregroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getForegroundColor() {
        return foregroundColor;
    }

    public void setForegroundColor(Color foregroundColor) {
        this.foregroundColor = foregroundColor;
    }

    @SerializedName("BackgroundColor")
    @JsonProperty("BackgroundColor")
    private Color backgroundColor;

    public PatternFill backgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @SerializedName("BackTransparency")
    @JsonProperty("BackTransparency")
    private Double backTransparency;

    public PatternFill backTransparency(Double backTransparency) {
        this.backTransparency = backTransparency;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getBackTransparency() {
        return backTransparency;
    }

    public void setBackTransparency(Double backTransparency) {
        this.backTransparency = backTransparency;
    }

    @SerializedName("ForeTransparency")
    @JsonProperty("ForeTransparency")
    private Double foreTransparency;

    public PatternFill foreTransparency(Double foreTransparency) {
        this.foreTransparency = foreTransparency;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getForeTransparency() {
        return foreTransparency;
    }

    public void setForeTransparency(Double foreTransparency) {
        this.foreTransparency = foreTransparency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PatternFill other = (PatternFill) o;
        return Objects.equals(this.pattern, other.pattern)
            && Objects.equals(this.backgroundCellsColor, other.backgroundCellsColor)
            && Objects.equals(this.foregroundCellsColor, other.foregroundCellsColor)
            && Objects.equals(this.foregroundColor, other.foregroundColor)
            && Objects.equals(this.backgroundColor, other.backgroundColor)
            && Objects.equals(this.backTransparency, other.backTransparency)
            && Objects.equals(this.foreTransparency, other.foreTransparency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pattern, backgroundCellsColor, foregroundCellsColor, foregroundColor, backgroundColor, backTransparency, foreTransparency);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PatternFill {\n");
        sb.append("    pattern: ").append(pattern).append("\n");
        sb.append("    backgroundCellsColor: ").append(backgroundCellsColor).append("\n");
        sb.append("    foregroundCellsColor: ").append(foregroundCellsColor).append("\n");
        sb.append("    foregroundColor: ").append(foregroundColor).append("\n");
        sb.append("    backgroundColor: ").append(backgroundColor).append("\n");
        sb.append("    backTransparency: ").append(backTransparency).append("\n");
        sb.append("    foreTransparency: ").append(foreTransparency).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
