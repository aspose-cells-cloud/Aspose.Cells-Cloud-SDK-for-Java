package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** DbfSaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DbfSaveOptions extends SaveOptions {
    /** Gets or sets ExportAsString. */
    @JsonProperty("ExportAsString")
    private Boolean exportAsString;

    public Boolean getExportAsString() { return exportAsString; }
    public DbfSaveOptions setExportAsString(Boolean exportAsString) { this.exportAsString = exportAsString; return this; }


    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setSaveFormat(String saveFormat) { return (DbfSaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setCachedFileFolder(String cachedFileFolder) { return (DbfSaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setClearData(Boolean clearData) { return (DbfSaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setCreateDirectory(Boolean createDirectory) { return (DbfSaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (DbfSaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (DbfSaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setSortNames(Boolean sortNames) { return (DbfSaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (DbfSaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setMergeAreas(Boolean mergeAreas) { return (DbfSaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setSortExternalNames(Boolean sortExternalNames) { return (DbfSaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (DbfSaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (DbfSaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning DbfSaveOptions. */
    @Override public DbfSaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (DbfSaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
