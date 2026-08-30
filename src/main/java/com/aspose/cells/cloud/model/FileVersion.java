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

    public String getVersionId() { return versionId; }
    public FileVersion setVersionId(String versionId) { this.versionId = versionId; return this; }

    public Boolean getIsLatest() { return isLatest; }
    public FileVersion setIsLatest(Boolean isLatest) { this.isLatest = isLatest; return this; }


    /** Covariant override: keeps fluent chains returning FileVersion. */
    @Override public FileVersion setName(String name) { return (FileVersion) super.setName(name); }
    /** Covariant override: keeps fluent chains returning FileVersion. */
    @Override public FileVersion setIsFolder(Boolean isFolder) { return (FileVersion) super.setIsFolder(isFolder); }
    /** Covariant override: keeps fluent chains returning FileVersion. */
    @Override public FileVersion setModifiedDate(OffsetDateTime modifiedDate) { return (FileVersion) super.setModifiedDate(modifiedDate); }
    /** Covariant override: keeps fluent chains returning FileVersion. */
    @Override public FileVersion setSize(Long size) { return (FileVersion) super.setSize(size); }
    /** Covariant override: keeps fluent chains returning FileVersion. */
    @Override public FileVersion setPath(String path) { return (FileVersion) super.setPath(path); }

}
