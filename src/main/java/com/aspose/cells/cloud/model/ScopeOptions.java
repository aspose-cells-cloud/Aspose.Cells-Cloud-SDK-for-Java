package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ScopeOptions — Specifies the range of cells within the worksheet where the spreadsheet operations will be performed. This parameter allows users to define the exact area to be processed, ensuring that operations are applied only to the designated cells. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScopeOptions {
    /** ScopeOptionsType is a type that represents options or settings that are specific to a particular scope. */
    @JsonProperty("Scope")
    private String scope;

    /** Specifies the designated work area within the worksheet where operations are to be performed. */
    @JsonProperty("ScopeItems")
    private List<ScopeItem> scopeItems;

    public String getScope() { return scope; }
    public ScopeOptions setScope(String scope) { this.scope = scope; return this; }

    public List<ScopeItem> getScopeItems() { return scopeItems; }
    public ScopeOptions setScopeItems(List<ScopeItem> scopeItems) { this.scopeItems = scopeItems; return this; }

}
