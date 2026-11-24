/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConditionalFormatting.java">
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

public class ConditionalFormatting extends LinkElement {

    @SerializedName("sqref")
    @JsonProperty("sqref")
    private String sqref;

    public ConditionalFormatting sqref(String sqref) {
        this.sqref = sqref;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getSqref() {
        return sqref;
    }

    public void setSqref(String sqref) {
        this.sqref = sqref;
    }

    @SerializedName("FormatConditions")
    @JsonProperty("FormatConditions")
    private List<FormatCondition> formatConditions;

    public ConditionalFormatting formatConditions(List<FormatCondition> formatConditions) {
        this.formatConditions = formatConditions;
        return this;
    }

    @ApiModelProperty(value = "")
    public List<FormatCondition> getFormatConditions() {
        return formatConditions;
    }

    public void setFormatConditions(List<FormatCondition> formatConditions) {
        this.formatConditions = formatConditions;
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
        ConditionalFormatting other = (ConditionalFormatting) o;
        return Objects.equals(this.sqref, other.sqref)
            && Objects.equals(this.formatConditions, other.formatConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqref, formatConditions, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionalFormatting {\n");
        sb.append("    sqref: ").append(sqref).append("\n");
        sb.append("    formatConditions: ").append(formatConditions).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
