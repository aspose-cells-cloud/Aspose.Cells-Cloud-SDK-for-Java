package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BatchProtectRequest — Indicates batch protect file request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchProtectRequest {
    /** The directory stores files that need to format conversion. */
    @JsonProperty("SourceFolder")
    private String sourceFolder;

    /** Aspose Cloud storage name */
    @JsonProperty("SourceStorage")
    private String sourceStorage;

    /** Indicates the match condition that needs to be processed for the file name. */
    @JsonProperty("MatchCondition")
    private MatchConditionRequest matchCondition;

    /** This property defines the protection type of an object. */
    @JsonProperty("ProtectionType")
    private String protectionType;

    /** Gets or sets Password. */
    @JsonProperty("Password")
    private String password;

    /** The directory that stores files whose format conversion was successful. */
    @JsonProperty("OutFolder")
    private String outFolder;

    /** Aspose Cloud storage name. */
    @JsonProperty("OutStorage")
    private String outStorage;

    public String getSourceFolder() { return sourceFolder; }
    public BatchProtectRequest setSourceFolder(String sourceFolder) { this.sourceFolder = sourceFolder; return this; }

    public String getSourceStorage() { return sourceStorage; }
    public BatchProtectRequest setSourceStorage(String sourceStorage) { this.sourceStorage = sourceStorage; return this; }

    public MatchConditionRequest getMatchCondition() { return matchCondition; }
    public BatchProtectRequest setMatchCondition(MatchConditionRequest matchCondition) { this.matchCondition = matchCondition; return this; }

    public String getProtectionType() { return protectionType; }
    public BatchProtectRequest setProtectionType(String protectionType) { this.protectionType = protectionType; return this; }

    public String getPassword() { return password; }
    public BatchProtectRequest setPassword(String password) { this.password = password; return this; }

    public String getOutFolder() { return outFolder; }
    public BatchProtectRequest setOutFolder(String outFolder) { this.outFolder = outFolder; return this; }

    public String getOutStorage() { return outStorage; }
    public BatchProtectRequest setOutStorage(String outStorage) { this.outStorage = outStorage; return this; }

}
