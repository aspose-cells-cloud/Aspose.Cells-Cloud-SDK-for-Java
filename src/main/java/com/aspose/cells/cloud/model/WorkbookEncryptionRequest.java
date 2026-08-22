package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookEncryptionRequest — Used by workbook encryption/decryption requests. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookEncryptionRequest {
    /** Workbook encription type. */
    @JsonProperty("EncryptionType")
    private String encryptionType;

    /** Encription key length. */
    @JsonProperty("KeyLength")
    private Integer keyLength;

    /** Encription password. */
    @JsonProperty("Password")
    private String password;

    public String getEncryptionType() { return encryptionType; }
    public WorkbookEncryptionRequest setEncryptionType(String encryptionType) { this.encryptionType = encryptionType; return this; }

    public Integer getKeyLength() { return keyLength; }
    public WorkbookEncryptionRequest setKeyLength(Integer keyLength) { this.keyLength = keyLength; return this; }

    public String getPassword() { return password; }
    public WorkbookEncryptionRequest setPassword(String password) { this.password = password; return this; }

}
