/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="WorksheetReplaceResponse.java">
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

public class WorksheetReplaceResponse extends CellsCloudResponse {

    @SerializedName("Matches")
    @JsonProperty("Matches")
    private Integer matches;

    public WorksheetReplaceResponse matches(Integer matches) {
        this.matches = matches;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getMatches() {
        return matches;
    }

    public void setMatches(Integer matches) {
        this.matches = matches;
    }

    @SerializedName("Worksheet")
    @JsonProperty("Worksheet")
    private LinkElement worksheet;

    public WorksheetReplaceResponse worksheet(LinkElement worksheet) {
        this.worksheet = worksheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public LinkElement getWorksheet() {
        return worksheet;
    }

    public void setWorksheet(LinkElement worksheet) {
        this.worksheet = worksheet;
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
        WorksheetReplaceResponse other = (WorksheetReplaceResponse) o;
        return Objects.equals(this.matches, other.matches)
            && Objects.equals(this.worksheet, other.worksheet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matches, worksheet, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorksheetReplaceResponse {\n");
        sb.append("    matches: ").append(matches).append("\n");
        sb.append("    worksheet: ").append(worksheet).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
