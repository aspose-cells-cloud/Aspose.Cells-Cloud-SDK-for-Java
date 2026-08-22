package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SaveResultTaskParameter — Represents save result task parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SaveResultTaskParameter extends TaskParameter {
    /** Represents result data source. */
    @JsonProperty("ResultSource")
    private String resultSource;

    /** Represents result destination data. */
    @JsonProperty("ResultDestination")
    private ResultDestination resultDestination;

    public String getResultSource() { return resultSource; }
    public SaveResultTaskParameter setResultSource(String resultSource) { this.resultSource = resultSource; return this; }

    public ResultDestination getResultDestination() { return resultDestination; }
    public SaveResultTaskParameter setResultDestination(ResultDestination resultDestination) { this.resultDestination = resultDestination; return this; }

}
