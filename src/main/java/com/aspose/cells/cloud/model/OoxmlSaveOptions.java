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


    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setSaveFormat(String saveFormat) { return (OoxmlSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setCachedFileFolder(String cachedFileFolder) { return (OoxmlSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setClearData(Boolean clearData) { return (OoxmlSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setCreateDirectory(Boolean createDirectory) { return (OoxmlSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (OoxmlSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (OoxmlSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setSortNames(Boolean sortNames) { return (OoxmlSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (OoxmlSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setMergeAreas(Boolean mergeAreas) { return (OoxmlSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (OoxmlSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (OoxmlSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (OoxmlSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning OoxmlSaveOptions. */
    @Override public OoxmlSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (OoxmlSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
