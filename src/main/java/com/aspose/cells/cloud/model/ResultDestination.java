package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ResultDestination — Represents result destination. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultDestination {
    /** Represents destination data type. */
    @JsonProperty("DestinationType")
    private String destinationType;

    /** Represents input file. */
    @JsonProperty("InputFile")
    private String inputFile;

    /** Represents output file. */
    @JsonProperty("OutputFile")
    private String outputFile;

    public String getDestinationType() { return destinationType; }
    public ResultDestination setDestinationType(String destinationType) { this.destinationType = destinationType; return this; }

    public String getInputFile() { return inputFile; }
    public ResultDestination setInputFile(String inputFile) { this.inputFile = inputFile; return this; }

    public String getOutputFile() { return outputFile; }
    public ResultDestination setOutputFile(String outputFile) { this.outputFile = outputFile; return this; }

}
