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

    public List<Cell> getCellsList() { return cellsList; }
    public RangeValueResponse setCellsList(List<Cell> cellsList) { this.cellsList = cellsList; return this; }


    /** Covariant override: keeps fluent chains returning RangeValueResponse. */
    @Override public RangeValueResponse setCode(Integer code) { return (RangeValueResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning RangeValueResponse. */
    @Override public RangeValueResponse setStatus(String status) { return (RangeValueResponse) super.setStatus(status); }

}
