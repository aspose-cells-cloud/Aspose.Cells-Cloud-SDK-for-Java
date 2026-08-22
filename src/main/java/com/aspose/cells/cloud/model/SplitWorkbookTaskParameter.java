package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SplitWorkbookTaskParameter — Represents split workbook task parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SplitWorkbookTaskParameter extends TaskParameter {
    /** Represents data source of task object. */
    @JsonProperty("Workbook")
    private FileSource workbook;

    /** Represents data source of task object. */
    @JsonProperty("DestinationFilePosition")
    private FileSource destinationFilePosition;

    /** Represents destination data source. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents destination data source. */
    @JsonProperty("TargetDataSource")
    private DataSource targetDataSource;

    /** Represents destination data file format. */
    @JsonProperty("DestinationFileFormat")
    private String destinationFileFormat;

    /** SheetName /NewGuid */
    @JsonProperty("SplitNameRule")
    private String splitNameRule;

    /** When destination file format is image , vertical resolution can not be null. */
    @JsonProperty("VerticalResolution")
    private Integer verticalResolution;

    /** When destination file format is image , horizontal resolution can not be null. */
    @JsonProperty("HorizontalResolution")
    private Integer horizontalResolution;

    public FileSource getWorkbook() { return workbook; }
    public SplitWorkbookTaskParameter setWorkbook(FileSource workbook) { this.workbook = workbook; return this; }

    public FileSource getDestinationFilePosition() { return destinationFilePosition; }
    public SplitWorkbookTaskParameter setDestinationFilePosition(FileSource destinationFilePosition) { this.destinationFilePosition = destinationFilePosition; return this; }

    public DataSource getDataSource() { return dataSource; }
    public SplitWorkbookTaskParameter setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public DataSource getTargetDataSource() { return targetDataSource; }
    public SplitWorkbookTaskParameter setTargetDataSource(DataSource targetDataSource) { this.targetDataSource = targetDataSource; return this; }

    public String getDestinationFileFormat() { return destinationFileFormat; }
    public SplitWorkbookTaskParameter setDestinationFileFormat(String destinationFileFormat) { this.destinationFileFormat = destinationFileFormat; return this; }

    public String getSplitNameRule() { return splitNameRule; }
    public SplitWorkbookTaskParameter setSplitNameRule(String splitNameRule) { this.splitNameRule = splitNameRule; return this; }

    public Integer getVerticalResolution() { return verticalResolution; }
    public SplitWorkbookTaskParameter setVerticalResolution(Integer verticalResolution) { this.verticalResolution = verticalResolution; return this; }

    public Integer getHorizontalResolution() { return horizontalResolution; }
    public SplitWorkbookTaskParameter setHorizontalResolution(Integer horizontalResolution) { this.horizontalResolution = horizontalResolution; return this; }

}
