package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookSettingsResponse — Represents the WorkbookSettings Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookSettingsResponse extends CellsCloudResponse {
    /** The class has a public property called "settings" of type WorkbookSettings that can be accessed and modified. */
    @JsonProperty("settings")
    private WorkbookSettings settings;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public WorkbookSettings getSettings() { return settings; }
    public WorkbookSettingsResponse setSettings(WorkbookSettings settings) { this.settings = settings; return this; }

    public Integer getCode() { return code; }
    public WorkbookSettingsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public WorkbookSettingsResponse setStatus(String status) { this.status = status; return this; }

}
