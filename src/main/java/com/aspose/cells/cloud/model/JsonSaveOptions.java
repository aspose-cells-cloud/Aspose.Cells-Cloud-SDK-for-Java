/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="JsonSaveOptions.java">
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

public class JsonSaveOptions extends SaveOptions {

    @SerializedName("ExportArea")
    @JsonProperty("ExportArea")
    private CellArea exportArea;

    public JsonSaveOptions exportArea(CellArea exportArea) {
        this.exportArea = exportArea;
        return this;
    }

    @ApiModelProperty(value = "")
    public CellArea getExportArea() {
        return exportArea;
    }

    public void setExportArea(CellArea exportArea) {
        this.exportArea = exportArea;
    }

    @SerializedName("HasHeaderRow")
    @JsonProperty("HasHeaderRow")
    private Boolean hasHeaderRow;

    public JsonSaveOptions hasHeaderRow(Boolean hasHeaderRow) {
        this.hasHeaderRow = hasHeaderRow;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getHasHeaderRow() {
        return hasHeaderRow;
    }

    public void setHasHeaderRow(Boolean hasHeaderRow) {
        this.hasHeaderRow = hasHeaderRow;
    }

    @SerializedName("ExportAsString")
    @JsonProperty("ExportAsString")
    private Boolean exportAsString;

    public JsonSaveOptions exportAsString(Boolean exportAsString) {
        this.exportAsString = exportAsString;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getExportAsString() {
        return exportAsString;
    }

    public void setExportAsString(Boolean exportAsString) {
        this.exportAsString = exportAsString;
    }

    @SerializedName("Indent")
    @JsonProperty("Indent")
    private String indent;

    public JsonSaveOptions indent(String indent) {
        this.indent = indent;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getIndent() {
        return indent;
    }

    public void setIndent(String indent) {
        this.indent = indent;
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
        JsonSaveOptions other = (JsonSaveOptions) o;
        return Objects.equals(this.exportArea, other.exportArea)
            && Objects.equals(this.hasHeaderRow, other.hasHeaderRow)
            && Objects.equals(this.exportAsString, other.exportAsString)
            && Objects.equals(this.indent, other.indent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportArea, hasHeaderRow, exportAsString, indent, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JsonSaveOptions {\n");
        sb.append("    exportArea: ").append(exportArea).append("\n");
        sb.append("    hasHeaderRow: ").append(hasHeaderRow).append("\n");
        sb.append("    exportAsString: ").append(exportAsString).append("\n");
        sb.append("    indent: ").append(indent).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
