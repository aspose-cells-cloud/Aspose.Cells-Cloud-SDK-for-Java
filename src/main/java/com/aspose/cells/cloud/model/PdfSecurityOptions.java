package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PdfSecurityOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PdfSecurityOptions {
    /** Gets or sets AnnotationsPermission. */
    @JsonProperty("AnnotationsPermission")
    private Boolean annotationsPermission;

    /** Gets or sets AssembleDocumentPermission. */
    @JsonProperty("AssembleDocumentPermission")
    private Boolean assembleDocumentPermission;

    /** Gets or sets ExtractContentPermission. */
    @JsonProperty("ExtractContentPermission")
    private Boolean extractContentPermission;

    /** Gets or sets FillFormsPermission. */
    @JsonProperty("FillFormsPermission")
    private Boolean fillFormsPermission;

    /** Gets or sets FullQualityPrintPermission. */
    @JsonProperty("FullQualityPrintPermission")
    private Boolean fullQualityPrintPermission;

    /** Gets or sets ModifyDocumentPermission. */
    @JsonProperty("ModifyDocumentPermission")
    private Boolean modifyDocumentPermission;

    /** Gets or sets OwnerPassword. */
    @JsonProperty("OwnerPassword")
    private String ownerPassword;

    /** Gets or sets PrintPermission. */
    @JsonProperty("PrintPermission")
    private Boolean printPermission;

    /** Gets or sets UserPassword. */
    @JsonProperty("UserPassword")
    private String userPassword;

    public Boolean getAnnotationsPermission() { return annotationsPermission; }
    public PdfSecurityOptions setAnnotationsPermission(Boolean annotationsPermission) { this.annotationsPermission = annotationsPermission; return this; }

    public Boolean getAssembleDocumentPermission() { return assembleDocumentPermission; }
    public PdfSecurityOptions setAssembleDocumentPermission(Boolean assembleDocumentPermission) { this.assembleDocumentPermission = assembleDocumentPermission; return this; }

    public Boolean getExtractContentPermission() { return extractContentPermission; }
    public PdfSecurityOptions setExtractContentPermission(Boolean extractContentPermission) { this.extractContentPermission = extractContentPermission; return this; }

    public Boolean getFillFormsPermission() { return fillFormsPermission; }
    public PdfSecurityOptions setFillFormsPermission(Boolean fillFormsPermission) { this.fillFormsPermission = fillFormsPermission; return this; }

    public Boolean getFullQualityPrintPermission() { return fullQualityPrintPermission; }
    public PdfSecurityOptions setFullQualityPrintPermission(Boolean fullQualityPrintPermission) { this.fullQualityPrintPermission = fullQualityPrintPermission; return this; }

    public Boolean getModifyDocumentPermission() { return modifyDocumentPermission; }
    public PdfSecurityOptions setModifyDocumentPermission(Boolean modifyDocumentPermission) { this.modifyDocumentPermission = modifyDocumentPermission; return this; }

    public String getOwnerPassword() { return ownerPassword; }
    public PdfSecurityOptions setOwnerPassword(String ownerPassword) { this.ownerPassword = ownerPassword; return this; }

    public Boolean getPrintPermission() { return printPermission; }
    public PdfSecurityOptions setPrintPermission(Boolean printPermission) { this.printPermission = printPermission; return this; }

    public String getUserPassword() { return userPassword; }
    public PdfSecurityOptions setUserPassword(String userPassword) { this.userPassword = userPassword; return this; }

}
