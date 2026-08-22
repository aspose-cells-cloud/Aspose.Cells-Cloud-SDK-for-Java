package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConvertWorksheetOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConvertWorksheetOptions extends BaseOperateOptions {
    /** The class has a public property named "Name" with a getter and setter method. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Gets or sets FileInfo. */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Gets or sets WorksheetName. */
    @JsonProperty("WorksheetName")
    private String worksheetName;

    /** Gets or sets PageSetup. */
    @JsonProperty("PageSetup")
    private PageSetup pageSetup;

    /** Gets or sets ImageOrPrintOptions. */
    @JsonProperty("ImageOrPrintOptions")
    private ImageOrPrintOptions imageOrPrintOptions;

    /** Gets or sets ConvertFormat. */
    @JsonProperty("ConvertFormat")
    private String convertFormat;

    /** Gets or sets CheckExcelRestriction. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    /** Gets or sets Region. */
    @JsonProperty("Region")
    private String region;

    public String getName() { return name; }
    public ConvertWorksheetOptions setName(String name) { this.name = name; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ConvertWorksheetOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public ConvertWorksheetOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public String getWorksheetName() { return worksheetName; }
    public ConvertWorksheetOptions setWorksheetName(String worksheetName) { this.worksheetName = worksheetName; return this; }

    public PageSetup getPageSetup() { return pageSetup; }
    public ConvertWorksheetOptions setPageSetup(PageSetup pageSetup) { this.pageSetup = pageSetup; return this; }

    public ImageOrPrintOptions getImageOrPrintOptions() { return imageOrPrintOptions; }
    public ConvertWorksheetOptions setImageOrPrintOptions(ImageOrPrintOptions imageOrPrintOptions) { this.imageOrPrintOptions = imageOrPrintOptions; return this; }

    public String getConvertFormat() { return convertFormat; }
    public ConvertWorksheetOptions setConvertFormat(String convertFormat) { this.convertFormat = convertFormat; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public ConvertWorksheetOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public String getRegion() { return region; }
    public ConvertWorksheetOptions setRegion(String region) { this.region = region; return this; }

}
