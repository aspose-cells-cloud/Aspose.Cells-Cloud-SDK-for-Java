package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PclSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PclSaveOptions extends SaveOptions {
    /** Gets or sets fontFullName. */
    @JsonProperty("fontFullName")
    private String fontFullName;

    /** Gets or sets fontPclName. */
    @JsonProperty("fontPclName")
    private String fontPclName;

    public String getFontFullName() { return fontFullName; }
    public PclSaveOptions setFontFullName(String fontFullName) { this.fontFullName = fontFullName; return this; }

    public String getFontPclName() { return fontPclName; }
    public PclSaveOptions setFontPclName(String fontPclName) { this.fontPclName = fontPclName; return this; }


    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setSaveFormat(String saveFormat) { return (PclSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setCachedFileFolder(String cachedFileFolder) { return (PclSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setClearData(Boolean clearData) { return (PclSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setCreateDirectory(Boolean createDirectory) { return (PclSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (PclSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (PclSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setSortNames(Boolean sortNames) { return (PclSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (PclSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setMergeAreas(Boolean mergeAreas) { return (PclSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (PclSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (PclSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (PclSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning PclSaveOptions. */
    @Override public PclSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (PclSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
