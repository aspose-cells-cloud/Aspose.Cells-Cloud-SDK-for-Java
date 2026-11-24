/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Color.java">
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

public class Color {

    @SerializedName("A")
    @JsonProperty("A")
    private Integer a;

    public Color a(Integer a) {
        this.a = a;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    @SerializedName("R")
    @JsonProperty("R")
    private Integer r;

    public Color r(Integer r) {
        this.r = r;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    @SerializedName("G")
    @JsonProperty("G")
    private Integer g;

    public Color g(Integer g) {
        this.g = g;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getG() {
        return g;
    }

    public void setG(Integer g) {
        this.g = g;
    }

    @SerializedName("B")
    @JsonProperty("B")
    private Integer b;

    public Color b(Integer b) {
        this.b = b;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Color other = (Color) o;
        return Objects.equals(this.a, other.a)
            && Objects.equals(this.r, other.r)
            && Objects.equals(this.g, other.g)
            && Objects.equals(this.b, other.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, r, g, b);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Color {\n");
        sb.append("    a: ").append(a).append("\n");
        sb.append("    r: ").append(r).append("\n");
        sb.append("    g: ").append(g).append("\n");
        sb.append("    b: ").append(b).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
