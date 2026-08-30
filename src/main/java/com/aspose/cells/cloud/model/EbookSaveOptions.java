package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** EbookSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EbookSaveOptions extends HtmlSaveOptions {
    /** Gets or sets SaveFormat. */
    @JsonProperty("SaveFormat")
    private String saveFormat;

    /** Gets or sets CachedFileFolder. */
    @JsonProperty("CachedFileFolder")
    private String cachedFileFolder;

    /** Gets or sets ClearData. */
    @JsonProperty("ClearData")
    private Boolean clearData;

    /** Gets or sets CreateDirectory. */
    @JsonProperty("CreateDirectory")
    private Boolean createDirectory;

    /** Gets or sets EnableHTTPCompression. */
    @JsonProperty("EnableHTTPCompression")
    private Boolean enableHTTPCompression;

    /** Gets or sets RefreshChartCache. */
    @JsonProperty("RefreshChartCache")
    private Boolean refreshChartCache;

    /** Gets or sets SortNames. */
    @JsonProperty("SortNames")
    private Boolean sortNames;

    /** Gets or sets ValidateMergedAreas. */
    @JsonProperty("ValidateMergedAreas")
    private Boolean validateMergedAreas;

    /** Gets or sets MergeAreas. */
    @JsonProperty("MergeAreas")
    private Boolean mergeAreas;

    /** Gets or sets SortExternalNames. */
    @JsonProperty("SortExternalNames")
    private Boolean sortExternalNames;

    /** Gets or sets CheckExcelRestriction. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    /** Gets or sets UpdateSmartArt. */
    @JsonProperty("UpdateSmartArt")
    private Boolean updateSmartArt;

    /** Gets or sets EncryptDocumentProperties. */
    @JsonProperty("EncryptDocumentProperties")
    private Boolean encryptDocumentProperties;

    public String getSaveFormat() { return saveFormat; }
    public EbookSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public EbookSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public EbookSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public EbookSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public EbookSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public EbookSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public EbookSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public EbookSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getMergeAreas() { return mergeAreas; }
    public EbookSaveOptions setMergeAreas(Boolean mergeAreas) { this.mergeAreas = mergeAreas; return this; }

    public Boolean getSortExternalNames() { return sortExternalNames; }
    public EbookSaveOptions setSortExternalNames(Boolean sortExternalNames) { this.sortExternalNames = sortExternalNames; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public EbookSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getUpdateSmartArt() { return updateSmartArt; }
    public EbookSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { this.updateSmartArt = updateSmartArt; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public EbookSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }


    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportPageHeaders(Boolean exportPageHeaders) { return (EbookSaveOptions) super.setExportPageHeaders(exportPageHeaders); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportPageFooters(Boolean exportPageFooters) { return (EbookSaveOptions) super.setExportPageFooters(exportPageFooters); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportRowColumnHeadings(Boolean exportRowColumnHeadings) { return (EbookSaveOptions) super.setExportRowColumnHeadings(exportRowColumnHeadings); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setShowAllSheets(Boolean showAllSheets) { return (EbookSaveOptions) super.setShowAllSheets(showAllSheets); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setImageOptions(ImageOrPrintOptions imageOptions) { return (EbookSaveOptions) super.setImageOptions(imageOptions); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setSaveAsSingleFile(Boolean saveAsSingleFile) { return (EbookSaveOptions) super.setSaveAsSingleFile(saveAsSingleFile); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportHiddenWorksheet(Boolean exportHiddenWorksheet) { return (EbookSaveOptions) super.setExportHiddenWorksheet(exportHiddenWorksheet); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportGridLines(Boolean exportGridLines) { return (EbookSaveOptions) super.setExportGridLines(exportGridLines); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setPresentationPreference(Boolean presentationPreference) { return (EbookSaveOptions) super.setPresentationPreference(presentationPreference); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setCellCssPrefix(String cellCssPrefix) { return (EbookSaveOptions) super.setCellCssPrefix(cellCssPrefix); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setTableCssId(String tableCssId) { return (EbookSaveOptions) super.setTableCssId(tableCssId); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setIsFullPathLink(Boolean isFullPathLink) { return (EbookSaveOptions) super.setIsFullPathLink(isFullPathLink); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportWorksheetCSSSeparately(Boolean exportWorksheetCSSSeparately) { return (EbookSaveOptions) super.setExportWorksheetCSSSeparately(exportWorksheetCSSSeparately); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportSimilarBorderStyle(Boolean exportSimilarBorderStyle) { return (EbookSaveOptions) super.setExportSimilarBorderStyle(exportSimilarBorderStyle); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setMergeEmptyTdForcely(Boolean mergeEmptyTdForcely) { return (EbookSaveOptions) super.setMergeEmptyTdForcely(mergeEmptyTdForcely); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportCellCoordinate(Boolean exportCellCoordinate) { return (EbookSaveOptions) super.setExportCellCoordinate(exportCellCoordinate); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportExtraHeadings(Boolean exportExtraHeadings) { return (EbookSaveOptions) super.setExportExtraHeadings(exportExtraHeadings); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportHeadings(Boolean exportHeadings) { return (EbookSaveOptions) super.setExportHeadings(exportHeadings); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportFormula(Boolean exportFormula) { return (EbookSaveOptions) super.setExportFormula(exportFormula); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setAddTooltipText(Boolean addTooltipText) { return (EbookSaveOptions) super.setAddTooltipText(addTooltipText); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportBogusRowData(Boolean exportBogusRowData) { return (EbookSaveOptions) super.setExportBogusRowData(exportBogusRowData); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExcludeUnusedStyles(Boolean excludeUnusedStyles) { return (EbookSaveOptions) super.setExcludeUnusedStyles(excludeUnusedStyles); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportDocumentProperties(Boolean exportDocumentProperties) { return (EbookSaveOptions) super.setExportDocumentProperties(exportDocumentProperties); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportWorksheetProperties(Boolean exportWorksheetProperties) { return (EbookSaveOptions) super.setExportWorksheetProperties(exportWorksheetProperties); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportWorkbookProperties(Boolean exportWorkbookProperties) { return (EbookSaveOptions) super.setExportWorkbookProperties(exportWorkbookProperties); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportFrameScriptsAndProperties(Boolean exportFrameScriptsAndProperties) { return (EbookSaveOptions) super.setExportFrameScriptsAndProperties(exportFrameScriptsAndProperties); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setAttachedFilesDirectory(String attachedFilesDirectory) { return (EbookSaveOptions) super.setAttachedFilesDirectory(attachedFilesDirectory); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setAttachedFilesUrlPrefix(String attachedFilesUrlPrefix) { return (EbookSaveOptions) super.setAttachedFilesUrlPrefix(attachedFilesUrlPrefix); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setEncoding(String encoding) { return (EbookSaveOptions) super.setEncoding(encoding); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportActiveWorksheetOnly(Boolean exportActiveWorksheetOnly) { return (EbookSaveOptions) super.setExportActiveWorksheetOnly(exportActiveWorksheetOnly); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportChartImageFormat(String exportChartImageFormat) { return (EbookSaveOptions) super.setExportChartImageFormat(exportChartImageFormat); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setExportImagesAsBase64(Boolean exportImagesAsBase64) { return (EbookSaveOptions) super.setExportImagesAsBase64(exportImagesAsBase64); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setHiddenColDisplayType(String hiddenColDisplayType) { return (EbookSaveOptions) super.setHiddenColDisplayType(hiddenColDisplayType); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setHiddenRowDisplayType(String hiddenRowDisplayType) { return (EbookSaveOptions) super.setHiddenRowDisplayType(hiddenRowDisplayType); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setHtmlCrossStringType(String htmlCrossStringType) { return (EbookSaveOptions) super.setHtmlCrossStringType(htmlCrossStringType); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setIsExpImageToTempDir(Boolean isExpImageToTempDir) { return (EbookSaveOptions) super.setIsExpImageToTempDir(isExpImageToTempDir); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setPageTitle(String pageTitle) { return (EbookSaveOptions) super.setPageTitle(pageTitle); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setParseHtmlTagInCell(Boolean parseHtmlTagInCell) { return (EbookSaveOptions) super.setParseHtmlTagInCell(parseHtmlTagInCell); }
    /** Covariant override: keeps fluent chains returning EbookSaveOptions. */
    @Override public EbookSaveOptions setCellNameAttribute(String cellNameAttribute) { return (EbookSaveOptions) super.setCellNameAttribute(cellNameAttribute); }

}
