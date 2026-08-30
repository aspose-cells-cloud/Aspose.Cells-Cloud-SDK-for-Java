package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HyperlinksResponse — Represents the Hyperlinks Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HyperlinksResponse extends CellsCloudResponse {
    /** This class has a property named "Hyperlinks" of type Hyperlinks which can be accessed and modified. */
    @JsonProperty("Hyperlinks")
    private Hyperlinks hyperlinks;

    public Hyperlinks getHyperlinks() { return hyperlinks; }
    public HyperlinksResponse setHyperlinks(Hyperlinks hyperlinks) { this.hyperlinks = hyperlinks; return this; }


    /** Covariant override: keeps fluent chains returning HyperlinksResponse. */
    @Override public HyperlinksResponse setCode(Integer code) { return (HyperlinksResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning HyperlinksResponse. */
    @Override public HyperlinksResponse setStatus(String status) { return (HyperlinksResponse) super.setStatus(status); }

}
