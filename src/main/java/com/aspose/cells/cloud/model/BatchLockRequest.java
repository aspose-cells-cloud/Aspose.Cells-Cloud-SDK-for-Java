package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BatchLockRequest — Indicates batch lock file request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BatchLockRequest {
    /** The directory stores files that need to format conversion. */
    @JsonProperty("SourceFolder")
    private String sourceFolder;

    /** Aspose Cloud storage name */
    @JsonProperty("SourceStorage")
    private String sourceStorage;

    /** Indicates the match condition that needs to be processed for the file name. */
    @JsonProperty("MatchCondition")
    private MatchConditionRequest matchCondition;

    /** Lock file with password */
    @JsonProperty("Password")
    private String password;

    /** The directory that stores files whose format conversion was successful. */
    @JsonProperty("OutFolder")
    private String outFolder;

    /** Aspose Cloud storage name */
    @JsonProperty("OutStorage")
    private String outStorage;

    public String getSourceFolder() { return sourceFolder; }
    public BatchLockRequest setSourceFolder(String sourceFolder) { this.sourceFolder = sourceFolder; return this; }

    public String getSourceStorage() { return sourceStorage; }
    public BatchLockRequest setSourceStorage(String sourceStorage) { this.sourceStorage = sourceStorage; return this; }

    public MatchConditionRequest getMatchCondition() { return matchCondition; }
    public BatchLockRequest setMatchCondition(MatchConditionRequest matchCondition) { this.matchCondition = matchCondition; return this; }

    public String getPassword() { return password; }
    public BatchLockRequest setPassword(String password) { this.password = password; return this; }

    public String getOutFolder() { return outFolder; }
    public BatchLockRequest setOutFolder(String outFolder) { this.outFolder = outFolder; return this; }

    public String getOutStorage() { return outStorage; }
    public BatchLockRequest setOutStorage(String outStorage) { this.outStorage = outStorage; return this; }

}
