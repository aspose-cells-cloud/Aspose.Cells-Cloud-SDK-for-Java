package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookProtectionRequest — Used by workbook protection requests. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookProtectionRequest {
    /** Protection type. Can be ALL, CONTENTS, NONE, OBJECTS, SCENARIOS, STRUCTURE, WINDOWS */
    @JsonProperty("ProtectionType")
    private String protectionType;

    /** Encription password. */
    @JsonProperty("Password")
    private String password;

    public String getProtectionType() { return protectionType; }
    public WorkbookProtectionRequest setProtectionType(String protectionType) { this.protectionType = protectionType; return this; }

    public String getPassword() { return password; }
    public WorkbookProtectionRequest setPassword(String password) { this.password = password; return this; }

}
