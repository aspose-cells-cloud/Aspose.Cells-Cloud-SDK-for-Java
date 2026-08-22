package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SaveOptionsData model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaveOptionsData {
    /** Gets or sets SaveOptions. */
    @JsonProperty("SaveOptions")
    private SaveOptions saveOptions;

    /** Gets or sets Filename. */
    @JsonProperty("Filename")
    private String filename;

    /** Gets or sets StorageName. */
    @JsonProperty("StorageName")
    private String storageName;

    public SaveOptions getSaveOptions() { return saveOptions; }
    public SaveOptionsData setSaveOptions(SaveOptions saveOptions) { this.saveOptions = saveOptions; return this; }

    public String getFilename() { return filename; }
    public SaveOptionsData setFilename(String filename) { this.filename = filename; return this; }

    public String getStorageName() { return storageName; }
    public SaveOptionsData setStorageName(String storageName) { this.storageName = storageName; return this; }

}
