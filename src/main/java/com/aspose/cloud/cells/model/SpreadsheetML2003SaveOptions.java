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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class SpreadsheetML2003SaveOptions  extends  SaveOptions {
        @SerializedName("ExportColumnIndexOfCell")
        private Boolean exportColumnIndexOfCell ;

        public  SpreadsheetML2003SaveOptions  exportColumnIndexOfCell(Boolean  exportColumnIndexOfCell) {
            this.exportColumnIndexOfCell =  exportColumnIndexOfCell;
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
        private Boolean isIndentedFormatting ;

        public  SpreadsheetML2003SaveOptions  isIndentedFormatting(Boolean  isIndentedFormatting) {
            this.isIndentedFormatting =  isIndentedFormatting;
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
        private Boolean limitAsXls ;

        public  SpreadsheetML2003SaveOptions  limitAsXls(Boolean  limitAsXls) {
            this.limitAsXls =  limitAsXls;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            SpreadsheetML2003SaveOptions spreadsheetML2003SaveOptions = (SpreadsheetML2003SaveOptions) o;
            return
                Objects.equals(this.exportColumnIndexOfCell, spreadsheetML2003SaveOptions.exportColumnIndexOfCell) &&
                Objects.equals(this.isIndentedFormatting, spreadsheetML2003SaveOptions.isIndentedFormatting) &&
                Objects.equals(this.limitAsXls, spreadsheetML2003SaveOptions.limitAsXls) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(exportColumnIndexOfCell, isIndentedFormatting, limitAsXls, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class SpreadsheetML2003SaveOptions {\n");
            sb.append("    exportColumnIndexOfCell: ").append(toIndentedString(getExportColumnIndexOfCell())).append("\n");
            sb.append("    isIndentedFormatting: ").append(toIndentedString(getIsIndentedFormatting())).append("\n");
            sb.append("    limitAsXls: ").append(toIndentedString(getLimitAsXls())).append("\n");
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

