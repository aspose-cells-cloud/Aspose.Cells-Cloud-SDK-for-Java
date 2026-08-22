package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** TaskRunResult — Represents task run result. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TaskRunResult {
    /** Represents task run result description. */
    @JsonProperty("Description")
    private String description;

    /** Represents out data file list. */
    @JsonProperty("OutFileList")
    private List<DataSource> outFileList;

    public String getDescription() { return description; }
    public TaskRunResult setDescription(String description) { this.description = description; return this; }

    public List<DataSource> getOutFileList() { return outFileList; }
    public TaskRunResult setOutFileList(List<DataSource> outFileList) { this.outFileList = outFileList; return this; }

}
