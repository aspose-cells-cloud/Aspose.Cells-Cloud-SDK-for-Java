package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ScopeItem — Define the specific range in your Excel worksheet where you want the spreadsheet operations to be performed. This ensures that only the cells within the selected range are processed, and any operations are confined to this area. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScopeItem {
    /** The specific worksheet of spreadsheet. */
    @JsonProperty("Worksheet")
    private String worksheet;

    /** The specific ranges of worksheet. */
    @JsonProperty("Ranges")
    private List<String> ranges;

    public String getWorksheet() { return worksheet; }
    public ScopeItem setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

    public List<String> getRanges() { return ranges; }
    public ScopeItem setRanges(List<String> ranges) { this.ranges = ranges; return this; }

}
