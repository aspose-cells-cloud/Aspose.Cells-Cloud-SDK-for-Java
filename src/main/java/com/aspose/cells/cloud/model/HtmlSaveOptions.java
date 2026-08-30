package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** HtmlSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class HtmlSaveOptions extends SaveOptions {
    /** Gets or sets ExportPageHeaders. */
    @JsonProperty("ExportPageHeaders")
    private Boolean exportPageHeaders;

    /** Gets or sets ExportPageFooters. */
    @JsonProperty("ExportPageFooters")
    private Boolean exportPageFooters;

    /** Gets or sets ExportRowColumnHeadings. */
    @JsonProperty("ExportRowColumnHeadings")
    private Boolean exportRowColumnHeadings;

    /** Gets or sets ShowAllSheets. */
    @JsonProperty("ShowAllSheets")
    private Boolean showAllSheets;

    /** Gets or sets ImageOptions. */
    @JsonProperty("ImageOptions")
    private ImageOrPrintOptions imageOptions;

    /** Gets or sets SaveAsSingleFile. */
    @JsonProperty("SaveAsSingleFile")
    private Boolean saveAsSingleFile;

    /** Gets or sets ExportHiddenWorksheet. */
    @JsonProperty("ExportHiddenWorksheet")
    private Boolean exportHiddenWorksheet;

    /** Gets or sets ExportGridLines. */
    @JsonProperty("ExportGridLines")
    private Boolean exportGridLines;

    /** Gets or sets PresentationPreference. */
    @JsonProperty("PresentationPreference")
    private Boolean presentationPreference;

    /** Gets or sets CellCssPrefix. */
    @JsonProperty("CellCssPrefix")
    private String cellCssPrefix;

    /** Gets or sets TableCssId. */
    @JsonProperty("TableCssId")
    private String tableCssId;

    /** Gets or sets IsFullPathLink. */
    @JsonProperty("IsFullPathLink")
    private Boolean isFullPathLink;

    /** Gets or sets ExportWorksheetCSSSeparately. */
    @JsonProperty("ExportWorksheetCSSSeparately")
    private Boolean exportWorksheetCSSSeparately;

    /** Gets or sets ExportSimilarBorderStyle. */
    @JsonProperty("ExportSimilarBorderStyle")
    private Boolean exportSimilarBorderStyle;

    /** Gets or sets MergeEmptyTdForcely. */
    @JsonProperty("MergeEmptyTdForcely")
    private Boolean mergeEmptyTdForcely;

    /** Gets or sets ExportCellCoordinate. */
    @JsonProperty("ExportCellCoordinate")
    private Boolean exportCellCoordinate;

    /** Gets or sets ExportExtraHeadings. */
    @JsonProperty("ExportExtraHeadings")
    private Boolean exportExtraHeadings;

    /** Gets or sets ExportHeadings. */
    @JsonProperty("ExportHeadings")
    private Boolean exportHeadings;

    /** Gets or sets ExportFormula. */
    @JsonProperty("ExportFormula")
    private Boolean exportFormula;

    /** Gets or sets AddTooltipText. */
    @JsonProperty("AddTooltipText")
    private Boolean addTooltipText;

    /** Gets or sets ExportBogusRowData. */
    @JsonProperty("ExportBogusRowData")
    private Boolean exportBogusRowData;

    /** Gets or sets ExcludeUnusedStyles. */
    @JsonProperty("ExcludeUnusedStyles")
    private Boolean excludeUnusedStyles;

    /** Gets or sets ExportDocumentProperties. */
    @JsonProperty("ExportDocumentProperties")
    private Boolean exportDocumentProperties;

    /** Gets or sets ExportWorksheetProperties. */
    @JsonProperty("ExportWorksheetProperties")
    private Boolean exportWorksheetProperties;

    /** Gets or sets ExportWorkbookProperties. */
    @JsonProperty("ExportWorkbookProperties")
    private Boolean exportWorkbookProperties;

    /** Gets or sets ExportFrameScriptsAndProperties. */
    @JsonProperty("ExportFrameScriptsAndProperties")
    private Boolean exportFrameScriptsAndProperties;

    /** Gets or sets AttachedFilesDirectory. */
    @JsonProperty("AttachedFilesDirectory")
    private String attachedFilesDirectory;

    /** Gets or sets AttachedFilesUrlPrefix. */
    @JsonProperty("AttachedFilesUrlPrefix")
    private String attachedFilesUrlPrefix;

    /** Gets or sets Encoding. */
    @JsonProperty("Encoding")
    private String encoding;

    /** Gets or sets ExportActiveWorksheetOnly. */
    @JsonProperty("ExportActiveWorksheetOnly")
    private Boolean exportActiveWorksheetOnly;

    /** Gets or sets ExportChartImageFormat. */
    @JsonProperty("ExportChartImageFormat")
    private String exportChartImageFormat;

    /** Gets or sets ExportImagesAsBase64. */
    @JsonProperty("ExportImagesAsBase64")
    private Boolean exportImagesAsBase64;

    /** Gets or sets HiddenColDisplayType. */
    @JsonProperty("HiddenColDisplayType")
    private String hiddenColDisplayType;

    /** Gets or sets HiddenRowDisplayType. */
    @JsonProperty("HiddenRowDisplayType")
    private String hiddenRowDisplayType;

    /** Gets or sets HtmlCrossStringType. */
    @JsonProperty("HtmlCrossStringType")
    private String htmlCrossStringType;

    /** Gets or sets IsExpImageToTempDir. */
    @JsonProperty("IsExpImageToTempDir")
    private Boolean isExpImageToTempDir;

    /** Gets or sets PageTitle. */
    @JsonProperty("PageTitle")
    private String pageTitle;

    /** Gets or sets ParseHtmlTagInCell. */
    @JsonProperty("ParseHtmlTagInCell")
    private Boolean parseHtmlTagInCell;

    /** Gets or sets CellNameAttribute. */
    @JsonProperty("CellNameAttribute")
    private String cellNameAttribute;

    public Boolean getExportPageHeaders() { return exportPageHeaders; }
    public HtmlSaveOptions setExportPageHeaders(Boolean exportPageHeaders) { this.exportPageHeaders = exportPageHeaders; return this; }

    public Boolean getExportPageFooters() { return exportPageFooters; }
    public HtmlSaveOptions setExportPageFooters(Boolean exportPageFooters) { this.exportPageFooters = exportPageFooters; return this; }

    public Boolean getExportRowColumnHeadings() { return exportRowColumnHeadings; }
    public HtmlSaveOptions setExportRowColumnHeadings(Boolean exportRowColumnHeadings) { this.exportRowColumnHeadings = exportRowColumnHeadings; return this; }

    public Boolean getShowAllSheets() { return showAllSheets; }
    public HtmlSaveOptions setShowAllSheets(Boolean showAllSheets) { this.showAllSheets = showAllSheets; return this; }

    public ImageOrPrintOptions getImageOptions() { return imageOptions; }
    public HtmlSaveOptions setImageOptions(ImageOrPrintOptions imageOptions) { this.imageOptions = imageOptions; return this; }

    public Boolean getSaveAsSingleFile() { return saveAsSingleFile; }
    public HtmlSaveOptions setSaveAsSingleFile(Boolean saveAsSingleFile) { this.saveAsSingleFile = saveAsSingleFile; return this; }

    public Boolean getExportHiddenWorksheet() { return exportHiddenWorksheet; }
    public HtmlSaveOptions setExportHiddenWorksheet(Boolean exportHiddenWorksheet) { this.exportHiddenWorksheet = exportHiddenWorksheet; return this; }

    public Boolean getExportGridLines() { return exportGridLines; }
    public HtmlSaveOptions setExportGridLines(Boolean exportGridLines) { this.exportGridLines = exportGridLines; return this; }

    public Boolean getPresentationPreference() { return presentationPreference; }
    public HtmlSaveOptions setPresentationPreference(Boolean presentationPreference) { this.presentationPreference = presentationPreference; return this; }

    public String getCellCssPrefix() { return cellCssPrefix; }
    public HtmlSaveOptions setCellCssPrefix(String cellCssPrefix) { this.cellCssPrefix = cellCssPrefix; return this; }

    public String getTableCssId() { return tableCssId; }
    public HtmlSaveOptions setTableCssId(String tableCssId) { this.tableCssId = tableCssId; return this; }

    public Boolean getIsFullPathLink() { return isFullPathLink; }
    public HtmlSaveOptions setIsFullPathLink(Boolean isFullPathLink) { this.isFullPathLink = isFullPathLink; return this; }

    public Boolean getExportWorksheetCSSSeparately() { return exportWorksheetCSSSeparately; }
    public HtmlSaveOptions setExportWorksheetCSSSeparately(Boolean exportWorksheetCSSSeparately) { this.exportWorksheetCSSSeparately = exportWorksheetCSSSeparately; return this; }

    public Boolean getExportSimilarBorderStyle() { return exportSimilarBorderStyle; }
    public HtmlSaveOptions setExportSimilarBorderStyle(Boolean exportSimilarBorderStyle) { this.exportSimilarBorderStyle = exportSimilarBorderStyle; return this; }

    public Boolean getMergeEmptyTdForcely() { return mergeEmptyTdForcely; }
    public HtmlSaveOptions setMergeEmptyTdForcely(Boolean mergeEmptyTdForcely) { this.mergeEmptyTdForcely = mergeEmptyTdForcely; return this; }

    public Boolean getExportCellCoordinate() { return exportCellCoordinate; }
    public HtmlSaveOptions setExportCellCoordinate(Boolean exportCellCoordinate) { this.exportCellCoordinate = exportCellCoordinate; return this; }

    public Boolean getExportExtraHeadings() { return exportExtraHeadings; }
    public HtmlSaveOptions setExportExtraHeadings(Boolean exportExtraHeadings) { this.exportExtraHeadings = exportExtraHeadings; return this; }

    public Boolean getExportHeadings() { return exportHeadings; }
    public HtmlSaveOptions setExportHeadings(Boolean exportHeadings) { this.exportHeadings = exportHeadings; return this; }

    public Boolean getExportFormula() { return exportFormula; }
    public HtmlSaveOptions setExportFormula(Boolean exportFormula) { this.exportFormula = exportFormula; return this; }

    public Boolean getAddTooltipText() { return addTooltipText; }
    public HtmlSaveOptions setAddTooltipText(Boolean addTooltipText) { this.addTooltipText = addTooltipText; return this; }

    public Boolean getExportBogusRowData() { return exportBogusRowData; }
    public HtmlSaveOptions setExportBogusRowData(Boolean exportBogusRowData) { this.exportBogusRowData = exportBogusRowData; return this; }

    public Boolean getExcludeUnusedStyles() { return excludeUnusedStyles; }
    public HtmlSaveOptions setExcludeUnusedStyles(Boolean excludeUnusedStyles) { this.excludeUnusedStyles = excludeUnusedStyles; return this; }

    public Boolean getExportDocumentProperties() { return exportDocumentProperties; }
    public HtmlSaveOptions setExportDocumentProperties(Boolean exportDocumentProperties) { this.exportDocumentProperties = exportDocumentProperties; return this; }

    public Boolean getExportWorksheetProperties() { return exportWorksheetProperties; }
    public HtmlSaveOptions setExportWorksheetProperties(Boolean exportWorksheetProperties) { this.exportWorksheetProperties = exportWorksheetProperties; return this; }

    public Boolean getExportWorkbookProperties() { return exportWorkbookProperties; }
    public HtmlSaveOptions setExportWorkbookProperties(Boolean exportWorkbookProperties) { this.exportWorkbookProperties = exportWorkbookProperties; return this; }

    public Boolean getExportFrameScriptsAndProperties() { return exportFrameScriptsAndProperties; }
    public HtmlSaveOptions setExportFrameScriptsAndProperties(Boolean exportFrameScriptsAndProperties) { this.exportFrameScriptsAndProperties = exportFrameScriptsAndProperties; return this; }

    public String getAttachedFilesDirectory() { return attachedFilesDirectory; }
    public HtmlSaveOptions setAttachedFilesDirectory(String attachedFilesDirectory) { this.attachedFilesDirectory = attachedFilesDirectory; return this; }

    public String getAttachedFilesUrlPrefix() { return attachedFilesUrlPrefix; }
    public HtmlSaveOptions setAttachedFilesUrlPrefix(String attachedFilesUrlPrefix) { this.attachedFilesUrlPrefix = attachedFilesUrlPrefix; return this; }

    public String getEncoding() { return encoding; }
    public HtmlSaveOptions setEncoding(String encoding) { this.encoding = encoding; return this; }

    public Boolean getExportActiveWorksheetOnly() { return exportActiveWorksheetOnly; }
    public HtmlSaveOptions setExportActiveWorksheetOnly(Boolean exportActiveWorksheetOnly) { this.exportActiveWorksheetOnly = exportActiveWorksheetOnly; return this; }

    public String getExportChartImageFormat() { return exportChartImageFormat; }
    public HtmlSaveOptions setExportChartImageFormat(String exportChartImageFormat) { this.exportChartImageFormat = exportChartImageFormat; return this; }

    public Boolean getExportImagesAsBase64() { return exportImagesAsBase64; }
    public HtmlSaveOptions setExportImagesAsBase64(Boolean exportImagesAsBase64) { this.exportImagesAsBase64 = exportImagesAsBase64; return this; }

    public String getHiddenColDisplayType() { return hiddenColDisplayType; }
    public HtmlSaveOptions setHiddenColDisplayType(String hiddenColDisplayType) { this.hiddenColDisplayType = hiddenColDisplayType; return this; }

    public String getHiddenRowDisplayType() { return hiddenRowDisplayType; }
    public HtmlSaveOptions setHiddenRowDisplayType(String hiddenRowDisplayType) { this.hiddenRowDisplayType = hiddenRowDisplayType; return this; }

    public String getHtmlCrossStringType() { return htmlCrossStringType; }
    public HtmlSaveOptions setHtmlCrossStringType(String htmlCrossStringType) { this.htmlCrossStringType = htmlCrossStringType; return this; }

    public Boolean getIsExpImageToTempDir() { return isExpImageToTempDir; }
    public HtmlSaveOptions setIsExpImageToTempDir(Boolean isExpImageToTempDir) { this.isExpImageToTempDir = isExpImageToTempDir; return this; }

    public String getPageTitle() { return pageTitle; }
    public HtmlSaveOptions setPageTitle(String pageTitle) { this.pageTitle = pageTitle; return this; }

    public Boolean getParseHtmlTagInCell() { return parseHtmlTagInCell; }
    public HtmlSaveOptions setParseHtmlTagInCell(Boolean parseHtmlTagInCell) { this.parseHtmlTagInCell = parseHtmlTagInCell; return this; }

    public String getCellNameAttribute() { return cellNameAttribute; }
    public HtmlSaveOptions setCellNameAttribute(String cellNameAttribute) { this.cellNameAttribute = cellNameAttribute; return this; }


    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setSaveFormat(String saveFormat) { return (HtmlSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setCachedFileFolder(String cachedFileFolder) { return (HtmlSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setClearData(Boolean clearData) { return (HtmlSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setCreateDirectory(Boolean createDirectory) { return (HtmlSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (HtmlSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (HtmlSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setSortNames(Boolean sortNames) { return (HtmlSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (HtmlSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setMergeAreas(Boolean mergeAreas) { return (HtmlSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (HtmlSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (HtmlSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (HtmlSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning HtmlSaveOptions. */
    @Override public HtmlSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (HtmlSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
