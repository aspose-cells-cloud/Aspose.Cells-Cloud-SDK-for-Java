package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** TextItem model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TextItem {
    /** Gets or sets Filename. */
    @JsonProperty("Filename")
    private String filename;

    /** Gets or sets Worksheet. */
    @JsonProperty("Worksheet")
    private String worksheet;

    /** Gets or sets Position. */
    @JsonProperty("Position")
    private String position;

    /** Gets or sets Content. */
    @JsonProperty("Content")
    private String content;

    public String getFilename() { return filename; }
    public TextItem setFilename(String filename) { this.filename = filename; return this; }

    public String getWorksheet() { return worksheet; }
    public TextItem setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

    public String getPosition() { return position; }
    public TextItem setPosition(String position) { this.position = position; return this; }

    public String getContent() { return content; }
    public TextItem setContent(String content) { this.content = content; return this; }

}
