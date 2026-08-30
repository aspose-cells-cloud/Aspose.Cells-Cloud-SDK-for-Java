package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** MHtmlSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MHtmlSaveOptions extends SaveOptions {
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
    public MHtmlSaveOptions setExportPageHeaders(Boolean exportPageHeaders) { this.exportPageHeaders = exportPageHeaders; return this; }

    public Boolean getExportPageFooters() { return exportPageFooters; }
    public MHtmlSaveOptions setExportPageFooters(Boolean exportPageFooters) { this.exportPageFooters = exportPageFooters; return this; }

    public Boolean getExportRowColumnHeadings() { return exportRowColumnHeadings; }
    public MHtmlSaveOptions setExportRowColumnHeadings(Boolean exportRowColumnHeadings) { this.exportRowColumnHeadings = exportRowColumnHeadings; return this; }

    public Boolean getShowAllSheets() { return showAllSheets; }
    public MHtmlSaveOptions setShowAllSheets(Boolean showAllSheets) { this.showAllSheets = showAllSheets; return this; }

    public ImageOrPrintOptions getImageOptions() { return imageOptions; }
    public MHtmlSaveOptions setImageOptions(ImageOrPrintOptions imageOptions) { this.imageOptions = imageOptions; return this; }

    public Boolean getSaveAsSingleFile() { return saveAsSingleFile; }
    public MHtmlSaveOptions setSaveAsSingleFile(Boolean saveAsSingleFile) { this.saveAsSingleFile = saveAsSingleFile; return this; }

    public Boolean getExportHiddenWorksheet() { return exportHiddenWorksheet; }
    public MHtmlSaveOptions setExportHiddenWorksheet(Boolean exportHiddenWorksheet) { this.exportHiddenWorksheet = exportHiddenWorksheet; return this; }

    public Boolean getExportGridLines() { return exportGridLines; }
    public MHtmlSaveOptions setExportGridLines(Boolean exportGridLines) { this.exportGridLines = exportGridLines; return this; }

    public Boolean getPresentationPreference() { return presentationPreference; }
    public MHtmlSaveOptions setPresentationPreference(Boolean presentationPreference) { this.presentationPreference = presentationPreference; return this; }

    public String getCellCssPrefix() { return cellCssPrefix; }
    public MHtmlSaveOptions setCellCssPrefix(String cellCssPrefix) { this.cellCssPrefix = cellCssPrefix; return this; }

    public String getTableCssId() { return tableCssId; }
    public MHtmlSaveOptions setTableCssId(String tableCssId) { this.tableCssId = tableCssId; return this; }

    public Boolean getIsFullPathLink() { return isFullPathLink; }
    public MHtmlSaveOptions setIsFullPathLink(Boolean isFullPathLink) { this.isFullPathLink = isFullPathLink; return this; }

    public Boolean getExportWorksheetCSSSeparately() { return exportWorksheetCSSSeparately; }
    public MHtmlSaveOptions setExportWorksheetCSSSeparately(Boolean exportWorksheetCSSSeparately) { this.exportWorksheetCSSSeparately = exportWorksheetCSSSeparately; return this; }

    public Boolean getExportSimilarBorderStyle() { return exportSimilarBorderStyle; }
    public MHtmlSaveOptions setExportSimilarBorderStyle(Boolean exportSimilarBorderStyle) { this.exportSimilarBorderStyle = exportSimilarBorderStyle; return this; }

    public Boolean getMergeEmptyTdForcely() { return mergeEmptyTdForcely; }
    public MHtmlSaveOptions setMergeEmptyTdForcely(Boolean mergeEmptyTdForcely) { this.mergeEmptyTdForcely = mergeEmptyTdForcely; return this; }

    public Boolean getExportCellCoordinate() { return exportCellCoordinate; }
    public MHtmlSaveOptions setExportCellCoordinate(Boolean exportCellCoordinate) { this.exportCellCoordinate = exportCellCoordinate; return this; }

    public Boolean getExportExtraHeadings() { return exportExtraHeadings; }
    public MHtmlSaveOptions setExportExtraHeadings(Boolean exportExtraHeadings) { this.exportExtraHeadings = exportExtraHeadings; return this; }

    public Boolean getExportHeadings() { return exportHeadings; }
    public MHtmlSaveOptions setExportHeadings(Boolean exportHeadings) { this.exportHeadings = exportHeadings; return this; }

    public Boolean getExportFormula() { return exportFormula; }
    public MHtmlSaveOptions setExportFormula(Boolean exportFormula) { this.exportFormula = exportFormula; return this; }

    public Boolean getAddTooltipText() { return addTooltipText; }
    public MHtmlSaveOptions setAddTooltipText(Boolean addTooltipText) { this.addTooltipText = addTooltipText; return this; }

    public Boolean getExportBogusRowData() { return exportBogusRowData; }
    public MHtmlSaveOptions setExportBogusRowData(Boolean exportBogusRowData) { this.exportBogusRowData = exportBogusRowData; return this; }

    public Boolean getExcludeUnusedStyles() { return excludeUnusedStyles; }
    public MHtmlSaveOptions setExcludeUnusedStyles(Boolean excludeUnusedStyles) { this.excludeUnusedStyles = excludeUnusedStyles; return this; }

    public Boolean getExportDocumentProperties() { return exportDocumentProperties; }
    public MHtmlSaveOptions setExportDocumentProperties(Boolean exportDocumentProperties) { this.exportDocumentProperties = exportDocumentProperties; return this; }

    public Boolean getExportWorksheetProperties() { return exportWorksheetProperties; }
    public MHtmlSaveOptions setExportWorksheetProperties(Boolean exportWorksheetProperties) { this.exportWorksheetProperties = exportWorksheetProperties; return this; }

    public Boolean getExportWorkbookProperties() { return exportWorkbookProperties; }
    public MHtmlSaveOptions setExportWorkbookProperties(Boolean exportWorkbookProperties) { this.exportWorkbookProperties = exportWorkbookProperties; return this; }

    public Boolean getExportFrameScriptsAndProperties() { return exportFrameScriptsAndProperties; }
    public MHtmlSaveOptions setExportFrameScriptsAndProperties(Boolean exportFrameScriptsAndProperties) { this.exportFrameScriptsAndProperties = exportFrameScriptsAndProperties; return this; }

    public String getAttachedFilesDirectory() { return attachedFilesDirectory; }
    public MHtmlSaveOptions setAttachedFilesDirectory(String attachedFilesDirectory) { this.attachedFilesDirectory = attachedFilesDirectory; return this; }

    public String getAttachedFilesUrlPrefix() { return attachedFilesUrlPrefix; }
    public MHtmlSaveOptions setAttachedFilesUrlPrefix(String attachedFilesUrlPrefix) { this.attachedFilesUrlPrefix = attachedFilesUrlPrefix; return this; }

    public String getEncoding() { return encoding; }
    public MHtmlSaveOptions setEncoding(String encoding) { this.encoding = encoding; return this; }

    public Boolean getExportActiveWorksheetOnly() { return exportActiveWorksheetOnly; }
    public MHtmlSaveOptions setExportActiveWorksheetOnly(Boolean exportActiveWorksheetOnly) { this.exportActiveWorksheetOnly = exportActiveWorksheetOnly; return this; }

    public String getExportChartImageFormat() { return exportChartImageFormat; }
    public MHtmlSaveOptions setExportChartImageFormat(String exportChartImageFormat) { this.exportChartImageFormat = exportChartImageFormat; return this; }

    public Boolean getExportImagesAsBase64() { return exportImagesAsBase64; }
    public MHtmlSaveOptions setExportImagesAsBase64(Boolean exportImagesAsBase64) { this.exportImagesAsBase64 = exportImagesAsBase64; return this; }

    public String getHiddenColDisplayType() { return hiddenColDisplayType; }
    public MHtmlSaveOptions setHiddenColDisplayType(String hiddenColDisplayType) { this.hiddenColDisplayType = hiddenColDisplayType; return this; }

    public String getHiddenRowDisplayType() { return hiddenRowDisplayType; }
    public MHtmlSaveOptions setHiddenRowDisplayType(String hiddenRowDisplayType) { this.hiddenRowDisplayType = hiddenRowDisplayType; return this; }

    public String getHtmlCrossStringType() { return htmlCrossStringType; }
    public MHtmlSaveOptions setHtmlCrossStringType(String htmlCrossStringType) { this.htmlCrossStringType = htmlCrossStringType; return this; }

    public Boolean getIsExpImageToTempDir() { return isExpImageToTempDir; }
    public MHtmlSaveOptions setIsExpImageToTempDir(Boolean isExpImageToTempDir) { this.isExpImageToTempDir = isExpImageToTempDir; return this; }

    public String getPageTitle() { return pageTitle; }
    public MHtmlSaveOptions setPageTitle(String pageTitle) { this.pageTitle = pageTitle; return this; }

    public Boolean getParseHtmlTagInCell() { return parseHtmlTagInCell; }
    public MHtmlSaveOptions setParseHtmlTagInCell(Boolean parseHtmlTagInCell) { this.parseHtmlTagInCell = parseHtmlTagInCell; return this; }

    public String getCellNameAttribute() { return cellNameAttribute; }
    public MHtmlSaveOptions setCellNameAttribute(String cellNameAttribute) { this.cellNameAttribute = cellNameAttribute; return this; }


    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setSaveFormat(String saveFormat) { return (MHtmlSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setCachedFileFolder(String cachedFileFolder) { return (MHtmlSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setClearData(Boolean clearData) { return (MHtmlSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setCreateDirectory(Boolean createDirectory) { return (MHtmlSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (MHtmlSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (MHtmlSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setSortNames(Boolean sortNames) { return (MHtmlSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (MHtmlSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setMergeAreas(Boolean mergeAreas) { return (MHtmlSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (MHtmlSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (MHtmlSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (MHtmlSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning MHtmlSaveOptions. */
    @Override public MHtmlSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (MHtmlSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
