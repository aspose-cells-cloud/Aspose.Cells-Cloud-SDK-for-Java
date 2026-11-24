/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="MergeQueries.java">
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

public class MergeQueries extends AppliedOperate {

    @SerializedName("DataQueryNameA")
    @JsonProperty("DataQueryNameA")
    private String dataQueryNameA;

    public MergeQueries dataQueryNameA(String dataQueryNameA) {
        this.dataQueryNameA = dataQueryNameA;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataQueryNameA() {
        return dataQueryNameA;
    }

    public void setDataQueryNameA(String dataQueryNameA) {
        this.dataQueryNameA = dataQueryNameA;
    }

    @SerializedName("DataAIndexField")
    @JsonProperty("DataAIndexField")
    private String dataAIndexField;

    public MergeQueries dataAIndexField(String dataAIndexField) {
        this.dataAIndexField = dataAIndexField;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataAIndexField() {
        return dataAIndexField;
    }

    public void setDataAIndexField(String dataAIndexField) {
        this.dataAIndexField = dataAIndexField;
    }

    @SerializedName("DataQueryNameB")
    @JsonProperty("DataQueryNameB")
    private String dataQueryNameB;

    public MergeQueries dataQueryNameB(String dataQueryNameB) {
        this.dataQueryNameB = dataQueryNameB;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataQueryNameB() {
        return dataQueryNameB;
    }

    public void setDataQueryNameB(String dataQueryNameB) {
        this.dataQueryNameB = dataQueryNameB;
    }

    @SerializedName("DataBIndexField")
    @JsonProperty("DataBIndexField")
    private String dataBIndexField;

    public MergeQueries dataBIndexField(String dataBIndexField) {
        this.dataBIndexField = dataBIndexField;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getDataBIndexField() {
        return dataBIndexField;
    }

    public void setDataBIndexField(String dataBIndexField) {
        this.dataBIndexField = dataBIndexField;
    }

    @SerializedName("JoinType")
    @JsonProperty("JoinType")
    private String joinType;

    public MergeQueries joinType(String joinType) {
        this.joinType = joinType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getJoinType() {
        return joinType;
    }

    public void setJoinType(String joinType) {
        this.joinType = joinType;
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
        MergeQueries other = (MergeQueries) o;
        return Objects.equals(this.dataQueryNameA, other.dataQueryNameA)
            && Objects.equals(this.dataAIndexField, other.dataAIndexField)
            && Objects.equals(this.dataQueryNameB, other.dataQueryNameB)
            && Objects.equals(this.dataBIndexField, other.dataBIndexField)
            && Objects.equals(this.joinType, other.joinType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataQueryNameA, dataAIndexField, dataQueryNameB, dataBIndexField, joinType, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeQueries {\n");
        sb.append("    dataQueryNameA: ").append(dataQueryNameA).append("\n");
        sb.append("    dataAIndexField: ").append(dataAIndexField).append("\n");
        sb.append("    dataQueryNameB: ").append(dataQueryNameB).append("\n");
        sb.append("    dataBIndexField: ").append(dataBIndexField).append("\n");
        sb.append("    joinType: ").append(joinType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
