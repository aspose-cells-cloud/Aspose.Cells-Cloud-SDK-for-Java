package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsResponse — Represents the Cells Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsResponse extends CellsCloudResponse {
    /** Property Summary: The class has a property called "Cells" which is annotated with the [XmlElement("cells")] attribute. */
    @JsonProperty("Cells")
    private Cells cells;

    public Cells getCells() { return cells; }
    public CellsResponse setCells(Cells cells) { this.cells = cells; return this; }


    /** Covariant override: keeps fluent chains returning CellsResponse. */
    @Override public CellsResponse setCode(Integer code) { return (CellsResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning CellsResponse. */
    @Override public CellsResponse setStatus(String status) { return (CellsResponse) super.setStatus(status); }

}
