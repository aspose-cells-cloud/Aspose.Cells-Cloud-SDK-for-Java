package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** CheckFormulaErrorOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CheckFormulaErrorOptions {
    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Gets or sets FileInfo. */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Gets or sets SheetName. */
    @JsonProperty("SheetName")
    private String sheetName;

    /** Gets or sets ChartIndex. */
    @JsonProperty("ChartIndex")
    private Integer chartIndex;

    /** Gets or sets Names. */
    @JsonProperty("Names")
    private List<String> names;

    public DataSource getDataSource() { return dataSource; }
    public CheckFormulaErrorOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public CheckFormulaErrorOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getSheetName() { return sheetName; }
    public CheckFormulaErrorOptions setSheetName(String sheetName) { this.sheetName = sheetName; return this; }

    public Integer getChartIndex() { return chartIndex; }
    public CheckFormulaErrorOptions setChartIndex(Integer chartIndex) { this.chartIndex = chartIndex; return this; }

    public List<String> getNames() { return names; }
    public CheckFormulaErrorOptions setNames(List<String> names) { this.names = names; return this; }

}
