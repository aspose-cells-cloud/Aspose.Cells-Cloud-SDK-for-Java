package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ObjectExist — Object exists */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ObjectExist {
    /** Indicates that the file or folder exists. */
    @JsonProperty("Exists")
    private Boolean exists;

    /** True if it is a folder, false if it is a file. */
    @JsonProperty("IsFolder")
    private Boolean isFolder;

    public Boolean getExists() { return exists; }
    public ObjectExist setExists(Boolean exists) { this.exists = exists; return this; }

    public Boolean getIsFolder() { return isFolder; }
    public ObjectExist setIsFolder(Boolean isFolder) { this.isFolder = isFolder; return this; }

}
