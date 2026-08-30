package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WallsResponse — Represents the Walls Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WallsResponse extends CellsCloudResponse {
    /** The class has a public property named `Walls` of type `Walls`. */
    @JsonProperty("Walls")
    private Walls walls;

    public Walls getWalls() { return walls; }
    public WallsResponse setWalls(Walls walls) { this.walls = walls; return this; }


    /** Covariant override: keeps fluent chains returning WallsResponse. */
    @Override public WallsResponse setCode(Integer code) { return (WallsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning WallsResponse. */
    @Override public WallsResponse setStatus(String status) { return (WallsResponse) super.setStatus(status); }

}
