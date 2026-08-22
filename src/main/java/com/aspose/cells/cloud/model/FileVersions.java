package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** FileVersions — File versions FileVersion. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FileVersions {
    /** File versions FileVersion. */
    @JsonProperty("Value")
    private List<FileVersion> value;

    public List<FileVersion> getValue() { return value; }
    public FileVersions setValue(List<FileVersion> value) { this.value = value; return this; }

}
