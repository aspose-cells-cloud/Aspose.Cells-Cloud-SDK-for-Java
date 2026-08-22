package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TaskRunResultResponse — Represents the TaskRunResult Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskRunResultResponse extends CellsCloudResponse {
    /** This class has a property named "TaskRunResult" of type "TaskRunResult" that can be both accessed and modified. */
    @JsonProperty("TaskRunResult")
    private TaskRunResult taskRunResult;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public TaskRunResult getTaskRunResult() { return taskRunResult; }
    public TaskRunResultResponse setTaskRunResult(TaskRunResult taskRunResult) { this.taskRunResult = taskRunResult; return this; }

    public Integer getCode() { return code; }
    public TaskRunResultResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public TaskRunResultResponse setStatus(String status) { this.status = status; return this; }

}
