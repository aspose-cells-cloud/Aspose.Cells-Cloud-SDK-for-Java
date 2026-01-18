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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class JsonSaveOptions  extends  SaveOptions {
        @SerializedName("ExportArea")
        private CellArea exportArea ;

        public  JsonSaveOptions  exportArea(CellArea  exportArea) {
            this.exportArea =  exportArea;
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
        private Boolean hasHeaderRow ;

        public  JsonSaveOptions  hasHeaderRow(Boolean  hasHeaderRow) {
            this.hasHeaderRow =  hasHeaderRow;
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
        private Boolean exportAsString ;

        public  JsonSaveOptions  exportAsString(Boolean  exportAsString) {
            this.exportAsString =  exportAsString;
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
        private String indent ;

        public  JsonSaveOptions  indent(String  indent) {
            this.indent =  indent;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            JsonSaveOptions jsonSaveOptions = (JsonSaveOptions) o;
            return
                Objects.equals(this.exportArea, jsonSaveOptions.exportArea) &&
                Objects.equals(this.hasHeaderRow, jsonSaveOptions.hasHeaderRow) &&
                Objects.equals(this.exportAsString, jsonSaveOptions.exportAsString) &&
                Objects.equals(this.indent, jsonSaveOptions.indent) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(exportArea, hasHeaderRow, exportAsString, indent, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class JsonSaveOptions {\n");
            sb.append("    exportArea: ").append(toIndentedString(getExportArea())).append("\n");
            sb.append("    hasHeaderRow: ").append(toIndentedString(getHasHeaderRow())).append("\n");
            sb.append("    exportAsString: ").append(toIndentedString(getExportAsString())).append("\n");
            sb.append("    indent: ").append(toIndentedString(getIndent())).append("\n");
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

