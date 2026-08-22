package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PageSetupResponse — Represents the PageSetup Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageSetupResponse extends CellsCloudResponse {
    /** Property Summary: The class has a public property named PageSetup of type PageSetup that can be accessed and modified. */
    @JsonProperty("PageSetup")
    private PageSetup pageSetup;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public PageSetup getPageSetup() { return pageSetup; }
    public PageSetupResponse setPageSetup(PageSetup pageSetup) { this.pageSetup = pageSetup; return this; }

    public Integer getCode() { return code; }
    public PageSetupResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public PageSetupResponse setStatus(String status) { this.status = status; return this; }

}
