package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** FileVersion model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileVersion extends StorageFile {
    /** Gets or sets VersionId. */
    @JsonProperty("VersionId")
    private String versionId;

    /** Gets or sets IsLatest. */
    @JsonProperty("IsLatest")
    private Boolean isLatest;

    /** Gets or sets Name. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets IsFolder. */
    @JsonProperty("IsFolder")
    private Boolean isFolder;

    /** Gets or sets ModifiedDate. */
    @JsonProperty("ModifiedDate")
    private OffsetDateTime modifiedDate;

    /** Gets or sets Size. */
    @JsonProperty("Size")
    private Long size;

    /** Gets or sets Path. */
    @JsonProperty("Path")
    private String path;

    public String getVersionId() { return versionId; }
    public FileVersion setVersionId(String versionId) { this.versionId = versionId; return this; }

    public Boolean getIsLatest() { return isLatest; }
    public FileVersion setIsLatest(Boolean isLatest) { this.isLatest = isLatest; return this; }

    public String getName() { return name; }
    public FileVersion setName(String name) { this.name = name; return this; }

    public Boolean getIsFolder() { return isFolder; }
    public FileVersion setIsFolder(Boolean isFolder) { this.isFolder = isFolder; return this; }

    public OffsetDateTime getModifiedDate() { return modifiedDate; }
    public FileVersion setModifiedDate(OffsetDateTime modifiedDate) { this.modifiedDate = modifiedDate; return this; }

    public Long getSize() { return size; }
    public FileVersion setSize(Long size) { this.size = size; return this; }

    public String getPath() { return path; }
    public FileVersion setPath(String path) { this.path = path; return this; }

}
