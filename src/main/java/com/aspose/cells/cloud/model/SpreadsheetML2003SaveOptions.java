package com.aspose.cells.cloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SpreadsheetML2003SaveOptions model. */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SpreadsheetML2003SaveOptions extends SaveOptions {
    /** Gets or sets ExportColumnIndexOfCell. */
    @JsonProperty("ExportColumnIndexOfCell")
    private Boolean exportColumnIndexOfCell;

    /** Gets or sets IsIndentedFormatting. */
    @JsonProperty("IsIndentedFormatting")
    private Boolean isIndentedFormatting;

    /** Gets or sets LimitAsXls. */
    @JsonProperty("LimitAsXls")
    private Boolean limitAsXls;

    public Boolean getExportColumnIndexOfCell() { return exportColumnIndexOfCell; }
    public SpreadsheetML2003SaveOptions setExportColumnIndexOfCell(Boolean exportColumnIndexOfCell) { this.exportColumnIndexOfCell = exportColumnIndexOfCell; return this; }

    public Boolean getIsIndentedFormatting() { return isIndentedFormatting; }
    public SpreadsheetML2003SaveOptions setIsIndentedFormatting(Boolean isIndentedFormatting) { this.isIndentedFormatting = isIndentedFormatting; return this; }

    public Boolean getLimitAsXls() { return limitAsXls; }
    public SpreadsheetML2003SaveOptions setLimitAsXls(Boolean limitAsXls) { this.limitAsXls = limitAsXls; return this; }


    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setSaveFormat(String saveFormat) { return (SpreadsheetML2003SaveOptions) super.setSaveFormat(saveFormat); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setCachedFileFolder(String cachedFileFolder) { return (SpreadsheetML2003SaveOptions) super.setCachedFileFolder(cachedFileFolder); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setClearData(Boolean clearData) { return (SpreadsheetML2003SaveOptions) super.setClearData(clearData); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setCreateDirectory(Boolean createDirectory) { return (SpreadsheetML2003SaveOptions) super.setCreateDirectory(createDirectory); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setEnableHTTPCompression(Boolean enableHTTPCompression) { return (SpreadsheetML2003SaveOptions) super.setEnableHTTPCompression(enableHTTPCompression); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setRefreshChartCache(Boolean refreshChartCache) { return (SpreadsheetML2003SaveOptions) super.setRefreshChartCache(refreshChartCache); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setSortNames(Boolean sortNames) { return (SpreadsheetML2003SaveOptions) super.setSortNames(sortNames); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setValidateMergedAreas(Boolean validateMergedAreas) { return (SpreadsheetML2003SaveOptions) super.setValidateMergedAreas(validateMergedAreas); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setMergeAreas(Boolean mergeAreas) { return (SpreadsheetML2003SaveOptions) super.setMergeAreas(mergeAreas); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setSortExternalNames(Boolean sortExternalNames) { return (SpreadsheetML2003SaveOptions) super.setSortExternalNames(sortExternalNames); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setCheckExcelRestriction(Boolean checkExcelRestriction) { return (SpreadsheetML2003SaveOptions) super.setCheckExcelRestriction(checkExcelRestriction); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setUpdateSmartArt(Boolean updateSmartArt) { return (SpreadsheetML2003SaveOptions) super.setUpdateSmartArt(updateSmartArt); }
    /** Covariant override: keeps fluent chains returning SpreadsheetML2003SaveOptions. */
    @Override public SpreadsheetML2003SaveOptions setEncryptDocumentProperties(Boolean encryptDocumentProperties) { return (SpreadsheetML2003SaveOptions) super.setEncryptDocumentProperties(encryptDocumentProperties); }

}
