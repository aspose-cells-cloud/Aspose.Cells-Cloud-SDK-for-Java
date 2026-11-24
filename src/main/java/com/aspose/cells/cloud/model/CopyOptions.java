/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="CopyOptions.java">
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

public class CopyOptions {

    @SerializedName("ColumnCharacterWidth")
    @JsonProperty("ColumnCharacterWidth")
    private Boolean columnCharacterWidth;

    public CopyOptions columnCharacterWidth(Boolean columnCharacterWidth) {
        this.columnCharacterWidth = columnCharacterWidth;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getColumnCharacterWidth() {
        return columnCharacterWidth;
    }

    public void setColumnCharacterWidth(Boolean columnCharacterWidth) {
        this.columnCharacterWidth = columnCharacterWidth;
    }

    @SerializedName("CopyInvalidFormulasAsValues")
    @JsonProperty("CopyInvalidFormulasAsValues")
    private Boolean copyInvalidFormulasAsValues;

    public CopyOptions copyInvalidFormulasAsValues(Boolean copyInvalidFormulasAsValues) {
        this.copyInvalidFormulasAsValues = copyInvalidFormulasAsValues;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCopyInvalidFormulasAsValues() {
        return copyInvalidFormulasAsValues;
    }

    public void setCopyInvalidFormulasAsValues(Boolean copyInvalidFormulasAsValues) {
        this.copyInvalidFormulasAsValues = copyInvalidFormulasAsValues;
    }

    @SerializedName("CopyNames")
    @JsonProperty("CopyNames")
    private Boolean copyNames;

    public CopyOptions copyNames(Boolean copyNames) {
        this.copyNames = copyNames;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCopyNames() {
        return copyNames;
    }

    public void setCopyNames(Boolean copyNames) {
        this.copyNames = copyNames;
    }

    @SerializedName("ExtendToAdjacentRange")
    @JsonProperty("ExtendToAdjacentRange")
    private Boolean extendToAdjacentRange;

    public CopyOptions extendToAdjacentRange(Boolean extendToAdjacentRange) {
        this.extendToAdjacentRange = extendToAdjacentRange;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getExtendToAdjacentRange() {
        return extendToAdjacentRange;
    }

    public void setExtendToAdjacentRange(Boolean extendToAdjacentRange) {
        this.extendToAdjacentRange = extendToAdjacentRange;
    }

    @SerializedName("ReferToDestinationSheet")
    @JsonProperty("ReferToDestinationSheet")
    private Boolean referToDestinationSheet;

    public CopyOptions referToDestinationSheet(Boolean referToDestinationSheet) {
        this.referToDestinationSheet = referToDestinationSheet;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getReferToDestinationSheet() {
        return referToDestinationSheet;
    }

    public void setReferToDestinationSheet(Boolean referToDestinationSheet) {
        this.referToDestinationSheet = referToDestinationSheet;
    }

    @SerializedName("ReferToSheetWithSameName")
    @JsonProperty("ReferToSheetWithSameName")
    private Boolean referToSheetWithSameName;

    public CopyOptions referToSheetWithSameName(Boolean referToSheetWithSameName) {
        this.referToSheetWithSameName = referToSheetWithSameName;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getReferToSheetWithSameName() {
        return referToSheetWithSameName;
    }

    public void setReferToSheetWithSameName(Boolean referToSheetWithSameName) {
        this.referToSheetWithSameName = referToSheetWithSameName;
    }

    @SerializedName("CopyTheme")
    @JsonProperty("CopyTheme")
    private Boolean copyTheme;

    public CopyOptions copyTheme(Boolean copyTheme) {
        this.copyTheme = copyTheme;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getCopyTheme() {
        return copyTheme;
    }

    public void setCopyTheme(Boolean copyTheme) {
        this.copyTheme = copyTheme;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopyOptions other = (CopyOptions) o;
        return Objects.equals(this.columnCharacterWidth, other.columnCharacterWidth)
            && Objects.equals(this.copyInvalidFormulasAsValues, other.copyInvalidFormulasAsValues)
            && Objects.equals(this.copyNames, other.copyNames)
            && Objects.equals(this.extendToAdjacentRange, other.extendToAdjacentRange)
            && Objects.equals(this.referToDestinationSheet, other.referToDestinationSheet)
            && Objects.equals(this.referToSheetWithSameName, other.referToSheetWithSameName)
            && Objects.equals(this.copyTheme, other.copyTheme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnCharacterWidth, copyInvalidFormulasAsValues, copyNames, extendToAdjacentRange, referToDestinationSheet, referToSheetWithSameName, copyTheme);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopyOptions {\n");
        sb.append("    columnCharacterWidth: ").append(columnCharacterWidth).append("\n");
        sb.append("    copyInvalidFormulasAsValues: ").append(copyInvalidFormulasAsValues).append("\n");
        sb.append("    copyNames: ").append(copyNames).append("\n");
        sb.append("    extendToAdjacentRange: ").append(extendToAdjacentRange).append("\n");
        sb.append("    referToDestinationSheet: ").append(referToDestinationSheet).append("\n");
        sb.append("    referToSheetWithSameName: ").append(referToSheetWithSameName).append("\n");
        sb.append("    copyTheme: ").append(copyTheme).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
