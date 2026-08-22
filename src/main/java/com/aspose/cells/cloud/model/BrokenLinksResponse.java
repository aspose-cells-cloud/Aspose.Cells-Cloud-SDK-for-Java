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

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public List<BrokenLink> getBrokenLinks() { return brokenLinks; }
    public BrokenLinksResponse setBrokenLinks(List<BrokenLink> brokenLinks) { this.brokenLinks = brokenLinks; return this; }

    public Integer getCode() { return code; }
    public BrokenLinksResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public BrokenLinksResponse setStatus(String status) { this.status = status; return this; }

}
