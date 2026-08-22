package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** WorkbooksResponse — Represents the Workbooks Response. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WorkbooksResponse extends CellsCloudResponse {
    /** Property Summary: Contains a list of "Workbook" elements under the "Workbooks" array in XML format. */
    @JsonProperty("Workbooks")
    private List<LinkElement> workbooks;

    /** Gets or sets Code. */
    @JsonProperty("Code")
    private Integer code;

    /** Gets or sets Status. */
    @JsonProperty("Status")
    private String status;

    public List<LinkElement> getWorkbooks() { return workbooks; }
    public WorkbooksResponse setWorkbooks(List<LinkElement> workbooks) { this.workbooks = workbooks; return this; }

    public Integer getCode() { return code; }
    public WorkbooksResponse setCode(Integer code) { this.code = code; return this; }

    public String getStatus() { return status; }
    public WorkbooksResponse setStatus(String status) { this.status = status; return this; }

}
