package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** WallsResponse — Represents the Walls Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WallsResponse extends CellsCloudResponse {
    /** The class has a public property named `Walls` of type `Walls`. */
    @JsonProperty("Walls")
    private Walls walls;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Walls getWalls() { return walls; }
    public WallsResponse setWalls(Walls walls) { this.walls = walls; return this; }

    public Integer getCode() { return code; }
    public WallsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public WallsResponse setStatus(String status) { this.status = status; return this; }

}
