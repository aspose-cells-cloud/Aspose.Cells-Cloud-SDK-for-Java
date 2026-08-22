package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ExcelDataStatistics — Represents Excel data statistics. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ExcelDataStatistics {
    /** Represents worksheet data statistics list. */
    @JsonProperty("WorksheetDataStatistics")
    private List<WorksheetDataStatistics> worksheetDataStatistics;

    public List<WorksheetDataStatistics> getWorksheetDataStatistics() { return worksheetDataStatistics; }
    public ExcelDataStatistics setWorksheetDataStatistics(List<WorksheetDataStatistics> worksheetDataStatistics) { this.worksheetDataStatistics = worksheetDataStatistics; return this; }

}
