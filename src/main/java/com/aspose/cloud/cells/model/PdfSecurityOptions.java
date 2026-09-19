/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="PdfSecurityOptions.java">
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


public class PdfSecurityOptions {
        @SerializedName("AnnotationsPermission")
        private Boolean annotationsPermission ;

        public  PdfSecurityOptions  annotationsPermission(Boolean  annotationsPermission) {
            this.annotationsPermission =  annotationsPermission;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAnnotationsPermission() {
            return annotationsPermission;
        }

        public void setAnnotationsPermission(Boolean annotationsPermission) {
            this.annotationsPermission = annotationsPermission;
        }

        @SerializedName("AssembleDocumentPermission")
        private Boolean assembleDocumentPermission ;

        public  PdfSecurityOptions  assembleDocumentPermission(Boolean  assembleDocumentPermission) {
            this.assembleDocumentPermission =  assembleDocumentPermission;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAssembleDocumentPermission() {
            return assembleDocumentPermission;
        }

        public void setAssembleDocumentPermission(Boolean assembleDocumentPermission) {
            this.assembleDocumentPermission = assembleDocumentPermission;
        }

        @SerializedName("ExtractContentPermission")
        private Boolean extractContentPermission ;

        public  PdfSecurityOptions  extractContentPermission(Boolean  extractContentPermission) {
            this.extractContentPermission =  extractContentPermission;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getExtractContentPermission() {
            return extractContentPermission;
        }

        public void setExtractContentPermission(Boolean extractContentPermission) {
            this.extractContentPermission = extractContentPermission;
        }

        @SerializedName("FillFormsPermission")
        private Boolean fillFormsPermission ;

        public  PdfSecurityOptions  fillFormsPermission(Boolean  fillFormsPermission) {
            this.fillFormsPermission =  fillFormsPermission;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getFillFormsPermission() {
            return fillFormsPermission;
        }

        public void setFillFormsPermission(Boolean fillFormsPermission) {
            this.fillFormsPermission = fillFormsPermission;
        }

        @SerializedName("FullQualityPrintPermission")
        private Boolean fullQualityPrintPermission ;

        public  PdfSecurityOptions  fullQualityPrintPermission(Boolean  fullQualityPrintPermission) {
            this.fullQualityPrintPermission =  fullQualityPrintPermission;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getFullQualityPrintPermission() {
            return fullQualityPrintPermission;
        }

        public void setFullQualityPrintPermission(Boolean fullQualityPrintPermission) {
            this.fullQualityPrintPermission = fullQualityPrintPermission;
        }

        @SerializedName("ModifyDocumentPermission")
        private Boolean modifyDocumentPermission ;

        public  PdfSecurityOptions  modifyDocumentPermission(Boolean  modifyDocumentPermission) {
            this.modifyDocumentPermission =  modifyDocumentPermission;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getModifyDocumentPermission() {
            return modifyDocumentPermission;
        }

        public void setModifyDocumentPermission(Boolean modifyDocumentPermission) {
            this.modifyDocumentPermission = modifyDocumentPermission;
        }

        @SerializedName("OwnerPassword")
        private String ownerPassword ;

        public  PdfSecurityOptions  ownerPassword(String  ownerPassword) {
            this.ownerPassword =  ownerPassword;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getOwnerPassword() {
            return ownerPassword;
        }

        public void setOwnerPassword(String ownerPassword) {
            this.ownerPassword = ownerPassword;
        }

        @SerializedName("PrintPermission")
        private Boolean printPermission ;

        public  PdfSecurityOptions  printPermission(Boolean  printPermission) {
            this.printPermission =  printPermission;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getPrintPermission() {
            return printPermission;
        }

        public void setPrintPermission(Boolean printPermission) {
            this.printPermission = printPermission;
        }

        @SerializedName("UserPassword")
        private String userPassword ;

        public  PdfSecurityOptions  userPassword(String  userPassword) {
            this.userPassword =  userPassword;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getUserPassword() {
            return userPassword;
        }

        public void setUserPassword(String userPassword) {
            this.userPassword = userPassword;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            PdfSecurityOptions pdfSecurityOptions = (PdfSecurityOptions) o;
            return
                Objects.equals(this.annotationsPermission, pdfSecurityOptions.annotationsPermission) &&
                Objects.equals(this.assembleDocumentPermission, pdfSecurityOptions.assembleDocumentPermission) &&
                Objects.equals(this.extractContentPermission, pdfSecurityOptions.extractContentPermission) &&
                Objects.equals(this.fillFormsPermission, pdfSecurityOptions.fillFormsPermission) &&
                Objects.equals(this.fullQualityPrintPermission, pdfSecurityOptions.fullQualityPrintPermission) &&
                Objects.equals(this.modifyDocumentPermission, pdfSecurityOptions.modifyDocumentPermission) &&
                Objects.equals(this.ownerPassword, pdfSecurityOptions.ownerPassword) &&
                Objects.equals(this.printPermission, pdfSecurityOptions.printPermission) &&
                Objects.equals(this.userPassword, pdfSecurityOptions.userPassword);
      }

      @Override
      public int hashCode() {
        return Objects.hash(annotationsPermission, assembleDocumentPermission, extractContentPermission, fillFormsPermission, fullQualityPrintPermission, modifyDocumentPermission, ownerPassword, printPermission, userPassword);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class PdfSecurityOptions {\n");
            sb.append("    annotationsPermission: ").append(toIndentedString(getAnnotationsPermission())).append("\n");
            sb.append("    assembleDocumentPermission: ").append(toIndentedString(getAssembleDocumentPermission())).append("\n");
            sb.append("    extractContentPermission: ").append(toIndentedString(getExtractContentPermission())).append("\n");
            sb.append("    fillFormsPermission: ").append(toIndentedString(getFillFormsPermission())).append("\n");
            sb.append("    fullQualityPrintPermission: ").append(toIndentedString(getFullQualityPrintPermission())).append("\n");
            sb.append("    modifyDocumentPermission: ").append(toIndentedString(getModifyDocumentPermission())).append("\n");
            sb.append("    ownerPassword: ").append(toIndentedString(getOwnerPassword())).append("\n");
            sb.append("    printPermission: ").append(toIndentedString(getPrintPermission())).append("\n");
            sb.append("    userPassword: ").append(toIndentedString(getUserPassword())).append("\n");
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

