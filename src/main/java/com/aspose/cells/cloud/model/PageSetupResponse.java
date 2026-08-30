package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PageSetupResponse — Represents the PageSetup Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageSetupResponse extends CellsCloudResponse {
    /** Property Summary: The class has a public property named PageSetup of type PageSetup that can be accessed and modified. */
    @JsonProperty("PageSetup")
    private PageSetup pageSetup;

    public PageSetup getPageSetup() { return pageSetup; }
    public PageSetupResponse setPageSetup(PageSetup pageSetup) { this.pageSetup = pageSetup; return this; }


    /** Covariant override: keeps fluent chains returning PageSetupResponse. */
    @Override public PageSetupResponse setCode(Integer code) { return (PageSetupResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning PageSetupResponse. */
    @Override public PageSetupResponse setStatus(String status) { return (PageSetupResponse) super.setStatus(status); }

}
