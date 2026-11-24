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

package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ProtectWorkbookRequest {

    @SerializedName("AwaysOpenReadOnly")
    @JsonProperty("AwaysOpenReadOnly")
    private Boolean awaysOpenReadOnly;

    public ProtectWorkbookRequest awaysOpenReadOnly(Boolean awaysOpenReadOnly) {
        this.awaysOpenReadOnly = awaysOpenReadOnly;
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
    @JsonProperty("EncryptWithPassword")
    private String encryptWithPassword;

    public ProtectWorkbookRequest encryptWithPassword(String encryptWithPassword) {
        this.encryptWithPassword = encryptWithPassword;
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
    @JsonProperty("ProtectCurrentSheet")
    private Protection protectCurrentSheet;

    public ProtectWorkbookRequest protectCurrentSheet(Protection protectCurrentSheet) {
        this.protectCurrentSheet = protectCurrentSheet;
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
    @JsonProperty("ProtectAllSheets")
    private Protection protectAllSheets;

    public ProtectWorkbookRequest protectAllSheets(Protection protectAllSheets) {
        this.protectAllSheets = protectAllSheets;
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
    @JsonProperty("ProtectWorkbookStructure")
    private String protectWorkbookStructure;

    public ProtectWorkbookRequest protectWorkbookStructure(String protectWorkbookStructure) {
        this.protectWorkbookStructure = protectWorkbookStructure;
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
    @JsonProperty("DigitalSignature")
    private DigitalSignature digitalSignature;

    public ProtectWorkbookRequest digitalSignature(DigitalSignature digitalSignature) {
        this.digitalSignature = digitalSignature;
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
    @JsonProperty("MarkAsFinal")
    private Boolean markAsFinal;

    public ProtectWorkbookRequest markAsFinal(Boolean markAsFinal) {
        this.markAsFinal = markAsFinal;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectWorkbookRequest other = (ProtectWorkbookRequest) o;
        return Objects.equals(this.awaysOpenReadOnly, other.awaysOpenReadOnly)
            && Objects.equals(this.encryptWithPassword, other.encryptWithPassword)
            && Objects.equals(this.protectCurrentSheet, other.protectCurrentSheet)
            && Objects.equals(this.protectAllSheets, other.protectAllSheets)
            && Objects.equals(this.protectWorkbookStructure, other.protectWorkbookStructure)
            && Objects.equals(this.digitalSignature, other.digitalSignature)
            && Objects.equals(this.markAsFinal, other.markAsFinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(awaysOpenReadOnly, encryptWithPassword, protectCurrentSheet, protectAllSheets, protectWorkbookStructure, digitalSignature, markAsFinal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectWorkbookRequest {\n");
        sb.append("    awaysOpenReadOnly: ").append(awaysOpenReadOnly).append("\n");
        sb.append("    encryptWithPassword: ").append(encryptWithPassword).append("\n");
        sb.append("    protectCurrentSheet: ").append(protectCurrentSheet).append("\n");
        sb.append("    protectAllSheets: ").append(protectAllSheets).append("\n");
        sb.append("    protectWorkbookStructure: ").append(protectWorkbookStructure).append("\n");
        sb.append("    digitalSignature: ").append(digitalSignature).append("\n");
        sb.append("    markAsFinal: ").append(markAsFinal).append("\n");
        sb.append("}");
        return sb.toString();
    }
}
