package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorksheetOperateParameter — Represents worksheet operate parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorksheetOperateParameter extends OperateParameter {
    /** Represents worksheet name. */
    @JsonProperty("Name")
    private String name;

    /** Represents worksheet type. */
    @JsonProperty("SheetType")
    private String sheetType;

    /** rename worksheet name */
    @JsonProperty("NewName")
    private String newName;

    /** Represents move position. */
    @JsonProperty("MovingRequest")
    private WorksheetMovingRequest movingRequest;

    public String getName() { return name; }
    public WorksheetOperateParameter setName(String name) { this.name = name; return this; }

    public String getSheetType() { return sheetType; }
    public WorksheetOperateParameter setSheetType(String sheetType) { this.sheetType = sheetType; return this; }

    public String getNewName() { return newName; }
    public WorksheetOperateParameter setNewName(String newName) { this.newName = newName; return this; }

    public WorksheetMovingRequest getMovingRequest() { return movingRequest; }
    public WorksheetOperateParameter setMovingRequest(WorksheetMovingRequest movingRequest) { this.movingRequest = movingRequest; return this; }


    /** Covariant override: keeps fluent chains returning WorksheetOperateParameter. */
    @Override public WorksheetOperateParameter setOperateType(String operateType) { return (WorksheetOperateParameter) super.setOperateType(operateType); }

}
