package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ImportXMLRequest — Indicates import xml data request */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImportXMLRequest {
    /** XML file source */
    @JsonProperty("XMLFileSource")
    private DataSource xMLFileSource;

    /** Import position description. */
    @JsonProperty("ImportPosition")
    private ImportPosition importPosition;

    /** Base64String default is null */
    @JsonProperty("XMLContent")
    private String xMLContent;

    public DataSource getXMLFileSource() { return xMLFileSource; }
    public ImportXMLRequest setXMLFileSource(DataSource xMLFileSource) { this.xMLFileSource = xMLFileSource; return this; }

    public ImportPosition getImportPosition() { return importPosition; }
    public ImportXMLRequest setImportPosition(ImportPosition importPosition) { this.importPosition = importPosition; return this; }

    public String getXMLContent() { return xMLContent; }
    public ImportXMLRequest setXMLContent(String xMLContent) { this.xMLContent = xMLContent; return this; }

}
