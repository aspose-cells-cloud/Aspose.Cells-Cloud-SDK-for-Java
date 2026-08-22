package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ConvertWorkbookOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConvertWorkbookOptions extends BaseOperateOptions {
    /** The class has a public property named "Name" with a getter and setter method. */
    @JsonProperty("Name")
    private String name;

    /** Gets or sets DataSource. */
    @JsonProperty("DataSource")
    private DataSource dataSource;

    /** Gets or sets FileInfo. */
    @JsonProperty("FileInfo")
    private FileInfo fileInfo;

    /** Gets or sets PageSetup. */
    @JsonProperty("PageSetup")
    private PageSetup pageSetup;

    /** Gets or sets SaveOptions. */
    @JsonProperty("SaveOptions")
    private SaveOptions saveOptions;

    /** Gets or sets ConvertFormat. */
    @JsonProperty("ConvertFormat")
    private String convertFormat;

    /** Gets or sets CheckExcelRestriction. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    public String getName() { return name; }
    public ConvertWorkbookOptions setName(String name) { this.name = name; return this; }

    public DataSource getDataSource() { return dataSource; }
    public ConvertWorkbookOptions setDataSource(DataSource dataSource) { this.dataSource = dataSource; return this; }

    public FileInfo getFileInfo() { return fileInfo; }
    public ConvertWorkbookOptions setFileInfo(FileInfo fileInfo) { this.fileInfo = fileInfo; return this; }

    public PageSetup getPageSetup() { return pageSetup; }
    public ConvertWorkbookOptions setPageSetup(PageSetup pageSetup) { this.pageSetup = pageSetup; return this; }

    public SaveOptions getSaveOptions() { return saveOptions; }
    public ConvertWorkbookOptions setSaveOptions(SaveOptions saveOptions) { this.saveOptions = saveOptions; return this; }

    public String getConvertFormat() { return convertFormat; }
    public ConvertWorkbookOptions setConvertFormat(String convertFormat) { this.convertFormat = convertFormat; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public ConvertWorkbookOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

}
