package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PaginatedSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PaginatedSaveOptions extends SaveOptions {
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

    public String getDefaultFont() { return defaultFont; }
    public PaginatedSaveOptions setDefaultFont(String defaultFont) { this.defaultFont = defaultFont; return this; }

    public Boolean getCheckWorkbookDefaultFont() { return checkWorkbookDefaultFont; }
    public PaginatedSaveOptions setCheckWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) { this.checkWorkbookDefaultFont = checkWorkbookDefaultFont; return this; }

    public Boolean getCheckFontCompatibility() { return checkFontCompatibility; }
    public PaginatedSaveOptions setCheckFontCompatibility(Boolean checkFontCompatibility) { this.checkFontCompatibility = checkFontCompatibility; return this; }

    public Boolean getIsFontSubstitutionCharGranularity() { return isFontSubstitutionCharGranularity; }
    public PaginatedSaveOptions setIsFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) { this.isFontSubstitutionCharGranularity = isFontSubstitutionCharGranularity; return this; }

    public Boolean getOnePagePerSheet() { return onePagePerSheet; }
    public PaginatedSaveOptions setOnePagePerSheet(Boolean onePagePerSheet) { this.onePagePerSheet = onePagePerSheet; return this; }

    public Boolean getAllColumnsInOnePagePerSheet() { return allColumnsInOnePagePerSheet; }
    public PaginatedSaveOptions setAllColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) { this.allColumnsInOnePagePerSheet = allColumnsInOnePagePerSheet; return this; }

    public Boolean getIgnoreError() { return ignoreError; }
    public PaginatedSaveOptions setIgnoreError(Boolean ignoreError) { this.ignoreError = ignoreError; return this; }

    public Boolean getOutputBlankPageWhenNothingToPrint() { return outputBlankPageWhenNothingToPrint; }
    public PaginatedSaveOptions setOutputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) { this.outputBlankPageWhenNothingToPrint = outputBlankPageWhenNothingToPrint; return this; }

    public Integer getPageIndex() { return pageIndex; }
    public PaginatedSaveOptions setPageIndex(Integer pageIndex) { this.pageIndex = pageIndex; return this; }

    public Integer getPageCount() { return pageCount; }
    public PaginatedSaveOptions setPageCount(Integer pageCount) { this.pageCount = pageCount; return this; }

    public String getPrintingPageType() { return printingPageType; }
    public PaginatedSaveOptions setPrintingPageType(String printingPageType) { this.printingPageType = printingPageType; return this; }

    public String getGridlineType() { return gridlineType; }
    public PaginatedSaveOptions setGridlineType(String gridlineType) { this.gridlineType = gridlineType; return this; }

    public String getTextCrossType() { return textCrossType; }
    public PaginatedSaveOptions setTextCrossType(String textCrossType) { this.textCrossType = textCrossType; return this; }

    public String getDefaultEditLanguage() { return defaultEditLanguage; }
    public PaginatedSaveOptions setDefaultEditLanguage(String defaultEditLanguage) { this.defaultEditLanguage = defaultEditLanguage; return this; }

    public String getEmfRenderSetting() { return emfRenderSetting; }
    public PaginatedSaveOptions setEmfRenderSetting(String emfRenderSetting) { this.emfRenderSetting = emfRenderSetting; return this; }

    public Boolean getMergeAreas() { return mergeAreas; }
    public PaginatedSaveOptions setMergeAreas(Boolean mergeAreas) { this.mergeAreas = mergeAreas; return this; }

    public Boolean getSortExternalNames() { return sortExternalNames; }
    public PaginatedSaveOptions setSortExternalNames(Boolean sortExternalNames) { this.sortExternalNames = sortExternalNames; return this; }

    public Boolean getUpdateSmartArt() { return updateSmartArt; }
    public PaginatedSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { this.updateSmartArt = updateSmartArt; return this; }


    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setSaveFormat(String saveFormat) { return (PaginatedSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setCachedFileFolder(String cachedFileFolder) { return (PaginatedSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setClearData(Boolean clearData) { return (PaginatedSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setCreateDirectory(Boolean createDirectory) { return (PaginatedSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (PaginatedSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (PaginatedSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setSortNames(Boolean sortNames) { return (PaginatedSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (PaginatedSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (PaginatedSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning PaginatedSaveOptions. */
    @Override public PaginatedSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (PaginatedSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
