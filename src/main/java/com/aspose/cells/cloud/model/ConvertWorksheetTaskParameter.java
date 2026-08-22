package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConvertWorksheetTaskParameter — Represents convert worksheet task parameter. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConvertWorksheetTaskParameter extends TaskParameter {
    /** Represents data source of task object. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Represents data source of task object. */
    @JsonProperty("Workbook")
    private FileSource workbook;

    /** Represents worksheet. */
    @JsonProperty("Sheet")
    private String sheet;

    /** Represents destination data source. */
    @JsonProperty("TargetDataSource")
    private DataSource targetDataSource;

    /** Represents destination data source. */
    @JsonProperty("Target")
    private FileSource target;

    /** Represents destination data format. */
    @JsonProperty("Format")
    private String format;

    /** Represents converted data area. */
    @JsonProperty("Area")
    private String area;

    /** Represents converted page index. */
    @JsonProperty("PageIndex")
    private Integer pageIndex;

    /** Represents vertical resolution. */
    @JsonProperty("VerticalResolution")
    private Integer verticalResolution;

    /** Represents horizontal resolution. */
    @JsonProperty("HorizontalResolution")
    private Integer horizontalResolution;

    public DataSource getDataSource() { return dataSource; }
    public ConvertWorksheetTaskParameter setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileSource getWorkbook() { return workbook; }
    public ConvertWorksheetTaskParameter setWorkbook(FileSource workbook) { this.workbook = workbook; return this; }

    public String getSheet() { return sheet; }
    public ConvertWorksheetTaskParameter setSheet(String sheet) { this.sheet = sheet; return this; }

    public DataSource getTargetDataSource() { return targetDataSource; }
    public ConvertWorksheetTaskParameter setTargetDataSource(DataSource targetDataSource) { this.targetDataSource = targetDataSource; return this; }

    public FileSource getTarget() { return target; }
    public ConvertWorksheetTaskParameter setTarget(FileSource target) { this.target = target; return this; }

    public String getFormat() { return format; }
    public ConvertWorksheetTaskParameter setFormat(String format) { this.format = format; return this; }

    public String getArea() { return area; }
    public ConvertWorksheetTaskParameter setArea(String area) { this.area = area; return this; }

    public Integer getPageIndex() { return pageIndex; }
    public ConvertWorksheetTaskParameter setPageIndex(Integer pageIndex) { this.pageIndex = pageIndex; return this; }

    public Integer getVerticalResolution() { return verticalResolution; }
    public ConvertWorksheetTaskParameter setVerticalResolution(Integer verticalResolution) { this.verticalResolution = verticalResolution; return this; }

    public Integer getHorizontalResolution() { return horizontalResolution; }
    public ConvertWorksheetTaskParameter setHorizontalResolution(Integer horizontalResolution) { this.horizontalResolution = horizontalResolution; return this; }

}
