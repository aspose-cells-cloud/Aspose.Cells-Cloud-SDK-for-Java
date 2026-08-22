package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** RangeValueResponse — Represents the RangeValue Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RangeValueResponse extends CellsCloudResponse {
    /** Property Summary: Contains a list of elements labeled as "Cell". */
    @JsonProperty("CellsList")
    private List<Cell> cellsList;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public List<Cell> getCellsList() { return cellsList; }
    public RangeValueResponse setCellsList(List<Cell> cellsList) { this.cellsList = cellsList; return this; }

    public Integer getCode() { return code; }
    public RangeValueResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public RangeValueResponse setStatus(String status) { this.status = status; return this; }

}
