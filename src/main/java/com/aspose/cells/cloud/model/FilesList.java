package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** FilesList — Files list */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilesList {
    /** Files and folders contained by folder StorageFile. */
    @JsonProperty("Value")
    private List<StorageFile> value;

    public List<StorageFile> getValue() { return value; }
    public FilesList setValue(List<StorageFile> value) { this.value = value; return this; }

}
