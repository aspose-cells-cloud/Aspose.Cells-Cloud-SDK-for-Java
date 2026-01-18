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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class OoxmlSaveOptions  extends  SaveOptions {
        @SerializedName("ExportCellName")
        private Boolean exportCellName ;

        public  OoxmlSaveOptions  exportCellName(Boolean  exportCellName) {
            this.exportCellName =  exportCellName;
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
        private Boolean updateZoom ;

        public  OoxmlSaveOptions  updateZoom(Boolean  updateZoom) {
            this.updateZoom =  updateZoom;
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
        private Boolean enableZip64 ;

        public  OoxmlSaveOptions  enableZip64(Boolean  enableZip64) {
            this.enableZip64 =  enableZip64;
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
        private Boolean embedOoxmlAsOleObject ;

        public  OoxmlSaveOptions  embedOoxmlAsOleObject(Boolean  embedOoxmlAsOleObject) {
            this.embedOoxmlAsOleObject =  embedOoxmlAsOleObject;
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
        private String compressionType ;

        public  OoxmlSaveOptions  compressionType(String  compressionType) {
            this.compressionType =  compressionType;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            OoxmlSaveOptions ooxmlSaveOptions = (OoxmlSaveOptions) o;
            return
                Objects.equals(this.exportCellName, ooxmlSaveOptions.exportCellName) &&
                Objects.equals(this.updateZoom, ooxmlSaveOptions.updateZoom) &&
                Objects.equals(this.enableZip64, ooxmlSaveOptions.enableZip64) &&
                Objects.equals(this.embedOoxmlAsOleObject, ooxmlSaveOptions.embedOoxmlAsOleObject) &&
                Objects.equals(this.compressionType, ooxmlSaveOptions.compressionType) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(exportCellName, updateZoom, enableZip64, embedOoxmlAsOleObject, compressionType, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class OoxmlSaveOptions {\n");
            sb.append("    exportCellName: ").append(toIndentedString(getExportCellName())).append("\n");
            sb.append("    updateZoom: ").append(toIndentedString(getUpdateZoom())).append("\n");
            sb.append("    enableZip64: ").append(toIndentedString(getEnableZip64())).append("\n");
            sb.append("    embedOoxmlAsOleObject: ").append(toIndentedString(getEmbedOoxmlAsOleObject())).append("\n");
            sb.append("    compressionType: ").append(toIndentedString(getCompressionType())).append("\n");
            sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
            sb.append("    cachedFileFolder: ").append(toIndentedString(getCachedFileFolder())).append("\n");
            sb.append("    clearData: ").append(toIndentedString(getClearData())).append("\n");
            sb.append("    createDirectory: ").append(toIndentedString(getCreateDirectory())).append("\n");
            sb.append("    enableHTTPCompression: ").append(toIndentedString(getEnableHTTPCompression())).append("\n");
            sb.append("    refreshChartCache: ").append(toIndentedString(getRefreshChartCache())).append("\n");
            sb.append("    sortNames: ").append(toIndentedString(getSortNames())).append("\n");
            sb.append("    validateMergedAreas: ").append(toIndentedString(getValidateMergedAreas())).append("\n");
            sb.append("    mergeAreas: ").append(toIndentedString(getMergeAreas())).append("\n");
            sb.append("    sortExternalNames: ").append(toIndentedString(getSortExternalNames())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
            sb.append("    updateSmartArt: ").append(toIndentedString(getUpdateSmartArt())).append("\n");
            sb.append("    encryptDocumentProperties: ").append(toIndentedString(getEncryptDocumentProperties())).append("\n");
            sb.append("}");
            return sb.toString();
        }

        /**
        * Convert the given object to string with each line indented by 4 spaces
        * (except the first line).
        */
        private String toIndentedString(java.lang.Object o) {
            if (o == null) {
                return "null";
            }
            return o.toString().replace("\n", "\n    ");
        }


}

