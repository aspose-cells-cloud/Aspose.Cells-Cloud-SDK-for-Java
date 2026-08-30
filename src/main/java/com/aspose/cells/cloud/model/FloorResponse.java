package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** FloorResponse — Represents the Floor Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class FloorResponse extends CellsCloudResponse {
    /** This class has a public property "Floor" of type "Floor" with both a getter and a setter. */
    @JsonProperty("Floor")
    private Floor floor;

    public Floor getFloor() { return floor; }
    public FloorResponse setFloor(Floor floor) { this.floor = floor; return this; }


    /** Covariant override: keeps fluent chains returning FloorResponse. */
    @Override public FloorResponse setCode(Integer code) { return (FloorResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning FloorResponse. */
    @Override public FloorResponse setStatus(String status) { return (FloorResponse) super.setStatus(status); }

}
