package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** LoadTo — A description of the location to which the data is mounted. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoadTo {
    /** The worksheet name. */
    @JsonProperty("Worksheet")
    private String worksheet;

    /** The begin row index of worksheet. */
    @JsonProperty("beginRowIndex")
    private Integer beginRowIndex;

    /** The begin column index of worksheet. */
    @JsonProperty("beginColumnIndex")
    private Integer beginColumnIndex;

    public String getWorksheet() { return worksheet; }
    public LoadTo setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

    public Integer getBeginRowIndex() { return beginRowIndex; }
    public LoadTo setBeginRowIndex(Integer beginRowIndex) { this.beginRowIndex = beginRowIndex; return this; }

    public Integer getBeginColumnIndex() { return beginColumnIndex; }
    public LoadTo setBeginColumnIndex(Integer beginColumnIndex) { this.beginColumnIndex = beginColumnIndex; return this; }

}
