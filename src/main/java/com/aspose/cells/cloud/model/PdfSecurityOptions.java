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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class PdfSecurityOptions {

    @SerializedName("AnnotationsPermission")
    @JsonProperty("AnnotationsPermission")
    private Boolean annotationsPermission;

    public PdfSecurityOptions annotationsPermission(Boolean annotationsPermission) {
        this.annotationsPermission = annotationsPermission;
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
    @JsonProperty("AssembleDocumentPermission")
    private Boolean assembleDocumentPermission;

    public PdfSecurityOptions assembleDocumentPermission(Boolean assembleDocumentPermission) {
        this.assembleDocumentPermission = assembleDocumentPermission;
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
    @JsonProperty("ExtractContentPermission")
    private Boolean extractContentPermission;

    public PdfSecurityOptions extractContentPermission(Boolean extractContentPermission) {
        this.extractContentPermission = extractContentPermission;
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
    @JsonProperty("FillFormsPermission")
    private Boolean fillFormsPermission;

    public PdfSecurityOptions fillFormsPermission(Boolean fillFormsPermission) {
        this.fillFormsPermission = fillFormsPermission;
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
    @JsonProperty("FullQualityPrintPermission")
    private Boolean fullQualityPrintPermission;

    public PdfSecurityOptions fullQualityPrintPermission(Boolean fullQualityPrintPermission) {
        this.fullQualityPrintPermission = fullQualityPrintPermission;
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
    @JsonProperty("ModifyDocumentPermission")
    private Boolean modifyDocumentPermission;

    public PdfSecurityOptions modifyDocumentPermission(Boolean modifyDocumentPermission) {
        this.modifyDocumentPermission = modifyDocumentPermission;
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
    @JsonProperty("OwnerPassword")
    private String ownerPassword;

    public PdfSecurityOptions ownerPassword(String ownerPassword) {
        this.ownerPassword = ownerPassword;
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
    @JsonProperty("PrintPermission")
    private Boolean printPermission;

    public PdfSecurityOptions printPermission(Boolean printPermission) {
        this.printPermission = printPermission;
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
    @JsonProperty("UserPassword")
    private String userPassword;

    public PdfSecurityOptions userPassword(String userPassword) {
        this.userPassword = userPassword;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PdfSecurityOptions other = (PdfSecurityOptions) o;
        return Objects.equals(this.annotationsPermission, other.annotationsPermission)
            && Objects.equals(this.assembleDocumentPermission, other.assembleDocumentPermission)
            && Objects.equals(this.extractContentPermission, other.extractContentPermission)
            && Objects.equals(this.fillFormsPermission, other.fillFormsPermission)
            && Objects.equals(this.fullQualityPrintPermission, other.fullQualityPrintPermission)
            && Objects.equals(this.modifyDocumentPermission, other.modifyDocumentPermission)
            && Objects.equals(this.ownerPassword, other.ownerPassword)
            && Objects.equals(this.printPermission, other.printPermission)
            && Objects.equals(this.userPassword, other.userPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annotationsPermission, assembleDocumentPermission, extractContentPermission, fillFormsPermission, fullQualityPrintPermission, modifyDocumentPermission, ownerPassword, printPermission, userPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PdfSecurityOptions {\n");
        sb.append("    annotationsPermission: ").append(annotationsPermission).append("\n");
        sb.append("    assembleDocumentPermission: ").append(assembleDocumentPermission).append("\n");
        sb.append("    extractContentPermission: ").append(extractContentPermission).append("\n");
        sb.append("    fillFormsPermission: ").append(fillFormsPermission).append("\n");
        sb.append("    fullQualityPrintPermission: ").append(fullQualityPrintPermission).append("\n");
        sb.append("    modifyDocumentPermission: ").append(modifyDocumentPermission).append("\n");
        sb.append("    ownerPassword: ").append(ownerPassword).append("\n");
        sb.append("    printPermission: ").append(printPermission).append("\n");
        sb.append("    userPassword: ").append(userPassword).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
