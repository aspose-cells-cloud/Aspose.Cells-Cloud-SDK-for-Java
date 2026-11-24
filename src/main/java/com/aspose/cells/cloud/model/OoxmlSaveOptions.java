/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="OoxmlSaveOptions.java">
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

public class OoxmlSaveOptions extends SaveOptions {

    @SerializedName("ExportCellName")
    @JsonProperty("ExportCellName")
    private Boolean exportCellName;

    public OoxmlSaveOptions exportCellName(Boolean exportCellName) {
        this.exportCellName = exportCellName;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getExportCellName() {
        return exportCellName;
    }

    public void setExportCellName(Boolean exportCellName) {
        this.exportCellName = exportCellName;
    }

    @SerializedName("UpdateZoom")
    @JsonProperty("UpdateZoom")
    private Boolean updateZoom;

    public OoxmlSaveOptions updateZoom(Boolean updateZoom) {
        this.updateZoom = updateZoom;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getUpdateZoom() {
        return updateZoom;
    }

    public void setUpdateZoom(Boolean updateZoom) {
        this.updateZoom = updateZoom;
    }

    @SerializedName("EnableZip64")
    @JsonProperty("EnableZip64")
    private Boolean enableZip64;

    public OoxmlSaveOptions enableZip64(Boolean enableZip64) {
        this.enableZip64 = enableZip64;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getEnableZip64() {
        return enableZip64;
    }

    public void setEnableZip64(Boolean enableZip64) {
        this.enableZip64 = enableZip64;
    }

    @SerializedName("EmbedOoxmlAsOleObject")
    @JsonProperty("EmbedOoxmlAsOleObject")
    private Boolean embedOoxmlAsOleObject;

    public OoxmlSaveOptions embedOoxmlAsOleObject(Boolean embedOoxmlAsOleObject) {
        this.embedOoxmlAsOleObject = embedOoxmlAsOleObject;
        return this;
    }

    @ApiModelProperty(value = "")
    public Boolean getEmbedOoxmlAsOleObject() {
        return embedOoxmlAsOleObject;
    }

    public void setEmbedOoxmlAsOleObject(Boolean embedOoxmlAsOleObject) {
        this.embedOoxmlAsOleObject = embedOoxmlAsOleObject;
    }

    @SerializedName("CompressionType")
    @JsonProperty("CompressionType")
    private String compressionType;

    public OoxmlSaveOptions compressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }

    @ApiModelProperty(value = "")
    public String getCompressionType() {
        return compressionType;
    }

    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
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
        OoxmlSaveOptions other = (OoxmlSaveOptions) o;
        return Objects.equals(this.exportCellName, other.exportCellName)
            && Objects.equals(this.updateZoom, other.updateZoom)
            && Objects.equals(this.enableZip64, other.enableZip64)
            && Objects.equals(this.embedOoxmlAsOleObject, other.embedOoxmlAsOleObject)
            && Objects.equals(this.compressionType, other.compressionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exportCellName, updateZoom, enableZip64, embedOoxmlAsOleObject, compressionType, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OoxmlSaveOptions {\n");
        sb.append("    exportCellName: ").append(exportCellName).append("\n");
        sb.append("    updateZoom: ").append(updateZoom).append("\n");
        sb.append("    enableZip64: ").append(enableZip64).append("\n");
        sb.append("    embedOoxmlAsOleObject: ").append(embedOoxmlAsOleObject).append("\n");
        sb.append("    compressionType: ").append(compressionType).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
