package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SaveFilesToCloudResult — Represents save file to cloud result. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaveFilesToCloudResult extends TaskRunResult {
    /** This class has a property named SavedFiles of type List Link. */
    @JsonProperty("SavedFiles")
    private List<Link> savedFiles;

    /** Gets or sets Description. */
    @JsonProperty("Description")
    private String description;

    /** Gets or sets OutFileList. */
    @JsonProperty("OutFileList")
    private List<DataSource> outFileList;

    public List<Link> getSavedFiles() { return savedFiles; }
    public SaveFilesToCloudResult setSavedFiles(List<Link> savedFiles) { this.savedFiles = savedFiles; return this; }

    public String getDescription() { return description; }
    public SaveFilesToCloudResult setDescription(String description) { this.description = description; return this; }

    public List<DataSource> getOutFileList() { return outFileList; }
    public SaveFilesToCloudResult setOutFileList(List<DataSource> outFileList) { this.outFileList = outFileList; return this; }

}
