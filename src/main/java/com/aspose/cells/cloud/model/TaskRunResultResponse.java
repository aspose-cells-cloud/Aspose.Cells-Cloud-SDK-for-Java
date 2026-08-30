package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TaskRunResultResponse — Represents the TaskRunResult Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskRunResultResponse extends CellsCloudResponse {
    /** This class has a property named "TaskRunResult" of type "TaskRunResult" that can be both accessed and modified. */
    @JsonProperty("TaskRunResult")
    private TaskRunResult taskRunResult;

    public TaskRunResult getTaskRunResult() { return taskRunResult; }
    public TaskRunResultResponse setTaskRunResult(TaskRunResult taskRunResult) { this.taskRunResult = taskRunResult; return this; }


    /** Covariant override: keeps fluent chains returning TaskRunResultResponse. */
    @Override public TaskRunResultResponse setCode(Integer code) { return (TaskRunResultResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning TaskRunResultResponse. */
    @Override public TaskRunResultResponse setStatus(String status) { return (TaskRunResultResponse) super.setStatus(status); }

}
