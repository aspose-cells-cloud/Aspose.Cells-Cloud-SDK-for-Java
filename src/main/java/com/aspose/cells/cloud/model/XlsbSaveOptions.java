package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** XlsbSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class XlsbSaveOptions extends SaveOptions {
    /** Gets or sets ExportAllColumnIndexes. */
    @JsonProperty("ExportAllColumnIndexes")
    private Boolean exportAllColumnIndexes;

    /** Gets or sets CompressionType. */
    @JsonProperty("CompressionType")
    private String compressionType;

    public Boolean getExportAllColumnIndexes() { return exportAllColumnIndexes; }
    public XlsbSaveOptions setExportAllColumnIndexes(Boolean exportAllColumnIndexes) { this.exportAllColumnIndexes = exportAllColumnIndexes; return this; }

    public String getCompressionType() { return compressionType; }
    public XlsbSaveOptions setCompressionType(String compressionType) { this.compressionType = compressionType; return this; }


    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setSaveFormat(String saveFormat) { return (XlsbSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setCachedFileFolder(String cachedFileFolder) { return (XlsbSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setClearData(Boolean clearData) { return (XlsbSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setCreateDirectory(Boolean createDirectory) { return (XlsbSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (XlsbSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (XlsbSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setSortNames(Boolean sortNames) { return (XlsbSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (XlsbSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setMergeAreas(Boolean mergeAreas) { return (XlsbSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (XlsbSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (XlsbSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (XlsbSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning XlsbSaveOptions. */
    @Override public XlsbSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (XlsbSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
