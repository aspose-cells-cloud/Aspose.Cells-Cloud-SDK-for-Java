package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** TaskData — Represents task data. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskData {
    /** Represents task description list. */
    @JsonProperty("Tasks")
    private List<TaskDescription> tasks;

    public List<TaskDescription> getTasks() { return tasks; }
    public TaskData setTasks(List<TaskDescription> tasks) { this.tasks = tasks; return this; }

}
