package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WorksheetMovingRequest — Used by workbook moving requests. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorksheetMovingRequest {
    /** Destination worksheet name. */
    @JsonProperty("DestinationWorksheet")
    private String destinationWorksheet;

    /** Position to move. Can be BEFORE or AFTER. */
    @JsonProperty("Position")
    private String position;

    public String getDestinationWorksheet() { return destinationWorksheet; }
    public WorksheetMovingRequest setDestinationWorksheet(String destinationWorksheet) { this.destinationWorksheet = destinationWorksheet; return this; }

    public String getPosition() { return position; }
    public WorksheetMovingRequest setPosition(String position) { this.position = position; return this; }

}
