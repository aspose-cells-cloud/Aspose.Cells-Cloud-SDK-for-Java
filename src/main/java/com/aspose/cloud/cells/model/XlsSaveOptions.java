/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="XlsSaveOptions.java">
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


public class XlsSaveOptions  extends  SaveOptions {
        @SerializedName("MatchColor")
        private Boolean matchColor ;

        public  XlsSaveOptions  matchColor(Boolean  matchColor) {
            this.matchColor =  matchColor;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getMatchColor() {
            return matchColor;
        }

        public void setMatchColor(Boolean matchColor) {
            this.matchColor = matchColor;
        }

        @SerializedName("WpsCompatibility")
        private Boolean wpsCompatibility ;

        public  XlsSaveOptions  wpsCompatibility(Boolean  wpsCompatibility) {
            this.wpsCompatibility =  wpsCompatibility;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getWpsCompatibility() {
            return wpsCompatibility;
        }

        public void setWpsCompatibility(Boolean wpsCompatibility) {
            this.wpsCompatibility = wpsCompatibility;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            XlsSaveOptions xlsSaveOptions = (XlsSaveOptions) o;
            return
                Objects.equals(this.matchColor, xlsSaveOptions.matchColor) &&
                Objects.equals(this.wpsCompatibility, xlsSaveOptions.wpsCompatibility) &&
                super.equals(o);
      }

      @Override
      public int hashCode() {
        return Objects.hash(matchColor, wpsCompatibility, super.hashCode());
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class XlsSaveOptions {\n");
            sb.append("    matchColor: ").append(toIndentedString(getMatchColor())).append("\n");
            sb.append("    wpsCompatibility: ").append(toIndentedString(getWpsCompatibility())).append("\n");
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

