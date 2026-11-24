/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PasteOptions.java">
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

public class PasteOptions {

    @SerializedName("OnlyVisibleCells")
    @JsonProperty("OnlyVisibleCells")
    private Boolean onlyVisibleCells;

    public PasteOptions onlyVisibleCells(Boolean onlyVisibleCells) {
        this.onlyVisibleCells = onlyVisibleCells;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getOnlyVisibleCells() {
        return onlyVisibleCells;
    }

    public void setOnlyVisibleCells(Boolean onlyVisibleCells) {
        this.onlyVisibleCells = onlyVisibleCells;
    }

    @SerializedName("PasteType")
    @JsonProperty("PasteType")
    private String pasteType;

    public PasteOptions pasteType(String pasteType) {
        this.pasteType = pasteType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getPasteType() {
        return pasteType;
    }

    public void setPasteType(String pasteType) {
        this.pasteType = pasteType;
    }

    @SerializedName("SkipBlanks")
    @JsonProperty("SkipBlanks")
    private Boolean skipBlanks;

    public PasteOptions skipBlanks(Boolean skipBlanks) {
        this.skipBlanks = skipBlanks;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getSkipBlanks() {
        return skipBlanks;
    }

    public void setSkipBlanks(Boolean skipBlanks) {
        this.skipBlanks = skipBlanks;
    }

    @SerializedName("Transpose")
    @JsonProperty("Transpose")
    private Boolean transpose;

    public PasteOptions transpose(Boolean transpose) {
        this.transpose = transpose;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getTranspose() {
        return transpose;
    }

    public void setTranspose(Boolean transpose) {
        this.transpose = transpose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PasteOptions other = (PasteOptions) o;
        return Objects.equals(this.onlyVisibleCells, other.onlyVisibleCells)
            && Objects.equals(this.pasteType, other.pasteType)
            && Objects.equals(this.skipBlanks, other.skipBlanks)
            && Objects.equals(this.transpose, other.transpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(onlyVisibleCells, pasteType, skipBlanks, transpose);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PasteOptions {\n");
        sb.append("    onlyVisibleCells: ").append(onlyVisibleCells).append("\n");
        sb.append("    pasteType: ").append(pasteType).append("\n");
        sb.append("    skipBlanks: ").append(skipBlanks).append("\n");
        sb.append("    transpose: ").append(transpose).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
