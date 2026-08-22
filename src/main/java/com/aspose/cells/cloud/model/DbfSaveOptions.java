package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DbfSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DbfSaveOptions extends SaveOptions {
    /** Gets or sets ExportAsString. */
    @JsonProperty("ExportAsString")
    private Boolean exportAsString;

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

    public Boolean getExportAsString() { return exportAsString; }
    public DbfSaveOptions setExportAsString(Boolean exportAsString) { this.exportAsString = exportAsString; return this; }

    public String getSaveFormat() { return saveFormat; }
    public DbfSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public DbfSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public DbfSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public DbfSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public DbfSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public DbfSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public DbfSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public DbfSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getMergeAreas() { return mergeAreas; }
    public DbfSaveOptions setMergeAreas(Boolean mergeAreas) { this.mergeAreas = mergeAreas; return this; }

    public Boolean getSortExternalNames() { return sortExternalNames; }
    public DbfSaveOptions setSortExternalNames(Boolean sortExternalNames) { this.sortExternalNames = sortExternalNames; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public DbfSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getUpdateSmartArt() { return updateSmartArt; }
    public DbfSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { this.updateSmartArt = updateSmartArt; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public DbfSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }

}
