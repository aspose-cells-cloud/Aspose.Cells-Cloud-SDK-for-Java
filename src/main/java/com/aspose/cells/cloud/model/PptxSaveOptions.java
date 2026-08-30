package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PptxSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PptxSaveOptions extends PaginatedSaveOptions {
    /** Gets or sets IgnoreHiddenRows. */
    @JsonProperty("IgnoreHiddenRows")
    private Boolean ignoreHiddenRows;

    /** Gets or sets AdjustFontSizeForRowType. */
    @JsonProperty("AdjustFontSizeForRowType")
    private String adjustFontSizeForRowType;

    /** Gets or sets ExportViewType. */
    @JsonProperty("ExportViewType")
    private String exportViewType;

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

    /** Gets or sets CheckExcelRestriction. */
    @JsonProperty("CheckExcelRestriction")
    private Boolean checkExcelRestriction;

    /** Gets or sets EncryptDocumentProperties. */
    @JsonProperty("EncryptDocumentProperties")
    private Boolean encryptDocumentProperties;

    public Boolean getIgnoreHiddenRows() { return ignoreHiddenRows; }
    public PptxSaveOptions setIgnoreHiddenRows(Boolean ignoreHiddenRows) { this.ignoreHiddenRows = ignoreHiddenRows; return this; }

    public String getAdjustFontSizeForRowType() { return adjustFontSizeForRowType; }
    public PptxSaveOptions setAdjustFontSizeForRowType(String adjustFontSizeForRowType) { this.adjustFontSizeForRowType = adjustFontSizeForRowType; return this; }

    public String getExportViewType() { return exportViewType; }
    public PptxSaveOptions setExportViewType(String exportViewType) { this.exportViewType = exportViewType; return this; }

    public String getSaveFormat() { return saveFormat; }
    public PptxSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public PptxSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public PptxSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public PptxSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public PptxSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public PptxSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public PptxSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public PptxSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public PptxSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public PptxSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }


    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setDefaultFont(String defaultFont) { return (PptxSaveOptions) super.setDefaultFont(defaultFont); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setCheckWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) { return (PptxSaveOptions) super.setCheckWorkbookDefaultFont(checkWorkbookDefaultFont); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setCheckFontCompatibility(Boolean checkFontCompatibility) { return (PptxSaveOptions) super.setCheckFontCompatibility(checkFontCompatibility); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setIsFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) { return (PptxSaveOptions) super.setIsFontSubstitutionCharGranularity(isFontSubstitutionCharGranularity); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setOnePagePerSheet(Boolean onePagePerSheet) { return (PptxSaveOptions) super.setOnePagePerSheet(onePagePerSheet); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setAllColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) { return (PptxSaveOptions) super.setAllColumnsInOnePagePerSheet(allColumnsInOnePagePerSheet); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setIgnoreError(Boolean ignoreError) { return (PptxSaveOptions) super.setIgnoreError(ignoreError); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setOutputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) { return (PptxSaveOptions) super.setOutputBlankPageWhenNothingToPrint(outputBlankPageWhenNothingToPrint); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setPageIndex(Integer pageIndex) { return (PptxSaveOptions) super.setPageIndex(pageIndex); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setPageCount(Integer pageCount) { return (PptxSaveOptions) super.setPageCount(pageCount); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setPrintingPageType(String printingPageType) { return (PptxSaveOptions) super.setPrintingPageType(printingPageType); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setGridlineType(String gridlineType) { return (PptxSaveOptions) super.setGridlineType(gridlineType); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setTextCrossType(String textCrossType) { return (PptxSaveOptions) super.setTextCrossType(textCrossType); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setDefaultEditLanguage(String defaultEditLanguage) { return (PptxSaveOptions) super.setDefaultEditLanguage(defaultEditLanguage); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setEmfRenderSetting(String emfRenderSetting) { return (PptxSaveOptions) super.setEmfRenderSetting(emfRenderSetting); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setMergeAreas(Boolean mergeAreas) { return (PptxSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (PptxSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning PptxSaveOptions. */
    @Override public PptxSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (PptxSaveOptions) super.setUpdateSmartArt(updateSmartArt); }

}
