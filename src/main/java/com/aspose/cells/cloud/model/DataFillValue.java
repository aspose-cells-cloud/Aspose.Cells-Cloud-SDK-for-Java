/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DataFillValue.java">
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

public class DataFillValue {

    @SerializedName("DefaultBoolean")
    @JsonProperty("DefaultBoolean")
    private Boolean defaultBoolean;

    public DataFillValue defaultBoolean(Boolean defaultBoolean) {
        this.defaultBoolean = defaultBoolean;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getDefaultBoolean() {
        return defaultBoolean;
    }

    public void setDefaultBoolean(Boolean defaultBoolean) {
        this.defaultBoolean = defaultBoolean;
    }

    @SerializedName("DefaultString")
    @JsonProperty("DefaultString")
    private String defaultString;

    public DataFillValue defaultString(String defaultString) {
        this.defaultString = defaultString;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDefaultString() {
        return defaultString;
    }

    public void setDefaultString(String defaultString) {
        this.defaultString = defaultString;
    }

    @SerializedName("DefaultNumber")
    @JsonProperty("DefaultNumber")
    private Integer defaultNumber;

    public DataFillValue defaultNumber(Integer defaultNumber) {
        this.defaultNumber = defaultNumber;
        return this;
    }

    @ApiModelProperty(value = "")
    public Integer getDefaultNumber() {
        return defaultNumber;
    }

    public void setDefaultNumber(Integer defaultNumber) {
        this.defaultNumber = defaultNumber;
    }

    @SerializedName("DefaultDouble")
    @JsonProperty("DefaultDouble")
    private Double defaultDouble;

    public DataFillValue defaultDouble(Double defaultDouble) {
        this.defaultDouble = defaultDouble;
        return this;
    }

    @ApiModelProperty(value = "")
    public Double getDefaultDouble() {
        return defaultDouble;
    }

    public void setDefaultDouble(Double defaultDouble) {
        this.defaultDouble = defaultDouble;
    }

    @SerializedName("DefaultDate")
    @JsonProperty("DefaultDate")
    private String defaultDate;

    public DataFillValue defaultDate(String defaultDate) {
        this.defaultDate = defaultDate;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDefaultDate() {
        return defaultDate;
    }

    public void setDefaultDate(String defaultDate) {
        this.defaultDate = defaultDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataFillValue other = (DataFillValue) o;
        return Objects.equals(this.defaultBoolean, other.defaultBoolean)
            && Objects.equals(this.defaultString, other.defaultString)
            && Objects.equals(this.defaultNumber, other.defaultNumber)
            && Objects.equals(this.defaultDouble, other.defaultDouble)
            && Objects.equals(this.defaultDate, other.defaultDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultBoolean, defaultString, defaultNumber, defaultDouble, defaultDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataFillValue {\n");
        sb.append("    defaultBoolean: ").append(defaultBoolean).append("\n");
        sb.append("    defaultString: ").append(defaultString).append("\n");
        sb.append("    defaultNumber: ").append(defaultNumber).append("\n");
        sb.append("    defaultDouble: ").append(defaultDouble).append("\n");
        sb.append("    defaultDate: ").append(defaultDate).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
