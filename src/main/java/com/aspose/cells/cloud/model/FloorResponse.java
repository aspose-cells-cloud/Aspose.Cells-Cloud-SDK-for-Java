package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FloorResponse — Represents the Floor Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorResponse extends CellsCloudResponse {
    /** This class has a public property "Floor" of type "Floor" with both a getter and a setter. */
    @JsonProperty("Floor")
    private Floor floor;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Floor getFloor() { return floor; }
    public FloorResponse setFloor(Floor floor) { this.floor = floor; return this; }

    public Integer getCode() { return code; }
    public FloorResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public FloorResponse setStatus(String status) { this.status = status; return this; }

}
