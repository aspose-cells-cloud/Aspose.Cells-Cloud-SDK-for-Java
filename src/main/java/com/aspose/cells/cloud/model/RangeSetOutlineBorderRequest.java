/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RangeSetOutlineBorderRequest.java">
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

public class RangeSetOutlineBorderRequest {

    @SerializedName("Range")
    @JsonProperty("Range")
    private Range range;

    public RangeSetOutlineBorderRequest range(Range range) {
        this.range = range;
        return this;
    }

    @ApiModelProperty(value = "")
    public Range getRange() {
        return range;
    }

    public void setRange(Range range) {
        this.range = range;
    }

    @SerializedName("borderEdge")
    @JsonProperty("borderEdge")
    private String borderEdge;

    public RangeSetOutlineBorderRequest borderEdge(String borderEdge) {
        this.borderEdge = borderEdge;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBorderEdge() {
        return borderEdge;
    }

    public void setBorderEdge(String borderEdge) {
        this.borderEdge = borderEdge;
    }

    @SerializedName("borderStyle")
    @JsonProperty("borderStyle")
    private String borderStyle;

    public RangeSetOutlineBorderRequest borderStyle(String borderStyle) {
        this.borderStyle = borderStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBorderStyle() {
        return borderStyle;
    }

    public void setBorderStyle(String borderStyle) {
        this.borderStyle = borderStyle;
    }

    @SerializedName("borderColor")
    @JsonProperty("borderColor")
    private Color borderColor;

    public RangeSetOutlineBorderRequest borderColor(Color borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    @ApiModelProperty(value = "")
    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RangeSetOutlineBorderRequest other = (RangeSetOutlineBorderRequest) o;
        return Objects.equals(this.range, other.range)
            && Objects.equals(this.borderEdge, other.borderEdge)
            && Objects.equals(this.borderStyle, other.borderStyle)
            && Objects.equals(this.borderColor, other.borderColor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(range, borderEdge, borderStyle, borderColor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RangeSetOutlineBorderRequest {\n");
        sb.append("    range: ").append(range).append("\n");
        sb.append("    borderEdge: ").append(borderEdge).append("\n");
        sb.append("    borderStyle: ").append(borderStyle).append("\n");
        sb.append("    borderColor: ").append(borderColor).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
