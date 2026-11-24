/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="AppliedStep.java">
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

public class AppliedStep {

    @SerializedName("StepName")
    @JsonProperty("StepName")
    private String stepName;

    public AppliedStep stepName(String stepName) {
        this.stepName = stepName;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    @SerializedName("AppliedOperate")
    @JsonProperty("AppliedOperate")
    private AppliedOperate appliedOperate;

    public AppliedStep appliedOperate(AppliedOperate appliedOperate) {
        this.appliedOperate = appliedOperate;
        return this;
    }

    @ApiModelProperty(value = "")
    public AppliedOperate getAppliedOperate() {
        return appliedOperate;
    }

    public void setAppliedOperate(AppliedOperate appliedOperate) {
        this.appliedOperate = appliedOperate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppliedStep other = (AppliedStep) o;
        return Objects.equals(this.stepName, other.stepName)
            && Objects.equals(this.appliedOperate, other.appliedOperate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stepName, appliedOperate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppliedStep {\n");
        sb.append("    stepName: ").append(stepName).append("\n");
        sb.append("    appliedOperate: ").append(appliedOperate).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
