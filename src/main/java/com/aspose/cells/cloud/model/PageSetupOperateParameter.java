package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PageSetupOperateParameter — Represents page setup operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PageSetupOperateParameter extends OperateParameter {
    /** Represents worksheet page setup. */
    @JsonProperty("PageSetup")
    private PageSetup pageSetup;

    /** Gets or sets OperateType. */
    @JsonProperty("OperateType")
    private String operateType;

    public PageSetup getPageSetup() { return pageSetup; }
    public PageSetupOperateParameter setPageSetup(PageSetup pageSetup) { this.pageSetup = pageSetup; return this; }

    public String getOperateType() { return operateType; }
    public PageSetupOperateParameter setOperateType(String operateType) { this.operateType = operateType; return this; }

}
