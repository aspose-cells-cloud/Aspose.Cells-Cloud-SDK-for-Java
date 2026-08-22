package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HyperlinkResponse — Represents the Hyperlink Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HyperlinkResponse extends CellsCloudResponse {
    /** A public property named "Hyperlink" of type Hyperlink with both getter and setter methods. */
    @JsonProperty("Hyperlink")
    private Hyperlink hyperlink;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Hyperlink getHyperlink() { return hyperlink; }
    public HyperlinkResponse setHyperlink(Hyperlink hyperlink) { this.hyperlink = hyperlink; return this; }

    public Integer getCode() { return code; }
    public HyperlinkResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public HyperlinkResponse setStatus(String status) { this.status = status; return this; }

}
