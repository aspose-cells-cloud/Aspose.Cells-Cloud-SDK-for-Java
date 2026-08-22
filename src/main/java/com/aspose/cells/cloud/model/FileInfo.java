package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FileInfo — Represents file information. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileInfo {
    /** Represents filename. */
    @JsonProperty("Filename")
    private String filename;

    /** Represents file size. */
    @JsonProperty("FileSize")
    private Long fileSize;

    /** Represents file content,  byte to base64 string. */
    @JsonProperty("FileContent")
    private String fileContent;

    public String getFilename() { return filename; }
    public FileInfo setFilename(String filename) { this.filename = filename; return this; }

    public Long getFileSize() { return fileSize; }
    public FileInfo setFileSize(Long fileSize) { this.fileSize = fileSize; return this; }

    public String getFileContent() { return fileContent; }
    public FileInfo setFileContent(String fileContent) { this.fileContent = fileContent; return this; }

}
