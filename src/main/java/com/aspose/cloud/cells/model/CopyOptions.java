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

package com.aspose.cloud.cells.model;

import java.util.Objects;
import io.swagger.annotations.ApiModelProperty;
import com.aspose.cloud.cells.model.*;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import java.time.OffsetDateTime;


public class CopyOptions {
        @SerializedName("ColumnCharacterWidth")
        private Boolean columnCharacterWidth ;

        public  CopyOptions  columnCharacterWidth(Boolean  columnCharacterWidth) {
            this.columnCharacterWidth =  columnCharacterWidth;
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
        private Boolean copyInvalidFormulasAsValues ;

        public  CopyOptions  copyInvalidFormulasAsValues(Boolean  copyInvalidFormulasAsValues) {
            this.copyInvalidFormulasAsValues =  copyInvalidFormulasAsValues;
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
        private Boolean copyNames ;

        public  CopyOptions  copyNames(Boolean  copyNames) {
            this.copyNames =  copyNames;
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
        private Boolean extendToAdjacentRange ;

        public  CopyOptions  extendToAdjacentRange(Boolean  extendToAdjacentRange) {
            this.extendToAdjacentRange =  extendToAdjacentRange;
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
        private Boolean referToDestinationSheet ;

        public  CopyOptions  referToDestinationSheet(Boolean  referToDestinationSheet) {
            this.referToDestinationSheet =  referToDestinationSheet;
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
        private Boolean referToSheetWithSameName ;

        public  CopyOptions  referToSheetWithSameName(Boolean  referToSheetWithSameName) {
            this.referToSheetWithSameName =  referToSheetWithSameName;
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
        private Boolean copyTheme ;

        public  CopyOptions  copyTheme(Boolean  copyTheme) {
            this.copyTheme =  copyTheme;
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
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            CopyOptions copyOptions = (CopyOptions) o;
            return
                Objects.equals(this.columnCharacterWidth, copyOptions.columnCharacterWidth) &&
                Objects.equals(this.copyInvalidFormulasAsValues, copyOptions.copyInvalidFormulasAsValues) &&
                Objects.equals(this.copyNames, copyOptions.copyNames) &&
                Objects.equals(this.extendToAdjacentRange, copyOptions.extendToAdjacentRange) &&
                Objects.equals(this.referToDestinationSheet, copyOptions.referToDestinationSheet) &&
                Objects.equals(this.referToSheetWithSameName, copyOptions.referToSheetWithSameName) &&
                Objects.equals(this.copyTheme, copyOptions.copyTheme);
      }

      @Override
      public int hashCode() {
        return Objects.hash(columnCharacterWidth, copyInvalidFormulasAsValues, copyNames, extendToAdjacentRange, referToDestinationSheet, referToSheetWithSameName, copyTheme);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class CopyOptions {\n");
            sb.append("    columnCharacterWidth: ").append(toIndentedString(getColumnCharacterWidth())).append("\n");
            sb.append("    copyInvalidFormulasAsValues: ").append(toIndentedString(getCopyInvalidFormulasAsValues())).append("\n");
            sb.append("    copyNames: ").append(toIndentedString(getCopyNames())).append("\n");
            sb.append("    extendToAdjacentRange: ").append(toIndentedString(getExtendToAdjacentRange())).append("\n");
            sb.append("    referToDestinationSheet: ").append(toIndentedString(getReferToDestinationSheet())).append("\n");
            sb.append("    referToSheetWithSameName: ").append(toIndentedString(getReferToSheetWithSameName())).append("\n");
            sb.append("    copyTheme: ").append(toIndentedString(getCopyTheme())).append("\n");
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

