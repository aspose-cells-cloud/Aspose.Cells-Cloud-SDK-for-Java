package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DocxSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocxSaveOptions extends PaginatedSaveOptions {
    /** Gets or sets DefaultFont. */
    @JsonProperty("DefaultFont")
    private String defaultFont;

    /** Gets or sets CheckWorkbookDefaultFont. */
    @JsonProperty("CheckWorkbookDefaultFont")
    private Boolean checkWorkbookDefaultFont;

    /** Gets or sets CheckFontCompatibility. */
    @JsonProperty("CheckFontCompatibility")
    private Boolean checkFontCompatibility;

    /** Gets or sets IsFontSubstitutionCharGranularity. */
    @JsonProperty("IsFontSubstitutionCharGranularity")
    private Boolean isFontSubstitutionCharGranularity;

    /** Gets or sets OnePagePerSheet. */
    @JsonProperty("OnePagePerSheet")
    private Boolean onePagePerSheet;

    /** Gets or sets AllColumnsInOnePagePerSheet. */
    @JsonProperty("AllColumnsInOnePagePerSheet")
    private Boolean allColumnsInOnePagePerSheet;

    /** Gets or sets IgnoreError. */
    @JsonProperty("IgnoreError")
    private Boolean ignoreError;

    /** Gets or sets OutputBlankPageWhenNothingToPrint. */
    @JsonProperty("OutputBlankPageWhenNothingToPrint")
    private Boolean outputBlankPageWhenNothingToPrint;

    /** Gets or sets PageIndex. */
    @JsonProperty("PageIndex")
    private Integer pageIndex;

    /** Gets or sets PageCount. */
    @JsonProperty("PageCount")
    private Integer pageCount;

    /** Gets or sets PrintingPageType. */
    @JsonProperty("PrintingPageType")
    private String printingPageType;

    /** Gets or sets GridlineType. */
    @JsonProperty("GridlineType")
    private String gridlineType;

    /** Gets or sets TextCrossType. */
    @JsonProperty("TextCrossType")
    private String textCrossType;

    /** Gets or sets DefaultEditLanguage. */
    @JsonProperty("DefaultEditLanguage")
    private String defaultEditLanguage;

    /** Gets or sets EmfRenderSetting. */
    @JsonProperty("EmfRenderSetting")
    private String emfRenderSetting;

    /** Gets or sets MergeAreas. */
    @JsonProperty("MergeAreas")
    private Boolean mergeAreas;

    /** Gets or sets SortExternalNames. */
    @JsonProperty("SortExternalNames")
    private Boolean sortExternalNames;

    /** Gets or sets UpdateSmartArt. */
    @JsonProperty("UpdateSmartArt")
    private Boolean updateSmartArt;

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

    public String getDefaultFont() { return defaultFont; }
    public DocxSaveOptions setDefaultFont(String defaultFont) { this.defaultFont = defaultFont; return this; }

    public Boolean getCheckWorkbookDefaultFont() { return checkWorkbookDefaultFont; }
    public DocxSaveOptions setCheckWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) { this.checkWorkbookDefaultFont = checkWorkbookDefaultFont; return this; }

    public Boolean getCheckFontCompatibility() { return checkFontCompatibility; }
    public DocxSaveOptions setCheckFontCompatibility(Boolean checkFontCompatibility) { this.checkFontCompatibility = checkFontCompatibility; return this; }

    public Boolean getIsFontSubstitutionCharGranularity() { return isFontSubstitutionCharGranularity; }
    public DocxSaveOptions setIsFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) { this.isFontSubstitutionCharGranularity = isFontSubstitutionCharGranularity; return this; }

    public Boolean getOnePagePerSheet() { return onePagePerSheet; }
    public DocxSaveOptions setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }

    public Boolean getAllColumnsInOnePagePerSheet() { return allColumnsInOnePagePerSheet; }
    public DocxSaveOptions setAllColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) { this.allColumnsInOnePagePerSheet = allColumnsInOnePagePerSheet; return this; }

    public Boolean getIgnoreError() { return ignoreError; }
    public DocxSaveOptions setIgnoreError(Boolean ignoreError) { this.ignoreError = ignoreError; return this; }

    public Boolean getOutputBlankPageWhenNothingToPrint() { return outputBlankPageWhenNothingToPrint; }
    public DocxSaveOptions setOutputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) { this.outputBlankPageWhenNothingToPrint = outputBlankPageWhenNothingToPrint; return this; }

    public Integer getPageIndex() { return pageIndex; }
    public DocxSaveOptions setPageIndex(Integer pageIndex) { this.pageIndex = pageIndex; return this; }

    public Integer getPageCount() { return pageCount; }
    public DocxSaveOptions setPageCount(Integer pageCount) { this.pageCount = pageCount; return this; }

    public String getPrintingPageType() { return printingPageType; }
    public DocxSaveOptions setPrintingPageType(String printingPageType) { this.printingPageType = printingPageType; return this; }

    public String getGridlineType() { return gridlineType; }
    public DocxSaveOptions setGridlineType(String gridlineType) { this.gridlineType = gridlineType; return this; }

    public String getTextCrossType() { return textCrossType; }
    public DocxSaveOptions setTextCrossType(String textCrossType) { this.textCrossType = textCrossType; return this; }

    public String getDefaultEditLanguage() { return defaultEditLanguage; }
    public DocxSaveOptions setDefaultEditLanguage(String defaultEditLanguage) { this.defaultEditLanguage = defaultEditLanguage; return this; }

    public String getEmfRenderSetting() { return emfRenderSetting; }
    public DocxSaveOptions setEmfRenderSetting(String emfRenderSetting) { this.emfRenderSetting = emfRenderSetting; return this; }

    public Boolean getMergeAreas() { return mergeAreas; }
    public DocxSaveOptions setMergeAreas(Boolean mergeAreas) { this.mergeAreas = mergeAreas; return this; }

    public Boolean getSortExternalNames() { return sortExternalNames; }
    public DocxSaveOptions setSortExternalNames(Boolean sortExternalNames) { this.sortExternalNames = sortExternalNames; return this; }

    public Boolean getUpdateSmartArt() { return updateSmartArt; }
    public DocxSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { this.updateSmartArt = updateSmartArt; return this; }

    public String getSaveFormat() { return saveFormat; }
    public DocxSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public DocxSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public DocxSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public DocxSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public DocxSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public DocxSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public DocxSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public DocxSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public DocxSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public DocxSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }

}
