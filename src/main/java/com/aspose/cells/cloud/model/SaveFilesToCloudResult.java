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

    public List<Link> getSavedFiles() { return savedFiles; }
    public SaveFilesToCloudResult setSavedFiles(List<Link> savedFiles) { this.savedFiles = savedFiles; return this; }


    /** Covariant override: keeps fluent chains returning SaveFilesToCloudResult. */
    @Override public SaveFilesToCloudResult setDescription(String description) { return (SaveFilesToCloudResult) super.setDescription(description); }
    /** Covariant override: keeps fluent chains returning SaveFilesToCloudResult. */
    @Override public SaveFilesToCloudResult setOutFileList(List<DataSource> outFileList) { return (SaveFilesToCloudResult) super.setOutFileList(outFileList); }

}
