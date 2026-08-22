package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** SplitResult — Represents the result of the file split. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SplitResult {
    /** Represents cells cloud file information. */
    @JsonProperty("Documents")
    private List<CellsCloudFileInfo> documents;

    public List<CellsCloudFileInfo> getDocuments() { return documents; }
    public SplitResult setDocuments(List<CellsCloudFileInfo> documents) { this.documents = documents; return this; }

}
