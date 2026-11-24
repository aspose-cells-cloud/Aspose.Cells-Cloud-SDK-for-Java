/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataItem.java">
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

public class DataItem {

    @SerializedName("DataItemType")
    @JsonProperty("DataItemType")
    private String dataItemType;

    public DataItem dataItemType(String dataItemType) {
        this.dataItemType = dataItemType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataItemType() {
        return dataItemType;
    }

    public void setDataItemType(String dataItemType) {
        this.dataItemType = dataItemType;
    }

    @SerializedName("Value")
    @JsonProperty("Value")
    private String value;

    public DataItem value(String value) {
        this.value = value;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
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
        DataItem other = (DataItem) o;
        return Objects.equals(this.dataItemType, other.dataItemType)
            && Objects.equals(this.value, other.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataItemType, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataItem {\n");
        sb.append("    dataItemType: ").append(dataItemType).append("\n");
        sb.append("    value: ").append(value).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
