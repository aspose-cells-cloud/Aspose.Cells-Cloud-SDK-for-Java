package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** StorageExist — Storage exists */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StorageExist {
    /** Shows that the storage exists. */
    @JsonProperty("Exists")
    private Boolean exists;

    public Boolean getExists() { return exists; }
    public StorageExist setExists(Boolean exists) { this.exists = exists; return this; }

}
