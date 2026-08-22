package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WriteProtection — Specifies write protection settings for a workbook. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WriteProtection {
    /** Gets and sets the author. */
    @JsonProperty("Author")
    private String author;

    /** Indicates if the Read Only Recommended option is selected. */
    @JsonProperty("RecommendReadOnly")
    private Boolean recommendReadOnly;

    /** Indicates whether this workbook is write protected. */
    @JsonProperty("IsWriteProtected")
    private Boolean isWriteProtected;

    /** Sets the protected password to modify the file. */
    @JsonProperty("Password")
    private String password;

    public String getAuthor() { return author; }
    public WriteProtection setAuthor(String author) { this.author = author; return this; }

    public Boolean getRecommendReadOnly() { return recommendReadOnly; }
    public WriteProtection setRecommendReadOnly(Boolean recommendReadOnly) { this.recommendReadOnly = recommendReadOnly; return this; }

    public Boolean getIsWriteProtected() { return isWriteProtected; }
    public WriteProtection setIsWriteProtected(Boolean isWriteProtected) { this.isWriteProtected = isWriteProtected; return this; }

    public String getPassword() { return password; }
    public WriteProtection setPassword(String password) { this.password = password; return this; }

}
