/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AbstractCalculationEngine.java">
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

public class AbstractCalculationEngine {

    @SerializedName("IsParamLiteralRequired")
    @JsonProperty("IsParamLiteralRequired")
    private Boolean isParamLiteralRequired;

    public AbstractCalculationEngine isParamLiteralRequired(Boolean isParamLiteralRequired) {
        this.isParamLiteralRequired = isParamLiteralRequired;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsParamLiteralRequired() {
        return isParamLiteralRequired;
    }

    public void setIsParamLiteralRequired(Boolean isParamLiteralRequired) {
        this.isParamLiteralRequired = isParamLiteralRequired;
    }

    @SerializedName("IsParamArrayModeRequired")
    @JsonProperty("IsParamArrayModeRequired")
    private Boolean isParamArrayModeRequired;

    public AbstractCalculationEngine isParamArrayModeRequired(Boolean isParamArrayModeRequired) {
        this.isParamArrayModeRequired = isParamArrayModeRequired;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsParamArrayModeRequired() {
        return isParamArrayModeRequired;
    }

    public void setIsParamArrayModeRequired(Boolean isParamArrayModeRequired) {
        this.isParamArrayModeRequired = isParamArrayModeRequired;
    }

    @SerializedName("ProcessBuiltInFunctions")
    @JsonProperty("ProcessBuiltInFunctions")
    private Boolean processBuiltInFunctions;

    public AbstractCalculationEngine processBuiltInFunctions(Boolean processBuiltInFunctions) {
        this.processBuiltInFunctions = processBuiltInFunctions;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getProcessBuiltInFunctions() {
        return processBuiltInFunctions;
    }

    public void setProcessBuiltInFunctions(Boolean processBuiltInFunctions) {
        this.processBuiltInFunctions = processBuiltInFunctions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AbstractCalculationEngine other = (AbstractCalculationEngine) o;
        return Objects.equals(this.isParamLiteralRequired, other.isParamLiteralRequired)
            && Objects.equals(this.isParamArrayModeRequired, other.isParamArrayModeRequired)
            && Objects.equals(this.processBuiltInFunctions, other.processBuiltInFunctions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isParamLiteralRequired, isParamArrayModeRequired, processBuiltInFunctions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AbstractCalculationEngine {\n");
        sb.append("    isParamLiteralRequired: ").append(isParamLiteralRequired).append("\n");
        sb.append("    isParamArrayModeRequired: ").append(isParamArrayModeRequired).append("\n");
        sb.append("    processBuiltInFunctions: ").append(processBuiltInFunctions).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
