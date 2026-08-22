package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** MatchConditionRequest — Indicates the match condition that needs to be processed for the file name. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MatchConditionRequest {
    /** Regex Pattern. */
    @JsonProperty("RegexPattern")
    private String regexPattern;

    /** Name list. */
    @JsonProperty("FullMatchConditions")
    private List<String> fullMatchConditions;

    public String getRegexPattern() { return regexPattern; }
    public MatchConditionRequest setRegexPattern(String regexPattern) { this.regexPattern = regexPattern; return this; }

    public List<String> getFullMatchConditions() { return fullMatchConditions; }
    public MatchConditionRequest setFullMatchConditions(List<String> fullMatchConditions) { this.fullMatchConditions = fullMatchConditions; return this; }

}
