package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OdsSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OdsSaveOptions extends SaveOptions {
    /** Gets or sets GeneratorType. */
    @JsonProperty("GeneratorType")
    private String generatorType;

    /** Gets or sets OdfStrictVersion. */
    @JsonProperty("OdfStrictVersion")
    private String odfStrictVersion;

    /** Gets or sets IgnorePivotTables. */
    @JsonProperty("IgnorePivotTables")
    private Boolean ignorePivotTables;

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

    public String getGeneratorType() { return generatorType; }
    public OdsSaveOptions setGeneratorType(String generatorType) { this.generatorType = generatorType; return this; }

    public String getOdfStrictVersion() { return odfStrictVersion; }
    public OdsSaveOptions setOdfStrictVersion(String odfStrictVersion) { this.odfStrictVersion = odfStrictVersion; return this; }

    public Boolean getIgnorePivotTables() { return ignorePivotTables; }
    public OdsSaveOptions setIgnorePivotTables(Boolean ignorePivotTables) { this.ignorePivotTables = ignorePivotTables; return this; }

    public String getSaveFormat() { return saveFormat; }
    public OdsSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public OdsSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public OdsSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public OdsSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public OdsSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public OdsSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public OdsSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public OdsSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getMergeAreas() { return mergeAreas; }
    public OdsSaveOptions setMergeAreas(Boolean mergeAreas) { this.mergeAreas = mergeAreas; return this; }

    public Boolean getSortExternalNames() { return sortExternalNames; }
    public OdsSaveOptions setSortExternalNames(Boolean sortExternalNames) { this.sortExternalNames = sortExternalNames; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public OdsSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getUpdateSmartArt() { return updateSmartArt; }
    public OdsSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { this.updateSmartArt = updateSmartArt; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public OdsSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }

}
