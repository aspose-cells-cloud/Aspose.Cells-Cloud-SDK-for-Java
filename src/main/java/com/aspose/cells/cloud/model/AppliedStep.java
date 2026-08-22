package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** AppliedStep — Each data manipulation step that is performed when you get the query data. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppliedStep {
    /** Data manipulation step name. */
    @JsonProperty("StepName")
    private String stepName;

    /** Data manipulation name. */
    @JsonProperty("AppliedOperate")
    private AppliedOperate appliedOperate;

    public String getStepName() { return stepName; }
    public AppliedStep setStepName(String stepName) { this.stepName = stepName; return this; }

    public AppliedOperate getAppliedOperate() { return appliedOperate; }
    public AppliedStep setAppliedOperate(AppliedOperate appliedOperate) { this.appliedOperate = appliedOperate; return this; }

}
