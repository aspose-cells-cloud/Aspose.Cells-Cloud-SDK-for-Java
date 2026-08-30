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

    public List<LinkElement> getWorkbooks() { return workbooks; }
    public WorkbooksResponse setWorkbooks(List<LinkElement> workbooks) { this.workbooks = workbooks; return this; }


    /** Covariant override: keeps fluent chains returning WorkbooksResponse. */
    @Override public WorkbooksResponse setCode(Integer code) { return (WorkbooksResponse) super.setCode(code); }
    /** Covariant override: keeps fluent chains returning WorkbooksResponse. */
    @Override public WorkbooksResponse setStatus(String status) { return (WorkbooksResponse) super.setStatus(status); }

}
