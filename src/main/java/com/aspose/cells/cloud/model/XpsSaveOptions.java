package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** XpsSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XpsSaveOptions extends PaginatedSaveOptions {
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

    public String getSaveFormat() { return saveFormat; }
    public XpsSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public XpsSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public XpsSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public XpsSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public XpsSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public XpsSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public XpsSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public XpsSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public XpsSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public XpsSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }


    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setDefaultFont(String defaultFont) { return (XpsSaveOptions) super.setDefaultFont(defaultFont); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setCheckWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) { return (XpsSaveOptions) super.setCheckWorkbookDefaultFont(checkWorkbookDefaultFont); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setCheckFontCompatibility(Boolean checkFontCompatibility) { return (XpsSaveOptions) super.setCheckFontCompatibility(checkFontCompatibility); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setIsFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) { return (XpsSaveOptions) super.setIsFontSubstitutionCharGranularity(isFontSubstitutionCharGranularity); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setOnePagePerSheet(Boolean onePagePerSheet) { return (XpsSaveOptions) super.setOnePagePerSheet(onePagePerSheet); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setAllColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) { return (XpsSaveOptions) super.setAllColumnsInOnePagePerSheet(allColumnsInOnePagePerSheet); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setIgnoreError(Boolean ignoreError) { return (XpsSaveOptions) super.setIgnoreError(ignoreError); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setOutputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) { return (XpsSaveOptions) super.setOutputBlankPageWhenNothingToPrint(outputBlankPageWhenNothingToPrint); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setPageIndex(Integer pageIndex) { return (XpsSaveOptions) super.setPageIndex(pageIndex); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setPageCount(Integer pageCount) { return (XpsSaveOptions) super.setPageCount(pageCount); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setPrintingPageType(String printingPageType) { return (XpsSaveOptions) super.setPrintingPageType(printingPageType); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setGridlineType(String gridlineType) { return (XpsSaveOptions) super.setGridlineType(gridlineType); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setTextCrossType(String textCrossType) { return (XpsSaveOptions) super.setTextCrossType(textCrossType); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setDefaultEditLanguage(String defaultEditLanguage) { return (XpsSaveOptions) super.setDefaultEditLanguage(defaultEditLanguage); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setEmfRenderSetting(String emfRenderSetting) { return (XpsSaveOptions) super.setEmfRenderSetting(emfRenderSetting); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setMergeAreas(Boolean mergeAreas) { return (XpsSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (XpsSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning XpsSaveOptions. */
    @Override public XpsSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (XpsSaveOptions) super.setUpdateSmartArt(updateSmartArt); }

}
