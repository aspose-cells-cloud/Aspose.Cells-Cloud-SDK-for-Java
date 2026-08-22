package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OoxmlSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OoxmlSaveOptions extends SaveOptions {
    /** Gets or sets ExportCellName. */
    @JsonProperty("ExportCellName")
    private Boolean exportCellName;

    /** Gets or sets UpdateZoom. */
    @JsonProperty("UpdateZoom")
    private Boolean updateZoom;

    /** Gets or sets EnableZip64. */
    @JsonProperty("EnableZip64")
    private Boolean enableZip64;

    /** Gets or sets EmbedOoxmlAsOleObject. */
    @JsonProperty("EmbedOoxmlAsOleObject")
    private Boolean embedOoxmlAsOleObject;

    /** Gets or sets CompressionType. */
    @JsonProperty("CompressionType")
    private String compressionType;

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

    public Boolean getExportCellName() { return exportCellName; }
    public OoxmlSaveOptions setExportCellName(Boolean exportCellName) { this.exportCellName = exportCellName; return this; }

    public Boolean getUpdateZoom() { return updateZoom; }
    public OoxmlSaveOptions setUpdateZoom(Boolean updateZoom) { this.updateZoom = updateZoom; return this; }

    public Boolean getEnableZip64() { return enableZip64; }
    public OoxmlSaveOptions setEnableZip64(Boolean enableZip64) { this.enableZip64 = enableZip64; return this; }

    public Boolean getEmbedOoxmlAsOleObject() { return embedOoxmlAsOleObject; }
    public OoxmlSaveOptions setEmbedOoxmlAsOleObject(Boolean embedOoxmlAsOleObject) { this.embedOoxmlAsOleObject = embedOoxmlAsOleObject; return this; }

    public String getCompressionType() { return compressionType; }
    public OoxmlSaveOptions setCompressionType(String compressionType) { this.compressionType = compressionType; return this; }

    public String getSaveFormat() { return saveFormat; }
    public OoxmlSaveOptions setSaveFormat(String saveFormat) { this.saveFormat = saveFormat; return this; }

    public String getCachedFileFolder() { return cachedFileFolder; }
    public OoxmlSaveOptions setCachedFileFolder(String cachedFileFolder) { this.cachedFileFolder = cachedFileFolder; return this; }

    public Boolean getClearData() { return clearData; }
    public OoxmlSaveOptions setClearData(Boolean clearData) { this.clearData = clearData; return this; }

    public Boolean getCreateDirectory() { return createDirectory; }
    public OoxmlSaveOptions setCreateDirectory(Boolean createDirectory) { this.createDirectory = createDirectory; return this; }

    public Boolean getEnableHTTPCompression() { return enableHTTPCompression; }
    public OoxmlSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { this.enableHTTPCompression = enableHTTPCompression; return this; }

    public Boolean getRefreshChartCache() { return refreshChartCache; }
    public OoxmlSaveOptions setRefreshChartCache(Boolean refreshChartCache) { this.refreshChartCache = refreshChartCache; return this; }

    public Boolean getSortNames() { return sortNames; }
    public OoxmlSaveOptions setSortNames(Boolean sortNames) { this.sortNames = sortNames; return this; }

    public Boolean getValidateMergedAreas() { return validateMergedAreas; }
    public OoxmlSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { this.validateMergedAreas = validateMergedAreas; return this; }

    public Boolean getMergeAreas() { return mergeAreas; }
    public OoxmlSaveOptions setMergeAreas(Boolean mergeAreas) { this.mergeAreas = mergeAreas; return this; }

    public Boolean getSortExternalNames() { return sortExternalNames; }
    public OoxmlSaveOptions setSortExternalNames(Boolean sortExternalNames) { this.sortExternalNames = sortExternalNames; return this; }

    public Boolean getCheckExcelRestriction() { return checkExcelRestriction; }
    public OoxmlSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { this.checkExcelRestriction = checkExcelRestriction; return this; }

    public Boolean getUpdateSmartArt() { return updateSmartArt; }
    public OoxmlSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { this.updateSmartArt = updateSmartArt; return this; }

    public Boolean getEncryptDocumentProperties() { return encryptDocumentProperties; }
    public OoxmlSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { this.encryptDocumentProperties = encryptDocumentProperties; return this; }

}
