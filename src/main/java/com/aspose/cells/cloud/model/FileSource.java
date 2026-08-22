package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FileSource — I'm sorry, I just realized you didn't provide any features for me to summarize. Please provide the features you'd like me to summarize for the class. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileSource {
    /** A property named FileSourceType of type FileSourceType that can be accessed and modified. */
    @JsonProperty("FileSourceType")
    private String fileSourceType;

    /** Gets or sets FilePath. */
    @JsonProperty("FilePath")
    private String filePath;

    public String getFileSourceType() { return fileSourceType; }
    public FileSource setFileSourceType(String fileSourceType) { this.fileSourceType = fileSourceType; return this; }

    public String getFilePath() { return filePath; }
    public FileSource setFilePath(String filePath) { this.filePath = filePath; return this; }

}
