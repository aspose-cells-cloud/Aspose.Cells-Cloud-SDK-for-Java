package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PasteOptions — Represents the paste special options. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PasteOptions {
    /** True means only copying visible cells. */
    @JsonProperty("OnlyVisibleCells")
    private Boolean onlyVisibleCells;

    /** The paste special type. */
    @JsonProperty("PasteType")
    private String pasteType;

    /** Indicates whether skips blank cells. */
    @JsonProperty("SkipBlanks")
    private Boolean skipBlanks;

    /** True to transpose rows and columns when the range is pasted. The default value is False. */
    @JsonProperty("Transpose")
    private Boolean transpose;

    public Boolean getOnlyVisibleCells() { return onlyVisibleCells; }
    public PasteOptions setOnlyVisibleCells(Boolean onlyVisibleCells) { this.onlyVisibleCells = onlyVisibleCells; return this; }

    public String getPasteType() { return pasteType; }
    public PasteOptions setPasteType(String pasteType) { this.pasteType = pasteType; return this; }

    public Boolean getSkipBlanks() { return skipBlanks; }
    public PasteOptions setSkipBlanks(Boolean skipBlanks) { this.skipBlanks = skipBlanks; return this; }

    public Boolean getTranspose() { return transpose; }
    public PasteOptions setTranspose(Boolean transpose) { this.transpose = transpose; return this; }

}
