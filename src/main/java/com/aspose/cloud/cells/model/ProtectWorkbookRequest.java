/*
 * --------------------------------------------------------------------------------
 * <copyright company="Aspose" file="ProtectWorkbookRequest.java">
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


public class ProtectWorkbookRequest {
        @SerializedName("AwaysOpenReadOnly")
        private Boolean awaysOpenReadOnly ;

        public  ProtectWorkbookRequest  awaysOpenReadOnly(Boolean  awaysOpenReadOnly) {
            this.awaysOpenReadOnly =  awaysOpenReadOnly;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getAwaysOpenReadOnly() {
            return awaysOpenReadOnly;
        }

        public void setAwaysOpenReadOnly(Boolean awaysOpenReadOnly) {
            this.awaysOpenReadOnly = awaysOpenReadOnly;
        }

        @SerializedName("EncryptWithPassword")
        private String encryptWithPassword ;

        public  ProtectWorkbookRequest  encryptWithPassword(String  encryptWithPassword) {
            this.encryptWithPassword =  encryptWithPassword;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getEncryptWithPassword() {
            return encryptWithPassword;
        }

        public void setEncryptWithPassword(String encryptWithPassword) {
            this.encryptWithPassword = encryptWithPassword;
        }

        @SerializedName("ProtectCurrentSheet")
        private Protection protectCurrentSheet ;

        public  ProtectWorkbookRequest  protectCurrentSheet(Protection  protectCurrentSheet) {
            this.protectCurrentSheet =  protectCurrentSheet;
            return this;
        }

        @ApiModelProperty(value = "")
        public Protection getProtectCurrentSheet() {
            return protectCurrentSheet;
        }

        public void setProtectCurrentSheet(Protection protectCurrentSheet) {
            this.protectCurrentSheet = protectCurrentSheet;
        }

        @SerializedName("ProtectAllSheets")
        private Protection protectAllSheets ;

        public  ProtectWorkbookRequest  protectAllSheets(Protection  protectAllSheets) {
            this.protectAllSheets =  protectAllSheets;
            return this;
        }

        @ApiModelProperty(value = "")
        public Protection getProtectAllSheets() {
            return protectAllSheets;
        }

        public void setProtectAllSheets(Protection protectAllSheets) {
            this.protectAllSheets = protectAllSheets;
        }

        @SerializedName("ProtectWorkbookStructure")
        private String protectWorkbookStructure ;

        public  ProtectWorkbookRequest  protectWorkbookStructure(String  protectWorkbookStructure) {
            this.protectWorkbookStructure =  protectWorkbookStructure;
            return this;
        }

        @ApiModelProperty(value = "")
        public String getProtectWorkbookStructure() {
            return protectWorkbookStructure;
        }

        public void setProtectWorkbookStructure(String protectWorkbookStructure) {
            this.protectWorkbookStructure = protectWorkbookStructure;
        }

        @SerializedName("DigitalSignature")
        private DigitalSignature digitalSignature ;

        public  ProtectWorkbookRequest  digitalSignature(DigitalSignature  digitalSignature) {
            this.digitalSignature =  digitalSignature;
            return this;
        }

        @ApiModelProperty(value = "")
        public DigitalSignature getDigitalSignature() {
            return digitalSignature;
        }

        public void setDigitalSignature(DigitalSignature digitalSignature) {
            this.digitalSignature = digitalSignature;
        }

        @SerializedName("MarkAsFinal")
        private Boolean markAsFinal ;

        public  ProtectWorkbookRequest  markAsFinal(Boolean  markAsFinal) {
            this.markAsFinal =  markAsFinal;
            return this;
        }

        @ApiModelProperty(value = "")
        public Boolean getMarkAsFinal() {
            return markAsFinal;
        }

        public void setMarkAsFinal(Boolean markAsFinal) {
            this.markAsFinal = markAsFinal;
        }

        @Override
        public boolean equals(java.lang.Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }

            ProtectWorkbookRequest protectWorkbookRequest = (ProtectWorkbookRequest) o;
            return
                Objects.equals(this.awaysOpenReadOnly, protectWorkbookRequest.awaysOpenReadOnly) &&
                Objects.equals(this.encryptWithPassword, protectWorkbookRequest.encryptWithPassword) &&
                Objects.equals(this.protectCurrentSheet, protectWorkbookRequest.protectCurrentSheet) &&
                Objects.equals(this.protectAllSheets, protectWorkbookRequest.protectAllSheets) &&
                Objects.equals(this.protectWorkbookStructure, protectWorkbookRequest.protectWorkbookStructure) &&
                Objects.equals(this.digitalSignature, protectWorkbookRequest.digitalSignature) &&
                Objects.equals(this.markAsFinal, protectWorkbookRequest.markAsFinal);
      }

      @Override
      public int hashCode() {
        return Objects.hash(awaysOpenReadOnly, encryptWithPassword, protectCurrentSheet, protectAllSheets, protectWorkbookStructure, digitalSignature, markAsFinal);
      }
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("class ProtectWorkbookRequest {\n");
            sb.append("    awaysOpenReadOnly: ").append(toIndentedString(getAwaysOpenReadOnly())).append("\n");
            sb.append("    encryptWithPassword: ").append(toIndentedString(getEncryptWithPassword())).append("\n");
            sb.append("    protectCurrentSheet: ").append(toIndentedString(getProtectCurrentSheet())).append("\n");
            sb.append("    protectAllSheets: ").append(toIndentedString(getProtectAllSheets())).append("\n");
            sb.append("    protectWorkbookStructure: ").append(toIndentedString(getProtectWorkbookStructure())).append("\n");
            sb.append("    digitalSignature: ").append(toIndentedString(getDigitalSignature())).append("\n");
            sb.append("    markAsFinal: ").append(toIndentedString(getMarkAsFinal())).append("\n");
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

