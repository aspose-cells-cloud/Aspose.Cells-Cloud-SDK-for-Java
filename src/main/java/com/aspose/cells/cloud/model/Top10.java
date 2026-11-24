/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="Top10.java">
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

public class Top10 {

    @SerializedName("IsBottom")
    @JsonProperty("IsBottom")
    private Boolean isBottom;

    public Top10 isBottom(Boolean isBottom) {
        this.isBottom = isBottom;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsBottom() {
        return isBottom;
    }

    public void setIsBottom(Boolean isBottom) {
        this.isBottom = isBottom;
    }

    @SerializedName("IsPercent")
    @JsonProperty("IsPercent")
    private Boolean isPercent;

    public Top10 isPercent(Boolean isPercent) {
        this.isPercent = isPercent;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsPercent() {
        return isPercent;
    }

    public void setIsPercent(Boolean isPercent) {
        this.isPercent = isPercent;
    }

    @SerializedName("Rank")
    @JsonProperty("Rank")
    private Integer rank;

    public Top10 rank(Integer rank) {
        this.rank = rank;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Top10 other = (Top10) o;
        return Objects.equals(this.isBottom, other.isBottom)
            && Objects.equals(this.isPercent, other.isPercent)
            && Objects.equals(this.rank, other.rank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isBottom, isPercent, rank);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Top10 {\n");
        sb.append("    isBottom: ").append(isBottom).append("\n");
        sb.append("    isPercent: ").append(isPercent).append("\n");
        sb.append("    rank: ").append(rank).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
