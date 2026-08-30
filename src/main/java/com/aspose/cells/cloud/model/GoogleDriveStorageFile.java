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

    public String getMimeType() { return mimeType; }
    public GoogleDriveStorageFile setMimeType(String mimeType) { this.mimeType = mimeType; return this; }


    /** Covariant override: keeps fluent chains returning GoogleDriveStorageFile. */
    @Override public GoogleDriveStorageFile setName(String name) { return (GoogleDriveStorageFile) super.setName(name); }
    /** Covariant override: keeps fluent chains returning GoogleDriveStorageFile. */
    @Override public GoogleDriveStorageFile setIsFolder(Boolean isFolder) { return (GoogleDriveStorageFile) super.setIsFolder(isFolder); }
    /** Covariant override: keeps fluent chains returning GoogleDriveStorageFile. */
    @Override public GoogleDriveStorageFile setModifiedDate(OffsetDateTime modifiedDate) { return (GoogleDriveStorageFile) super.setModifiedDate(modifiedDate); }
    /** Covariant override: keeps fluent chains returning GoogleDriveStorageFile. */
    @Override public GoogleDriveStorageFile setSize(Long size) { return (GoogleDriveStorageFile) super.setSize(size); }
    /** Covariant override: keeps fluent chains returning GoogleDriveStorageFile. */
    @Override public GoogleDriveStorageFile setPath(String path) { return (GoogleDriveStorageFile) super.setPath(path); }

}
