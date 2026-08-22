package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** GoogleDriveStorageFile model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GoogleDriveStorageFile extends StorageFile {
    /** Gets or sets MimeType. */
    @JsonProperty("MimeType")
    private String mimeType;

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

    public String getMimeType() { return mimeType; }
    public GoogleDriveStorageFile setMimeType(String mimeType) { this.mimeType = mimeType; return this; }

    public String getName() { return name; }
    public GoogleDriveStorageFile setName(String name) { this.name = name; return this; }

    public Boolean getIsFolder() { return isFolder; }
    public GoogleDriveStorageFile setIsFolder(Boolean isFolder) { this.isFolder = isFolder; return this; }

    public OffsetDateTime getModifiedDate() { return modifiedDate; }
    public GoogleDriveStorageFile setModifiedDate(OffsetDateTime modifiedDate) { this.modifiedDate = modifiedDate; return this; }

    public Long getSize() { return size; }
    public GoogleDriveStorageFile setSize(Long size) { this.size = size; return this; }

    public String getPath() { return path; }
    public GoogleDriveStorageFile setPath(String path) { this.path = path; return this; }

}
