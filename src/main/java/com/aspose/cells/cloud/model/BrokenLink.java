package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** BrokenLink model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrokenLink {
    /** Gets or sets Filename. */
    @JsonProperty("Filename")
    private String filename;

    /** Gets or sets Worksheet. */
    @JsonProperty("Worksheet")
    private String worksheet;

    /** Gets or sets Position. */
    @JsonProperty("Position")
    private String position;

    /** Gets or sets LinkAddress. */
    @JsonProperty("LinkAddress")
    private String linkAddress;

    public String getFilename() { return filename; }
    public BrokenLink setFilename(String filename) { this.filename = filename; return this; }

    public String getWorksheet() { return worksheet; }
    public BrokenLink setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

    public String getPosition() { return position; }
    public BrokenLink setPosition(String position) { this.position = position; return this; }

    public String getLinkAddress() { return linkAddress; }
    public BrokenLink setLinkAddress(String linkAddress) { this.linkAddress = linkAddress; return this; }

}
