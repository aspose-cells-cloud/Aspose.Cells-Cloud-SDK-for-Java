package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** AnalyzedResult — Represents results of analyzed data. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AnalyzedResult {
    /** Represents the file name of data file. */
    @JsonProperty("Filename")
    private String filename;

    /** Represents summary about results of analyzed data. */
    @JsonProperty("Description")
    private String description;

    /** Represents Excel data statistics. */
    @JsonProperty("BasicStatistics")
    private ExcelDataStatistics basicStatistics;

    /** Represents analyzed table description. */
    @JsonProperty("Results")
    private List<AnalyzedTableDescription> results;

    /** base64String Excel file */
    @JsonProperty("SuggestedFile")
    private String suggestedFile;

    public String getFilename() { return filename; }
    public AnalyzedResult setFilename(String filename) { this.filename = filename; return this; }

    public String getDescription() { return description; }
    public AnalyzedResult setDescription(String description) { this.description = description; return this; }

    public ExcelDataStatistics getBasicStatistics() { return basicStatistics; }
    public AnalyzedResult setBasicStatistics(ExcelDataStatistics basicStatistics) { this.basicStatistics = basicStatistics; return this; }

    public List<AnalyzedTableDescription> getResults() { return results; }
    public AnalyzedResult setResults(List<AnalyzedTableDescription> results) { this.results = results; return this; }

    public String getSuggestedFile() { return suggestedFile; }
    public AnalyzedResult setSuggestedFile(String suggestedFile) { this.suggestedFile = suggestedFile; return this; }

}
