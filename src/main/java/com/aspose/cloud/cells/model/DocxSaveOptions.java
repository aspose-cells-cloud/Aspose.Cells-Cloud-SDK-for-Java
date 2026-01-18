/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="DocxSaveOptions.java">
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


public class DocxSaveOptions  extends  PaginatedSaveOptions {
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
            sb.append("class DocxSaveOptions {\n");
            sb.append("    defaultFont: ").append(toIndentedString(getDefaultFont())).append("\n");
            sb.append("    checkWorkbookDefaultFont: ").append(toIndentedString(getCheckWorkbookDefaultFont())).append("\n");
            sb.append("    checkFontCompatibility: ").append(toIndentedString(getCheckFontCompatibility())).append("\n");
            sb.append("    isFontSubstitutionCharGranularity: ").append(toIndentedString(getIsFontSubstitutionCharGranularity())).append("\n");
            sb.append("    onePagePerSheet: ").append(toIndentedString(getOnePagePerSheet())).append("\n");
            sb.append("    allColumnsInOnePagePerSheet: ").append(toIndentedString(getAllColumnsInOnePagePerSheet())).append("\n");
            sb.append("    ignoreError: ").append(toIndentedString(getIgnoreError())).append("\n");
            sb.append("    outputBlankPageWhenNothingToPrint: ").append(toIndentedString(getOutputBlankPageWhenNothingToPrint())).append("\n");
            sb.append("    pageIndex: ").append(toIndentedString(getPageIndex())).append("\n");
            sb.append("    pageCount: ").append(toIndentedString(getPageCount())).append("\n");
            sb.append("    printingPageType: ").append(toIndentedString(getPrintingPageType())).append("\n");
            sb.append("    gridlineType: ").append(toIndentedString(getGridlineType())).append("\n");
            sb.append("    textCrossType: ").append(toIndentedString(getTextCrossType())).append("\n");
            sb.append("    defaultEditLanguage: ").append(toIndentedString(getDefaultEditLanguage())).append("\n");
            sb.append("    emfRenderSetting: ").append(toIndentedString(getEmfRenderSetting())).append("\n");
            sb.append("    mergeAreas: ").append(toIndentedString(getMergeAreas())).append("\n");
            sb.append("    sortExternalNames: ").append(toIndentedString(getSortExternalNames())).append("\n");
            sb.append("    updateSmartArt: ").append(toIndentedString(getUpdateSmartArt())).append("\n");
            sb.append("    saveFormat: ").append(toIndentedString(getSaveFormat())).append("\n");
            sb.append("    cachedFileFolder: ").append(toIndentedString(getCachedFileFolder())).append("\n");
            sb.append("    clearData: ").append(toIndentedString(getClearData())).append("\n");
            sb.append("    createDirectory: ").append(toIndentedString(getCreateDirectory())).append("\n");
            sb.append("    enableHTTPCompression: ").append(toIndentedString(getEnableHTTPCompression())).append("\n");
            sb.append("    refreshChartCache: ").append(toIndentedString(getRefreshChartCache())).append("\n");
            sb.append("    sortNames: ").append(toIndentedString(getSortNames())).append("\n");
            sb.append("    validateMergedAreas: ").append(toIndentedString(getValidateMergedAreas())).append("\n");
            sb.append("    checkExcelRestriction: ").append(toIndentedString(getCheckExcelRestriction())).append("\n");
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

