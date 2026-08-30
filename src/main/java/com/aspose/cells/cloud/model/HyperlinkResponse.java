package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HyperlinkResponse — Represents the Hyperlink Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HyperlinkResponse extends CellsCloudResponse {
    /** A public property named "Hyperlink" of type Hyperlink with both getter and setter methods. */
    @JsonProperty("Hyperlink")
    private Hyperlink hyperlink;

    public Hyperlink getHyperlink() { return hyperlink; }
    public HyperlinkResponse setHyperlink(Hyperlink hyperlink) { this.hyperlink = hyperlink; return this; }


    /** Covariant override: keeps fluent chains returning HyperlinkResponse. */
    @Override public HyperlinkResponse setCode(Integer code) { return (HyperlinkResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning HyperlinkResponse. */
    @Override public HyperlinkResponse setStatus(String status) { return (HyperlinkResponse) super.setStatus(status); }

}
