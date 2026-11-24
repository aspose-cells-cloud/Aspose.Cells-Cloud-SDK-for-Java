/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="RangeCopyRequest.java">
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

public class RangeCopyRequest {

    @SerializedName("Operate")
    @JsonProperty("Operate")
    private String operate;

    public RangeCopyRequest operate(String operate) {
        this.operate = operate;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    @SerializedName("Source")
    @JsonProperty("Source")
    private Range source;

    public RangeCopyRequest source(Range source) {
        this.source = source;
        return this;
    }

    @ApiModelProperty(value = "")
    public Range getSource() {
        return source;
    }

    public void setSource(Range source) {
        this.source = source;
    }

    @SerializedName("Target")
    @JsonProperty("Target")
    private Range target;

    public RangeCopyRequest target(Range target) {
        this.target = target;
        return this;
    }

    @ApiModelProperty(value = "")
    public Range getTarget() {
        return target;
    }

    public void setTarget(Range target) {
        this.target = target;
    }

    @SerializedName("TargetWorkbook")
    @JsonProperty("TargetWorkbook")
    private String targetWorkbook;

    public RangeCopyRequest targetWorkbook(String targetWorkbook) {
        this.targetWorkbook = targetWorkbook;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getTargetWorkbook() {
        return targetWorkbook;
    }

    public void setTargetWorkbook(String targetWorkbook) {
        this.targetWorkbook = targetWorkbook;
    }

    @SerializedName("PasteOptions")
    @JsonProperty("PasteOptions")
    private PasteOptions pasteOptions;

    public RangeCopyRequest pasteOptions(PasteOptions pasteOptions) {
        this.pasteOptions = pasteOptions;
        return this;
    }

    @ApiModelProperty(value = "")
    public PasteOptions getPasteOptions() {
        return pasteOptions;
    }

    public void setPasteOptions(PasteOptions pasteOptions) {
        this.pasteOptions = pasteOptions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RangeCopyRequest other = (RangeCopyRequest) o;
        return Objects.equals(this.operate, other.operate)
            && Objects.equals(this.source, other.source)
            && Objects.equals(this.target, other.target)
            && Objects.equals(this.targetWorkbook, other.targetWorkbook)
            && Objects.equals(this.pasteOptions, other.pasteOptions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operate, source, target, targetWorkbook, pasteOptions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RangeCopyRequest {\n");
        sb.append("    operate: ").append(operate).append("\n");
        sb.append("    source: ").append(source).append("\n");
        sb.append("    target: ").append(target).append("\n");
        sb.append("    targetWorkbook: ").append(targetWorkbook).append("\n");
        sb.append("    pasteOptions: ").append(pasteOptions).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
