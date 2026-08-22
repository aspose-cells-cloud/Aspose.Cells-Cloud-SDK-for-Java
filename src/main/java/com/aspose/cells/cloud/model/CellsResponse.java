package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CellsResponse — Represents the Cells Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CellsResponse extends CellsCloudResponse {
    /** Property Summary: The class has a property called "Cells" which is annotated with the [XmlElement("cells")] attribute. */
    @JsonProperty("Cells")
    private Cells cells;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public Cells getCells() { return cells; }
    public CellsResponse setCells(Cells cells) { this.cells = cells; return this; }

    public Integer getCode() { return code; }
    public CellsResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public CellsResponse setStatus(String status) { this.status = status; return this; }

}
