package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** StorageFile — File or folder information */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorageFile {
    /** File or folder name. */
    @JsonProperty("Name")
    private String name;

    /** True if it is a folder. */
    @JsonProperty("IsFolder")
    private Boolean isFolder;

    /** File or folder last modified DateTime. */
    @JsonProperty("ModifiedDate")
    private OffsetDateTime modifiedDate;

    /** File or folder size. */
    @JsonProperty("Size")
    private Long size;

    /** File or folder path. */
    @JsonProperty("Path")
    private String path;

    public String getName() { return name; }
    public StorageFile setName(String name) { this.name = name; return this; }

    public Boolean getIsFolder() { return isFolder; }
    public StorageFile setIsFolder(Boolean isFolder) { this.isFolder = isFolder; return this; }

    public OffsetDateTime getModifiedDate() { return modifiedDate; }
    public StorageFile setModifiedDate(OffsetDateTime modifiedDate) { this.modifiedDate = modifiedDate; return this; }

    public Long getSize() { return size; }
    public StorageFile setSize(Long size) { this.size = size; return this; }

    public String getPath() { return path; }
    public StorageFile setPath(String path) { this.path = path; return this; }

}
