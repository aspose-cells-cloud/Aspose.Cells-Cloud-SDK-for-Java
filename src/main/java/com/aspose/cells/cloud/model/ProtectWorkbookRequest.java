package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ProtectWorkbookRequest — Indicates protect workbook request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProtectWorkbookRequest {
    /** Indicates aways open read-only. */
    @JsonProperty("AwaysOpenReadOnly")
    private Boolean awaysOpenReadOnly;

    /** Indicates encrypt with password. */
    @JsonProperty("EncryptWithPassword")
    private String encryptWithPassword;

    /** Represents the various types of protection options available for a worksheet. */
    @JsonProperty("ProtectCurrentSheet")
    private Protection protectCurrentSheet;

    /** Represents the various types of protection options available for all worksheets. */
    @JsonProperty("ProtectAllSheets")
    private Protection protectAllSheets;

    /** Indicates protect workbook structure. All, Contents, Objects, Scenarios, Structure, Windows, and None. */
    @JsonProperty("ProtectWorkbookStructure")
    private String protectWorkbookStructure;

    /** Indicates signature in file. */
    @JsonProperty("DigitalSignature")
    private DigitalSignature digitalSignature;

    /** Indicates mark as final. */
    @JsonProperty("MarkAsFinal")
    private Boolean markAsFinal;

    public Boolean getAwaysOpenReadOnly() { return awaysOpenReadOnly; }
    public ProtectWorkbookRequest setAwaysOpenReadOnly(Boolean awaysOpenReadOnly) { this.awaysOpenReadOnly = awaysOpenReadOnly; return this; }

    public String getEncryptWithPassword() { return encryptWithPassword; }
    public ProtectWorkbookRequest setEncryptWithPassword(String encryptWithPassword) { this.encryptWithPassword = encryptWithPassword; return this; }

    public Protection getProtectCurrentSheet() { return protectCurrentSheet; }
    public ProtectWorkbookRequest setProtectCurrentSheet(Protection protectCurrentSheet) { this.protectCurrentSheet = protectCurrentSheet; return this; }

    public Protection getProtectAllSheets() { return protectAllSheets; }
    public ProtectWorkbookRequest setProtectAllSheets(Protection protectAllSheets) { this.protectAllSheets = protectAllSheets; return this; }

    public String getProtectWorkbookStructure() { return protectWorkbookStructure; }
    public ProtectWorkbookRequest setProtectWorkbookStructure(String protectWorkbookStructure) { this.protectWorkbookStructure = protectWorkbookStructure; return this; }

    public DigitalSignature getDigitalSignature() { return digitalSignature; }
    public ProtectWorkbookRequest setDigitalSignature(DigitalSignature digitalSignature) { this.digitalSignature = digitalSignature; return this; }

    public Boolean getMarkAsFinal() { return markAsFinal; }
    public ProtectWorkbookRequest setMarkAsFinal(Boolean markAsFinal) { this.markAsFinal = markAsFinal; return this; }

}
