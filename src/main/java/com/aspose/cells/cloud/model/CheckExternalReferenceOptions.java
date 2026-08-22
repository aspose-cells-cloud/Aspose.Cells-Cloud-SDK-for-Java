package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** CheckExternalReferenceOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckExternalReferenceOptions {
    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Gets or sets FileInfo. */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Gets or sets Worksheet. */
    @JsonProperty("Worksheet")
    private String worksheet;

    /** Gets or sets Ranged_Table. */
    @JsonProperty("Ranged_Table")
    private String ranged_Table;

    /** Gets or sets ChartIndex. */
    @JsonProperty("ChartIndex")
    private Integer chartIndex;

    public DataSource getDataSource() { return dataSource; }
    public CheckExternalReferenceOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public CheckExternalReferenceOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getWorksheet() { return worksheet; }
    public CheckExternalReferenceOptions setWorksheet(String worksheet) { this.worksheet = worksheet; return this; }

    public String getRanged_Table() { return ranged_Table; }
    public CheckExternalReferenceOptions setRanged_Table(String ranged_Table) { this.ranged_Table = ranged_Table; return this; }

    public Integer getChartIndex() { return chartIndex; }
    public CheckExternalReferenceOptions setChartIndex(Integer chartIndex) { this.chartIndex = chartIndex; return this; }

}
