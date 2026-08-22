package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsObjectOperateTaskParameter — Represents cells object operate task parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsObjectOperateTaskParameter extends TaskParameter {
    /** Represents object operate. */
    @JsonProperty("OperateObject")
    private OperateObject operateObject;

    /** Represents operate parameter. */
    @JsonProperty("OperateParameter")
    private OperateParameter operateParameter;

    /** Represents destination data source. */
    @JsonProperty("DestinationDataSource")
    private DataSource destinationDataSource;

    /** Represents destination data source. */
    @JsonProperty("DestinationWorkbook")
    private FileSource destinationWorkbook;

    public OperateObject getOperateObject() { return operateObject; }
    public CellsObjectOperateTaskParameter setOperateObject(OperateObject operateObject) { this.operateObject = operateObject; return this; }

    public OperateParameter getOperateParameter() { return operateParameter; }
    public CellsObjectOperateTaskParameter setOperateParameter(OperateParameter operateParameter) { this.operateParameter = operateParameter; return this; }

    public DataSource getDestinationDataSource() { return destinationDataSource; }
    public CellsObjectOperateTaskParameter setDestinationDataSource(DataSource destinationDataSource) { this.destinationDataSource = destinationDataSource; return this; }

    public FileSource getDestinationWorkbook() { return destinationWorkbook; }
    public CellsObjectOperateTaskParameter setDestinationWorkbook(FileSource destinationWorkbook) { this.destinationWorkbook = destinationWorkbook; return this; }

}
