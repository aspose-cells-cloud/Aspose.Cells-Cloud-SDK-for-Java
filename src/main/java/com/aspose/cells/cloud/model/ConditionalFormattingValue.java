/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ConditionalFormattingValue.java">
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

public class ConditionalFormattingValue {

    @SerializedName("IsGTE")
    @JsonProperty("IsGTE")
    private Boolean isGTE;

    public ConditionalFormattingValue isGTE(Boolean isGTE) {
        this.isGTE = isGTE;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsGTE() {
        return isGTE;
    }

    public void setIsGTE(Boolean isGTE) {
        this.isGTE = isGTE;
    }

    @SerializedName("Type")
    @JsonProperty("Type")
    private String type;

    public ConditionalFormattingValue type(String type) {
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

    @SerializedName("Value")
    @JsonProperty("Value")
    private Object value;

    public ConditionalFormattingValue value(Object value) {
        this.value = value;
        return this;
    }

    @ApiModelProperty(value = "")
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConditionalFormattingValue other = (ConditionalFormattingValue) o;
        return Objects.equals(this.isGTE, other.isGTE)
            && Objects.equals(this.type, other.type)
            && Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isGTE, type, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConditionalFormattingValue {\n");
        sb.append("    isGTE: ").append(isGTE).append("\n");
        sb.append("    type: ").append(type).append("\n");
        sb.append("    value: ").append(value).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
