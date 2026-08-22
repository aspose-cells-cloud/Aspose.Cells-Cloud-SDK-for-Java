package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** FilesUploadResult — File upload result */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FilesUploadResult {
    /** List of uploaded file names */
    @JsonProperty("Uploaded")
    private List<String> uploaded;

    /** List of errors. */
    @JsonProperty("Errors")
    private List<Error> errors;

    public List<String> getUploaded() { return uploaded; }
    public FilesUploadResult setUploaded(List<String> uploaded) { this.uploaded = uploaded; return this; }

    public List<Error> getErrors() { return errors; }
    public FilesUploadResult setErrors(List<Error> errors) { this.errors = errors; return this; }

}
