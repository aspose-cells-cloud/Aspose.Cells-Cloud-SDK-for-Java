/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="EbookSaveOptions.java">
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


public class EbookSaveOptions  extends  HtmlSaveOptions {
        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            return super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class EbookSaveOptions {\n");
            sb.append("    exportPageHeaders: ").append(toIndentedString(getExportPageHeaders())).append("\n");
            sb.append("    exportPageFooters: ").append(toIndentedString(getExportPageFooters())).append("\n");
            sb.append("    exportRowColumnHeadings: ").append(toIndentedString(getExportRowColumnHeadings())).append("\n");
            sb.append("    showAllSheets: ").append(toIndentedString(getShowAllSheets())).append("\n");
            sb.append("    imageOptions: ").append(toIndentedString(getImageOptions())).append("\n");
            sb.append("    saveAsSingleFile: ").append(toIndentedString(getSaveAsSingleFile())).append("\n");
            sb.append("    exportHiddenWorksheet: ").append(toIndentedString(getExportHiddenWorksheet())).append("\n");
            sb.append("    exportGridLines: ").append(toIndentedString(getExportGridLines())).append("\n");
            sb.append("    presentationPreference: ").append(toIndentedString(getPresentationPreference())).append("\n");
            sb.append("    cellCssPrefix: ").append(toIndentedString(getCellCssPrefix())).append("\n");
            sb.append("    tableCssId: ").append(toIndentedString(getTableCssId())).append("\n");
            sb.append("    isFullPathLink: ").append(toIndentedString(getIsFullPathLink())).append("\n");
            sb.append("    exportWorksheetCSSSeparately: ").append(toIndentedString(getExportWorksheetCSSSeparately())).append("\n");
            sb.append("    exportSimilarBorderStyle: ").append(toIndentedString(getExportSimilarBorderStyle())).append("\n");
            sb.append("    mergeEmptyTdForcely: ").append(toIndentedString(getMergeEmptyTdForcely())).append("\n");
            sb.append("    exportCellCoordinate: ").append(toIndentedString(getExportCellCoordinate())).append("\n");
            sb.append("    exportExtraHeadings: ").append(toIndentedString(getExportExtraHeadings())).append("\n");
            sb.append("    exportHeadings: ").append(toIndentedString(getExportHeadings())).append("\n");
            sb.append("    exportFormula: ").append(toIndentedString(getExportFormula())).append("\n");
            sb.append("    addTooltipText: ").append(toIndentedString(getAddTooltipText())).append("\n");
            sb.append("    exportBogusRowData: ").append(toIndentedString(getExportBogusRowData())).append("\n");
            sb.append("    excludeUnusedStyles: ").append(toIndentedString(getExcludeUnusedStyles())).append("\n");
            sb.append("    exportDocumentProperties: ").append(toIndentedString(getExportDocumentProperties())).append("\n");
            sb.append("    exportWorksheetProperties: ").append(toIndentedString(getExportWorksheetProperties())).append("\n");
            sb.append("    exportWorkbookProperties: ").append(toIndentedString(getExportWorkbookProperties())).append("\n");
            sb.append("    exportFrameScriptsAndProperties: ").append(toIndentedString(getExportFrameScriptsAndProperties())).append("\n");
            sb.append("    attachedFilesDirectory: ").append(toIndentedString(getAttachedFilesDirectory())).append("\n");
            sb.append("    attachedFilesUrlPrefix: ").append(toIndentedString(getAttachedFilesUrlPrefix())).append("\n");
            sb.append("    encoding: ").append(toIndentedString(getEncoding())).append("\n");
            sb.append("    exportActiveWorksheetOnly: ").append(toIndentedString(getExportActiveWorksheetOnly())).append("\n");
            sb.append("    exportChartImageFormat: ").append(toIndentedString(getExportChartImageFormat())).append("\n");
            sb.append("    exportImagesAsBase64: ").append(toIndentedString(getExportImagesAsBase64())).append("\n");
            sb.append("    hiddenColDisplayType: ").append(toIndentedString(getHiddenColDisplayType())).append("\n");
            sb.append("    hiddenRowDisplayType: ").append(toIndentedString(getHiddenRowDisplayType())).append("\n");
            sb.append("    htmlCrossStringType: ").append(toIndentedString(getHtmlCrossStringType())).append("\n");
            sb.append("    isExpImageToTempDir: ").append(toIndentedString(getIsExpImageToTempDir())).append("\n");
            sb.append("    pageTitle: ").append(toIndentedString(getPageTitle())).append("\n");
            sb.append("    parseHtmlTagInCell: ").append(toIndentedString(getParseHtmlTagInCell())).append("\n");
            sb.append("    cellNameAttribute: ").append(toIndentedString(getCellNameAttribute())).append("\n");
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

