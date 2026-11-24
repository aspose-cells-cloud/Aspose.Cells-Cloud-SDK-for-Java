/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="LineShape.java">
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

public class LineShape extends Shape {

    @SerializedName("BeginArrowheadLength")
    @JsonProperty("BeginArrowheadLength")
    private String beginArrowheadLength;

    public LineShape beginArrowheadLength(String beginArrowheadLength) {
        this.beginArrowheadLength = beginArrowheadLength;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBeginArrowheadLength() {
        return beginArrowheadLength;
    }

    public void setBeginArrowheadLength(String beginArrowheadLength) {
        this.beginArrowheadLength = beginArrowheadLength;
    }

    @SerializedName("BeginArrowheadStyle")
    @JsonProperty("BeginArrowheadStyle")
    private String beginArrowheadStyle;

    public LineShape beginArrowheadStyle(String beginArrowheadStyle) {
        this.beginArrowheadStyle = beginArrowheadStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBeginArrowheadStyle() {
        return beginArrowheadStyle;
    }

    public void setBeginArrowheadStyle(String beginArrowheadStyle) {
        this.beginArrowheadStyle = beginArrowheadStyle;
    }

    @SerializedName("BeginArrowheadWidth")
    @JsonProperty("BeginArrowheadWidth")
    private String beginArrowheadWidth;

    public LineShape beginArrowheadWidth(String beginArrowheadWidth) {
        this.beginArrowheadWidth = beginArrowheadWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getBeginArrowheadWidth() {
        return beginArrowheadWidth;
    }

    public void setBeginArrowheadWidth(String beginArrowheadWidth) {
        this.beginArrowheadWidth = beginArrowheadWidth;
    }

    @SerializedName("EndArrowheadLength")
    @JsonProperty("EndArrowheadLength")
    private String endArrowheadLength;

    public LineShape endArrowheadLength(String endArrowheadLength) {
        this.endArrowheadLength = endArrowheadLength;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEndArrowheadLength() {
        return endArrowheadLength;
    }

    public void setEndArrowheadLength(String endArrowheadLength) {
        this.endArrowheadLength = endArrowheadLength;
    }

    @SerializedName("EndArrowheadStyle")
    @JsonProperty("EndArrowheadStyle")
    private String endArrowheadStyle;

    public LineShape endArrowheadStyle(String endArrowheadStyle) {
        this.endArrowheadStyle = endArrowheadStyle;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEndArrowheadStyle() {
        return endArrowheadStyle;
    }

    public void setEndArrowheadStyle(String endArrowheadStyle) {
        this.endArrowheadStyle = endArrowheadStyle;
    }

    @SerializedName("EndArrowheadWidth")
    @JsonProperty("EndArrowheadWidth")
    private String endArrowheadWidth;

    public LineShape endArrowheadWidth(String endArrowheadWidth) {
        this.endArrowheadWidth = endArrowheadWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getEndArrowheadWidth() {
        return endArrowheadWidth;
    }

    public void setEndArrowheadWidth(String endArrowheadWidth) {
        this.endArrowheadWidth = endArrowheadWidth;
    }

    @SerializedName("link")
    @JsonProperty("link")
    private Link link;

    public LineShape link(Link link) {
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
        LineShape other = (LineShape) o;
        return Objects.equals(this.beginArrowheadLength, other.beginArrowheadLength)
            && Objects.equals(this.beginArrowheadStyle, other.beginArrowheadStyle)
            && Objects.equals(this.beginArrowheadWidth, other.beginArrowheadWidth)
            && Objects.equals(this.endArrowheadLength, other.endArrowheadLength)
            && Objects.equals(this.endArrowheadStyle, other.endArrowheadStyle)
            && Objects.equals(this.endArrowheadWidth, other.endArrowheadWidth)
            && Objects.equals(this.link, other.link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(beginArrowheadLength, beginArrowheadStyle, beginArrowheadWidth, endArrowheadLength, endArrowheadStyle, endArrowheadWidth, link, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LineShape {\n");
        sb.append("    beginArrowheadLength: ").append(beginArrowheadLength).append("\n");
        sb.append("    beginArrowheadStyle: ").append(beginArrowheadStyle).append("\n");
        sb.append("    beginArrowheadWidth: ").append(beginArrowheadWidth).append("\n");
        sb.append("    endArrowheadLength: ").append(endArrowheadLength).append("\n");
        sb.append("    endArrowheadStyle: ").append(endArrowheadStyle).append("\n");
        sb.append("    endArrowheadWidth: ").append(endArrowheadWidth).append("\n");
        sb.append("    link: ").append(link).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
