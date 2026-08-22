package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ImportJsonRequest — Indicates import xml data request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportJsonRequest {
    /** Json file source */
    @JsonProperty("JsonFileSource")
    private DataSource jsonFileSource;

    /** Import position description. */
    @JsonProperty("ImportPosition")
    private ImportPosition importPosition;

    /** Base64String default is null */
    @JsonProperty("JsonContent")
    private String jsonContent;

    public DataSource getJsonFileSource() { return jsonFileSource; }
    public ImportJsonRequest setJsonFileSource(DataSource jsonFileSource) { this.jsonFileSource = jsonFileSource; return this; }

    public ImportPosition getImportPosition() { return importPosition; }
    public ImportJsonRequest setImportPosition(ImportPosition importPosition) { this.importPosition = importPosition; return this; }

    public String getJsonContent() { return jsonContent; }
    public ImportJsonRequest setJsonContent(String jsonContent) { this.jsonContent = jsonContent; return this; }

}
