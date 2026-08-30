package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookSettingsResponse — Represents the WorkbookSettings Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookSettingsResponse extends CellsCloudResponse {
    /** The class has a public property called "settings" of type WorkbookSettings that can be accessed and modified. */
    @JsonProperty("settings")
    private WorkbookSettings settings;

    public WorkbookSettings getSettings() { return settings; }
    public WorkbookSettingsResponse setSettings(WorkbookSettings settings) { this.settings = settings; return this; }


    /** Covariant override: keeps fluent chains returning WorkbookSettingsResponse. */
    @Override public WorkbookSettingsResponse setCode(Integer code) { return (WorkbookSettingsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning WorkbookSettingsResponse. */
    @Override public WorkbookSettingsResponse setStatus(String status) { return (WorkbookSettingsResponse) super.setStatus(status); }

}
