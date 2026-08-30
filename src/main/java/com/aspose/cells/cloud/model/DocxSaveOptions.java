package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DocxSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DocxSaveOptions extends PaginatedSaveOptions {
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


    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setDefaultFont(String defaultFont) { return (DocxSaveOptions) super.setDefaultFont(defaultFont); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setCheckWorkbookDefaultFont(Boolean checkWorkbookDefaultFont) { return (DocxSaveOptions) super.setCheckWorkbookDefaultFont(checkWorkbookDefaultFont); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setCheckFontCompatibility(Boolean checkFontCompatibility) { return (DocxSaveOptions) super.setCheckFontCompatibility(checkFontCompatibility); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setIsFontSubstitutionCharGranularity(Boolean isFontSubstitutionCharGranularity) { return (DocxSaveOptions) super.setIsFontSubstitutionCharGranularity(isFontSubstitutionCharGranularity); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setOnePagePerSheet(Boolean onePagePerSheet) { return (DocxSaveOptions) super.setOnePagePerSheet(onePagePerSheet); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setAllColumnsInOnePagePerSheet(Boolean allColumnsInOnePagePerSheet) { return (DocxSaveOptions) super.setAllColumnsInOnePagePerSheet(allColumnsInOnePagePerSheet); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setIgnoreError(Boolean ignoreError) { return (DocxSaveOptions) super.setIgnoreError(ignoreError); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setOutputBlankPageWhenNothingToPrint(Boolean outputBlankPageWhenNothingToPrint) { return (DocxSaveOptions) super.setOutputBlankPageWhenNothingToPrint(outputBlankPageWhenNothingToPrint); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setPageIndex(Integer pageIndex) { return (DocxSaveOptions) super.setPageIndex(pageIndex); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setPageCount(Integer pageCount) { return (DocxSaveOptions) super.setPageCount(pageCount); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setPrintingPageType(String printingPageType) { return (DocxSaveOptions) super.setPrintingPageType(printingPageType); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setGridlineType(String gridlineType) { return (DocxSaveOptions) super.setGridlineType(gridlineType); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setTextCrossType(String textCrossType) { return (DocxSaveOptions) super.setTextCrossType(textCrossType); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setDefaultEditLanguage(String defaultEditLanguage) { return (DocxSaveOptions) super.setDefaultEditLanguage(defaultEditLanguage); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setEmfRenderSetting(String emfRenderSetting) { return (DocxSaveOptions) super.setEmfRenderSetting(emfRenderSetting); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setMergeAreas(Boolean mergeAreas) { return (DocxSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (DocxSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning DocxSaveOptions. */
    @Override public DocxSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (DocxSaveOptions) super.setUpdateSmartArt(updateSmartArt); }

}
