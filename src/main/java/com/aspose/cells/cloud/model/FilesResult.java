package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** FilesResult — Class features: Weekly lectures, group projects, midterm and final exams, and participation in class discussions. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilesResult {
    /** A property named **Files** of type **IList FileInfo ** containing a collection of file information objects. */
    @JsonProperty("Files")
    private List<FileInfo> files;

    public List<FileInfo> getFiles() { return files; }
    public FilesResult setFiles(List<FileInfo> files) { this.files = files; return this; }

}
