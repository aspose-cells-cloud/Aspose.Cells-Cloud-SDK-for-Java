package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** BrokenLinksResponse model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BrokenLinksResponse extends CellsCloudResponse {
    /** Gets or sets BrokenLinks. */
    @JsonProperty("BrokenLinks")
    private List<BrokenLink> brokenLinks;

    public List<BrokenLink> getBrokenLinks() { return brokenLinks; }
    public BrokenLinksResponse setBrokenLinks(List<BrokenLink> brokenLinks) { this.brokenLinks = brokenLinks; return this; }


    /** Covariant override: keeps fluent chains returning BrokenLinksResponse. */
    @Override public BrokenLinksResponse setCode(Integer code) { return (BrokenLinksResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning BrokenLinksResponse. */
    @Override public BrokenLinksResponse setStatus(String status) { return (BrokenLinksResponse) super.setStatus(status); }

}
