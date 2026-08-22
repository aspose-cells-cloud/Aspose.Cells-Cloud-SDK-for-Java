package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SmartMarkerTaskParameter — Represents smart marker task parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SmartMarkerTaskParameter extends TaskParameter {
    /** Represents data source of task object. */
    @JsonProperty("SourceWorkbook")
    private FileSource sourceWorkbook;

    /** Represents data source of task object. */
    @JsonProperty("DestinationWorkbook")
    private FileSource destinationWorkbook;

    /** Represents xml file. */
    @JsonProperty("xmlFile")
    private FileSource xmlFile;

    /** Represents destination data source. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents destination data source. */
    @JsonProperty("TargetDataSource")
    private DataSource targetDataSource;

    /** Represents xml file. */
    @JsonProperty("XMLFileDataSource")
    private DataSource xMLFileDataSource;

    public FileSource getSourceWorkbook() { return sourceWorkbook; }
    public SmartMarkerTaskParameter setSourceWorkbook(FileSource sourceWorkbook) { this.sourceWorkbook = sourceWorkbook; return this; }

    public FileSource getDestinationWorkbook() { return destinationWorkbook; }
    public SmartMarkerTaskParameter setDestinationWorkbook(FileSource destinationWorkbook) { this.destinationWorkbook = destinationWorkbook; return this; }

    public FileSource getXmlFile() { return xmlFile; }
    public SmartMarkerTaskParameter setXmlFile(FileSource xmlFile) { this.xmlFile = xmlFile; return this; }

    public DataSource getDataSource() { return dataSource; }
    public SmartMarkerTaskParameter setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public DataSource getTargetDataSource() { return targetDataSource; }
    public SmartMarkerTaskParameter setTargetDataSource(DataSource targetDataSource) { this.targetDataSource = targetDataSource; return this; }

    public DataSource getXMLFileDataSource() { return xMLFileDataSource; }
    public SmartMarkerTaskParameter setXMLFileDataSource(DataSource xMLFileDataSource) { this.xMLFileDataSource = xMLFileDataSource; return this; }

}
