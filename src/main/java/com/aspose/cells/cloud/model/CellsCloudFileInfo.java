package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsCloudFileInfo model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsCloudFileInfo {
    /** Gets or sets Name. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets Size. */
    @JsonProperty("Size")
    private Long size;

    /** Gets or sets Folder. */
    @JsonProperty("Folder")
    private String folder;

    /** Gets or sets Storage. */
    @JsonProperty("Storage")
    private String storage;

    public String getName() { return name; }
    public CellsCloudFileInfo setName(String name) { this.name = name; return this; }

    public Long getSize() { return size; }
    public CellsCloudFileInfo setSize(Long size) { this.size = size; return this; }

    public String getFolder() { return folder; }
    public CellsCloudFileInfo setFolder(String folder) { this.folder = folder; return this; }

    public String getStorage() { return storage; }
    public CellsCloudFileInfo setStorage(String storage) { this.storage = storage; return this; }

}
