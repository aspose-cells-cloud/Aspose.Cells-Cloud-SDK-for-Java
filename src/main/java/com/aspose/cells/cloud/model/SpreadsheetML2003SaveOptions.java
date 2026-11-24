/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="SpreadsheetML2003SaveOptions.java">
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

public class SpreadsheetML2003SaveOptions extends SaveOptions {

    @SerializedName("ExportColumnIndexOfCell")
    @JsonProperty("ExportColumnIndexOfCell")
    private Boolean exportColumnIndexOfCell;

    public SpreadsheetML2003SaveOptions exportColumnIndexOfCell(Boolean exportColumnIndexOfCell) {
        this.exportColumnIndexOfCell = exportColumnIndexOfCell;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getExportColumnIndexOfCell() {
        return exportColumnIndexOfCell;
    }

    public void setExportColumnIndexOfCell(Boolean exportColumnIndexOfCell) {
        this.exportColumnIndexOfCell = exportColumnIndexOfCell;
    }

    @SerializedName("IsIndentedFormatting")
    @JsonProperty("IsIndentedFormatting")
    private Boolean isIndentedFormatting;

    public SpreadsheetML2003SaveOptions isIndentedFormatting(Boolean isIndentedFormatting) {
        this.isIndentedFormatting = isIndentedFormatting;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getIsIndentedFormatting() {
        return isIndentedFormatting;
    }

    public void setIsIndentedFormatting(Boolean isIndentedFormatting) {
        this.isIndentedFormatting = isIndentedFormatting;
    }

    @SerializedName("LimitAsXls")
    @JsonProperty("LimitAsXls")
    private Boolean limitAsXls;

    public SpreadsheetML2003SaveOptions limitAsXls(Boolean limitAsXls) {
        this.limitAsXls = limitAsXls;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getLimitAsXls() {
        return limitAsXls;
    }

    public void setLimitAsXls(Boolean limitAsXls) {
        this.limitAsXls = limitAsXls;
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
        SpreadsheetML2003SaveOptions other = (SpreadsheetML2003SaveOptions) o;
        return Objects.equals(this.exportColumnIndexOfCell, other.exportColumnIndexOfCell)
            && Objects.equals(this.isIndentedFormatting, other.isIndentedFormatting)
            && Objects.equals(this.limitAsXls, other.limitAsXls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportColumnIndexOfCell, isIndentedFormatting, limitAsXls, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpreadsheetML2003SaveOptions {\n");
        sb.append("    exportColumnIndexOfCell: ").append(exportColumnIndexOfCell).append("\n");
        sb.append("    isIndentedFormatting: ").append(isIndentedFormatting).append("\n");
        sb.append("    limitAsXls: ").append(limitAsXls).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
