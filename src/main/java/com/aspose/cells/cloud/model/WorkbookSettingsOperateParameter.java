package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorkbookSettingsOperateParameter — Represents workbook setting operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbookSettingsOperateParameter extends OperateParameter {
    /** Represents workbook setting. */
    @JsonProperty("WorkbookSettings")
    private WorkbookSettings workbookSettings;

    /** Gets or sets OperateType. */
    @JsonProperty("OperateType")
    private String operateType;

    public WorkbookSettings getWorkbookSettings() { return workbookSettings; }
    public WorkbookSettingsOperateParameter setWorkbookSettings(WorkbookSettings workbookSettings) { this.workbookSettings = workbookSettings; return this; }

    public String getOperateType() { return operateType; }
    public WorkbookSettingsOperateParameter setOperateType(String operateType) { this.operateType = operateType; return this; }

}
