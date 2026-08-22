package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SaveResult model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaveResult {
    /** Gets or sets Documents. */
    @JsonProperty("Documents")
    private List<CellsCloudFileInfo> documents;

    public List<CellsCloudFileInfo> getDocuments() { return documents; }
    public SaveResult setDocuments(List<CellsCloudFileInfo> documents) { this.documents = documents; return this; }

}
