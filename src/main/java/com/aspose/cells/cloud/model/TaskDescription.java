package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TaskDescription — Represents task description. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskDescription {
    /** Represents task type. */
    @JsonProperty("TaskType")
    private String taskType;

    /** Represents task parameter. */
    @JsonProperty("TaskParameter")
    private TaskParameter taskParameter;

    public String getTaskType() { return taskType; }
    public TaskDescription setTaskType(String taskType) { this.taskType = taskType; return this; }

    public TaskParameter getTaskParameter() { return taskParameter; }
    public TaskDescription setTaskParameter(TaskParameter taskParameter) { this.taskParameter = taskParameter; return this; }

}
